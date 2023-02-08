package org.labs;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HttpRequestTest {



    String newBookUrl = "http://localhost:8080/newBook";
    String addBuddyUrl = "http://localhost:8080/addBuddy?addressBookId=1";



    RestTemplate rest = new RestTemplate();




    HttpEntity<AddressBook> newBookRequest = new HttpEntity<>(new AddressBook());


    HttpEntity<BuddyInfo> newBuddyRequest = new HttpEntity<>(new BuddyInfo(0,"kai","ottawa","123"));



    @Test
    @Order(1)
    public void postRequestToCreateBook() throws Exception {
        AddressBook book = rest.postForObject(newBookUrl, newBookRequest, AddressBook.class);
        assertThat(book).isNotNull();
        assertThat(book.getId()).isEqualTo(1);
    }
//    @Test
//    @Order(2)
//    public void postRequestToAddBuddy() throws Exception{
//        AddressBook book = rest.postForObject(newBookUrl, newBookRequest, AddressBook.class);
//
//        BuddyInfo bud = rest.postForObject(addBuddyUrl,newBuddyRequest, BuddyInfo.class);
//        assertThat(bud).isNotNull();
//        System.out.println(book.getBuddies().size());
//        assertThat(book.getBuddy(0)).isEqualTo(bud.getId());
//    }


}