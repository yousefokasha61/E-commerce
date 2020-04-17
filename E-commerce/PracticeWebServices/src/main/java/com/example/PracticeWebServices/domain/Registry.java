package com.example.PracticeWebServices.domain;

import org.apache.catalina.Store;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ItemType , Item> itemMap = new HashMap<>() ;

    public Registry(){
        loaditems() ;
    }

    private void loaditems() {
        User user =new User();
        user.setEmail("kareemmagdy1");
        user.setUserName("Kareem");
        user.setPassWord("Magdy");
        itemMap.put(ItemType.User ,user) ;

        StoreOwner storeOwner = new StoreOwner();
        itemMap.put(ItemType.StoreOwner ,storeOwner) ;


        Customer customer = new Customer() ;
        itemMap.put(ItemType.Customer ,customer) ;

        Admin admin = new Admin()  ;
        itemMap.put(ItemType.Admin , admin) ;
    }

    public Item createItem(ItemType type){
        Item item = null ;

        try {
            item  = (Item) itemMap.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return item ;
    }
}
