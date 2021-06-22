package lesson15;

public class Main {
    public static void main(String[] args) {


        Person person = new Person();

        try {
            person.setAge(12);
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
        }
        System.out.println("программа работает");

        StringUtilsImpl stringUtils = new StringUtilsImpl();

        try {
            stringUtils.div("30", "5");

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }

        try {
            int s = Integer.parseInt("XYZ");
            System.out.println(s);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        }

    }

}
















