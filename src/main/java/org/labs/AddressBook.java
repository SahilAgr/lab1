package org.labs;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public BuddyInfo getBuddy(int id){
        return this.buddies.get(id);
    }

    public void removeBuddy(int id) {

       this.buddies.remove(id);

    }



    public int amountOfBuddies(){
        return buddies.size();
    }


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

    @Override
    public String toString() {
        return String.format("Address Book[id]= %d",id);
    }

    public List<BuddyInfo> getBuddies(){
        return buddies;
    }

    public String buddiesInBook(){
        String buds = "";
        for(BuddyInfo b: buddies){
            buds += String.format("BuddyInfo(id,Name,Address,PhoneNumber): %d %s %s %s\n",b.getId(),b.getName(),b.getAddress(),b.getPhoneNum());
        }
        return buds;
    }
}
