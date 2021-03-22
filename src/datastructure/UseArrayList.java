package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        //Creating Array object
        ArrayList<String> country = new ArrayList<>();

        //Adding elements to Array Countries
        country.add("Ghana");
        country.add("Algeria");
        country.add("Pakistan");
        country.add("India");
        country.add("Nigeria");
        country.add("Togo");

        System.out.println("Printing country elements\n===================================\n" + country);


        String name = country.remove(1);
        System.out.println("\nThe country removed is\n============================\n" + name + "\n");
        System.out.println("The remaining countries are:\n=================================");
        for (String rem : country) {
            System.out.println(rem);

        }
        Collections.sort(country);
        System.out.println("\nSorting the country elements\n===================================");
        for (String unique : country) {
            System.out.println(unique);

        }

    }
}