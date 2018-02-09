<%@ include file="header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false"%>
<style>
body { 
    /*  background: linear-gradient(to bottom, #ffffcc 1%, #669999 100%); 
 */	background-color: #f2f6f9;
	padding-top:80px; 
	}
</style>

<script>

    $(document).ready(function(){
        var searchCondition = '${searchCondition}';

        $('.table').DataTable({
        	 "lengthMenu": [[1,2,3,5,10, -1], [1,2,3,5,10, "All"]],
            "oSearch" : {"sSearch": searchCondition}
        })
    });
</script>
	<div class="container">
	<h3>Product List</h3>
	 <div  class="table-reponsive">
  <!-- <div class="col-sm-12 col-md-12 col-md-offset-1"> -->
	
	 <table class="table table-hover">
		<!-- <table class="table table-bordered table-striped"> -->
			<thead>
				<tr>
					<th>PID</th>
					<th></th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Category</th>
					<th>Supplier</th>
					<th></th>
					<th></th>
					
				</tr>
			</thead>
			<c:forEach var="pd" items="${productList}">
				<tr>
				
					<td>${pd.id}</td>
						<td>
				<c:url var="src" value="/resources/Images/${pd.id }.jpg"></c:url>
				<img class="img-thumbnail" src="${src }" width="120" height="120" />
				</td>
					<td>${pd.name}</td>				
					<td>${pd.description}</td>
					<td>${pd.price}</td>
					<td>${pd.quantity}</td>
					<td>${pd.category.categoryDetails}</td>
					<td>${pd.supplier.supname}</td>
					
					<td>
					<c:url var="url" value="/viewproduct/${pd.id }"></c:url>
					<a href="${url }"><span class="glyphicon glyphicon-info-sign"></span></a> 
					</td>
					
					 <c:if test="${pageContext.request.userPrincipal.name == 'admin'}"> 
					<td>
					<c:url var="delete" value="/admin/deleteproduct/${pd.id }"></c:url>
					<a href="${delete }"><span class="glyphicon glyphicon-remove"></span></a>
					</td>
					
					<td>
					<c:url var="edit" value="/admin/editform/${pd.id }"></c:url>
					<a href="${edit }"><span class="glyphicon glyphicon-pencil"></span></a>
				    </td>
				   
					</c:if>
					<c:if test="${pageContext.request.userPrincipal.name !=null}"> 
					 <c:if test="${pageContext.request.userPrincipal.name != 'admin'}"> 
					<td>
					<a href="<spring:url value="/favorite/${pd.id }" />">
					<img src="<c:url value="/resources/Images/fav.png" />" style="width:50px; height:50px"/></a>
					</td>
					</c:if>
					</c:if>
									
				</tr>
			</c:forEach>
		</table>
</div>
</div>
	

<br/>

<%@include file="footer.jsp" %>
