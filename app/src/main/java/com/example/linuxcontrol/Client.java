package com.example.linuxcontrol;

import java.net.*;
import java.io.*;

public class Client {
    private Socket client;
    PrintWriter remote;

    Client(String host, int port)throws IOException{
        this.client=new Socket(host, port);
        remote=new PrintWriter(client.getOutputStream());
    }

    void send(String txt)throws IOException{
        remote.print(txt);
    }

    void close()throws IOException{
        remote.close();
        client.close();
    }
}