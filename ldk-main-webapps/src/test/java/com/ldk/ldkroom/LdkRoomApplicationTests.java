package com.ldk.ldkroom;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
@SpringBootTest
class LdkRoomApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private StringEncryptor encryptor;

    /**
     * 使用jasypt进行加密解密
     */
    @Test
    public void testJasypt() {
        String password = "123456";
        String encryptPwd = encryptor.encrypt(password);
        System.out.println("加密:：" + encryptPwd);
        System.out.println("解密：" + encryptor.decrypt(encryptPwd));
    }


}
