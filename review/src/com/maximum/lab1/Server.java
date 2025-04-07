package com.maximum.lab1;

import java.awt.*;
import java.applet.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Server extends JFrame {
    private JTextArea jta = new JTextArea();

    public static void main(String args[]) throws NullPointerException {
        new Server();
    }

    public Server() {
        setLayout(new BorderLayout());
        add(new JScrollPane(jta), BorderLayout.CENTER);
        setTitle("Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            ServerSocket serverSocket = new ServerSocket(60000);
            jta.append("Server started at " + new Date() + '\n');

            Socket socket = serverSocket.accept();
            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

            while (true) {
                double n = inputFromClient.readDouble();
                double area = n * n * Math.PI;

                outputToClient.writeDouble(area);

                if (n == 1) {
                    jta.append("Radius received from client: " + n + '\n');
                    jta.append("Circle Area found: " + area + '\n');
                }
                if (n == 2) {
                    jta.append("Radius received from client: " + n + '\n');
                    jta.append("Cylinder Area found: " + area * 3 + '\n');
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}