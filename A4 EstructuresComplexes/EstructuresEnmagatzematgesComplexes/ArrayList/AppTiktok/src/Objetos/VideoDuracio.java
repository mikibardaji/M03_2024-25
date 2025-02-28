/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class VideoDuracio  implements Comparator<VideoTikTok>  {

    @Override
    public int compare(VideoTikTok o1, VideoTikTok o2) {
           return (int) o1.durada - (int) o2.durada;
    }
    
}
