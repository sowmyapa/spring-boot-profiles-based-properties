package org.sowmya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.mkyong.com/spring-boot/spring-boot-profile-based-properties-and-yaml-example/
 * mvn package
 * java -jar -Dspring.profiles.active=prod target/spring-boot-profile-1.0.jar
 * Created by sowmyaparameshwara on 5/26/17.
 *
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
   https://docs.spring.io/spring-boot/docs/current/reference/html/howto-properties-and-configuration.html
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ServerProperties serverProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(serverProperties);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}