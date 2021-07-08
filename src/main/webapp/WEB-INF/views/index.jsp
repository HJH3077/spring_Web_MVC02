<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>첫번째 Spring MVC Annotation 예제</h2>
	<form action="hello.do">
		<input type="submit" value="hello(get)">
	</form>
	<hr>
	<form action="hello.do" method="post">
		<input type="submit" value="hello(post)">
	</form>
	<hr>
	<!-- a링크는 get방식 -->
	<h2><a href="hi.do">hi</a></h2>
</body>
</html>