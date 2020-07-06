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
<body class="container">


	<jsp:include page="banner.jsp" />

	<div class="row">
		<div class="col-2">
			<ul class="nav flex-column">
				<li class="nav-item"><a class="nav-link active" href="#">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="loadProductForm">Add
						Product</a></li>
				<li class="nav-item"><a class="nav-link" href="./listAll">Display</a>
				</li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Find</a></li>
			</ul>
		</div>
		<div class="col-10">
			<div class="jumbotron">
				<h1 class="display-4">Hello, world!</h1>
				<p class="lead">This is a simple hero unit, a simple
					jumbotron-style component for calling extra attention to featured
					content or information.</p>
				<hr class="my-4">
				<p>It uses utility classes for typography and spacing to space
					content out within the larger container.</p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more</a>
			</div>


		</div>

	</div>




</body>
</html>