/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.util.Random;

public class VideoTikTok implements Comparable<VideoTikTok> {
    //private static int idCounter = 0; // Per generar IDs únics
    private  int id ; // No accessible des de l'exterior
    private final String usuari; // No canvia després de la creació
    private String titol;
    private int likes;
    public final double durada; // No canvia després de la creació
    public VideoTikTok(String usuari, String titol, double durada) {
      //  idCounter++;
      //  this.id = idCounter;
      this.id = 0;
        this.usuari = usuari;
        this.titol = titol;
        this.durada = durada;
        this.likes = 0; // Inicialment sense "M'agrada"
        this.likes = new Random().nextInt(100); //per tenir m'agrada
    }

    public VideoTikTok(int id, VideoTikTok v) {
        this.id = id;
        this.usuari = v.usuari;
        this.titol = v.titol;
        this.durada = v.durada;
        this.likes = v.likes; // Inicialment sense "M'agrada"
        this.likes = new Random().nextInt(100); //per tenir m'agrada
    }
    
    
    
    // Getters
    public String getUsuari() {
        return usuari;
    }

    public String getTitol() {
        return titol;
    }

    public int getLikes() {
        return likes;
    }

    public double getDurada() {
        return durada;
    }

    // Setters
    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void incrementarLikes() {
        this.likes++;
    }

    public void decrementarLikes() {
        this.likes--;
    }    
    public void setLikes(int new_likes)
    {
        if (new_likes>0)
        {
            this.likes = new_likes;
        }
    }

    // Comparable: ordenació per nombre de "M'agrada"
    @Override
    public int compareTo(VideoTikTok altre) {
        return this.likes - altre.likes;  //comparacio likes
    }

    // Equals i hashCode basats en usuari, títol i durada
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof VideoTikTok))
            return false;
        
        VideoTikTok video = (VideoTikTok) o;
        if (video.durada!= this.durada)
            return false;
        if (!video.usuari.equalsIgnoreCase(this.usuari))
            return false;
        if(!video.titol.equalsIgnoreCase(this.titol))
            return false;
        else
            return true;
    }

//    @Override
//    public int hashCode() {
//        return (usuari + titol + durada).hashCode();
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        if (id>0)
//            this.id = id;
//    }

    

    // toString sense mostrar l'ID
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("usuari=" + usuari + " " );
        sb.append(", titol=" + titol + " " );
        sb.append(" duració " + durada );
        sb.append(" segons acumula " + likes + " likes\n");
        return sb.toString();
    }
}