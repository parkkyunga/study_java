<%@page import="co.micol.prj.dept.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp" />
<a href="DeptInsert">부서등록</a>
<h3>부서목록</h3>
	<table>
		<thead>
			<tr>
				<th>부서번호</th>
				<th>부서이름</th>
				<th>관리자</th>
				<th>위치</th>
			</tr>
		</thead>
		<tbody>
		<% ArrayList<DeptVO> list = (ArrayList<DeptVO>)request.getAttribute("list"); 
		for(DeptVO vo : list){
		%>
		<tr>
			<td><%=vo.getDeptId() %></td>
			<td><%=vo.getDeptName() %></td>
			<td><%=vo.getMngId() %></td>
			<td><%=vo.getLocId() %></td>
		</tr>
		<%} %>
		</tbody>
		<tbody>
			<c:forEach var="vo" items="${list}">
				<tr>
					<td>${vo.deptId }</td>
					<td><a href="deptUpdate?deptId=${vo.deptId }">${vo.deptName }</a></td>
					<td>${vo.mngId }</td>
					<td>${vo.locId }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>