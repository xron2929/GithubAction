package dev.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class GithubActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionApplication.class, args);
    }

}
