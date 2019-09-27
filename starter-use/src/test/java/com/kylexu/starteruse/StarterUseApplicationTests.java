package com.kylexu.starteruse;

import com.kylexu.hellospringbootstarter.service.HelloService;
import com.kylexu.kotlinspringbootstarter.service.KotlinService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StarterUseApplicationTests {

    @Autowired
    HelloService helloService;
    @Autowired
    KotlinService kotlinService;

    @Test
    public void contextLoads() {
        System.out.println(helloService.helloWorld());

        String[] split = kotlinService.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

}
