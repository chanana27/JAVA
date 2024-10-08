<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.entity.Appointment"%>
<%@page import="com.dao.AppointmentDao"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.entity.Doctor"%>
<%@page import="com.dao.DoctorDao"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Medi Home</title>
<%@ include file="../component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="col-md-12">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Patient Details</p>
						<table class="table table-striped">
						  <thead>
						    <tr>
						      <th scope="col">Full Name</th>
						      <th scope="col">Gender</th>
						      <th scope="col">Age</th>
						      <th scope="col">Email</th>
						      <th scope="col">Mobile No</th>
						      <th scope="col">Address</th>
						      <th scope="col">Appointment Date</th>
						      <th scope="col">Disease</th>
						      <th scope="col">Doctor</th>
						      <th scope="col">Status</th>
						    </tr>
						  </thead>
						  <tbody>
						  <%
						  AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
						  List<Appointment> list = dao.getAllAppointments();
						  DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
						  for(Appointment ap: list){
						  Doctor d = dao2.getDoctorById(ap.getDoctorId());
						  %>
							
						    <tr>
						      <th scope="row"> <%=ap.getFullName() %></th>
						      <td><%=ap.getGender() %></td>
						      <td><%=ap.getAge() %></td>
						      <td><%=ap.getEmail() %></td>
						      <td><%=ap.getPhNo() %></td>
						      <td><%=ap.getAddress() %></td>
						      <td><%=ap.getAppoinDate() %></td>
						      <td><%=ap.getDiseases() %></td>
						      <td><%=d.getFullName() %></td>
						      <td><%=ap.getStatus() %></td>
						      
						    </tr>
						  <%						  
						  }
						  %>  
						    
						  </tbody>
					</table>
				</div>
			</div>
		</div>
				
</body>
</html>