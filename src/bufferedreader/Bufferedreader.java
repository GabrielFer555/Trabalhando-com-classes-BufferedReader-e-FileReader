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
        /*
        utilizando o bloco try-with-resources o neste caso especifico o comando zi.close() que faria o fechamento do leitor de texto será executado 
        automaticamente ao final da execução do bloco try
        
        Apenas lembrando: 
        
        BufferedReader nomeDoObjeto = new BufferedReader(new FileReader (String com o caminho do arquivo txt que você deseja ler))
        */
        try (BufferedReader zi = new BufferedReader(new FileReader("C:\\Games\\pi.txt"))){
            String line = zi.readLine();
            while(line != null){
                System.out.println(line);
                line = zi.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
           
        
    }
    
}
