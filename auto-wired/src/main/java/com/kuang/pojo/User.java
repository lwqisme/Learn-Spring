package com.kuang.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String name = "xzdl";

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
