package day;

import java.io.*;
import java.net.*;


/**
 * Created by CHLaih on 2018/10/19.
 */
public class TCPClient {
    public static void main(String[] args)throws Exception  {
        String sentence;
        String modifiedSentence;

        BufferedReader inFromUser =
                new BufferedReader(new InputStreamReader(System.in));

        Socket ClientSocket = new Socket("127.0.0.1", 6789);

        DataOutputStream outToServer =
                new DataOutputStream(ClientSocket.getOutputStream());
        BufferedReader inFromServer =
                new BufferedReader(new
                        InputStreamReader(ClientSocket.getInputStream()));

        sentence = inFromUser.readLine();

        outToServer.writeBytes(sentence + '\n');

        modifiedSentence = inFromServer.readLine();

        System.out.println("FROM Server: " + modifiedSentence);

        ClientSocket.close();

    }
}
