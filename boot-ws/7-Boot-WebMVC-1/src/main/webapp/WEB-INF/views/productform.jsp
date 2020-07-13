<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp" />
	<hr />
	<jsp:include page="menu.jsp" />


	<div align="center">
		<form:form modelAttribute="product">
			<form:input path="name" />
			<br />
			<form:input path="price" />
			<br />
			<form:textarea path="description" />
			<br />
			<input type="datetime-local" name="dateAdded"
				value="${product.dateAdded }" />
			<br>
			<form:input path="dateAdded" />
			<br />
		</form:form>

	</div>


</body>
</html>