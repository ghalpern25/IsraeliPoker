package dev.halpern.IsraeliPokerServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int numPlayers;
    private ServerSocket ss;
    private ServerSideConnection player1Connection;
    private ServerSideConnection player2Connection;

    public Server() {
        numPlayers = 0;

        try {
            ss = new ServerSocket(42069);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void acceptConnections() {
        try {
            while (numPlayers < 2) {
                //ss = new ServerSocket(42069);
                Socket s = ss.accept();
                numPlayers++;
                System.out.println("Player #" + numPlayers + " connected");
                ServerSideConnection ssc = new ServerSideConnection(s, numPlayers);
                if (numPlayers == 1) {
                    player1Connection = ssc;
                } else {
                    player2Connection = ssc;
                }
                Thread t = new Thread(ssc);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.acceptConnections();
    }
}
