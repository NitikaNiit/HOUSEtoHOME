<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Angular Sort and Filter</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style>
        body { padding-top:50px; }
    </style>

    <!-- JS -->
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
    <script src="resources/js/app.js"></script>
<style>
body { 
	background-color:#d9d9d9;
	height:"100%";
	padding-top:50px; 
	}
</style>
</head>
<body>

<div class="container" ng-app="sortApp" ng-controller="mainController">
  
  <div class="alert alert-info">
    <p>Products</p>
  </div>
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search da Fish" ng-model="searchFish">
      </div>      
    </div>
  </form>
  
  <table class="table table-bordered table-striped">
    
    <thead>
      <tr>
        <td>
          <a href="#" ng-click="sortType = 'id'; sortReverse = !sortReverse">
            Pid
            <span ng-show="sortType == 'id' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'id' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#">Image
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'item'; sortReverse = !sortReverse">
            Item
            <span ng-show="sortType == 'item' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'item' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'price'; sortReverse = !sortReverse">
          Price 
            <span ng-show="sortType == 'price' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'price' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" >View more</a>
            
        </td>
      </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="roll in product| orderBy:sortType:sortReverse | filter:searchitem">
        <td>{{ roll.pid }}</td>
        <td>{{ roll.image }}</td>
        <td>{{ roll.item }}</td>
        <td>{{ roll.price }}</td>
     <td><button>View more</button></td>
      </tr>
    </tbody>
    
  </table>
  
  <p class="text-center text-muted">
    <a href="#" target="_blank">ALL PRODUCTS</a>
  </p>
  
  <p class="text-center">
    by <a href="HOME" target="_blank">HOUSEtoHOME</a>
  </p>
  
</div>
</body>
</html>