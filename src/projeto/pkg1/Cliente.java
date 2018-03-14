/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg1;

import java.net.*;
import java.io.*;

/**
 *
 * @author gdev
 */
public class Cliente {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 2200);
        DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
        DataInputStream entrada = new DataInputStream(socket.getInputStream());
        
        for(int i = 0; i < 1; i++) {
            saida.writeInt(i);
            System.out.println("Enviei :"+i);
            
            String en = entrada.readUTF();
            System.out.println("Recebi :"+en);
        }
    }
    
}
