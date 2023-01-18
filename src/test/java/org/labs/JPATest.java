package org.labs;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import static org.junit.Assert.assertEquals;

public class JPATest {
    @Test
    public void performJPA(){
        AddressBook book1 = new AddressBook(1);
        AddressBook book2 = new AddressBook(2);


        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setId(1);
        buddy1.setName("Razem");
        buddy1.setAddress("Carleton");
        buddy1.setPhoneNum("613");


        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setId(2);
        buddy2.setName("Sahil");
        buddy2.setAddress("Sauga");
        buddy2.setPhoneNum("647");

        BuddyInfo buddy3 = new BuddyInfo();
        buddy3.setId(3);
        buddy3.setName("Babak");
        buddy3.setAddress("Ottawa");
        buddy3.setPhoneNum("123");

        book1.addBuddy(buddy1);
        book1.addBuddy(buddy2);
        book1.addBuddy(buddy3);

        book2.addBuddy(buddy1);
        book2.addBuddy(buddy2);

        List<BuddyInfo> original = new ArrayList<>();
        List<AddressBook> originalBook = new ArrayList<>();

        originalBook.add(book1);
        originalBook.add(book2);

        original.add(buddy1);
        original.add(buddy2);
        //original.add(buddy3);


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        em.persist(buddy1);
        em.persist(buddy2);
        //em.persist(buddy3);

        em.persist(book1);
        em.persist(book2);


        tx.commit();


        Query q = em.createQuery("SELECT b FROM BuddyInfo b");
        Query t = em.createQuery("SELECT a FROM AddressBook a");

        @SuppressWarnings("unckeched")
        List<BuddyInfo> results = q.getResultList();
        List<AddressBook> books = t.getResultList();


        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i).getId());
            assertEquals(results.get(i).getId(),original.get(i).getId());
            assertEquals(results.get(i).getName(),original.get(i).getName());
            assertEquals(results.get(i).getPhoneNum(),original.get(i).getPhoneNum());
            assertEquals(results.get(i).getAddress(),original.get(i).getAddress());

        }

        for(int i = 0; i < books.size(); i++){
            assertEquals(books.get(i).getId(),originalBook.get(i).getId());
        }

        em.close();
        emf.close();
    }
}
