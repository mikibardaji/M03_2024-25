/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO per a Like
public class LikeDAO {
    private Connection conn;
    
    public boolean afegirLike(Like like) throws SQLException {
        conn = DBConnect.getConnection();
        String query = "INSERT INTO LIKES (nick_visualitzador, id_video) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, like.getNickVisualitzador());
        stmt.setInt(2, like.getIdVideo());
        int numRowsAffected = stmt.executeUpdate();
        stmt.close();
        conn.close();
        return numRowsAffected > 0;
    }
}