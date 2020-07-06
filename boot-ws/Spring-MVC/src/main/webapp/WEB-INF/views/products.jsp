<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body class="container">
	<jsp:include page="menu.jsp" />


	<div class="card">
	
	<div class="card-header text-center bg-warning">Products from Abc Store</div>

		<div class="card-body">
			<table class="table table-sm table-hover">

				<tbody>
					<tr>
						<th>Product Id</th>
						<th>Product name</th>
						<th>Description</th>
						<th>Price</th>
					</tr>
				</tbody>



				<c:forEach items="${prods}" var="product">
					<tbody>
						<tr>
							<td><a href="./update?product=${product}">${product.id}</a></td>
							<td>${product.name}</td>
							<td>${product.description}</td>
							<td>${product.price}</td>

						</tr>
					</tbody>

				</c:forEach>



			</table>
		</div>

	</div>




</body>
</html>