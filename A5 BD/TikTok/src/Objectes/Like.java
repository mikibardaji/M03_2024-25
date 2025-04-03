package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Like
public class Like {
    private final String nickVisualitzador;
    private final int idVideo;
    
    public Like(String nickVisualitzador, int idVideo) {
        this.nickVisualitzador = nickVisualitzador;
        this.idVideo = idVideo;
    }
    
    public String getNickVisualitzador() {
        return nickVisualitzador;
    }
    
    public int getIdVideo() {
        return idVideo;
    }
}