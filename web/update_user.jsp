<%@page import="model.Customer"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="dao.UserDAOImpl"%>
<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/login.css" rel='stylesheet' type='text/css' />
<title>Đăng kí tài khoản</title>
</head>
<body>
	<%
		String err = "";
		if (request.getAttribute("err") != null) {
			err = (String) request.getAttribute("err");
		}
		String username= request.getParameter("username");
		UserDAOImpl userDAO = new UserDAOImpl();
		Customer u= userDAO.getCustomer(username);
	%>

	<!--/start-login-two-->
	<div class="login-02">
		<div class="two-login  hvr-float-shadow">
			<div class="two-login-head">
				<img src="images/top-note.png" alt="" />
				<h2>Cập nhật thông tin</h2>
				<lable></lable>
			</div>
			<form action="UpdateUser" method="post">
				<li style="color: red"></li>
				Tên đăng nhập
				<li><input type="text" class="text"
					value="<%=u.getAccount().getUserName()%>" readonly name="username"><a
					href="#" class=" icon2 user2"></a></li>
				Mật khẩu
				<li><input type="password" value="" 
					name="password"><a href="#" class=" icon2 lock2"></a></li>
				Số điện thoại
				<li><input type="text" value="<%=u.getTel()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getTel() %>';}" name="sdt"><a
					href="#" class=" icon2 lock2"></a></li>
				Số nhà
				<li><input type="text" value="<%=u.getAddress().getNoHome()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getAddress().getNoHome()%>';}"
					name="diachi"><a href="#" class=" icon2 lock2"></a></li>
                                Đường
				<li><input type="text" value="<%=u.getAddress().getStreet()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getAddress().getStreet()%>';}"
					name="duong"><a href="#" class=" icon2 lock2"></a></li>
                                Quận
				<li><input type="text" value="<%=u.getAddress().getDistrict()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getAddress().getDistrict()%>';}"
					name="quan"><a href="#" class=" icon2 lock2"></a></li>
                                Thành phố
                                <li><input type="text" value="<%=u.getAddress().getCity()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getAddress().getCity()%>';}"
					name="thanhpho"><a href="#" class=" icon2 lock2"></a></li>
                                Tên
                                <li><input type="text" value="<%=u.getFullname().getFirstName()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getFullname().getFirstName()%>';}"
					name="ten"><a href="#" class=" icon2 lock2"></a></li>
                                Họ
                                <li><input type="text" value="<%=u.getFullname().getLastName()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getFullname().getLastName()%>';}"
					name="ho"><a href="#" class=" icon2 lock2"></a></li>
                                Đệm
                                <li><input type="text" value="<%=u.getFullname().getMidName()%>"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = '<%=u.getFullname().getMidName()%>';}"
					name="tendem"><a href="#" class=" icon2 lock2"></a></li>
				
				<div class="submit two">
					<input type="submit" value="CẬP NHẬT">
                                        <input type="hidden" value="<%=u.getId()%>" name="id">
				</div>
				<h5>
					<a href="index.jsp">Trở về</a>
				</h5>
			</form>
		</div>
	</div>
</body>
</html>