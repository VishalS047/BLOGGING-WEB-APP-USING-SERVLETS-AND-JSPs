<%@page import="com.tech.bog.entities.Users"%>
<%@page import="com.tech.blog.dao.UsersDAO"%>
<%@page import="com.tech.blog.dao.LikeDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.bog.entities.Posts"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDAO"%>
<!--This is load post page....--> 


<div class="row">
<%
    
    Users user = (Users)session.getAttribute("currentUser");
    PostDAO dao = new PostDAO(ConnectionProvider.getConnection());
    List<Posts> post= null;
    
    int cid = Integer.parseInt(request.getParameter("cid"));
//    out.println(cid);
    if(cid==0)
    {
        post = dao.getAllPosts();
        Thread.sleep(500);
    }
    
    else
    {
        post = dao.getPostByCatId(cid);
        Thread.sleep(500);
    }
    
    if(post.size()==0)
    {
        out.println("<h3 class='display-4 text-center'>No post of this category.</h3>");
        return;
    }
    
    for(Posts p:post)
    {
%>

<div class="col-md-6">
    
    <div class="card mt-3">
        <img src="blog_pics/<%=p.getpPic() %>" class="card-img-top" alt="...">

        <div class="card-body">
            <h5><%=p.getpTitle()  %></h5>
            <hr>
            <p><%=p.getpContent()  %></p>
            <!--<code><%=p.getpCode() %></code>-->
            
            <p style="text-align: right"><b>Submitted on:</b> <%=p.getpDate()  %></p>
        </div>
        
        <div class="card-footer text-center primary_color">
            
            <a href="show_blog_post.jsp?post_id=<%= p.getpId() %>" class="btn btn-outline-light btn-sm">Read more...</a>
            
            
            <%
                LikeDAO ldao =  new LikeDAO(ConnectionProvider.getConnection());
            %>
             
            <a href="#" onclick=" doLikePost(<%=p.getpId() %> , <%=user.getID() %>);" class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-up "> </i><span class="like-counter"><%=ldao.countLikeOnPost(p.getpId()) %></span></a>
            <a href="#" class="btn btn-outline-light btn-sm"><i class="fa fa-comment"> </i><span>20</span></a>
            
            
        </div>
        
    </div>
    
</div>

<%
    }
%>

</div>