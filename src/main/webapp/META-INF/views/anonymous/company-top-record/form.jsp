<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.name" path="name" />
	<acme:form-checkbox code="anonymous.companyTopRecord.form.label.incorporated" path="incorporated"/>
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.sector" path="sector" />
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.ceo" path="ceo" />
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.activities" path="activities" />
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.link" path="link" />
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.phone" path="phone" />
	<acme:form-textbox code="anonymous.companyTopRecord.form.label.email" path="email" />
	<acme:form-integer code="anonymous.companyTopRecord.form.label.stars" path="stars"/>
	
	<acme:form-return code="anonymous.companyTopRecord.form.button.return"/>
</acme:form>	