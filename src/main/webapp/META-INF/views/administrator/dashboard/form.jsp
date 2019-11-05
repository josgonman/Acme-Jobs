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
	<acme:form-double code="administrator.dashboard.form.label.standDevAOmin" path="standDevActiveOffersMin"/>
	<acme:form-double code="administrator.dashboard.form.label.standDevAOmax" path="standDevActiveOffersMax"/>

</acme:form>
	 
	<h2 align="center">
	<acme:message code="administrator.dashboard.form.title.investor-record"/>
	</h2>
	
	<div>
		<canvas id="canvas"></canvas>
	</div>
	
	<script type="text/javascript">
	$(document).ready(function(){
		var data = {
			labels:[
				<jstl:forEach var="iterator" items="${totalInvestorGroupBySector}"> 
						"<jstl:out value="${iterator[0]}"/>",
				</jstl:forEach>
			],
			datasets:[
				{
				data:[
						<jstl:forEach var="iterator" items="${totalInvestorGroupBySector}"> 
							<jstl:out value="${iterator[1]}"/>,
						</jstl:forEach>
					]
				}
			]
		};
		var options = {
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
	
	<h2 align="center">
	<acme:message code="administrator.dashboard.form.title.company-record"/>
	</h2>
	<div>
		<canvas id="canvas02"></canvas>
	</div>
	<script type="text/javascript">
	$(document).ready(function(){
		var data = {
			labels:[
				<jstl:forEach var="iterator" items="${totalCompanyGroupBySector}"> 
				"<jstl:out value="${iterator[0]}"/>",
				</jstl:forEach>

				
			],
			datasets:[
				{
				data:[
				<jstl:forEach var="iterator" items="${totalCompanyGroupBySector}"> 
				<jstl:out value="${iterator[1]}"/>,
				</jstl:forEach>

				]
				}
			]
		};
		var options = {
			scales : {
				yAxes: [
					{
						ticks : {
							suggestedMin: 0.0,
							suggestedMax: 2.0
						}
					}
				]
			},	
			legend :{
				display:false
			}
		};
		
		var canvas,context;
		
		canvas = document.getElementById("canvas02");
		context = canvas.getContext("2d");
		new Chart(context, {
			type:"bar",
			data:data,
			options: options
		});
	});
	</script>
	
