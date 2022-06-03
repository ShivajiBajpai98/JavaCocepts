package com.atmecs.collectionpratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {


        Map<String,String> map = new HashMap<String,String>();

        map.put("firstName", "Shivaji");
        map.put("lastName", "Bajpai");
        map.put("sub", "Selenium");
        map.put("location", "India");
        map.put("company", "Atmecs");

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("firstName"));


        Set<String> keys = map.keySet();

        for(String key:keys){


            System.out.println("Key --> "+key+"  Value is -->"+map.get(key));
        }


        Map<String,List<String>> map1 = new HashMap<String,List<String>>();

        List<String> listofEmails = new ArrayList<String>();
        listofEmails.add("shivajibajpai@gmail0.com");
        listofEmails.add("shivajibajpai@gmail1.com");
        listofEmails.add("shivajibajpai@gmail3.com");
        listofEmails.add("shivajibajpai@gmail4.com");

        map1.put("email", listofEmails);

        Map<String,Map<String,String>> map2 = new HashMap<String,Map<String,String>>();



    }

}
