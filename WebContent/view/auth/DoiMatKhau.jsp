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
		<div class="row">
			<div class="col-md-5">
				<form>
					<h2>Doi Mat Khau</h2>
					<div class="row">
						<div class="col">
							<label>Username</label> <input type="text" class="form-control"
								placeholder="Username cua ban" required name="">
						</div>
						<div class="col">
							<label>Current Password</label> <input type="password"
								class="form-control" placeholder="Password hien tai" required
								name="">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>New Password</label> <input type="password"
								class="form-control" placeholder="Password moi" required
								name="">
						</div>
						<div class="col">
							<label>Confirm Password</label> <input type="password"
								class="form-control" placeholder="Xac nhan Password moi" required
								name="">
						</div>
					</div>
					<div class="form-group">
						<button class="btn btn-success" type="submit">Doi MK</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>


