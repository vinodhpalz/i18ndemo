<%@ page contentType="text/html;charset=UTF-8" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html>
<html>
<head>
<title>I18N Demo</title>
</head>
<body>

<h2><spring:message code="lbl.page"/></h2>
	<table border="1">
		<tr>
			<th><spring:message code="lbl.Id"/></th>
			<th><spring:message code="lbl.firstName"/></th>
			<th><spring:message code="lbl.lastName"/></th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>