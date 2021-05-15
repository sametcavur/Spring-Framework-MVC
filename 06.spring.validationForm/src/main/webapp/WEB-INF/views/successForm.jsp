<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<table>
		<tr>
			<td>Username=</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>Email=</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>Salary=</td>
			<td>${user.salary}</td>
		</tr>
		<tr>
			<td>Password=</td>
			<td>${user.password}</td>
		</tr>
	</table>
</body>
</html>
