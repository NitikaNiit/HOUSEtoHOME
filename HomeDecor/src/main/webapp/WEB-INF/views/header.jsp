<html>
<head>
  <title>HOUSEtoHOME</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="resources/Images/login.ico">
  <link rel="stylesheet" href="">
  <script src="resources/Bootstrap/css/bootstrap.min.css"></script>
  <script src="resources/Bootstrap/js/bootstrap.min.js"></script>
  
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="resources/css/hero.css">
  <link rel="stylesheet" href="resources/css/login.css">
<%@include file="login.jsp" %>
<%@include file="signup.jsp" %>
<%@include file="contact.jsp" %>

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
      <a class="navbar-brand" href="HOME">HOUSEtoHOME</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse ">
    <ul class="nav navbar-nav ">
      <li class="active"><a href="HOME"><i class="fa fa-home"></i></a></li>
      <li><a href="#">About</a></li>
      <li><a href="CONTACT" data-toggle="modal" data-target="#contactmodal">Contact Us</a></li>
      <li><a href="PRODUCTS">Products</a></li>
      <li><a href="produ">Add new Product</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="SIGNUP" data-toggle="modal" data-target="#signupmodal"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="LOGIN" data-toggle="modal" data-target="#loginmodal"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li><a href="www.google.com"><i class="fa fa-search"></i></a></li>
    </ul>
  </div>
  </div>
</nav>
</div>