package firstproject.Helpers;

import java.util.HashMap;

public class HashTest {

    public void test01() {
        // TODO Auto-generated method stub
        
        HashMap<String,Long>countryCodes = new HashMap<>();

        // Add keys and values (Country=String, Code=Integer)
        countryCodes.put("UK",44L);
        countryCodes.put("India", 91L);
        countryCodes.put("US",90L);
        countryCodes.put("France", 33L);
        
        //To access the key values after adding them
        System.out.println("UK code is: ");

        System.out.println(countryCodes.get("UK"));

        //Size
        System.out.println("Size of hashmap is: "+countryCodes.size());
        //remove an item 
        countryCodes.remove("UK");

        //Size
        System.out.println("Size of hashmap is: "+countryCodes.size());

        //Iteration in the hashmap
        for(String key: countryCodes.keySet()){
            System.out.println(key + " " + countryCodes.get(key));
        }
    }
}
