package com.qq.pojo;

import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy();
        proxy.rent();
    }
}
