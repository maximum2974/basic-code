package com.maximum.a05test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        客户端: 多次发送数据
        服务器: 接受多次接收数据,并打印
         */

        Socket socket = new Socket("127.0.0.1", 10000);
        OutputStream os = socket.getOutputStream();

        String str = null;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要发送的信息");
            str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        socket.close();
    }
}
