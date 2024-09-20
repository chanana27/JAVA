<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.dao.CountDao" %>
<%@ page import="com.db.DBConnect" %>
<%@ page import="com.entity.Doctor" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Dashboard</title>
<style type="text/css">
	        .paint-card{
	            box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
	        }
</style>
<%@ include file="../component/allcss.jsp"%>
</head>
<body>
	<c:if test="${empty docObj }">
		<c:redirect url="../doctor_login.jsp"></c:redirect>
	</c:if>

	<%@ include file="navbar.jsp"%>

	<p class="text-center fs-3">Doctor Dashboard</p>
	<%
	CountDao dao = new CountDao(DBConnect.getConn());
	Doctor doctor = (Doctor) session.getAttribute("docObj");
	%>﻿
	
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-2">
				<div class="card paint-card">
					<div class="card-body text-center text-success">
						<i class="fas fa-user-md fa-3x"></i>
						<p class="fs-4 text-center">
						Doctor<br> <%=dao.countDoctor()%>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-success">
						<i class="far fa-calendar-check fa-3x"></i>
						<p class="fs-4 text-center">
							Total Appointment <br> <%=dao.countAppointmentBySpecificDoctor(doctor.getId())%>
						</p>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>