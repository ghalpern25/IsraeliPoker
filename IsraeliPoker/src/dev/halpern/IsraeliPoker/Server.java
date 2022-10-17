package dev.halpern.IsraeliPoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.LinkedList;

public class Server {
    public LinkedList<LinkedList<LinkedList<Card>>> hands = new LinkedList<>();

    public Server() {
        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));

            String ip = in.readLine(); //you get the IP as a String
            System.out.println(ip);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        // try (ServerSocket serverSocket = new ServerSocket(42069)) {
        //     System.out.println(serverSocket);
        //     Socket clientSocket = serverSocket.accept();
            
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        for (int i = 0; i < 2; i++) {
            hands.add(new LinkedList<>());
            for (int j = 0; j < 5; j++) {
                hands.get(i).add(new LinkedList<>());
            }
        }
    }

    public void dealInitial() {
        for (int i = 0; i < 10; i++) {
            //placeCard(i % 2, i / 2, deck.pop());
        }
    }

    public void placeCard(int player, int position, Card card) {
        hands.get(player).get(position).add(card);
    }
}
