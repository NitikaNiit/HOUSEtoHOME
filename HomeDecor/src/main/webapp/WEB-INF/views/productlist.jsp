<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Browse Products</title>
<style>
body {
	background-color:;
	padding-top: 80px;
}
</style>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>PID</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Category</th>
				</tr>
			</thead>
			<c:forEach var="pd" items="${productList}">
				<tr>
					<td>${pd.id}</td>
					<td>${pd.name}</td>
					<td>${pd.description}</td>
					<td>${pd.price}</td>
					<td>${pd.quantity}</td>
					<td>${pd.category.categoryDetails}</td>
					<td><a href="viewprod"><span
							class="glyphicon glyphicon-info-sign"></span></a></td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>
