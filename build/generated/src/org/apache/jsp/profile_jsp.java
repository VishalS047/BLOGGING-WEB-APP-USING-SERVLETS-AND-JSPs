package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.PostDAO;
import com.tech.bog.entities.Categories;
import com.tech.bog.entities.Message;
import com.tech.bog.entities.Users;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <title>User Profile</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\n");
      out.write("        <style>\n");
      out.write("            .onhover:hover\n");
      out.write("            {\n");
      out.write("                font-family: cursive;\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            .profile_name:hover\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Users user = (Users) session.getAttribute("currentUser");
            if (user == null) {
                response.sendRedirect("Login_page.jsp");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <!--<br>-->\n");
      out.write("        ");
      out.write("\n");
      out.write("        <!--<br>-->\n");
      out.write("        ");
      out.write("\n");
      out.write("        <!--<br>-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- start-of-navbar-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark primary_color\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-cubes\"></span>Technology Bog</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-home\"></span>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"  fa fa-paper-plane \"></span>Contact Us </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown active\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"   fa fa-arrow-circle-down\"></span>\n");
      out.write("                            Dropdown\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Programming Languages</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Latest Technologies</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Trending Technologies</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\" ><span class=\"fa fa-folder\"></span>More</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\" data-toggle=\"modal\" data-target=\"#add-post-modal\" ><span class=\"fa fa-cloud-upload\"></span>POST</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav mr-right\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item active \">\n");
      out.write("                        <a class=\"nav-link profile_name\" data-toggle=\"modal\" data-target=\"#profile-modal\"><span class=\"fa fa-user\"></span>");
      out.print( user.getName().toUpperCase());
      out.write("</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link onhover\" href=\"LogoutServlet\" ><span class=\"fa fa-sign-out\"></span>Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--end-of-nav-bar-->\n");
      out.write("        ");


            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert ");
      out.print( m.getCssClass());
      out.write("\" role=\"alert\">\n");
      out.write("            ");
      out.print( m.getMessagecontent());
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");


                session.removeAttribute("msg");
            }


        
      out.write("\n");
      out.write("\n");
      out.write("        <!--profile modal-->\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("        <!--        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#profile-modal\">\n");
      out.write("                    Launch demo modal\n");
      out.write("                </button>-->\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header primary_color\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">My Tech Blog</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"container text-center\">\n");
      out.write("\n");
      out.write("                            <img class=\"m-2\" src=ProfilePics/");
      out.print(user.getProfile());
      out.write(" alt=\"default.png\"style=\"border-radius: 50%\"/>\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalLabel\">");
      out.print("Hello " + user.getName().toUpperCase());
      out.write("</h5>\n");
      out.write("                            <!--details-->\n");
      out.write("                            <div class=\"user-details\">\n");
      out.write("                                <table class=\"table table-dark m-2\">\n");
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">ID:</th>\n");
      out.write("                                            <td>");
      out.print(user.getID());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Email:</th>\n");
      out.write("                                            <td>");
      out.print( user.getEmail());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Gender:</th>\n");
      out.write("                                            <td>");
      out.print( user.getGender());
      out.write(" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">About:</th>\n");
      out.write("                                            <td>");
      out.print( user.getAbout());
      out.write(" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Registered Date:</th>\n");
      out.write("                                            <td>");
      out.print( user.getDate().toString());
      out.write(" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"edit-user-details\">\n");
      out.write("                                <h3 class=\"m-2 \" style=\"color:greenyellow\">EDIT YOUR DETAILS HERE!!</h3>\n");
      out.write("\n");
      out.write("                                <form action=\"EditServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <table class=\"table table table-dark\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">ID:</th>\n");
      out.write("                                            <td >");
      out.print(user.getID());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Name:</th>\n");
      out.write("                                            <td><input type=\"text\" class=\" form-control\" value=\"");
      out.print(user.getName());
      out.write("\" name=\"username\" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Email:</th>\n");
      out.write("                                            <td><input type=\"email\" class=\" form-control\" value=\"");
      out.print(user.getEmail());
      out.write("\" name=\"useremail\" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Password:</th>\n");
      out.write("                                            <td><input type=\"password\" class=\" form-control\" value=\"");
      out.print(user.getPassword());
      out.write("\" name=\"userpassword\" </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Gender:</th>\n");
      out.write("                                            <td>");
      out.print( user.getGender());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">About</th>\n");
      out.write("                                            <td>\n");
      out.write("                                                <textarea rows=\"3\" cols=\"5\" class=\"form-control\" name=\"About\" >\n");
      out.write("                                                    ");
      out.print(user.getAbout());
      out.write("\n");
      out.write("                                                </textarea>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Update Pic:</th>\n");
      out.write("                                            <td><input type=\"file\" name=\"image\" class=\"form-control\"> </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <button type=\"submit\"  class=\"btn btn-primary\" > Save</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">CLOSE</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary edit-details\">EDIT</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--end-of-profile-modal-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- start-of-post modal-->\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"add-post-modal\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\" id=\"staticBackdropLabel\" style=\"margin-left: 17%\"><span class=\"fa fa-heart\"></span>POST YOUR BLOG HERE<span class=\"fa fa-heart\"></span></h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <form action=\"AddPostServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <select class=\"form-control\">\n");
      out.write("\n");
      out.write("                                    <option selected disabled>---Select Category---</option>\n");
      out.write("                                    ");

                                        PostDAO dao = new PostDAO(ConnectionProvider.getConnection());
                                        ArrayList<Categories> list = dao.getAllCategories();
                                        for (Categories c : list) 
                                        {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getName());
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h4>Enter The Blog Title</h4>\n");
      out.write("                                <input type=\"text\" name=\"title\" placeholder=\"Enter the blog title\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea class=\"form-control\" style=\"height: 200px;\" placeholder=\"Enter the content of the blog\" name=\"content\">\n");
      out.write("                                    \n");
      out.write("                                </textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea class=\"form-control\" style=\"height: 200px;\" placeholder=\"Enter your code(if any)\" name=\"code\">\n");
      out.write("                                </textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label> Select your pic.</label>\n");
      out.write("                                <input type=\"file\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\">Understood</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--end-of-post-modal-->\n");
      out.write("\n");
      out.write("        <!--java script-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"  integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\"  crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"javascript/myjavascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/yourcode.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                let editStatus = false;\n");
      out.write("                $(\".edit-user-details\").hide();\n");
      out.write("                $(\".edit-details\").click(function () {\n");
      out.write("                    if (editStatus === false)\n");
      out.write("                    {\n");
      out.write("                        $(\".user-details\").hide();\n");
      out.write("                        $(\".edit-user-details\").show();\n");
      out.write("                        $(this).text(\"BACK\")\n");
      out.write("                        editStatus = true;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $(\".user-details\").show();\n");
      out.write("                        $(\".edit-user-details\").hide();\n");
      out.write("                        editStatus = false;\n");
      out.write("                        $(this).text(\"EDIT\")\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
