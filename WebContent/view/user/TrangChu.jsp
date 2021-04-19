<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width = device-width, initial-scale=1.0">
<title>Assignment</title>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/view/user/style.css">
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container">
			<a class="navbar-brand" href="#">Online Entertainment</a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse " id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active" href="#">My-Favorites</a></li>

					<li class="nav-item dropdown"><a class="nav-link" href="#"
						id="navbarDropdown"> My Account </a>
						<div class="dropdown-content">
							<a class="dropdown-item" href="${ pageContext.request.contextPath }/login">Login</a> <a
								class="dropdown-item" href="#">Forgot Password</a> <a
								class="dropdown-item" href="#">Registration</a> <a
								class="dropdown-item" href="#">Logoff</a> <a
								class="dropdown-item" href="#">Change Password</a> <a
								class="dropdown-item" href="#">Edit Profile</a>
						</div></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="product-group">
			<div class="row">
				<c:forEach var="video" items="${ listVideo }">
					<div class="col-md-4 col-sm-4">
						<div class="card card-product mb-3">
							<img src="https://via.placeholder.com/320x180"
								class="card-img-top" alt="Card image cap">
							<div class="card-body">
								<h5 class="card-title">${ video.title}</h5>
								<ul class="nav justify-content-end">
									<a href="#" class="btn btn-primary">Like</a>
									<a href="#" class="btn btn-primary">Share</a>
								</ul>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>

	<div class="container">
		<ul class="pagination justify-content-center">
			<li class="page-item"><a class="page-link"
				href="/PT15307-UD/trangchu?page=${ page - 1 }"> |< </a></li>
			<li class="page-item"><a class="page-link"
				href="/PT15307-UD/trangchu?page=${ page - 1 }"> << </a></li>
			<li class="page-item"><a class="page-link"
				href="/PT15307-UD/trangchu?page=${ page + 1 }"> >> </a></li>
			<li class="page-item"><a class="page-link"
				href="/PT15307-UD/trangchu?page=${ page + 1 }"> >| </a></li>
		</ul>
	</div>

	
</body>
</html>
