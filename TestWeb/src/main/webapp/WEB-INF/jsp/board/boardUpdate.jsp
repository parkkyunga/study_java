<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
form {
	padding: 10px;
}

form>label {
	display: inline-block;
	width: 25%;
	background-color: orange;
	text-align: center;
}
</style>
</head>
<body>
<h3>글 수정하기</h3>
<form action="boardUpdate" method="post">
	<label for="id">번호</label> <input type="text" name="id" value="${vo.id }"><br> 
	<label for="title">제목</label> <input type="text" name="title"><br> 
	<label for="content">내용</label> <textarea rows="10" cols="30" name="content"></textarea><br> 
	<label for="writer">작성자</label> <input type="text" name="writer"><br> 
	<label for="rdt">날짜</label> <input type="date" name="rdt"><br> 
	<button type="submit">등록</button>
</form>
</body>
</html>