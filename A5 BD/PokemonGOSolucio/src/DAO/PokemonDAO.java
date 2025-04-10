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
import java.util.Random;
import model.Pokemon;

public class PokemonDAO {
    private Connection conn;

    // Constructor que inicialitza la connexió a la base de dades
    public PokemonDAO() throws SQLException {
        this.conn = DBConnect.getConnection();
    }

    // Mètode per donar d'alta un Pokémon
    public boolean altaPokemon(Pokemon pokemon) throws SQLException {
        String query = "INSERT INTO Pokemons (numero_pokedex, nom, tipus) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pokemon.getNumeroPokedex());
            stmt.setString(2, pokemon.getNom());
            stmt.setString(3, pokemon.getTipus());
            int result = stmt.executeUpdate();
            return result > 0; // Retorna true si s'ha afegit correctament
        }
    }

    
    private int getNumPokemonExistents() throws SQLException
    {
            String query = "SELECT COUNT(*) AS total FROM Pokemons"; // Consulta per comptar el nombre de Pokémon
     
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery(query); 
            if (rs.next()) {
                return rs.getInt("total"); // Retorna el nombre de Pokémon
            }
            return 0; // Si no hi ha Pokémon, retorna 0
       
    }
    // Mètode per obtenir un Pokémon aleatori
    public Pokemon getPokemonRandom() throws SQLException {
        int num_pokemons_existents = getNumPokemonExistents();
        Random rd = new Random();
        int aleatori = rd.nextInt(num_pokemons_existents);
        List<Pokemon> tots = getListPokemon();
        if (tots!= null)
        {
            return tots.get(aleatori);
        }
        else
            return null;
        //opcio 2, que el random ho faci el select
      /*  String query = "SELECT * FROM Pokemons ORDER BY RAND() LIMIT 1";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                return new Pokemon(rs.getInt("numero_pokedex"), rs.getString("nom"), rs.getString("tipus"));
            }
            return null; // Si no hi ha Pokémon, retorna null
        }*/
    }

    // Mètode per obtenir tots els Pokémon
    public List<Pokemon> getListPokemon() throws SQLException {
        List<Pokemon> pokemons = new ArrayList<>();
        String query = "SELECT * FROM Pokemons";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Pokemon pokemon = new Pokemon(rs.getInt("numero_pokedex"), rs.getString("nom"), rs.getString("tipus"));
                pokemons.add(pokemon);
            }
        }
        return pokemons;
    }
    
    
    public void tancarConexio() throws SQLException
    {
        conn.close();
    }
}

