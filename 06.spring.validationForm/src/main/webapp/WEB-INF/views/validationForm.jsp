<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<title>Validation Form</title>
</head>
<body>
<form:form action="successForm" modelAttribute="user">
	<table>
		<tr>
			<td>Username=</td>
			<td><form:input path="username"/><form:errors path="username"></form:errors></td>
		</tr>
		<tr>
			<td>Email=</td>
			<td><form:input path="email"/><form:errors path="email"></form:errors></td>
		</tr>
		<tr>
			<td>Salary=</td>
			<td><form:input path="salary"/><form:errors path="salary"></form:errors></td>
		</tr>
		<tr>
			<td>Password=</td>
			<td><form:password path="password"/><form:errors path="password"></form:errors></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="GÖNDER"></td>
		</tr>
	</table>
	</form:form>
</body>
</html>
