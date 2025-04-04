package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Like
public class Like {
    private final String nickVisualitzador;
    private int idVideo;
    private final String nomVideo;

    public String getNomVideo() {
        return nomVideo;
    }

    public Like(String nickVisualitzador, String nomVideo) {
        this.nickVisualitzador = nickVisualitzador;
        this.nomVideo = nomVideo;
        this.idVideo = 0;
    }
    
    public Like(String nickVisualitzador, int idVideo) {
        this.nickVisualitzador = nickVisualitzador;
        this.idVideo = idVideo;
        nomVideo = "";
    }
    
    public String getNickVisualitzador() {
        return nickVisualitzador;
    }
    
    public int getIdVideo() {
        return idVideo;
    }
    
    public void setVideo(int id)
    {
        this.idVideo = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Like de " + nickVisualitzador);
        if (!nomVideo.isEmpty())
        {
            sb.append("al video " + nomVideo);
        }
        else
        {
            sb.append("al video " + idVideo);
        }
        return sb.toString();
    }
    
    
}