/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
import java.util.Comparator;

public class VideoTikTok implements Comparable<VideoTikTok> {
    private int idCounter = 0; // Per generar IDs únics
    private final int id ; // No accessible des de l'exterior
    private final String usuari; // No canvia després de la creació
    private String titol;
    private int likes;
    public final double durada; // No canvia després de la creació

    public VideoTikTok(String usuari, String titol, double durada) {
        this.id = 0;
        this.usuari = usuari;
        this.titol = titol;
        this.durada = durada;
        this.likes = 0; // Inicialment sense "M'agrada"
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

    // Comparable: ordenació per nombre de "M'agrada"
    @Override
    public int compareTo(VideoTikTok altre) {
        return this.likes - altre.likes;
    }

    // Equals i hashCode basats en usuari, títol i durada
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoTikTok video = (VideoTikTok) o;
        return Double.compare(video.durada, durada) == 0 &&
                usuari.equals(video.usuari) &&
                titol.equals(video.titol);
    }

    @Override
    public int hashCode() {
        return (usuari + titol + durada).hashCode();
    }

    // Comparador per durada (de més curt a més llarg)
    public static final Comparator<VideoTikTok> COMPARATOR_DURADA = Comparator.comparingDouble(VideoTikTok::getDurada);

    // Comparador per nom d'usuari (ordre alfabètic)
    public static final Comparator<VideoTikTok> COMPARATOR_USUARI = Comparator.comparing(VideoTikTok::getUsuari);

    // toString sense mostrar l'ID
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("usuari=" + usuari + " " );
        sb.append(", titol=" + titol + " " );
        sb.append("que dura " + durada );
        sb.append("acumula " + likes + " likes\n");
        return sb.toString();
    }
}

