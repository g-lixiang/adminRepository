package com.bjpowernode.test;

import java.util.UUID;

/**
 * @auther 李祥
 * @date 2021/6/1 16:20
 */
public class Test01 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        str=str.replaceAll("-", "");
        System.out.println(str);

    }
}
