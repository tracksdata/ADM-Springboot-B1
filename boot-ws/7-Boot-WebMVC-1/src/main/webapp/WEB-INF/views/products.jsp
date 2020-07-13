<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>
	<hr />
	<jsp:include page="menu.jsp" />


	<table border="1" align="center">

		<tr>

			<th>Product Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Description>
			<th>Product added date</th>
		</tr>

		<c:forEach items="${prods}" var="product">

			<tr>

				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.description}</td>
				<td>${product.dateAdded}</td>


			</tr>

		</c:forEach>


	</table>



</body>
</html>