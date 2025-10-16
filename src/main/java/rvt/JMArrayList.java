package rvt;

import java.util.*;

public class JMArrayList {
        
    public static void ListSize (String []args) {
            ArrayList<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
    
            while(true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break; // beidz lasīt, ja rinda tukša
                }
    
                list.add(input); // pievieno sarakstam
             }
    
             // Izdrukā visus vārdus 
             for (String name : list) {
                System.out.println(name);
             }
    
             System.out.println("In total: " + list.size());
            }
    
    public static void onlyTheseNumbers (String[]args){}
    public static void onTheList (String[]args) {}
    public static void removeLast(ArrayList<String> strings) {}
    }

