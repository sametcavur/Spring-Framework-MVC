<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
</head>
<body>
	<form:form action="sonuc" modelAttribute="user">
	<table>
		<tr>
			<td>Username=</td>
			<td><form:input path="username"/></td>
		</tr>
		<tr>
			<td>Email=</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="gonder"></td>
		</tr>
	</table>
	</form:form>
</body>
</html>
