<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录窗口</title>
<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row" style="margin-top: 80px">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-primary">
					<div class="panel-heading">登录</div>
					<div class="panel-body">
						<form action="${pageContext.request.contextPath}/login" method="post"  >
							<div class="form-group">
								<label for="userName">用户名</label> <input type="text"
									class="form-control" name="userName" placeholder="请输入用户名">
							</div>
							<div class="form-group">
								<label for="password">密码</label> <input type="password"
									class="form-control" name="password" placeholder="请输入密码"
									value="" >
							</div>
							<div class="form-inline text-right">
								<button type="submit" class="btn btn-primary">登录</button>
								<button type="reset" class="btn btn-default" focus>重置</button>
							</div>
						</form>
						<!-- 出错显示的信息框 -->
						<c:if test="${not empty login_msg}">
							<div role="alert">
								<strong>${login_msg}</strong>
							</div>
						</c:if>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>