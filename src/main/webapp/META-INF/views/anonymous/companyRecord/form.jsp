<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.companyRecord.form.label.name" path="name" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.incorporated" path="incorporated" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.sector" path="sector" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.ceo" path="ceo" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.activities" path="activities" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.link" path="link" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.phone" path="phone" width="10%"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.email" path="email" width="10%"/>
	<acme:form-integer code="anonymous.companyRecord.form.label.stars" path="stars" width="10%"/>
	
	<acme:form-submit code="anonymous.companyRecord.form.button.create" action="/anonymous/companyRecord/create"/>
	<acme:form-return code="anonymous.companyRecord.form.button.return"/>
</acme:form>	