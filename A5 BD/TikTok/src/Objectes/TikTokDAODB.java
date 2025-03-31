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
    //private int nextId; // Controla el següent ID disponible

    public TikTokDAODB() {

    }

    // Mètode privat per trobar el màxim ID
    private int retornarIdMaxim() {
            return 0;
    }

    // Afegir un nou vídeo, independentment de si ja existeix
    public boolean afegirVideo(VideoTikTok video) throws SQLException  {
        
        String titol = video.getTitol();
        int likes = video.getLikes();
        
        //obtenir una conexió a la bd amb el usuari y password
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

    // Eliminar el primer vídeo (segons l'ordre d'afegit)
    public VideoTikTok eliminarVideo() throws NoVideoListException {
        return null;
    }

    public boolean eliminarVideo(VideoTikTok delete){
        return true;
    }
    // Retorna vídeos d'un usuari ordenats per popularitat (de més a menys "M'agrada")
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
    // Retorna vídeos d'un usuari ordenats per títol
    public List<VideoTikTok> llistarVideosUsuariTitol(String usuari) {
            return null;
    }

    // Retorna vídeos d'un usuari ordenats per durada
    public List<VideoTikTok> llistarVideosDurada(String usuari) {
            return null;
    }

    /**
     * **Resposta a la pregunta:**  
     * En el cas de TikTok, no té gaire sentit substituir un vídeo sencer per un altre,
     * ja que cada vídeo és únic i està lligat a un contingut específic.  
     * En comptes de substituir, TikTok permet modificar certs atributs com el títol o la visibilitat.  
     */

    // Mètode per modificar els atributs editables d'un vídeo a TikTok
    public boolean modificarVideo(VideoTikTok video, String nouTitol, int nousMAgradan) {
            return true;
    }
    
}
