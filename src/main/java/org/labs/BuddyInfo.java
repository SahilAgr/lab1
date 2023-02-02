package org.labs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


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
    public BuddyInfo(String name, String address, String phoneNum){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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

    @Override
    public String toString() {
        return String.format("BuddyInfo[id][name]= %d %d",id,name);
    }
}