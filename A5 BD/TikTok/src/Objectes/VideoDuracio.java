/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.util.Comparator;

/**
 *
 * @author usuari
 */
public class VideoDuracio  implements Comparator<VideoTikTok>  {

    @Override
    public int compare(VideoTikTok o1, VideoTikTok o2) {
           return (int) o1.durada - (int) o2.durada;
    }
    
}
