<%@page import="co.micol.prj.dept.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="co.micol.prj.emp.JobsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInsert.jsp</title>
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

input[type="submit"] {
	margin-top: 10px; outline : none;
	width: 130px;
	height: 40px;
	padding: 10px 25px;
	border: 2px solid #000;
	font-family: 'Lato', sans-serif;
	font-weight: 500;
	background: transparent;
	cursor: pointer;
	transition: all 0.3s ease;
	position: relative;
	display: inline-block;
	transition: all 0.3s ease;
	outline: none;
}

input[type="submit"]:hover {
	box-shadow: -7px -7px 20px 0px #fff9, 
				-4px -4px 5px 0px #fff9, 
				7px 7px 20px 0px #0002, 
				4px 4px 5px 0px #0001;
}
</style>
</head>
<script type="text/javascript">
	function validateForm(){
		
	/* 	if(empFrm.empId.value == ""){
			alert("사번을 입력하세요");
			empFrm.empId.focus();
			return false;
		} */
		if(empFrm.empName.value == ""){
			alert("이름을 입력하세요");
			empFrm.empName.focus();
			return false;
		}
		if(empFrm.email.value == ""){
			alert("이메일을 입력하세요");
			empFrm.email.focus();
			return false;
		}
		var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		if(regExp.test(empFrm.email.value) == false){
			alert("이메일형식을 확인하세요.")
			empFrm.email.focus();
			return false;
		}
		
		if(empFrm.hireDate.value == ""){
			alert("입사일를 입력하세요");
			empFrm.hireDate.focus();
			return false;
		}
		if(empFrm.jobId.value == ""){
			alert("부서명를 입력하세요");
			empFrm.jobId.focus();
			return false;
		}
		return true;
	}
	
</script>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp" />
	<h3>사원등록</h3>
	<form action="empInsert" name="empFrm" method="post" onsubmit="return validateForm()">
		<label for="empId">직원번호</label> 
		<input type="number" name="empId" id="empId" disabled="disabled"><br> 
		<label for="empName">직원이름</label> 
		<input type="text" name="empName" id="empName"><br> 
		<label for="email">이메일</label> 
		<input type="text" name="email" id="email"><br>
		<label for="hireDate">입사일</label> 
		<input type="date" name="hireDate" id="hireDate"><br> 
		<label for="jobId">부서명</label> 
		<select name="jobId">
		<c:forEach var="job" items="${jobs}">
			<option value="${job.getJobId()}">${ job.getJobTitle() }
		</c:forEach>
		</select><br>
		<%
		ArrayList<DeptVO> vo = (ArrayList<DeptVO>)request.getAttribute("depts");
		for(DeptVO depts : vo){
		%>
			<input type="radio" name="deptId" value="<%=depts.getDeptId() %>"><%=depts.getDeptName() %>
		<%} %>
		<br>
		<input type="submit" value="등록">
	</form>
</body>
</html>