/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author usuari
 */
public class TikTokDAODB { //Data Acces Object (collection de objectes)
    Connection conn;
    //private int nextId; // Controla el seg�ent ID disponible

    public TikTokDAODB() {

    }

    // M�tode privat per trobar el m�xim ID
    private int retornarIdMaxim() {
            return 0;
    }

    // Afegir un nou v�deo, independentment de si ja existeix
    public boolean afegirVideo(VideoTikTok video) throws SQLException  {
        
        String titol = video.getTitol();
        int likes = video.getLikes();
        
        //obtenir una conexi� a la bd amb el usuari y password
        conn = DBConnect.getConnection();
        
        String sql = "INSERT INTO VIDEOS (usuari, titol, durada, likes) "
                + " values ('" + video.getUsuari() + "','" + video.getTitol() 
                + "'," + video.getDurada() + "," + likes + ");";
        //System.out.println(sql);
         Statement stmt = conn.createStatement();
         int numRowsAffected = stmt.executeUpdate(sql);
         if (numRowsAffected>0)
             return true;
        else
            return false;
        
    }

    // Eliminar el primer v�deo (segons l'ordre d'afegit)
    public VideoTikTok eliminarVideo() throws NoVideoListException {
        return null;
    }

    public boolean eliminarVideo(VideoTikTok delete){
        return true;
    }
    // Retorna v�deos d'un usuari ordenats per popularitat (de m�s a menys "M'agrada")
    public List<VideoTikTok> llistarVideosUsuariPopulars(String usuari) {
        return null;
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
    
}
