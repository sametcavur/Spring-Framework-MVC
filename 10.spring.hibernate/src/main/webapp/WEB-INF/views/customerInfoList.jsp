<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer List</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<td>ID:</td>
					<td>Name:</td>
					<td>Surname:</td>
					<td>Phone Number:</td>
					<td>Email:</td>
					<td>Password</td>
					<td></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customer}" var="customer">
					<tr>
						<td>${customer.customerId}</td>
						<td>${customer.customerName}</td>
						<td>${customer.customerSurname}</td>
						<td>${customer.customerPhoneNumber}</td>
						<td>${customer.customerEmail}</td>
						<td>${customer.customerPassword}</td>
						<td><a href="updateCustomer">Guncelle</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
