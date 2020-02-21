package br.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.mongodb.com/blog/post/rest-apis-with-java-spring-boot-and-mongodb
 * https://docs.mongodb.com/manual/tutorial/convert-standalone-to-replica-set/
 * https://github.com/simplicityitself/Mongo-Tomcat-Sessions
 * https://docs.spring.io/spring-boot/docs/2.0.8.RELEASE/reference/htmlsingle/#boot-features-connecting-to-mongodb
 * https://docs.spring.io/spring-data/mongodb/docs/2.2.4.RELEASE/reference/html/#reference
 * https://www.mongodb.com/blog/post/mongodb-multi-document-acid-transactions-general-availability
 * https://medium.com/oril/uploading-files-to-aws-s3-bucket-using-spring-boot-483fcb6f8646
 * https://github.com/joshlong/bookmarks/tree/tutorial
 */
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}