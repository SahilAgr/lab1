package org.labs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @Value(value="${local.server.port}")
    private int port;

    String newBookUrl = "http://localhost:8080/newBook";

    @Autowired
    private TestRestTemplate restTemplate;

    HttpEntity<AddressBook> request= new HttpEntity<>(new AddressBook());

    @Test
    public void postRequestToCreateBook() throws Exception {


        AddressBook book = restTemplate.postForObject(newBookUrl,request, AddressBook.class);
        Assertions.assertThat(book);
        Assertions.assertThat(book.getId(),1);

    }
}