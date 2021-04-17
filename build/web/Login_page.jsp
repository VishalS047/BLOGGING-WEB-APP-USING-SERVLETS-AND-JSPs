

<%@page import="com.tech.bog.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>

        <!--css-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

    </head>

    <body>
        <%@include file="normal_navbar.jsp"%>

        <main class=" d-flex align-items-center primary_color banner_background " style="height: 80vh;">
            <div class="container ">
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        <div class="card " >
                            <div class="card-header text-center primary_color">
                                <span class="fa fa-unlock fa-3x"></span><p>Login Here</p>
                            </div>

                            <%

                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) 
                                {
                            %>
                            <div class="alert <%= m.getCssClass() %>" role="alert">
                                <%= m.getMessagecontent() %>
                            </div>
                            <%
                                    
                                    session.removeAttribute("msg");
                                }
                                
                                
                            %>

                            <div class="card-body">
                                <form action="Login_Servlet" method="post">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input name="email"  required type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input  name="password" required type="password" class="form-control" id="exampleInputPassword1">
                                    </div>
                                    <!--                                    <div class="form-group form-check">
                                                                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                                                            <label class="form-check-label" for="exampleCheck1">Check me out</label>
                                                                        </div>-->
                                    <div class="container text-center">
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <!--java script-->
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="  crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="javascript/myjavascript.js" type="text/javascript"></script>
        <script src="https://kit.fontawesome.com/yourcode.js"></script>



    </body>
</html>
