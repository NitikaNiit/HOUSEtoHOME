var app = angular.module("app", [])
app.controller("ProductController", function($scope, $http) {
	$scope.addToCart = function(productId) {
		$http.post('http://localhost:9002/HomeDecor/addCartItem/' + productId)
				.success(function() {
					alert('Product successfully added to the cart');
				});
	};

});