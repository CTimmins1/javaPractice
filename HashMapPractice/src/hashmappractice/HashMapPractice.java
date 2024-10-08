/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmappractice;

import java.util.HashMap;

/**
 *
 * @author CamaraAdmin
 */
public class HashMapPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //good to paratise () for java to read better
        //create a map of emp names to value of employees id(int)
        HashMap<String, Integer> empIds = new HashMap();
        //map the names, to the ids.
        empIds.put("Conor", 12345);
        empIds.put("Micheal", 12223);
        empIds.put("Darren", 13343);
        //print out the whole hashmap.
        System.out.println(empIds);
        
        //print out a value from a key
        System.out.println(empIds.get("Conor"));
        
        //check to see if a key exsists in a map
        System.out.println(empIds.containsKey("Darren"));
        //check to see if value exsists
        //will print false as no such integer exsists
        System.out.println(empIds.containsValue(332322));
       //if we use another .put method with the same key but diff value, it will overwrite it and update the integer value.
       //only puts in if not currently in the map
       empIds.putIfAbsent("Steve", 45676677);
        System.out.println(empIds);
        
        //to remove a key/value
        empIds.remove("Steve");
        System.out.println(empIds);
        
        
        
        
        
    }
    
}
