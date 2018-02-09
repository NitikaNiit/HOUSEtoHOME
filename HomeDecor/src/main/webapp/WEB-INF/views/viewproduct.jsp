<%@ include file="header.jsp"%>
 <link href="<c:url value="/resources/css/tyr.css" />" rel="stylesheet">
 <script src="<c:url value="/resources/js/tyr.js"/>"></script>
<style>
body {
	/* background: linear-gradient(to bottom, #ffffcc 1%, #669999 100%); */
	background-color: #f2f6f9; 
	padding-top: 80px;
}

.hero-slide {
	margin-top: 45px;
}



ul.unstyled {
	list-style: none;
	padding: 0;
}
</style>
<body ng-app="app" ng-controller="ProductController">
	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>
					<b>Product Details</b>
				</h1>

				<p class="lead">Here is the detail information of the product:</p>
			</div>

			<div class="container">
				<div class="row">
					<div class="col-md-6 magnify">
						<div class="large" style="background:url('../resources/Images/${product.id }.jpg') no-repeat; "  ></div>
						<c:url var="src" value="/resources/Images/${product.id }.jpg"></c:url>
						<img class="small" src="${src }" alt="image" style="width: 200px" />
						<%-- <img src="<c:url value="/resources/Images/${product.id}.jpg" />" alt="image" style="width:100%"/> --%>
					</div>
					<div class="col-md-2"></div>
					<div class="col-md-4">
						<h3>${product.name}</h3>
						<p>${product.description}</p>
						<p>
							<strong>Category</strong>: ${product.category.categoryDetails}
						</p>
						<p>Rs ${product.price}</p>
						<%-- <c:url value="/addCartItem/${product.id }" var="url"></c:url> --%>
						<c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
							<a href="#" class="btn btn-warning btn-lg"
								ng-click="addToCart(${product.id })"> <span
								class="glyphicon glyphicon-shopping-cart"></span>Add to Cart

							</a>
						</c:if>
						<a href="<c:url value="/prodlist" />" class="btn btn-danger btn-lg" >View more Products</a> <br />
					</div>

				</div>

			</div>

		</div>
	</div>

	<br />
	<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>
	<%@ include file="footer.jsp"%>