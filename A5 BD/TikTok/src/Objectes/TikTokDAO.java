/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author usuari
 */
public class TikTokDAO { //Data Acces Object (collection de objectes)
    private List<VideoTikTok> videos;
    //private int nextId; // Controla el següent ID disponible

    public TikTokDAO() {
        //this.videos = new ArrayList<>(); //millor
        this.videos = new LinkedList<>(); //si la app es mes important insert/delete
       // this.nextId = 1; // Comença des de 1
    }

    // Mètode privat per trobar el màxim ID
    private int retornarIdMaxim() {
        int max=1;
        for (VideoTikTok video : videos) {
            if (video.getId()>max)
            {
             max = video.getId();
            }
        }
        return ++max;
        //return videos.stream().mapToInt(VideoTikTok::getId).max().orElse(0) + 1;
    }

    // Afegir un nou vídeo, independentment de si ja existeix
    public boolean afegirVideo(VideoTikTok video) throws NotUserInformedException {
        //error enunciat li tinc que assignar un id, i per tant te 
        //que tenir un setter i un getter
        if (video.getUsuari().isEmpty())
        {
            throw new NotUserInformedException();
        }
        else if(video.getUsuari().length()< 4)
        {
            throw new NotUserInformedException(video.getUsuari());
        }
        else
        {
            VideoTikTok add = new VideoTikTok(retornarIdMaxim(),video); //para no tener el SetId
            //video.setId(retornarIdMaxim()); // Assignem un nou ID
            return videos.add(video);
        }
        
    }

    // Eliminar el primer vídeo (segons l'ordre d'afegit)
    public VideoTikTok eliminarVideo() throws NoVideoListException {
        if (!videos.isEmpty()) {
            //return videos.remove(0);
            return videos.remove(0);
        }
        else
            throw new NoVideoListException();
    }

    public boolean eliminarVideo(VideoTikTok delete){
        return videos.remove(delete);
    }
    // Retorna vídeos d'un usuari ordenats per popularitat (de més a menys "M'agrada")
    public List<VideoTikTok> llistarVideosUsuariPopulars(String usuari) {
        List<VideoTikTok> lista_usuari = LlistaUsuari(usuari);
        
        Collections.sort(lista_usuari,Collections.reverseOrder()); //comparable
        return lista_usuari;
    }

    /**
     * metode interna que ens filtra per usuari
     * @param usuari
     * @return 
     */
    private List<VideoTikTok> LlistaUsuari(String usuari)
    {
         List<VideoTikTok> lista_usuari = new ArrayList<>();
        
        for (VideoTikTok video : videos) {
            if (video.getUsuari().equalsIgnoreCase(usuari))
                lista_usuari.add(video);
        }
        return lista_usuari; //lista filtrada por usuario
    }
    // Retorna vídeos d'un usuari ordenats per títol
    public List<VideoTikTok> llistarVideosUsuariTitol(String usuari) {
        List<VideoTikTok> lista_titol =  LlistaUsuari(usuari);
        
        Collections.sort(lista_titol, new VideoTiktokTitol());
        return lista_titol;
    }

    // Retorna vídeos d'un usuari ordenats per durada
    public List<VideoTikTok> llistarVideosDurada(String usuari) {
        List<VideoTikTok> lista_titol =  LlistaUsuari(usuari);
        
        Collections.sort(lista_titol, new VideoDuracio());
        return lista_titol;
    }

    /**
     * **Resposta a la pregunta:**  
     * En el cas de TikTok, no té gaire sentit substituir un vídeo sencer per un altre,
     * ja que cada vídeo és únic i està lligat a un contingut específic.  
     * En comptes de substituir, TikTok permet modificar certs atributs com el títol o la visibilitat.  
     */

    // Mètode per modificar els atributs editables d'un vídeo a TikTok
    public boolean modificarVideo(VideoTikTok video, String nouTitol, int nousMAgradan) {
        
        int posicion = videos.indexOf(video);
        if (posicion != -1)
        {
            videos.get(posicion).setLikes(nousMAgradan);
            videos.get(posicion).setTitol(nouTitol);
            return true;
        }
        else
            return false; // No s'ha trobat cap vídeo coincident
    }
    
}
