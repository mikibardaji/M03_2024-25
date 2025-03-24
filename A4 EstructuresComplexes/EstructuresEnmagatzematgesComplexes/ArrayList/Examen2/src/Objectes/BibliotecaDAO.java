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
public class BibliotecaDAO { //Data Acces Object (collection de objectes)
    private List<Llibre> cataleg;
    private final int CAPACITAT;
    
    //private int nextId; // Controla el següent ID disponible

    public BibliotecaDAO(int capacitat) {
        cataleg = new ArrayList<>();
        if (capacitat == 0)
        {
             this.CAPACITAT = 50;
        }
        else
        {
            this.CAPACITAT = capacitat;
        }
        
    }

    public BibliotecaDAO() {
        cataleg = new ArrayList<>();
        this.CAPACITAT = 50;
    }


    // Afegir un nou vídeo, independentment de si ja existeix
    public boolean afegirVideo(Llibre book) throws OverflowCapacityException {
        
        if (cataleg.size()>= CAPACITAT)
        {
            throw new OverflowCapacityException(CAPACITAT);
        }
        else if (!cataleg.contains(book))
        {
            return cataleg.add(book);
        }
        else
        {
            return false;
        }

        
    }



    public boolean eliminarLibro(Llibre delete){
        return cataleg.remove(delete);
    }
    // Retorna vídeos d'un usuari ordenats per popularitat (de més a menys "M'agrada")
    public List<Llibre> llistarLlibresTitol(String usuari) {
        List<Llibre> lista_llibre = cataleg;
        
        Collections.sort(lista_llibre); //comparable
        return lista_llibre;
    }

    public List<Llibre> llistarLlibresSatisfaction(String usuari) {
        List<Llibre> lista_llibre = cataleg;
        
        Collections.sort(lista_llibre, new OrderBySatisfaction()); //comparable
        return lista_llibre;
    }
    
 
    // Retorna vídeos d'un usuari ordenats per popularitat (de més a menys "M'agrada")
    public List<Llibre> llistarLlibresAutor(String usuari) {
        List<Llibre> lista_llibre = new ArrayList<>();
        
        for (Llibre book : lista_llibre) {
            if (book.getAutor().endsWith(usuari))
            {
                lista_llibre.add(book);
            }
        }
              
        return lista_llibre;
    }

    public List<Llibre> LlibresDisponibles() {
        return cataleg;
    }
    

    public List<Llibre> llibresGenere(String genero)
    {
         List<Llibre> lista_llibre = new ArrayList<>();
         
         for (Llibre book : lista_llibre) {
            if (book.getGeneres().contains(genero))
            {
                lista_llibre.add(book);
            }
        }
         return lista_llibre;
    }



}
