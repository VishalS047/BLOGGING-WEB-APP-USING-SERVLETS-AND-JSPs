package com.tech.blog.dao;

import com.tech.blog.helper.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LikeDAO {

    Connection conn;

    public LikeDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean InsertLike(int pid, int uid) {
        try {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Insert into LIKED(pid,userid) values(?,?)");
            ps.setInt(1, pid);
            ps.setInt(2, uid);

            int count = ps.executeUpdate();
            if (count == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public int countLikeOnPost(int pid)
    {
        int count = 0;
        try
        {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select count(*) from liked where pid = ?");
            ps.setInt(1, pid);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                count = rs.getInt(1);
            }
            return count;
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return count;
    }
    
    public boolean isLikedByUser(int pid,int uid)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("Select * from liked where pid=? and uid=?");
            ps.setInt(1, pid);
            ps.setInt(2, uid);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                return true;
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteLike(int pid,int uid)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement(" Delete from liked where pid = ? and uid = ? ");
            ps.setInt(1, pid);
            ps.setInt(2, uid);
            int count = ps.executeUpdate();
            if(count>1)
                return true;
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
