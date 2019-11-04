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