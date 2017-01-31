<html>
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="">
  <script src="resources/Bootstrap/css/bootstrap.min.css"></script>
  <script src="resources/Bootstrap/js/bootstrap.min.js"></script>
  
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="resources/css/hero.css">
  <link rel="stylesheet" href="resources/css/login.css">
<link rel="stylesheet" href="resources/css/callout.css">
<%@include file="login.jsp" %>
<%@include file="signup.jsp" %>
<%@include file="contact.jsp" %>
  <style> 
  h1{
  color:  #66cc00;
  }
	body {
    background-color: #d9d9d9;
	}

  </style>
</head>
<body>
<div class="navbar-wrapper">
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
      <a class="navbar-brand" href="#">HOUSEtoHOME</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="CONTACT" data-toggle="modal" data-target="#contactmodal">Contact Us</a></li>
      <li><a href="PRODUCTS">Products</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <form class="navbar-form navbar-left">
  			<div class="input-group">
   			 <input type="text" class="form-control" placeholder="Search...">
   				 <div class="input-group-btn">
     			 <button class="btn btn-default btn-sm" type="submit" >
       				<p><span class="glyphicon glyphicon-search"></span></p>
      			 </button>
   				 </div>
  			</div>
		</form>
      <li><a href="SIGNUP" data-toggle="modal" data-target="#signupmodal"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="LOGIN" data-toggle="modal" data-target="#loginmodal"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
  </div>
</nav>
</div>