/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.servlets;

import com.tech.blog.dao.PostDAO;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;
import com.tech.bog.entities.Message;
import com.tech.bog.entities.Posts;
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

@MultipartConfig
public class AddPostServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            int cid = Integer.parseInt(request.getParameter("cid"));
//            out.println("CID is  " + cid);
            String pTitle = request.getParameter("pTitle");
            String pContent = request.getParameter("pContent");
            String pCode = request.getParameter("pCode");
            Part part = request.getPart("pic");

//            getting current user
            HttpSession s = request.getSession();
            Users user = (Users) s.getAttribute("currentUser");
            Posts p = new Posts(pTitle, pContent, pCode, part.getSubmittedFileName(), null, cid, user.getID());

            PostDAO dao = new PostDAO(ConnectionProvider.getConnection());
            boolean stats = dao.savePost(p);

            if (stats == true) {
                String path = request.getSession().getServletContext().getRealPath("/") + "blog_pics" + File.separator + part.getSubmittedFileName();
                System.out.println("The path is: " + path);
                Helper.saveFile(part.getInputStream(), path);
                Message msg = new Message("Post Successfully uploaded!!", "Success!", "alert-success");
                s.setAttribute("msg", msg);
                out.println("Done");
            } else {
//                out.println("Submitted file name is "+part.getSubmittedFileName());
//                out.println("title is: "+pTitle);
//                out.println("Content is: "+pContent);
//                out.println("Code is: "+pCode);
                Message msg = new Message("Something went wrong!!", "error!", "alert-danger");
                s.setAttribute("msg", msg);
                out.println("Not Done");
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
