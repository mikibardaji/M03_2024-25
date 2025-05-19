/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesfile;

import java.io.File;

/**
 *
 * @author mabardaji
 */
public class ProvesFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //primera part teoaria
        //diferenciaRelatiuAbsolut();
        
        //segona part teoria
        //comprobacionsObjecteFile();      
        
        //tercera part moure fitxers
        //renombrarFitxers();
        
        //llistartotes els fitxers
        listAllFiles();
    }
    
    
    public static void mostrarRutas(File f, String tipo_ruta){
        System.out.println(tipo_ruta);
        System.out.println("getParent(): " + f.getParent());
        System.out.println("getName(): " + f.getName());
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        
    }

    private static void diferenciaRelatiuAbsolut() {
        //Ruta absoluta
        File carpetaAbs = new File("C:\\Users\\mabardaji\\Pictures");
        File fitxerAbs = new File("C:\\Users\\mabardaji\\Pictures\\A1_UD2_EX9.png");
        //rutes relatives
         File carpetaRel = new File("Proves");
        File fitxerRel = new File("Proves\\pokemon.jpg");       
        
        //mostrrar rutas
        mostrarRutas(carpetaAbs, "Rutas absolutas");
        mostrarRutas(fitxerAbs, "Rutas absolutas");
        mostrarRutas(carpetaRel, "Rutas relatives");
        mostrarRutas(fitxerRel, "Rutas relatives");  
    }

    private static void comprobacionsObjecteFile() {
        //exists
        //isFile o isDirectory
        File f1_exist = new File("Proves");
        File f2_exist = new File("Proves\\1.txt");
        File f1_no_exist = new File("ProvesNO");
        File f2_no_exist = new File("Proves\\NO.txt");
        
        comprobacionsFile(f1_exist);
        comprobacionsFile(f2_exist);
        comprobacionsFile(f1_no_exist);
        comprobacionsFile(f2_no_exist);
        
    }

    private static void comprobacionsFile(File fitxer) {
        System.out.println("Nom--> " + fitxer.getAbsolutePath());
        if (fitxer.exists())
        {
            System.out.println("Archivo?" + fitxer.isFile());
            System.out.println("Carpeta?" + fitxer.isDirectory());
        }
    }

    private static void renombrarFitxers() {
        File f2_exist = new File("Proves\\2.txt");
        File f2_newfile = new File("2.txt");
        
        if (f2_exist.renameTo(f2_newfile))
        {
            System.out.println("Se ha movido archivo");
        }
        else
        {
            System.out.println("No se ha podido renombrar");
        }
    }

    private static void listAllFiles() {
        File carpeta = new File("C:\\Users\\mabardaji\\Downloads");
        if (carpeta.exists())
        {
            if (carpeta.isDirectory())
            {
                File[] lista = carpeta.listFiles();
                //bucle 
                for (File archivo : lista) {
                    if (archivo.isDirectory())
                    {
                        System.out.println("Carpeta--> " + archivo.getName());
                    }
                    else
                    {
                         System.out.println("Archivo--> " + archivo.getName());
                    }
                    
                }
                
            }
            
        }
    }
}
