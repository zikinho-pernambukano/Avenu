package lesson14;

import java.util.*;

public class Holodilnik {

    private HashMap<String, Integer> products = new HashMap<>();

    public Holodilnik() {
    }

    public void addProduct(String product, int value) {
        if (products.containsKey(product)) {
            int valueNow = products.get(product);
            products.put(product, value + valueNow);
        } else {
            products.put(product, value);
        }


    }

    public void printAllProducts() {

        for (String str : products.keySet()) {
            System.out.println(str + " - " + products.get(str));

        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println(" Такого продукта нет");
            return;
        }
        int currentValue = products.get(product);
        if (currentValue < value) {
            products.remove(product);
            System.out.println("Недостаточно продукта");
            return;
        }
        products.put(product, currentValue - value);
    }

    public void printAllWeightProduct() {
        int summ = 0;
        for (Integer i : products.values()) {
            summ = summ + i;
        }
        System.out.println(summ);
    }

    public void minValue(){
        System.out.println(Collections.min(products.values()));
    }

    public void sortName(){
        TreeMap<String,Integer> sort= new TreeMap<String,Integer>(products);
        for (String s:sort.keySet()) {
            System.out.println(s);
        }
        }
    }


