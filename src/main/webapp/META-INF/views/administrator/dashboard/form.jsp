<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-integer code="administrator.dashboard.form.label.announcement" path="totalAnnouncements" />
	<acme:form-integer code="administrator.dashboard.form.label.company" path="totalCompanies" />
	<acme:form-integer code="administrator.dashboard.form.label.investor" path="totalInvestor" />
	<acme:form-money code="administrator.dashboard.form.label.minActiveRequest" path="minActiveRequest"/>
	<acme:form-money code="administrator.dashboard.form.label.maxActiveRequest" path="maxActiveRequest"/>
	<acme:form-money code="administrator.dashboard.form.label.avgActiveRequest" path="avgActiveRequest"/>
	<acme:form-double code="administrator.dashboard.form.label.standDevAR" path="standDevActiveResquest"/>
	<acme:form-money code="administrator.dashboard.form.label.minActiveOffers" path="minActiveOffers"/>
	<acme:form-money code="administrator.dashboard.form.label.maxActiveOffers" path="maxActiveOffers"/>
	<acme:form-money code="administrator.dashboard.form.label.avgMinActiveOffers" path="avgMinActiveOffers"/>
	<acme:form-money code="administrator.dashboard.form.label.avgMaxActiveOffers" path="avgMaxActiveOffers"/>
	<acme:form-double code="administrator.dashboard.form.label.standDevAO" path="standDevActiveOffers"/>
			</acme:form>
	 
	<h2>
	<acme:message code="administrator.dashboard.form.title.investor-record"/>
	</h2>
	
	<div>
		<canvas id="canvas"></canvas>
	</div>
	<script type="text/javascript">
	$(document).ready(function(){
		var data = {
			labels:[
				<jstl:forEach var="sector" items="${sectors}"> 
				<jstl:out value="${sector}"/>
				</jstl:forEach>
				
			],
			datasets:[
				{
				data:[
				<jstl:forEach var="number" items="${totalInvestorGroupBySector}"> 
				<jstl:out value="${totalInvestorGroupBySector}"/>
				</jstl:forEach>
				]
				}
			]
		};
		var options = {
			scales :{
				yAxes :[
					{
						ticks:{
							suggestedMin:0.0;
							suggestedMax:20.0;
						}
					}
				]		
				
			},
			legend :{
				display:false
			}
		};
		
		var canvas,context;
		
		canvas = document.getElementById("canvas");
		context = canvas.getContext("2d");
		new Chart(context, {
			type:"bar",
			data:data,
			options: options
		});
	});
	</script>
	
	<h2>
	<acme:message code="administrator.dashboard.form.title.company-record"/>
	</h2>
	<div>
		<canvas id="canvas"></canvas>
	</div>
	<script type="text/javascript">
	$(document).ready(function(){
		var data = {
			labels:[
				<jstl:forEach var="sector" items="${sectors}"> 
				<jstl:out value="${sectors}"/>
				</jstl:forEach>

				
			],
			datasets:[
				{
				data:[
				<jstl:forEach var="number" items="${totalCompanyGroupBySector}"> 
				<jstl:out value="${totalInvestorGroupBySector}"/>
				</jstl:forEach>

				]
				}
			]
		};
		var options = {
			scales :{
				yAxes :[
					{
						ticks:{
							suggestedMin:0.0;
							suggestedMax:20.0;
						}
					}
				]		
				
			},
			legend :{
				display:false
			}
		};
		
		var canvas,context;
		
		canvas = document.getElementById("canvas");
		context = canvas.getContext("2d");
		new Chart(context, {
			type:"bar",
			data:data,
			options: options
		});
	});
	</script>
	
