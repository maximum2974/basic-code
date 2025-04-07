package com.maximum.lab1;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame implements ActionListener {
    private JTextField jtf = new JTextField();
    private JTextField jtf1 = new JTextField();
    private JTextArea jta = new JTextArea(30, 30);
    private JButton b = new JButton("Show");
    private DataOutputStream toServer;
    private DataInputStream fromServer;
    JLabel l1, l2, l3;

    public static void main(String args[]) throws NullPointerException {
        new Client();
    }

    public Client() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        p4.add(b);
        p2.add(jta);
        Font f = new Font("Arial", Font.BOLD, 12);

        l1 = new JLabel("\nArea received from the server is ");
        l1.setFont(f);
        l2 = new JLabel("Enter Radius: ");
        l3 = new JLabel("Enter Shape: ");

        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l2);
        p1.add(jtf);
        p1.add(l3);
        p1.add(jtf1);

        p3.setLayout(new GridLayout(3, 1));
        p3.add(p1);
        p3.add(p2);
        p3.add(p4);
        add(p3);

        b.addActionListener(this);

        setTitle("Client");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            Socket socket = new Socket("192.168.80.1", 60000);
            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            jta.append(ex.toString() + '\n');
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            try {
                double radius = Double.parseDouble(jtf.getText().trim());
                int n = Integer.parseInt(jtf1.getText().trim());
                toServer.writeDouble(radius);
                toServer.flush();
                double area = fromServer.readDouble();

                if (n == 1) {
                    jta.append("\nRadius is: " + radius);
                    jta.append("\n\nCircle : " + area);
                }
                if (n == 2) {
                    jta.append("\nRadius is: " + radius);
                    jta.append("\n\nCylinder: " + area);
                }
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
}