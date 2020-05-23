package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void  test1(){
        String name = "imooc";
        String pwd = "123456";
        log.debug("debug...");
        log.info("name: {}, password: {}",name,pwd);
        log.info("info...");
        log.error("error...");
        log.warn("warn...");
    }
}
