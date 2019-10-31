<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">

	<acme:form-moment code="authenticated.active-request.form.label.moment" path="moment" width="20%"/>
	<acme:form-moment code="authenticated.active-request.form.label.deadline" path="deadline" width="20%"/>
	<acme:form-textbox code="authenticated.active-request.form.label.title" path="title" width="20%"/>
	<acme:form-textarea code="authenticated.active-request.form.label.description" path="description" width="20%"/>
	<acme:form-money code="authenticated.active-request.form.label.reward" path="reward" width="10%"/>
	<acme:form-textbox code="authenticated.active-request.form.label.ticker" path="ticker" width="10%"/>
	
	<acme:form-return code="authenticated.active-request.form.button.return"/>
	
</acme:form	>
