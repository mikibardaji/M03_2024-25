/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Captura;

public class CapturaDAO {
    private Connection conn;

    // Constructor que inicialitza la connexió a la base de dades
    public CapturaDAO() throws SQLException {
        this.conn =  DBConnect.getConnection();
    }

    // Mètode per registrar una nova captura
    public boolean darCaptura(int id_entrenador, int num_pokemon, int CP) throws SQLException {
        String query = "INSERT INTO Capturas (id_entrenador, num_pokemon, CP) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_entrenador);  // Assignem el id de l'entrenador
            stmt.setInt(2, num_pokemon);    // Assignem el número de Pokémon (Pokedex)
            stmt.setInt(3, CP);             // Assignem el Combat Power (CP) de la captura

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;  // Retorna true si s'ha realitzat amb èxit
        }
    }

    // Mètode per obtenir totes les captures d'un entrenador
    public List<Captura> getCaza(int id_entrenador) throws SQLException {
        List<Captura> captures = new ArrayList<>();
        // Consulta SQL modificada per incloure el nom de l'entrenador
        String query = "SELECT e.nom_entrenador, p.nom_pokemon, c.CP " +
                       "FROM Capturas c " +
                       "JOIN Pokemons p ON c.num_pokemon = p.num_pokemon " +
                       "JOIN Entrenadors e ON c.id_entrenador = e.id_entrenador " +
                       "WHERE c.id_entrenador = ? " +
                       "ORDER BY c.num_pokemon";  // Ordenem les captures pel número de Pokémon (Pokedex)

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id_entrenador);  // Assignem l'id de l'entrenador a la consulta

            ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    String nomEntrenador = rs.getString("nom_entrenador");  // Obtenim el nom de l'entrenador
                    String nomPokemon = rs.getString("nom_pokemon");        // Obtenim el nom del Pokémon
                    int CP = rs.getInt("CP");                                // Obtenim el Combat Power (CP) de la captura

                    // Afegim la informació a la llista en el format "nom_entrenador: nom_pokemon CP"
                    captures.add(new Captura(nomEntrenador , nomPokemon, CP));
                }
        
        return captures;  // Retornem la llista de captures amb els noms dels entrenadors
    }
    
    
    public void tancarConexió() throws SQLException
    {
        conn.close();
    }
}

