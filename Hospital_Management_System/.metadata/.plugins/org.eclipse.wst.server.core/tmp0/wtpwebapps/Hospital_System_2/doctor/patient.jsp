<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.db.DBConnect"%>
<%@ page import="com.dao.AppointmentDao"%>
<%@ page import="com.entity.Appointment"%>
<%@ page import="com.entity.Doctor"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Patients</title>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}

.no-resize {
	resize: none; /* Prevent resizing */
}
</style>
<%@ include file="../component/allcss.jsp"%>
</head>
<body>
	<c:if test="${empty docObj}">
		<c:redirect url="../doctor_login.jsp" />
	</c:if>

	<jsp:include page="navbar.jsp" />

	<div class="container p-3">
		<div class="row">
			<div class="col-md-12">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Patient Details</p>
						<c:if test="${not empty errorMsg}">
							<p class="fs-4 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<c:if test="${not empty succMsg}">
							<p class=" fs-4 text-center text-success">${succMsg}</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>

						<table class="table">
							<thead>
								<tr>
									<th scope="col">Full Name</th>
									<th scope="col">Gender</th>
									<th scope="col">Age</th>
									<th scope="col">Appointment Date</th>
									<th scope="col">Email</th>
									<th scope="col">Mob No</th>
									<th scope="col">Diseases</th>
									<th scope="col">Status</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								Doctor d = (Doctor) session.getAttribute("docObj");
								AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
								List<Appointment> list = dao.getAllAppointmentByLoginDoctor(d.getId());
								for (Appointment ap : list) {
								%>
								<tr>
									<th><%=ap.getFullName()%></th>
									<td><%=ap.getGender()%></td>
									<td><%=ap.getAge()%></td>
									<td><%=ap.getAppoinDate()%></td>
									<td><%=ap.getEmail()%></td>
									<td><%=ap.getPhNo()%></td>
									<td><%=ap.getDiseases()%></td>
									<td><%=ap.getStatus()%></td>
									<td>
										<%
										if(ap.getStatus().equals("Pending")){ %>
											<button type="button" class="btn btn-success btn-sm"
													data-bs-toggle="modal" data-bs-target="#exampleModal">
													Comment</button> <!-- Modal -->
												<div class="modal fade" id="exampleModal" tabindex="-1"
													aria-labelledby="exampleModalLabel" aria-hidden="true">
													<div class="modal-dialog">
														<div class="modal-content">
															<div class="modal-header">
																<h5 class="modal-title" id="exampleModalLabel">Enter
																	the Status Below</h5>
																<button type="button" class="btn-close"
																	data-bs-dismiss="modal" aria-label="Close"></button>
															</div>
															<form action="../updateStatus" method="post">
																<input type="hidden" name="id" value="<%= ap.getId() %>">
																<input type="hidden" name="userId" value="<%= ap.getUserId() %>">
																<div class="modal-body">
																	<label>Comment</label>
																	<textarea required name="comm" rows="4" cols="55"
																		class="no-resize"></textarea>
																</div>
																<div class="modal-footer">
																	<button type="button" class="btn btn-secondary"
																		data-bs-dismiss="modal">Close</button>
																		<button type="submit" class="btn btn-primary">Save</button>
																</div>
															</form>
														</div>
													</div>
												</div>
												
												<%} else { %>
													<button type="button" class="btn btn-success btn-sm disabled"
															data-bs-toggle="modal" data-bs-target="#exampleModal ">
															Comment</button> 
												
												<% }%>
											</td>
										</tr>
									<%} %>	

							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
