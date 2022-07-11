<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table,tr,th,td{
	border:1px solid #E0E0E0;
	border-collapse: collapse;
}
td,th{padding:5px;}
</style>
<body>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
 	 	<c:forEach var="vo" items="${list}"> 
			<tr>
				<td>${vo.id }</td>
				<td><a href="boardUpdate?Id=${vo.id}">${vo.title }</a></td>
				<td>${vo.content }</td>
				<td>${vo.writer }</td>
				<td>${vo.rdt }</td>
				<td>${vo.hit }</td>
			</tr>
		</c:forEach>   
	</tbody>
</table>
<a href="boardInsert">글작성하기</a>
</body>
</html>