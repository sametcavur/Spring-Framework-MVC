<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
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
		<h2>Hello Buddy,Please Select One..!</h2>
		<div class="alert alert-success">
			<a href="customerForm">Customer Sign Up Form</a>
		</div>
	</div>
	<div class="container">
		<div class="alert alert-info">
			<a href="customerDeleteForm">Customer Delete</a>
		</div>
	</div>
	<div class="container">
		<div class="alert alert-danger">
			<a href="customerInfoList">Customer Info List</a>
		</div>
	</div>

</body>
</html>
