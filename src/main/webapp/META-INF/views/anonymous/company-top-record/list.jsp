
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list >
	<acme:list-column code="anonymous.companyTopRecord.list.label.name" path="nameIncorporated" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.sector" path="sector" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.ceo" path="ceo" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.activities" path="activities" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.link" path="link" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.phone" path="phone" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.email" path="email" width="10%"/>
	<acme:list-column code="anonymous.companyTopRecord.list.label.stars" path="stars" width="10%"/>
</acme:list>	
	