package com.tech.blog.dao;

//import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.bog.entities.Categories;
import com.tech.bog.entities.Posts;
import com.tech.bog.entities.Users;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {

    private Connection conn;

    public PostDAO(Connection conn) {
        this.conn = conn;
    }

    public ArrayList<Categories> getAllCategories() {
        ArrayList<Categories> list = new ArrayList<>();

        try {
            Connection conn = ConnectionProvider.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from categories");

            System.out.println("ResultSet " + rs);
            while (rs.next()) {
                int cid = rs.getInt(1);
                String name = rs.getString(2);
                String description = rs.getString(3);
                String ctype = rs.getString(4);
                Categories c = new Categories(cid, name, description, ctype);
                list.add(c);
                System.out.println(" My list is:" + list);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public boolean savePost(Posts p) {
        boolean status = false;
        try {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Insert into posts(ptitle,pcontent,pcode,ppic,catid,userid) values(?,?,?,?,?,?)");
            ps.setString(1, p.getpTitle());
            ps.setString(2, p.getpContent());
            ps.setString(3, p.getpCode());
            ps.setString(4, p.getpPic());
            ps.setInt(5, p.getCatId());
            ps.setInt(6, p.getUserid());

            int count = ps.executeUpdate();
            if (count == 1) {
                status = true;
            } else {
                status = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }

//    for getting all the posts
    public List<Posts> getAllPosts() {
        List<Posts> list = new ArrayList();

        try {
            Connection conn = ConnectionProvider.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from posts order by pid desc");
            while (rs.next()) {
                int pid = rs.getInt(1);
                String pTitle = rs.getString(2);
                String pContent = rs.getString(3);
                String pCode = rs.getString(4);
                String pPic = rs.getString(5);
                Date dDate = rs.getDate(6);
                int catId = rs.getInt(7);
                int userId = rs.getInt(8);
                Posts p = new Posts(pid, pTitle, pContent, pCode, pPic, dDate, catId, userId);
                list.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Posts> getPostByCatId(int catId) {
        List<Posts> list = new ArrayList();

        try {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select * from posts where catid = ?");
            ps.setInt(1, catId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int pid = rs.getInt(1);
                String pTitle = rs.getString(2);
                String pContent = rs.getString(3);
                String pCode = rs.getString(4);
                String pPic = rs.getString(5);
                Date dDate = rs.getDate(6);
                int userId = rs.getInt(7);
                Posts p = new Posts(pid, pTitle, pContent, pCode, pPic, dDate, catId, userId);
                list.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public Posts getPostByPostId(int postId)
    {
        Posts p = null;
        try
        {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select * from posts where pid =? ");
            ps.setInt(1, postId);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                
                int pid = rs.getInt(1);
                String pTitle = rs.getString(2);
                String pContent = rs.getString(3);
                String pCode = rs.getString(4);
                String pPic = rs.getString(5);
                Date dDate = rs.getDate(6);
                int catId = rs.getInt(7);
                int userId = rs.getInt(8);
                p = new Posts(pid, pTitle, pContent, pCode, pPic, dDate, catId, userId);
                
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return p;
    }
    
    
}
