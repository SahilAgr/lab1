package org.labs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AccessingDataJpaApplication {
    private static final Logger log =  LoggerFactory.getLogger(AccessingDataJpaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }



//    @Bean
//    public CommandLineRunner demo(AddressBookRepository repository){
//        return (args) -> {
//
//
//            BuddyInfo b1 = new BuddyInfo(1,"Razem","Ottawa","613");
//            BuddyInfo b2 = new BuddyInfo(2,"Sahil","Sauga","647");
//            BuddyInfo b3 = new BuddyInfo(3,"Babak","Carleton","905");
//
//            AddressBook a1 = new AddressBook(1);
//            a1.addBuddy(b1);
//            a1.addBuddy(b2);
//            a1.addBuddy(b3);
//
//
//            repository.save(a1);
//
//            log.info("Buddies found with findAll():");
//            log.info("-----------------------------");
//            for (AddressBook addressBook: repository.findAll()){
//                log.info(addressBook.toString());
//            }
//            log.info("");
//
//            AddressBook addressBookById = repository.findAddressBookById(1);
//            log.info("Buddy found with findById(1):");
//            log.info("-----------------------------");
//            log.info(addressBookById.toString());
//            log.info(a1.buddiesInBook());
//            log.info("");
//
//
//        };
//    }

}
