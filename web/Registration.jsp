<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <style>
            .text-area
            {
                resize: none;
            }
        </style>
    </head>
    <body>

        <%@include file="normal_navbar.jsp"%>

        <main class="d-flex align-items-center primary_color  banner_background "style="height: 90vh;">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="card  ">
                            <div class="card-header text-center primary_color">
                                <span class="fa fa-user-plus fa-3x"></span><p>Sign Up</p>
                            </div>



                            <div class="card-body border_style">

                                <form id = "reg-form" action="RegisterServlet" method="post">

                                    <div class="form-group">
                                        <label for="User_Name">User Name</label>
                                        <input name="user_name" type="text" class="form-control" id="User_Name" aria-describedby="emailHelp" >
                                    </div>

                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input name="email_address" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>


                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input name="password" type="password" class="form-control" id="exampleInputPassword1" >

                                    </div>

                                    <div class="form-group">
                                        <label for="Gender">Gender</label>
                                        <br>
                                        <input type="radio" id="gender1" name="gender" value="Male">Male &nbsp; &nbsp;
                                        <input type="radio" id="gender2" name="gender"value="Female" >Female

                                    </div>
                                    <div class="form-group">
                                        <textarea name="about" id=""  class="form-control text-area"  rows="4" placeholder="Enter something about yourself"></textarea>
                                    </div>

                                    <div class="form-group form-check ">
                                        <input name = "check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                        <label class="form-check-label" for="exampleCheck1">Agree to the Terms and Conditions</label>
                                    </div>

                                    <div class="container text-center" id="loader" style="display:none;">
                                        <span class="fa fa-refresh fa-spin fa-3x "></span>
                                        <h3>Registering...</h3>
                                    </div>
                                    <button id="submit_btn" type="submit" class="btn btn-primary " >Submit</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <!--java script-->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="   crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="javascript/myjavascript.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></script>
        
        <script scr="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>






        <script>

            $(document).ready(function () {

                console.log("Loaded.....")

                $('#reg-form').on('submit', function (event) {
                    event.preventDefault();
                    $("#submit_btn").hide();
                    $("#loader").show();
                    let form = new FormData(this);
//                    send register servet;

                    $.ajax
                            ({
                                url: 'RegisterServlet',
                                type: 'POST',
                                data: form,
                                success: function (data, textStatus, jqXHR) {
                                    console.log(data)

                                    $("#submit_btn").hide();
                                    $("#loader").show();
                                    if (data.trim() == "done")
                                    {
                                        swal({
                                            title: "Good job!",
                                            text: "Registration Successfull!",
                                            icon: "success",
                                        }).then(function () {

                                            window.location = "Login_page.jsp";
                                        });
                                    }
                                    else
                                    {
//                                        swal(data)
                                         
                                        swal({
                                            title: "Some problem occured!!",
                                            text: "Registration Failed!",
                                            icon: "error",
                                        }).then(function () {

                                            window.location = "Registration.jsp";
                                        });
                                    }

                                    $("#submit_btn").show();
                                    $("#loader").hide();
                                },
                                error: function (jqXHR, textStatus, errorThrown) {
                                    console.log(jqXHR);
                                    $("#submit_btn").show();
                                    $("#loader").hide();
                                    swal("Something went wrong!!Please try again!");
                                },
                                processData: false,
                                contentType: false
                            });
                });
            });
        </script>
    </body>
</html>
