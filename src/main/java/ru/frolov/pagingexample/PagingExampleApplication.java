package ru.frolov.pagingexample;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

@SpringBootApplication
public class PagingExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagingExampleApplication.class, args);
    }



}
