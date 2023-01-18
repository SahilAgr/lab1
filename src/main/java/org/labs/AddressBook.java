package org.labs;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class AddressBook {
    private int id;
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
    }

    public AddressBook(int id) {
        this.id = id;
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    public int amountOfBuddies(){
        return buddies.size();
    }

    @Id
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    /*
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo(1,"Sahil", "Carleton", "613");
        AddressBook addressBook = new AddressBook(1);
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);


    }

     */
}
