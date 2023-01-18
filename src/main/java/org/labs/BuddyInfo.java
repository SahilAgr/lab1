package org.labs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    private int id;
    private String name;
    private String address;
    private String phoneNum;

    public  BuddyInfo(){}
    public BuddyInfo(int id,String name, String address, String phoneNum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;

    }
    @Id
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String num){
        this.phoneNum = num;
    }

    public String getPhoneNum() {
        return phoneNum;
    }


}