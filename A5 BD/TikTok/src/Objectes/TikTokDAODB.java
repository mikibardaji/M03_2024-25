/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.sql.SQLException;
import java.util.List;
import org.mariadb.jdbc.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class TikTokDAODB { //Data Acces Object (collection de objectes)
    Connection conn;
    //private int nextId; // Controla el seg�ent ID disponible

    public TikTokDAODB() {
            //conn = DBConnect.getConnection();
            //podria deixar la connexi� oberta
            // aqu� i fer un metode final, per quant es
            // es fa el salir, que tanques la connexi�
            //metode cerrarConexion() 
    }

    // M�tode privat per trobar el m�xim ID
    private int retornarIdMaxim() {
        
        //select max
            return 0;
    }

    // Afegir un nou v�deo, independentment de si ja existeix
    public boolean afegirVideo(VideoTikTok video) throws SQLException  {
        
        String titol = video.getTitol();
        int likes = video.getLikes();
        
        //obtenir una conexi� a la bd amb el usuari y password
        conn = DBConnect.getConnection();
        
       /* String sql = "INSERT INTO VIDEOS (usuari, titol, durada, likes) "
                + " values ('" + video.getUsuari() + "','" + video.getTitol() 
                + "'," + video.getDurada() + "," + likes + ");";
        //System.out.println(sql);
         Statement stmt = conn.createStatement();
         int numRowsAffected = stmt.executeUpdate(sql);*/
       String query = "INSERT INTO VIDEOS (usuari, titol, durada, likes) "
               + " VALUES (?,?,?,?)";
       PreparedStatement stmt = conn.prepareStatement(query);
       
       stmt.setString(1, video.getUsuari());
       stmt.setString(2, titol);
       stmt.setDouble(3, video.getDurada());
       stmt.setInt(4, likes);
       int numRowsAffected = stmt.executeUpdate();
       stmt.close();
       conn.close();
       if (numRowsAffected>0)
            return true;
       else
            return false;
        
    }

    // Eliminar el primer v�deo (segons l'ordre d'afegit)
    public VideoTikTok eliminarVideo() throws NoVideoListException {
        return null;
    }

    public int eliminarVideo(VideoTikTok delete) throws SQLException{
         //obtenir una conexi� a la bd amb el usuari y password
        conn = DBConnect.getConnection();
        
        String sql = "DELETE FROM VIDEOS " +
                " WHERE USUARI = '" + delete.getUsuari()+ "' "
                + " AND TITOL = '" + delete.getTitol() +"';";
        System.out.println(sql);
        Statement stmt = conn.createStatement();
        int numRowsAffected = stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
        return numRowsAffected;
    }
    // Retorna v�deos d'un usuari ordenats per popularitat (de m�s a menys "M'agrada")
    public List<VideoTikTok> llistarVideosUsuariPopulars(String usuari) throws SQLException {
        List<VideoTikTok> lista = new ArrayList<>();
               
        String sql = "SELECT * FROM VIDEOS " + 
                "WHERE USUARI = ? ORDER BY LIKES DESC;";
        //obtenir una conexi� a la bd amb el usuari y password
        conn = DBConnect.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, usuari);
        
        ResultSet rs  = pstmt.executeQuery();
        while (rs.next())
        {
            VideoTikTok vista = new VideoTikTok(rs.getString("usuari"), rs.getString("titol"), rs.getDouble("durada"));
            vista.setLikes(rs.getInt("likes"));
            lista.add(vista);
        }
        return lista;
    }

    /**
     * metode interna que ens filtra per usuari
     * @param usuari
     * @return 
     */
    private List<VideoTikTok> LlistaUsuari(String usuari)
    {
        return null;
    }
    // Retorna v�deos d'un usuari ordenats per t�tol
    public List<VideoTikTok> llistarVideosUsuariTitol(String usuari) {
            return null;
    }

    // Retorna v�deos d'un usuari ordenats per durada
    public List<VideoTikTok> llistarVideosDurada(String usuari) {
            return null;
    }

    /**
     * **Resposta a la pregunta:**  
     * En el cas de TikTok, no t� gaire sentit substituir un v�deo sencer per un altre,
     * ja que cada v�deo �s �nic i est� lligat a un contingut espec�fic.  
     * En comptes de substituir, TikTok permet modificar certs atributs com el t�tol o la visibilitat.  
     */

    // M�tode per modificar els atributs editables d'un v�deo a TikTok
    public boolean modificarVideo(VideoTikTok video, String nouTitol, int nousMAgradan) {
            return true;
    }

    int getIdVideo(String nomVideo) throws SQLException {
        
               
        String sql = "SELECT id FROM VIDEOS " + 
                "WHERE titol = ? ";
        //obtenir una conexi� a la bd amb el usuari y password
        conn = DBConnect.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nomVideo);
        
        ResultSet rs  = pstmt.executeQuery();
        if (rs.next())
        {
            return rs.getInt("id");

        }
        return -1;        
    }
    
}
