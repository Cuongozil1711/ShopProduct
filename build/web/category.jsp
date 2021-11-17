<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page import="dao.CategoryDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu dọc</title>
<link rel="stylesheet" href="css/category.css" />
</head>
<body>
	<div class="container">
		<nav>
		<ul class="mcd-menu">
			
			<li><a href="index.jsp?ma_the_loai=x"> <i class="fa fa-home"><img
						src="images/book.png" class="icon_img" /></i>
					<strong>Book</strong> 
			</a></li>
                        <li><a href="index.jsp?ma_the_loai=x"> <i class="fa fa-home"><img
						src="images/electronic.jpg"  class="icon_img" /></i>
					<strong>Electronics</strong>
			</a></li>
                         <li><a href="index.jsp?ma_the_loai=x"> <i class="fa fa-home"><img
						src="images/6.png"  class="icon_img" /></i>
					<strong>Shoes</strong> 
			</a></li>
                          <li><a href="index.jsp?ma_the_loai=x"> <i class="fa fa-home"><img
						src="images/3.png" class="icon_img"  /></i>
					<strong>Clothes</strong>
			</a></li>
			
		</ul>
		</nav>
	</div>
</body>
</html>