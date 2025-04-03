/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO per a Visualitzador
public class VisualitzadorDAO {
    private Connection conn;
    
    public boolean afegirVisualitzador(Visualitzador visualitzador) throws SQLException {
        conn = DBConnect.getConnection();
        String query = "INSERT INTO VISUALITZADORS (nick, nom) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, visualitzador.getNick());
        stmt.setString(2, visualitzador.getNom());
        int numRowsAffected = stmt.executeUpdate();
        stmt.close();
        conn.close();
        return numRowsAffected > 0;
    }
}