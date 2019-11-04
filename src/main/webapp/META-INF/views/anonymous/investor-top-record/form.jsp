<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.investor-top-record.form.label.name" path="name"/>
	<acme:form-textbox code="anonymous.investor-top-record.form.label.sector" path="sector"/>
	<acme:form-textarea code="anonymous.investor-top-record.form.label.investorStatement" path="investorStatement"/>
	<acme:form-integer code="anonymous.investor-top-record.form.label.stars" path="stars"/>
	<acme:form-return code="anonymous.investor-top-record.form.button.return"/>
</acme:form>	