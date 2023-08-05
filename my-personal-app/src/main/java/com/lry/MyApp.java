package com.lry;


import com.ruoyi.RuoYiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: RuoYi-Vue-Personal
 * @description: 启动类
 * @author: Pck
 * @create: 2023-08-06 01:36
 **/

@SpringBootApplication
public class MyApp {

        public static void main(String[] args) {
            SpringApplication.run(new Class[]{
                    RuoYiApplication.class,
                    MyApp.class
            }, args);

            System.out.println("启动成功!");

        }


}
