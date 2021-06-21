package lesson14;

public class Main {

    public static void main(String[] args) {

        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Apple", 34);
        holodilnik.addProduct("Orange", 24);
        holodilnik.addProduct("Apple", 90);
        holodilnik.addProduct("Pear", 88);
/*
        holodilnik.printAllProducts();
        holodilnik.getProduct("Apple", 140);
        holodilnik.printAllProducts();
 */
     //  holodilnik.printAllWeightProduct();
       holodilnik.minValue();
       holodilnik.sortName();


    }
}
