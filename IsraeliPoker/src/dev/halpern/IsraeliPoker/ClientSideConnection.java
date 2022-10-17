package dev.halpern.IsraeliPoker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSideConnection {

    private Socket socket;
    private DataInputStream dataIn;
    private DataOutputStream dataOut;
    private String serverIP = "localhost";

    public ClientSideConnection() {
        try {
            socket = new Socket(serverIP, 42069);
            dataIn = new DataInputStream(socket.getInputStream());
            dataOut = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
