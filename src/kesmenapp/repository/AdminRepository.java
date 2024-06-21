/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kesmenapp.model.Admin;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class AdminRepository {
    private Connection connection;
    public AdminRepository() {
        connection = DBConn.getInstance().getConnection();
    }
    
    public List<Admin> getListAdmin() {
        List<Admin> adminList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM mahasiswa");
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                Admin admin = new Admin();                
                admin.setNama(resultSet.getString("nama"));
                admin.setEmail(resultSet.getString("email"));
                admin.setPassword(resultSet.getString("password"));
                adminList.add(admin);
            }
        } catch (Exception e) {
        }
        return adminList; 
    }

    public void insertAdmin(Admin admin) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO admin (nama, email, password)VALUES (?,?,?)");
            preparedStatement.setString(1, admin.getNama());
            preparedStatement.setString(2, admin.getEmail());
            preparedStatement.setString(3, admin.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();    
        }       
    }

    public Admin getAdminByEmail(String email) {
        Admin admin = new Admin();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM admin WHERE email = ?");            
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                admin.setNama(resultSet.getString("nama"));
                admin.setEmail(resultSet.getString("email"));      
                admin.setPassword(resultSet.getString("password"));                         
            } 
              
        } catch (Exception e) {
        }
        return admin;   
    }
}
