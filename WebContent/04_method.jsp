<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿</title>
</head>
<body>
	<form method="get" action="MethodServlet">
		<input type="submit" value="get방식으로 호출하기"> 
		<!--get은 내용을 공개한다, 짧게 정보요청할때(인터넷 검색).-->
	</form>
	<br>
	<br>
	<form method="post" action="MethodServlet">
		<input type="submit" value="post방식으로 호출하기"> 
		<!--post은 내용을 공개하지 않는다, 보안이 중요할 일을 처리할때.-->
	</form>
</body>
</html>