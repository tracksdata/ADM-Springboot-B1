<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>

	<jsp:include page="banner.jsp" />
	<ul class="nav justify-content-center">
		<li class="nav-item"><a class="nav-link active" href="./">Home</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="./loadProductForm">Add
				Product</a></li>
		<li class="nav-item"><a class="nav-link" href="./listAll">Display
				Products</a></li>
		<li class="nav-item"><a class="nav-link disabled" href="#"
			tabindex="-1" aria-disabled="true">Find Product</a></li>
	</ul>

</body>
</html>