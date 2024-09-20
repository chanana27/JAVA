<%@page import="com.db.DBConnect" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MediHome</title>
	<%@ include file="component/allcss.jsp"%>
	<style type="text/css">
	        .paint-card{
	            box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
	        }
	</style>
</head>
<body>
	<%@ include file="component/nav-bar.jsp"%>

	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/hos1.jpg" class="d-block w-100" alt="..." height="500px">
			</div>
			<div class="carousel-item">
				<img src="img/hos2.jpg" class="d-block w-100" alt="..." height="500px">
			</div>
			<div class="carousel-item">
				<img src="img/hos3.png" class="d-block w-100" alt="..." height="500px">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	
	
	<div class="container p-3">
        <p class="text-center fs-2">Key Features of Hospital</p>
        <div class="row">
            <div class="col-md-8 p-5">
                <div class="row">
                    <div class="col-md-6">
                        <div class="card paint-card">
                            <div class="card-body">
                                <p class="fs-5">100% safety</p>
                                <p>At MediHome, patient safety is our top priority, ensured through rigorous protocols and continuous staff training. Our advanced monitoring systems and emergency response teams are always ready to provide the highest level of care.</p>
                            </div>
                        </div>
                    </div> 
                    <div class="col-md-6">
                        <div class="card paint-card">
                            <div class="card-body">
                                <p class="fs-5">Clean Environment</p>
                                <p>MediHome maintains a spotless and hygienic facility with strict cleaning protocols and state-of-the-art sanitation technology. Our dedicated housekeeping team works around the clock to ensure every corner of our hospital is free from contaminants. </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card paint-card">
                            <div class="card-body">
                                <p class="fs-5">Friendly Doctors</p>
                                <p>Our team of compassionate and approachable doctors at MediHome is dedicated to providing personalized care. They prioritize patient comfort and communication, ensuring that every patient feels heard and supported. </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card paint-card">
                            <div class="card-body">
                                <p class="fs-5">Medical Research</p>
                                <p>MediHome is at the forefront of medical research, constantly seeking innovative treatments and cures. Our research department collaborates with leading institutions to conduct groundbreaking studies. </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <img src="img/doc.jpg" alt="" height="350px">
            </div>

        </div>
    </div>

    <hr>

    <div class="container p-2">
        <p class="text-center fs-2">Our Team</p>

        <div class="row">
            <div class="col-md-3">
                <div class="card paint-card">
                    <div class="card-body text-center">
                        <img src="img/doc1.jpg" alt="" width="250px" height="300px">
                        <p class="fw-bold fs-5">Dr. Gitanjali Verma</p>
                        <p class="fs-7"> (Chariman)</p> 
                    </div>
                </div>
            </div>

            <div class="col-md-3">
                <div class="card paint-card">
                    <div class="card-body text-center">
                        <img src="img/doc2.jpg" alt="" width="250px" height="300px">
                        <p class="fw-bold fs-5">Dr. Ravi Kumar</p>
                        <p class="fs-7"> (CEO)</p> 
                    </div>
                </div>
            </div>

            <div class="col-md-3">
                <div class="card paint-card">
                    <div class="card-body text-center">
                        <img src="img/doc3.jpg" alt="" width="250px" height="300px">
                        <p class="fw-bold fs-5">Dr.Naveen Malhotra</p>
                        <p class="fs-7"> (MD)</p> 
                    </div>
                </div>
            </div>

            <div class="col-md-3">
                <div class="card paint-card">
                    <div class="card-body text-center">
                        <img src="img/doc4.jpg" alt="" width="250px" height="300px">
                        <p class="fw-bold fs-5">Dr. Vikas Saini</p>
                        <p class="fs-7"> (Director)</p> 
                    </div>
                </div>
            </div>

        </div>
    </div>

<%@include file="component/footer.jsp" %>

</body>
</html>