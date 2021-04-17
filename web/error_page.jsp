<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oops! Sorry!!</title>
        <!--css-->
        <style>
            .btn_color
            {

                background-color: #cc33ff;
                font-family: cursive;
            }
            .blink_me {
                animation: blinker 2s linear infinite;
            }
            .img
            {
                margin-top: 4vh;
            }
            .image_up
            {
                margin-top: 3vh;
            }

            @keyframes blinker {
                70% {
                    opacity: 0;
                }
            }
        </style>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

    </head>
    <body>
        <div class="container text-center" >
            <div class="image_up">
                <h2>Sorry for the inconvenience!!</h2>
            </div>
            <img src="Images/error.png" alt="Error" class="img-fluid img"/>
            <div class="blink_me">
                <h2 class="display-4">Sorry! Something went wrong! Please try after sometime.</h2>
            </div>
            <%= exception%>
                <a href="index.jsp" class="btn primary_background btn-lg text-dark btn_color mt-4">Home Page</a>
            
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="   crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="javascript/myjavascript.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></script>

        <script scr="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script>
            var colors = ['#ff0000', '#00ff00', '#0000ff'];
            var random_color = colors[Math.floor(Math.random() * colors.length)];
            document.querySelector('.blink_me').style.color = random_color;
        </script>
    </body>
</html>
