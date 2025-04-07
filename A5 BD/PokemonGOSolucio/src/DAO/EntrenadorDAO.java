package DAO;



import BD.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Entrenador;

public class EntrenadorDAO {
    private Connection conn;

    // Constructor que inicialitza la connexió a la base de dades
    public EntrenadorDAO() throws SQLException {
        this.conn = DBConnect.getConnection();
    }
    
    // Mètode per donar d'alta un entrenador    
    public boolean altaEntrenador(Entrenador entrenador) throws SQLException {
        String query = "INSERT INTO Entrenadors (nom, password) VALUES (?, ?)";
        
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entrenador.getNom());
            pstmt.setString(2, entrenador.getPassword());
            int result = pstmt.executeUpdate();
            if (result>0)
            {
               Statement stmt = conn.createStatement();
               
               query = "SELECT MAX(id) from Entrenadors"; 
               ResultSet rs = stmt.executeQuery(query);
               if (rs.next())
               {
                   
                   entrenador.setId(rs.getInt(1)); //li poso el id
                   //no cal fer return de entrenador perque al no ser una variable primitiva, es conserva els valors
                   return true;
               }
               
            }
                
            return result > 0; // Retorna true si s'ha afegit correctament
        
    }

    // Mètode per verificar si un entrenador existeix
    public Entrenador existeixEntrenador(String nom) throws SQLException {
        String query = "SELECT * FROM Entrenadors WHERE nom = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nom);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Entrenador(rs.getInt("id"),rs.getString("nom"), rs.getString("password"));
                }
                return null; // Si no existeix, retorna null
            }
    }

    // Mètode per esborrar un entrenador per nom
    public boolean esborrarEntrenador(String nom) throws SQLException {
        Entrenador exists = existeixEntrenador(nom);
        if (exists!=null)
        {
           String query = "DELETE FROM Entrenadors WHERE nom = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nom);
            int result = stmt.executeUpdate();
            return result > 0; // Retorna true si s'ha esborrat correctament 
        }
        else
            return false;
    }

    // Mètode per obtenir tots els entrenadors
    public List<Entrenador> totsEntrenadors() throws SQLException {
        List<Entrenador> entrenadors = new ArrayList<>();
        String query = "SELECT * FROM Entrenadors";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Entrenador entrenador = new Entrenador(rs.getString("nom"), rs.getString("password"));
                entrenadors.add(entrenador);
            }
        }
        return entrenadors;
    }
    
    public void tancarConexió() throws SQLException
    {
        conn.close();
    }
}

