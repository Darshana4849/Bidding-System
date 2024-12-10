<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href = "CSS/style_contact_us.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- header section starts  -->

<header class="header">

    <a href="#" class="logo"><span>b</span>id<span>M</span>aster</a>

    <nav class="navbar">
        <a href="#home">home</a>
        <a href="#service">service</a>
        <a href="#about">about</a>
        <a href="#gallery">gallery</a>
        <a href="#review">review</a>
        <a href="#contact us">contact</a>
        <a href="#signup">signup</a>
        <a href="#login">login</a>
        <a href="#contact">Support</a>
        <a href="#">Payment</a>
        <a href="#"><i class="fa fa-cart-arrow-down"></i></a>
    </nav>

    <div id="menu-bars" class="fas fa-bars"></div>

</header>

<!-- header section ends -->


<div class="card">
    <div class="card2">
      <form class="form" method="post" action="AddContact">
        <p id="heading">ContactUs</p>
        <div class="field">
            <input type="text" class="input-field" id="floatingInput" name="name" placeholder="Name"/>
          </div>
        <div class="field">
          <input type="email" class="input-field" id="floatingInput" name="email" placeholder="Email" />
        </div>
         <div class="field">
            <input type="text" class="input-field" id="floatingInput" name="number" placeholder="Contact_Number"/>
          </div>
        <div class="field">
          <input type="text" class="input-field" id="floatingInput" name="message" placeholder="Message" />
          </div>
        <div class="butn">
          <button class="button1">Confirm</button>
        </div>

      </form>
    </div>
  </div>
  
<!-- footer section starts  -->

<section class="footer">

    <div class="box-container">
        
        <div class="box">
            <h3>contact info</h3>
            <a href="#"> <i class="fas fa-phone"></i> +9411 254 1695</a>
            <a href="#"> <i class="fas fa-phone"></i> +9471 489 3671</a>
            <a href="#"> <i class="fas fa-envelope"></i> bidmaster12@gmail.com </a>
            <a href="#"> <i class="fas fa-envelope"></i> bidmaster25@gmail.com </a>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> Galle Road - Colombo 2 </a>
        </div>

        <div class="box">
            <h3>follow us</h3>
            <a href="#"> <i class="fab fa-facebook-f"></i> facebook </a>
            <a href="#"> <i class="fab fa-twitter"></i> twitter </a>
            <a href="#"> <i class="fab fa-instagram"></i> instagram </a>
            <a href="#"> <i class="fab fa-linkedin"></i> linkedin </a>
        </div>

    </div>

    <div class="credit"> created by <span>Bid Master</span> | all rights reserved </div>

</section>

<!-- footer section ends -->

</body>
</html>