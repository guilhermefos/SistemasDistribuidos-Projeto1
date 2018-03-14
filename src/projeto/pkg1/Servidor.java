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
public class Servidor {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2200);
        System.out.println("Esperando conexão: .......");
        
        Socket socket = serverSocket.accept();
        System.out.println("Conexão aceita, esperando dados ...");
        
        DataInputStream entrada = new DataInputStream(socket.getInputStream());
        DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
        
        for (int i = 0; i < 1; i++) {
            int linha = entrada.readInt();
            System.out.println("Cliente realizou a conexão");
            saida.writeUTF("Dado do cliente recebido - dado: "+linha);
        }
    }
}
