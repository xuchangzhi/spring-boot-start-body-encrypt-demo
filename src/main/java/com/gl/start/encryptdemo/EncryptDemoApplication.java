package com.gl.start.encryptdemo;

import com.gl.encrypt.annotation.EnableEncrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEncrypt
@SpringBootApplication
public class EncryptDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncryptDemoApplication.class, args);
    }

}
