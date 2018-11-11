package day;

import java.io.*;
import java.net.*;


/**
 * Created by CHLaih on 2018/10/19.
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        String ClientSentence;
        String capitalizedSentence;

        ServerSocket welcomeSocket = new ServerSocket(8080);

        while(true) {

            Socket connectionSocket = welcomeSocket.accept();

            BufferedReader inFromClient =
                    new BufferedReader(new
                            InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient =
                    new DataOutputStream(connectionSocket.getOutputStream());

            ClientSentence = inFromClient.readLine();

            capitalizedSentence = ClientSentence.toUpperCase() + '\n';

            outToClient.writeBytes(capitalizedSentence);
        }

        }
}
