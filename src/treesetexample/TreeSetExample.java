package treesetexample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> strom = new TreeSet<Integer>();

        strom.add(8);
        strom.add(12);
        strom.add(3);
        strom.add(5);
        strom.add(7);
        strom.add(9);

        System.out.println("Počet prvků ve stromu: " + strom.size());

        System.out.print("Výpis (setříděných) dat: ");
        Iterator<Integer> i = strom.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");
        
        System.out.println("Nejmenší prvek: "+strom.first());
        System.out.println("Největší prvek: "+strom.last());

        strom.remove(8);
        
        System.out.print("Výpis stromu po odstranění prvku: ");
        i = strom.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");

        strom.clear();
        if (strom.isEmpty()) {
            System.out.println("Strom je prázdný.");
        } else {
            System.out.println("Strom není prázdný.");
        }
        
    }

}
