package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.bog.entities.Message;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\n");
      out.write("        <style>\n");
      out.write("            .text-area\n");
      out.write("            {\n");
      out.write("                resize: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark primary_color\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-cubes\"></span>Technology Bog</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-home\"></span>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"  fa fa-paper-plane \"></span>Contact Us </a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown active\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"   fa fa-arrow-circle-down\"></span>\n");
      out.write("          Dropdown\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming Languages</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Latest Technologies</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Trending Technologies</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link \" href=\"#\" ><span class=\"fa fa-folder\"></span>More</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2 search_color\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-dark my-2 my-sm-0 btn_color\" type=\"submit\">Search</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        <main class=\"d-flex align-items-center primary_color  banner_background \"style=\"height: 90vh;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                        <div class=\"card  \">\n");
      out.write("                            <div class=\"card-header text-center primary_color\">\n");
      out.write("                                <span class=\"fa fa-user-plus fa-3x\"></span><p>Sign Up</p>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                            ");

                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) 
                                {
                            
      out.write("\n");
      out.write("                            <div class=\"alert ");
      out.print( m.getCssClass() );
      out.write("\" role=\"alert\">\n");
      out.write("                                ");
      out.print( m.getMessagecontent() );
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                    
                                    session.removeAttribute("msg");
                                }
                                
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"card-body border_style\">\n");
      out.write("\n");
      out.write("                                <form id = \"reg-form\" action=\"RegisterServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"User_Name\">User Name</label>\n");
      out.write("                                        <input name=\"user_name\" type=\"text\" class=\"form-control\" id=\"User_Name\" aria-describedby=\"emailHelp\" >\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                        <input name=\"email_address\" type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                        <input name=\"password\" type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" >\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"Gender\">Gender</label>\n");
      out.write("                                        <br>\n");
      out.write("                                        <input type=\"radio\" id=\"gender\" name=\"gender\" value=\"Male\">Male &nbsp; &nbsp;\n");
      out.write("                                        <input type=\"radio\" id=\"gender\" name=\"gender\"value=\"Female\" >Female\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <textarea name=\"about\" id=\"\"  class=\"form-control text-area\"  rows=\"4\" placeholder=\"Enter something about yourself\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group form-check \">\n");
      out.write("                                        <input name = \"check\" type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                        <label class=\"form-check-label\" for=\"exampleCheck1\">Agree to the Terms and Conditions</label>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"container text-center\" id=\"loader\" style=\"display:none;\">\n");
      out.write("                                        <span class=\"fa fa-refresh fa-spin fa-3x \"></span>\n");
      out.write("                                        <h3>Registering...</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button id=\"submit_btn\" type=\"submit\" class=\"btn btn-primary \" >Submit</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <!--java script-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"  integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"   crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"javascript/myjavascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"></script>\n");
      out.write("\n");
      out.write("        <script scr=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                console.log(\"Loaded.....\")\n");
      out.write("\n");
      out.write("                $('#reg-form').on('submit', function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $(\"#submit_btn\").hide();\n");
      out.write("                    $(\"#loader\").show();\n");
      out.write("                    let form = new FormData(this);\n");
      out.write("//                    send register servet;\n");
      out.write("\n");
      out.write("                    $.ajax\n");
      out.write("                            ({\n");
      out.write("                                url: 'RegisterServlet',\n");
      out.write("                                type: 'POST',\n");
      out.write("                                data: form,\n");
      out.write("                                success: function (data, textStatus, jqXHR) {\n");
      out.write("                                    console.log(data)\n");
      out.write("\n");
      out.write("                                    $(\"#submit_btn\").hide();\n");
      out.write("                                    $(\"#loader\").show();\n");
      out.write("                                    if(data.trim()===\"done\")\n");
      out.write("                                    {\n");
      out.write("                                            swal({\n");
      out.write("                                                title: \"Good job!\",\n");
      out.write("                                                text: \"Registration Successfull!\",\n");
      out.write("                                                icon: \"success\",\n");
      out.write("                                            }).then(function () {\n");
      out.write("                                                window.location = \"Login_page.jsp\";\n");
      out.write("                                            });\n");
      out.write("                                    }\n");
      out.write("                                    else\n");
      out.write("                                    {\n");
      out.write("                                        swal(data)\n");
      out.write("                                    }\n");
      out.write("                                \n");
      out.write("                                    $(\"#submit_btn\").show();\n");
      out.write("                                    $(\"#loader\").hide();\n");
      out.write("                                },\n");
      out.write("                                error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                                    console.log(jqXHR)\n");
      out.write("                                    $(\"#submit_btn\").show();\n");
      out.write("                                    $(\"#loader\").hide();\n");
      out.write("                                    swal(\"Something went wrong!!Please try again!\")\n");
      out.write("                                },\n");
      out.write("                                processData: false,\n");
      out.write("                                contentType: false\n");
      out.write("                            });\n");
      out.write("                });\n");
      out.write("            });\n");
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
