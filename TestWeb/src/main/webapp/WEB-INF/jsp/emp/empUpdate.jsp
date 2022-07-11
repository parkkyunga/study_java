<%@page import="co.micol.prj.emp.EmpVO"%>
<%@page import="co.micol.prj.dept.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="co.micol.prj.emp.JobsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

input[type="submit"],button {
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

input[type="submit"]:hover,button:hover {
	box-shadow: -7px -7px 20px 0px #fff9, 
				-4px -4px 5px 0px #fff9, 
				7px 7px 20px 0px #0002, 
				4px 4px 5px 0px #0001;
}
</style>
</head>
<script type="text/javascript">
	function validateForm(){
		
		if(empFrm.empId.value == ""){
			alert("사번을 입력하세요");
			empFrm.empId.focus();
			return false;
		}
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
<%
EmpVO emp = (EmpVO)request.getAttribute("emp");
ArrayList<JobsVO> job = (ArrayList<JobsVO>)request.getAttribute("jobs"); 
ArrayList<DeptVO> dept = (ArrayList<DeptVO>)request.getAttribute("depts");
%>
	<h3>사원수정</h3>
	<form action="empUpdate" name="empFrm" method="post" onsubmit="return validateForm()">
		<label for="empId">직원번호</label> 
		<input type="number" name="empId" id="empId" value="<%=emp.getEmpId() %>" readonly="readonly"><br> 
		<label for="empName">직원이름</label> 
		<input type="text" name="empName" id="empName"value="<%=emp.getEmpName() %>"><br> 
		<label for="email">이메일</label> 
		<input type="text" name="email" id="email" value="<%=emp.getEmail() %>"><br>
		<label for="hireDate">입사일</label> 
		<input type="date" name="hireDate" id="hireDate" value="<%=emp.getHireDate().substring(0,10) %>"><br> 
		<label for="jobId">부서명</label> 
		<select name="jobId">
		<% for(JobsVO jobs : job){ %>
			<option value="<%=jobs.getJobId()%>"><%=jobs.getJobTitle() %>
		<% } %>
		</select><br>
		<% for(DeptVO depts : dept){ %>
			<input type="radio" name="deptId" value="<%=depts.getDeptId() %>"><%=depts.getDeptName() %>
		<%} %>
		<br>
		<input type="submit" value="수정하기">
		<button type="button" onclick="empDelete()">삭제하기</button>
	</form>
	<%-- <%if(jobs.getJobId().equals(emp.getJobId())){ %> selected="selected"<%} %> --%>
	<%-- <%if(depts.getDeptId().equals(emp.getDeptId())){ %> checked="checked" <%} %> --%>
<script type="text/javascript">
	document.getElementsByName("jobId")[0].value = "<%= emp.getJobId()%>";
	document.querySelector("[name=deptId][value='<%=emp.getDeptId() %>']").checked=true;
	
	function empDelete(){
		location.href="empDelete?empId=<%=emp.getEmpId() %>";
	}
</script>
</body>
</html>