<%@ include file="header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div data-ng-app="app" data-ng-controller="ProductController">
		<div data-ng-init="getCart(${cartId})">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Quantity</th>
						<th>Total Price</th>
					</tr>
				</thead>

				<tr data-ng-repeat="Item in cartItem">
					<td>{{Item.product.name}}</td>
					<td>{{Item.quantity}}</td>
					<td>{{Item.totalPrice}}</td>
				</tr>

			</table>
		</div>

	</div>
	<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>
</body>
</html>