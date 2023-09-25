package com.programmerzamannow.spring.config.environment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = EnvironmentTest.TestApplication.class)
public class EnvironmentTest {

    @Autowired
    Environment environment;

    @Test
    void testEnviroment() {
        String java_home = environment.getProperty("JAVA_HOME");
        Assertions.assertEquals("/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home", java_home);
    }

    @SpringBootApplication
    public static  class TestApplication {

    }
}
