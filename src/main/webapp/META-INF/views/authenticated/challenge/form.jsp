<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.challenge.form.label.title" path="title"/>
	<acme:form-textarea code="authenticated.challenge.form.label.description" path="description"/>
	<acme:form-moment code="authenticated.challenge.form.label.deadline" path="deadline"/>
	<acme:form-textbox code="authenticated.challenge.form.label.goalGold" path="goalGoldName"/>
		<acme:form-textbox code="authenticated.challenge.form.label.reward" path="goldReward"/>
	<acme:form-textbox code="authenticated.challenge.form.label.goalSilver" path="goalSilverName"/>
		<acme:form-textbox code="authenticated.challenge.form.label.reward" path="silverReward"/>
	
	<acme:form-textbox code="authenticated.challenge.form.label.goalBronze" path="goalBronzeName"/>
		<acme:form-textbox code="authenticated.challenge.form.label.reward" path="bronzeReward"/>
	
	
	<acme:form-return code="authenticated.challenge.form.button.return"/>
	
</acme:form>