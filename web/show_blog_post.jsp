<%@page import="com.tech.blog.dao.LikeDAO"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.tech.blog.dao.UsersDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.bog.entities.Categories"%>
<%@page import="com.tech.bog.entities.Posts"%>
<%@page import="com.tech.blog.dao.PostDAO"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.bog.entities.Users"%>
<%@page  errorPage="error_page.jsp" %>
<%
    Users user = (Users) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("Login_page.jsp");
    }
%>

<%
    int postId = Integer.parseInt(request.getParameter("post_id"));

    PostDAO dao = new PostDAO(ConnectionProvider.getConnection());
    Posts p = dao.getPostByPostId(postId);


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= p.getpTitle()%></title>
        
        <!--css-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP:wght@700&display=swap" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Mono&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <style>
            .onhover:hover
            {
                font-family: cursive;
                background-color: black;
            }
            .profile_name:hover
            {
                cursor: pointer;
            }
            .post-title
            {
                font-family: 'Noto Sans JP', sans-serif;
                font-size: 40px;
            }
            .post-date
            {
                font-family: sans-serif;
                font-size: 16px;
            }
            .post-content
            {
                font-family: 'Roboto Mono', monospace;

            }

            body
            {
                background: url(Images/coding.jpg);  
                background-size: cover;
                background-attachment: fixed;
            }

        </style>
        
        <div id="fb-root"></div>
        <script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v9.0&appId=114069152505088&autoLogAppEvents=1" nonce="EHOdKGHa"></script>
    </head>
    <body>
        <!-- start-of-navbar-->


        <nav class="navbar navbar-expand-lg navbar-dark primary_color ">
            <a class="navbar-brand" href="index.jsp"><span class="fa fa-cubes"></span>Technology Bog</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="profile.jsp"><span class="fa fa-home"></span>Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#"><span class="  fa fa-paper-plane "></span>Contact Us </a>
                    </li>
                    <li class="nav-item dropdown active">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="   fa fa-arrow-circle-down"></span>
                            Dropdown
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Programming Languages</a>
                            <a class="dropdown-item" href="#">Latest Technologies</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Trending Technologies</a>
                        </div>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link " href="#" ><span class="fa fa-folder"></span>More</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link " href="#" data-toggle="modal" data-target="#add-post-modal" ><span class="fa fa-cloud-upload"></span>POST</a>
                    </li>

                </ul>
                <ul class="navbar-nav mr-right">

                    <li class="nav-item active ">
                        <a class="nav-link profile_name" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user"></span><%= user.getName().toUpperCase()%></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link onhover" href="LogoutServlet" ><span class="fa fa-sign-out"></span>Logout</a>
                    </li>
                </ul>
            </div>
        </nav>



        <!--end-of-nav-bar-->


        <!--start of main body content-->

        <div class="container">
            <div class="row">
                <div class="col-md-7 offset-md-3">
                    <div class="card  m-4">
                        <div class="card-header primary_color">
                            <h4 class="post-title" ><%=p.getpTitle()%> </h4>
                            <p class="post-date" style="text-align: right"><b>Submitted On:</b> <%=DateFormat.getDateInstance().format(p.getpDate())%></p>
                        </div>
                        <div class="card-body">
                            <img src="blog_pics/<%=p.getpPic()%>" class="card-img-top" alt="...">
                            <br>
                            <br>
                            <div class="row m-2">
                                <div class="col-md-10 container-fluid">
                                    <hr>
                                    <%
                                        UsersDAO udao = new UsersDAO(ConnectionProvider.getConnection());

                                    %>
                                    <h4>Submitted by: <a href="#"><%=udao.getUserNameByPostId(p.getUserid()).getName()%>  </a></h4>
                                    <hr>
                                </div>

                            </div>
                            <b class="post-content"><%=p.getpContent()%></b>

                            <br>
                            <br>
                            <div class="post-code">
                                <code><%=p.getpCode()%></code>
                            </div>

                        </div>
                                
                            
                        <div class="card-footer text-center primary_color">
                            
                            <%
                                LikeDAO ldao = new LikeDAO(ConnectionProvider.getConnection());
                                
                            %>
                            <a href="#" onclick=" doLikePost(<%=p.getpId() %> , <%=user.getID() %>);"  class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-up "> </i><span class="like-counter"><%=ldao.countLikeOnPost(p.getpId()) %></span></a>
                            <a href="#" class="btn btn-outline-light btn-sm"><i class="fa fa-comment"> </i><span>20</span></a>
                        </div>
                            
                            <div class="card-footer">
                                <div class="fb-comments" data-href="http://localhost:1997/TechieBlog/show_blog_post.jsp?post_id=<%=p.getpId() %>" data-numposts="5" data-width=""></div>
                            </div>

                    </div>
                </div>
            </div>
        </div>

        <!--end of main body content-->

        <!--profile modal-->
        <!-- Button trigger modal -->
        <!--        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#profile-modal">
                    Launch demo modal
                </button>-->

        <!-- Modal -->
        <div class="modal fade" id="profile-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header primary_color">
                        <h5 class="modal-title" id="exampleModalLabel">My Tech Blog</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">

                            <img class="m-2" src=ProfilePics/<%=user.getProfile()%> alt="default.png"style="border-radius: 50%"/>
                            <h5 class="modal-title" id="exampleModalLabel"><%="Hello " + user.getName().toUpperCase()%></h5>
                            <!--details-->
                            <div class="user-details">
                                <table class="table table-dark m-2">

                                    <tbody>
                                        <tr>
                                            <th scope="row">ID:</th>
                                            <td><%=user.getID()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Email:</th>
                                            <td><%= user.getEmail()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Gender:</th>
                                            <td><%= user.getGender()%> </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">About:</th>
                                            <td><%= user.getAbout()%> </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Registered Date:</th>
                                            <td><%= user.getDate().toString()%> </td>
                                        </tr>
                                    </tbody>

                                </table>
                            </div>
                            <div class="edit-user-details">
                                <h3 class="m-2 " style="color:greenyellow">EDIT YOUR DETAILS HERE!!</h3>

                                <form action="EditServlet" method="post" enctype="multipart/form-data">
                                    <table class="table table table-dark">
                                        <tr>
                                            <th scope="row">ID:</th>
                                            <td ><%=user.getID()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Name:</th>
                                            <td><input type="text" class=" form-control" value="<%=user.getName()%>" name="username" </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Email:</th>
                                            <td><input type="email" class=" form-control" value="<%=user.getEmail()%>" name="useremail" </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Password:</th>
                                            <td><input type="password" class=" form-control" value="<%=user.getPassword()%>" name="userpassword" </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Gender:</th>
                                            <td><%= user.getGender()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">About</th>
                                            <td>
                                                <textarea rows="3" cols="5" class="form-control" name="About" >
                                                    <%=user.getAbout()%>
                                                </textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Update Pic:</th>
                                            <td><input type="file" name="image" class="form-control"> </td>
                                        </tr>
                                    </table>
                                    <div class="container">
                                        <button type="submit"  class="btn btn-primary" > Save</button>
                                    </div>
                                </form>


                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
                        <button type="button" class="btn btn-primary edit-details">EDIT</button>
                    </div>
                </div>
            </div>
        </div>

        <!--end-of-profile-modal-->

        <!-- start-of-post modal-->

        <!-- Modal -->
        <div class="modal fade" id="add-post-modal" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="staticBackdropLabel" style="margin-left: 17%"><span class="fa fa-heart"></span>POST YOUR BLOG HERE<span class="fa fa-heart"></span></h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">


                        <form action="AddPostServlet" method="post" id="add-post-form" >

                            <div class="form-group">
                                <select class="form-control" name="cid">

                                    <option selected disabled>---Select Category---</option>
                                    <%
                                        PostDAO pdao = new PostDAO(ConnectionProvider.getConnection());
                                        ArrayList<Categories> list = pdao.getAllCategories();
                                        for (Categories cat : list) {
                                    %>
                                    <option value = "<%=cat.getCid()%>" ><%=cat.getName()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="form-group">
                                <h4>Enter The Blog Title</h4>
                                <input name="pTitle" type="text" placeholder="Enter Post Title" class="form-control"/>
                            </div>

                            <div class="form-group">
                                <textarea name="pContent" class="form-control" style="height: 200px;" placeholder="Enter the content of the blog." >
                                    
                                </textarea>
                            </div>

                            <div class="form-group">
                                <textarea name="pCode" class="form-control" style="height: 200px;" placeholder="Enter your code(if any)." />
                                </textarea>
                            </div>

                            <div class="form-group">
                                <label> Select your pic.</label>
                                <br>
                                <input name="pic" type="file" class="form-control" />
                            </div>

                            <div class="container text-center" >
                                <button type="submit" class="btn btn-primary">POST</button>
                            </div>

                        </form>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">CANCEL</button>

                    </div>
                </div>
            </div>
        </div>

        <!--end-of-post-modal-->

        <!--java script-->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="   crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="javascript/myjavascript.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script scr="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>

        <!--        <h1>Hello Vishal!</h1>
                <h1><%="Post ID is:" + postId%></h1>-->

        <script>

                                        $(document).ready(function () {
                                let editStatus = false;
                                        $(".edit-user-details").hide();
                                        $(".edit-details").click(function () {
                                if (editStatus === false)
                                {
                                $(".user-details").hide();
                                        $(".edit-user-details").show();
                                        $(this).text("BACK")
                                        editStatus = true;
                                }
                                else
                                {
                                $(".user-details").show();
                                        $(".edit-user-details").hide();
                                        editStatus = false;
                                        $(this).text("EDIT")
                                }


                                });
                                });</script>

        <script>

                    $(document).ready(function (e) {

            console.log("Loaded.....");
                    $('#add-post-form').on("submit", function (event) {

            event.preventDefault();
                    console.log("You have clicked post");
                    let form = new FormData(this);
                    $.ajax
                    ({

                    url: "AddPostServlet",
                            type: "POST",
                            data: form,
                            success: function (data, textStatus, jqXHR) {
//                                if request is successful
                            console.log(data);
                                    if (data.trim() === "Done")
                            {
                            swal({
                            title: "Good job!",
                                    text: "Blog added Successfully!",
                                    icon: "success",
                            }).then(function () {

                            window.location = "profile.jsp";
                            });
                            }
                            else
                            {
                            //                                        swal(data)

                            swal({
                            title: "Some problem occured!!",
                                    text: "Blog adding Failed!",
                                    icon: "error",
                            });
                            }
                            },
                            error: function (jqXHR, textStatus, errorThrown) {
//                                if there is some error
                            console.log(jqXHR)
                            },
                            processData: false,
                            contentType: false
                    });
            });
            });</script>
    </body>
</html>
