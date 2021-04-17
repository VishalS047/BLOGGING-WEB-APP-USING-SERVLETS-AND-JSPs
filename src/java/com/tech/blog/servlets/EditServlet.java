/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.servlets;

import com.tech.blog.dao.UsersDAO;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;
import com.tech.bog.entities.Message;
import com.tech.bog.entities.Users;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Ankit Sharma
 */
@MultipartConfig
public class EditServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditServlet</title>");
            out.println("</head>");
            out.println("<body>");

            String userName = request.getParameter("username");
            String userEmail = request.getParameter("useremail");
            String userPassword = request.getParameter("userpassword");
            String About = request.getParameter("About");
            Part part = request.getPart("image");
            String imgName = part.getSubmittedFileName();

//            get the user from the session
            HttpSession s = request.getSession();
            Users user = (Users) s.getAttribute("currentUser");

            user.setName(userName);
            user.setEmail(userEmail);
            user.setPassword(userPassword);
            user.setAbout(About);
            String oldPic = user.getProfile();
            user.setProfile(imgName);

//            Updating the database
            UsersDAO dao = new UsersDAO(ConnectionProvider.getConnection());
            boolean status = dao.updateUser(user);
            if (status == true) {

                out.println("Updated to database");
                String path = request.getSession().getServletContext().getRealPath("/") + "ProfilePics" + File.separator + user.getProfile();
                System.out.println("My file name is " + path);
                String path1 = request.getSession().getServletContext().getRealPath("/") + "ProfilePics" + File.separator + oldPic;
                if(!oldPic.equals("default.jpg"))
                    Helper.deleteFile(path1);

                if (Helper.saveFile(part.getInputStream(), path) == true) {
                    out.println("Profile Uploaded........");
                    Message msg = new Message("Profile Successfully uploaded!!", "Success!", "alert-success");
                    s.setAttribute("msg", msg);
                   
                } else {
                    Message msg = new Message("Something went wrong!!", "error!", "alert-danger");
                    s.setAttribute("msg", msg);
                   
                }

            } else {
                out.println("Not updated to database");
                Message msg = new Message("Something went wrong!!", "error!", "alert-danger");
                s.setAttribute("msg", msg);
                
            }
            response.sendRedirect("profile.jsp");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
