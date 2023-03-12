/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class Bufferedreader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader zi = null;
        try {
            zi = new BufferedReader(new FileReader("C:\\Games\\pi.txt"));
            String path = zi.readLine();
            while(path != null){
                System.out.println(path);
                path = zi.readLine();
            }
            zi.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            String response = zi == null?"Impossivel inicializar":"Sucesso ao ler arquivo";
            System.out.println(response);
        }
           
        
    }
    
}
