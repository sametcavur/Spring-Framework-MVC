<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<title>Sonuc Sayfasi</title>
</head>
<body>
	<table>
		<tr>
			<td>First Name=</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>Email=</td>
			<td>${user.email}</td>
		</tr>
	</table>
</body>
</html>