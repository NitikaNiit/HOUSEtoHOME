<%@ include file="header.jsp"%>
<style>
body {
	background: linear-gradient(to bottom, #ffffcc 1%, #669999 100%);
	padding-top: 80px;
}

footer {
	position: absolute;
	bottom: 0px;
	left: 0;
	right: 0;
}
</style>
<body>
	<div ng-app="app" ng-controller="ProductController">
		<div ng-init="getCart(${cartId})">
			<div class="container">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Name</th>
							<th>Quantity</th>
							<th>Total Price</th>
						</tr>
					</thead>
					<tr ng-repeat="cartItem in cart.cartItems">
						<td>{{cartItem.product.name}}</td>
						<td>{{cartItem.quantity}}
							<button class="btn btn-success" type="button">+</button>
							<button class="btn btn-inverse" type="button">-</button>
						</td>
						<td>{{cartItem.totalPrice}}</td>
					</tr>

				</table>
			</div>
		</div>

	</div>
	<br />
	<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>
	<%@ include file="footer.jsp"%>