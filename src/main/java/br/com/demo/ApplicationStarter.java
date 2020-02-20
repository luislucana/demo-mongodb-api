package br.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.mongodb.com/blog/post/rest-apis-with-java-spring-boot-and-mongodb
 * https://docs.mongodb.com/manual/tutorial/convert-standalone-to-replica-set/
 * https://www.mongodb.com/blog/post/mongodb-multi-document-acid-transactions-general-availability
 */
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}