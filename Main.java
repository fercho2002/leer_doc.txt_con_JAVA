import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.sampled.SourceDataLine;

class Main {
    private static String[] lista = new String[726];
    private static String nombre = "urls.txt";
    private static int i = 0;
    private static String[] listado = new String[726];
    public static void main(String[] args) {
    System.out.println("hola mundo soy fernando");
        try{
            File f;
            FileReader lectorArchivo;
            f = new File(nombre);
            lectorArchivo = new FileReader(f);
            BufferedReader br = new BufferedReader(lectorArchivo);
            for(i=0;i<726;i++){
                lista[i]=br.readLine();
                }
            br.close();
            lectorArchivo.close();
            }catch(IOException e){
            System.out.println("Error:"+e.getMessage());
                  }
        for(i=0;i<726;i++){
            System.out.println("-"+lista[i]);
        }
      }
   }
