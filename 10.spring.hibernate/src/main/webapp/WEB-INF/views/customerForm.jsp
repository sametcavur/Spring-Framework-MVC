<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>Customer Sing Up..!</title>
</head>
<body>
	<div class="container" >
		<h2>Sign Up Form</h2>
		<form:form action="saveCustomer" modelAttribute="customer">

			<div class="form-group">
				<form:label for="customerName" path="customerName">Name:</form:label> 
				<form:input type="text" class="form-control" id="customerName" 
				placeholder="Enter name" name="customerName" path="customerName"/>
			</div>

			<div class="form-group">
				<form:label for="customerSurname" path="customerSurname">Surname:</form:label>
				 <form:input type="text" class="form-control" id="customerSurname"
				  placeholder="Enter surname" name="customerSurname" path="customerSurname"/>
			</div>

			<div class="form-group">
				<form:label for="customerPhoneNumber" path="customerPhoneNumber">Phone Number:</form:label>
				 <form:input type="text" class="form-control" id="customerPhoneNumber" 
				 placeholder="Enter phone number" name="customerPhoneNumber" path="customerPhoneNumber"/>
			</div>

			<div class="form-group">
				<form:label for="customerEmail" path="customerEmail">Email:</form:label>
				 <form:input type="email" class="form-control" id="customerEmail" 
				 placeholder="Enter email" name="customerEmail" path="customerEmail"/>
			</div>

			<div class="form-group">
				<form:label for="customerPassword" path="customerPassword">Password</form:label> 
				<form:input type="password" class="form-control" id="customerPassword" 
				placeholder="Enter password" name="customerPassword" path="customerPassword"/>
			</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
	</div>
</body>
</html>
