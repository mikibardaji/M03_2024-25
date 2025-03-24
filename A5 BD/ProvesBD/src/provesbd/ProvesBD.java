/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesbd;

import java.sql.SQLException;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class ProvesBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProvesBD app = new ProvesBD();
        app.run();
    }

    private void run() {
        try {
            //al principi del programa i un sol cop!!
            DBConnect.loadDriver();
            printCountries();
            
            insertCountry();
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    /** recupera todos los paises de la bd y los mostramos*/
    
    private void printCountries() {
        try {
            //obtenir una conexió a la bd amb el usuari y password
            Connection conn = DBConnect.getConnection();
            if (conn != null)
            {//si ens ha donat conexió tot va aquí dins
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM COUNTRIES WHERE ID > 0";
                
                ResultSet res = stmt.executeQuery(query); //Cursor
                print_Countries(res);
                
                stmt.close();
                conn.close();
                
            }
            else
            {
                System.out.println("Conexió nula");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void print_Countries(ResultSet res) throws SQLException {
        while (res.next()) //fetch
        {
            int id = res.getInt("id");
            String nom = res.getString("nombre");
            String capital = res.getString("capital");
            Country pais = new Country(id, nom, capital);
            System.out.println(pais);
        }
    }

    private void insertCountry() {
        try {
            //obtenir una conexió a la bd amb el usuari y password
            Connection conn = DBConnect.getConnection();
            if (conn != null)
            {//si
                 Statement stmt = conn.createStatement();
                 String pais1 = "Andorra";
                 String capital1 = "Andorra la vella";
                 String query = "Insert into countries (nom, capital) values " +
                         "('" + pais1+ "','" + capital1 + "')";
                 System.out.println(query);
                 int numRowsAffected = stmt.executeUpdate(query);
                 System.out.println("Insert "+ numRowsAffected);
                 stmt.close();
                 conn.close();
            }
            else
            {
                System.out.println("Conexió nula");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProvesBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
