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



	<jsp:include page="menu.jsp" />

	<hr />

	<div class="row">
		<div class="col-2"></div>
		<div class="col-8">
			<div class="card">
				<div class="card-header">Product Form</div>
				<div class="card-body">
					<form action="saveProductV2" method="post" autocomplete="off">

						<div class="form-group">
							<label>Product Id</label>
							<input name="id" class="form-control">
						</div>

						<div class="form-group">
							<label>Product Name</label>
							<input name="name" class="form-control">
						</div>

						<div class="form-group">
							<label>Product Price</label>
							<input name="price" class="form-control">
						</div>

						<div class="form-group">
							<label>Description</label>
							<textarea name="description" class="form-control"></textarea>
						</div>

						<div class="form-group">
							<span>${msg} </span>
						</div>


						<div class="form-group text-center">
							<button class="btn btn-primary">Save</button>
							<button class="btn btn-danger">Cancel</button>
							<button type="reset" class="btn btn-warning">Reset</button>

						</div>

					</form>
				</div>
			</div>

		</div>
	</div>





</body>
</html>