
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="your-logo.png" href="favicon.ico" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog Page</title>

        <!--css-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <style>
            .banner_background
            {
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 94%, 70% 100%, 25% 100%, 0 93%, 0 0);
            }
        </style>




    </head>
    <body>
        <%@include file="normal_navbar.jsp" %>

        <!--container-->
        <div class="container-fluid p-0 m-0 banner_background">
            <div class="jumbotron primary_color text-dark">
                <div class="container">
                    <h1 class="display-3">Welcome to the Tech Blog paradise</h1>
                    <h3>Heaven for bloggers</h3>
                    <p>A programming language is a formal language comprising a set of instructions that produce various kinds of output. Programming languages are used in computer programming to implement algorithms.Most programming languages consist of instructions for computers. There are programmable machines that use a set of specific instructions, rather than general programming languages.</p>
                    <a href="Registration.jsp" type="button" class="btn btn-primary btn-lg "><span class="fa fa-user-plus"></span>  Sign Up</a>
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    <a href="Login_page.jsp" type="button" class="btn btn-primary  btn-lg "><span class="fa fa-user-circle fa-spin"></span>    Sign in</a>

                </div>
            </div>
        </div>

        <!--cards-->
        <div class="container">
            <div class="row">
                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">JAVA</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Read More</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>

            </div>
            <br>
            <div class="row">
                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>

            </div>
            <br>
            <div class="row">
                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-4">

                    <div class="card" style="width: 18rem;">
                        <img src="Images/java.png"class="card-img-top" alt="JAVA">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <!--java script-->
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="  crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="javascript/myjavascript.js" type="text/javascript"></script>
        <script src="https://kit.fontawesome.com/yourcode.js"></script>


        <script>


        </script>
    </body>
</html>
