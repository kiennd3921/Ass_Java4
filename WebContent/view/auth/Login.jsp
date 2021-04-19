<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width = device-width, initial-scale=1.0">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<link rel="stylesheet" type="text/css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<div class="row col-md-5">
			<h1>${ error }</h1>
			<form action="${ pageContext.request.contextPath }/login"
				method="POST">
				<h2>LOGIN</h2>
				<div class="form-group">
					<label>Email</label> <input type="email" class="form-control"
						placeholder="Email cua ban" required name="email">
				</div>
				<div class="form-group">
					<label>Password</label> <input type="password" class="form-control"
						placeholder="Password cua ban" required name="password">
				</div>
				<div class="form-group">
					<input type="checkbox" name=""> <label>Remember-Me?</label>
				</div>
				<div class="form-group">
					<button class="btn btn-success" type="submit">Login</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>


