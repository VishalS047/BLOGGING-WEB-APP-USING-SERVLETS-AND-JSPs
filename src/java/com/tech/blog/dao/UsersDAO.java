package com.tech.blog.dao;

import com.tech.blog.helper.ConnectionProvider;
import com.tech.bog.entities.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDAO {

    private Connection conn;

    public UsersDAO(Connection conn) {
        this.conn = conn;
    }

//    method to insert user to database
    public boolean insertUser(Users user) {
        try {
            Connection conn = ConnectionProvider.getConnection();
            System.out.println("Connection Established");
            PreparedStatement ps = conn.prepareStatement("Insert into users(name,email,password,gender,about) values (?,?,?,?,?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getGender());
            ps.setString(5, user.getAbout());
            int count = ps.executeUpdate();
            if (count == 1) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
//    get user by username ans password

    public Users getUserByEmailAndPassword(String email, String password) {
        Users user = null;
        try {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select * from users where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new Users();
                String name = rs.getString("name");
                user.setName(name);

                user.setID(rs.getInt("id"));

                user.setEmail(rs.getString("email"));

                user.setPassword(rs.getString("password"));

                user.setGender(rs.getString("gender"));

                user.setAbout(rs.getString("about"));

                user.setDate(rs.getDate("reg_date"));

                user.setProfile(rs.getString("profile"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public boolean updateUser(Users user) {
        boolean status = false;
        try {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Update users set name = ? , email = ? , password = ? ,about = ? , profile = ? where id = ?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
//            ps.setString(4, user.getGender());
            ps.setString(4, user.getAbout());
            ps.setString(5, user.getProfile());
            ps.setInt(6, user.getID());

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

    public Users getUserNameByPostId(int postId) {
        Users user = null;

        try {
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select * from Users where id = ?");
            ps.setInt(1, postId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new Users();
                String name = rs.getString("name");
                user.setName(name);

                user.setID(rs.getInt("id"));

                user.setEmail(rs.getString("email"));

                user.setPassword(rs.getString("password"));

                user.setGender(rs.getString("gender"));

                user.setAbout(rs.getString("about"));

                user.setDate(rs.getDate("reg_date"));

                user.setProfile(rs.getString("profile"));
            }
        } catch (SQLException ex) {

            ex.printStackTrace();

        }
        return user;
    }
}
