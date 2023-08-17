package com.maximum.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建对象DatagramSocket的对象
        DatagramSocket ds = new DatagramSocket(10086);

        //接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            //解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();

            //打印数据
            System.out.println("ip为: " + ip + ",主机名为: " + name + "的人,发送了数据: " + new String(data,0,len));
        }

    }
}
