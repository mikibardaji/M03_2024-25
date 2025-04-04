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
    TikTokDAODB videos;

    public LikeDAO() {
        videos = new TikTokDAODB();
    }
    
    public boolean afegirLike(Like like) throws SQLException {
        
        conn = DBConnect.getConnection();
        int id = videos.getIdVideo(like.getNomVideo());
        if (id>0)
        {
            like.setVideo(id);
            String query = "INSERT INTO LIKES (nick_visualitzador, id_video) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, like.getNickVisualitzador());
            stmt.setInt(2, like.getIdVideo());
            int numRowsAffected = stmt.executeUpdate();
            stmt.close();
            conn.close();
            return numRowsAffected > 0;
        }
        else
        {
            return false;
        }
    }
}