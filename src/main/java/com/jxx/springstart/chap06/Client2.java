package com.jxx.springstart.chap06;

public class Client2 {
    private String host;
    public void setHost(String host) {
        this.host = host;
    }

    public void connect() {
        System.out.println("Client2.connect() 실행");
    }

    public void close() {
        System.out.println("Client2.close() 실행 " + this.host);
    }

    public void send() {
        System.out.println("Client.send()" + this.host);
    }
}
