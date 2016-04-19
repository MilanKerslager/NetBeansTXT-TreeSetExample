package treesetexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        final int NUMLOOKUPS = 10000;
        final int ELEMENTS = 10000000;
        final int MAXVALUE = Integer.MAX_VALUE;
        long startTime, stopTime;
        TreeSet<Integer> strom = new TreeSet<Integer>();

        System.out.println("Vytvářím strom s "+ELEMENTS+" prvky...");
        Random r = new Random();
        startTime = System.currentTimeMillis();
        for (long i = 1; i <= ELEMENTS; i++) {
            strom.add(r.nextInt(MAXVALUE) + 1);
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Naplnění trvalo "+(stopTime - startTime)+" ms");
        System.out.println("Skutečný počet prvků ve stromu: " + strom.size());

        startTime = System.currentTimeMillis();
        int hit = 0;
        for (long i = 1; i < NUMLOOKUPS; i++) {
            if (strom.contains(r.nextInt(MAXVALUE) + 1)) {
                hit++;
            }
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Doba vyhledání "+NUMLOOKUPS+" prvků: " + (stopTime - startTime)+" ms.");

        System.out.println("");
        System.out.println("Vytvářím seznam s "+ELEMENTS+" prvky...");
        ArrayList<Integer> seznam = new ArrayList<Integer>();
        startTime = System.currentTimeMillis();
        for (long i = 1; i <= ELEMENTS; i++) {
            seznam.add(r.nextInt(MAXVALUE) + 1);
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Naplnění trvalo "+(stopTime - startTime)+" ms");
        System.out.println("Skutečný počet prvků v seznamu: " + seznam.size());
        
        startTime = System.currentTimeMillis();
        int hitseznam = 0;
        for (long i = 1; i < NUMLOOKUPS; i++) {
            if (seznam.contains(r.nextInt(MAXVALUE) + 1)) {
                hitseznam++;
            }
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Doba vyhledání "+NUMLOOKUPS+" prvků: " + (stopTime - startTime)+" ms.");
    }
}
