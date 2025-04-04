/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO per a Comment
public class CommentDAO {
    private Connection conn;
    TikTokDAODB videos;

    public CommentDAO() {
        videos = new TikTokDAODB();
    }
    
    public boolean afegirComentari(Comment like) throws SQLException {
        
        conn = DBConnect.getConnection();
        int id = videos.getIdVideo(like.getNomVideo());//a partir titulo busco id del video
        if (id>0)
        {
            like.setVideo(id);
            String query = "INSERT INTO COMMENTS (nick_visualitzador, id_video, comentari) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, like.getNickVisualitzador());
            stmt.setInt(2, like.getIdVideo());
            stmt.setString(3,like.getComentario());
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