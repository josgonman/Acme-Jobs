<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.companyRecord.form.label.name" path="nameIncorporated" />
	<acme:form-checkbox code="anonymous.companyRecord.form.label.incorporated" path="incorporated"/>
	<acme:form-textbox code="anonymous.companyRecord.form.label.sector" path="sector" />
	<acme:form-textbox code="anonymous.companyRecord.form.label.ceo" path="ceo" />
	<acme:form-textbox code="anonymous.companyRecord.form.label.activities" path="activities" />
	<acme:form-textbox code="anonymous.companyRecord.form.label.link" path="link" />
	<acme:form-textbox code="anonymous.companyRecord.form.label.phone" path="phone" />
	<acme:form-textbox code="anonymous.companyRecord.form.label.email" path="email" />
	<acme:form-integer code="anonymous.companyRecord.form.label.stars" path="stars"/>
	
	<acme:form-return code="anonymous.companyRecord.form.button.return"/>
</acme:form>	