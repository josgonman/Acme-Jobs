<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly = "true">

<acme:form-moment code="authenticated.active-request.form.label.moment" path="moment"/>
<acme:form-moment code="authenticated.active-request.form.label.deadline" path="deadline" />
<acme:form-textbox code="authenticated.active-request.form.label.title" path="title" />
<acme:form-textarea code="authenticated.active-request.form.label.description" path="description" />
<acme:form-textbox code="authenticated.active-request.form.label.ticker" path="ticker" />	
<acme:form-money code="authenticated.active-request.form.label.reward" path="reward" />
	
	<acme:form-return code="authenticated.active-request.form.label.button.return" />
	
</acme:form>
