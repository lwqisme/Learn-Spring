package com.qq.demo;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //当前没有代理角色
        ProxyIHandler pih = new ProxyIHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setTarget(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
