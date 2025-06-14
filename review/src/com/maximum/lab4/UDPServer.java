package com.maximum.lab4;

import java.net.*;
import java.io.IOException;

public class UDPServer {

    public static void main(String args[]) {

        DatagramSocket aSocket = null;

        try {
            aSocket = new DatagramSocket(60000);
            byte[] buffer = new byte[1000];
            while(true) {
                DatagramPacket request =  new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                System.out.print("got " + request.getLength() + " bytes - ");
                DatagramPacket reply = new DatagramPacket
                        (
                                request.getData(), request.getLength(), request.getAddress(), request.getPort()
                        );
                aSocket.send(reply);
                System.out.println("send " + reply.getLength() + " bytes back");
            }
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if(aSocket != null)
                aSocket.close();
        }

    }

}
