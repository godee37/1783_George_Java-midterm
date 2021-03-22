package datastructure;
import java.util.HashMap;
public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */


        //Creating HashMap Object called namesInAlphabiticalOrder
        HashMap<String, String> namesInAlphabiticalOrder = new HashMap<String, String>();

        //Adding keys and values
        namesInAlphabiticalOrder.put("A", "Adam");
        namesInAlphabiticalOrder.put("B", "Benjamine");
        namesInAlphabiticalOrder.put("C", "Cynthia");
        namesInAlphabiticalOrder.put("D", "Daniel");
        namesInAlphabiticalOrder.put("E", "Emmanuel");
        namesInAlphabiticalOrder.put("F", "Fish");
        namesInAlphabiticalOrder.put("G", "George");
        namesInAlphabiticalOrder.put("H", "Hallison");
        namesInAlphabiticalOrder.put("I", "Iglo");
        namesInAlphabiticalOrder.put("J", "Jesus");
        namesInAlphabiticalOrder.put("K", "King");
        namesInAlphabiticalOrder.put("L", "Lion");
        namesInAlphabiticalOrder.put("M", "Man");
        namesInAlphabiticalOrder.put("N", "Nancy");

        System.out.println(namesInAlphabiticalOrder + "\n");

        //Accessing HashMap
        System.out.println("Select the name with F\n=====================================\n" + namesInAlphabiticalOrder.get("F"));


        //Using foreach loop
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values
        System.out.println("\nPrinting key and values on screen\n=====================================");
        for (String name : namesInAlphabiticalOrder.keySet()) {
            System.out.println("key: " + name + " - value: " + namesInAlphabiticalOrder.get(name));


        }
        System.out.println("\nprinting values alone\n==========================================");
        for (String name : namesInAlphabiticalOrder.values()) {
            System.out.println(name);
        }

    }
}