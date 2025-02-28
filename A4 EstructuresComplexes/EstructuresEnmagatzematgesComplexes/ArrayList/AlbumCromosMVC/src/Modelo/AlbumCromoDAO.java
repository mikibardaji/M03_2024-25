/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * DAO = Data Acces Object --> CRUD Cromo (Create/Read/Update/Delete)
 * @author mabardaji
 * Encarregat del mantenimet de la Estructura de Dades
 */
public class AlbumCromoDAO { 


//colecció no repes/repes
    
    //atributs Estructures
    private List<Cromo> album; //null
    //valors importants per aquesta estructura 
    private List<Cromo> caixa_repes;
    //NO TINDRA ATRIBUTS PROPIS DEL OBJECTE QUE GUARDA
    private final int NUM_MAX_COLECCION;

    
    public AlbumCromoDAO(int num) {
        album = new ArrayList<>();
        caixa_repes = new ArrayList<>();
        this.NUM_MAX_COLECCION = num;
    }
    
    /**
     * Afegeix el cromo a la nostra col·lecció 
     * @param afegir Cromo que vull afegir al  album
     * @return true si s'afegeix /false si es fica a repes
     * @throws NumberOutofAlbum quant el cromo a afegir no es de la col·lecció
     */
    public boolean afegirCromo(Cromo afegir) throws NumberOutofAlbum
            {
                //validacions
                    if (afegir.getNum()> NUM_MAX_COLECCION)
                    {
                        throw new NumberOutofAlbum(NUM_MAX_COLECCION);
                    }
                    else
                    {
                        if (album.contains(afegir)) //funcionara si
                        {//
                            caixa_repes.add(afegir);
                            return false;
                        }
                        else
                        {
                            album.add(afegir);
                            return true;
                        }  
                    }
            }
    
    public boolean afegirCromo(int num_cromo, String nom_cromo, TipoBrawler tipus) throws NumberOutofAlbum
    {
        Cromo afegir = new Cromo(num_cromo, nom_cromo, tipus);
        return this.afegirCromo(afegir);
        
    }
   
    /**
     * Eliminar cromo rebut sempre que estigui al album
     * Si no hi es s'ha d'informar
     */
    
    public boolean eliminarCromo(Cromo delete)
    {
        //comprovar si numero cromo no es mes gran
        //
        
           return  album.remove(delete); //borra el primer
        //opcion removeig
           //return album.removeIf(cromo -> cromo.getNum()==delete.getNum());
//           for (int i = 0; i < album.size(); i++) 
//           {
//               if (album.get(i).getNum() == delete.getNum())
//               {
//                   album.remove(i);
//               }
//            
//        }
           
           
//           int pos = album.indexOf(delete);
//           return album.remove(pos); //Cromo
        
    }
    
    public Cromo SustituirCromo(Cromo change)
    {
        //cambiar los atributos del cromo
        int pos = album.indexOf(change); //trobo on esta
        //opcion 1
        return album.set(pos, change);
        //opcio 2
        //album.get(pos).setNom(change.getNom());
        //album.get(pos).setTipo(change.getTipo());
        
    }
    
    /**
     * 
     * @param earn
     * @param give
     * @return -1 si no existe en repes, -2 si ya existe album -3 otro erro
     * 0 si todo ha funcionado correctamente 
     */
    
    public int CambiarPatio(Cromo earn, Cromo give)
    {
        //solo lo cambias si te falta en el album
        //y lo tienes repetido si no nada
// Opcio 0 :   int ind_repes = caixa_repes.indexOf(give);
//        if (ind_repes==-1)  //si es -1 no existe
//        {//si es otro valor es la posicion 
//            //seria return -1;
//        }
        if (!caixa_repes.contains(give))
        {
            return -1; //no lo tengo en repes
        }
        if(album.contains(earn))
        {
            return -2; //ya lo tengo en el albun
        }
        int result;
        if (!album.add(earn))
        {
            return -3;
        }
        if (caixa_repes.remove(give))
        {
            return 0;
        }
        else
        {
            return -3;
        }
        
    }
    
    public int cromosAlbum()
    {
        return album.size();
    }
}
