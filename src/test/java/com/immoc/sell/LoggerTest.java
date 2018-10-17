package com.immoc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: SLF4J 测试类
 * Created by Liu qi.
 * Date: 2018-10-14 16:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLoggerOut() {
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
    }
}
