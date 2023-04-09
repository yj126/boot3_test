package com.example.boot3_test;


import com.qing.oss.core.OssTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot3TestApplicationTests {
    @Autowired
    private OssTemplate ossTemplate;

    @Test
    void contextLoads() {
        ossTemplate.createBucket("oss02");

    }
    @Test
    void contextLoads2() {
        System.out.println(666);
    }

}
