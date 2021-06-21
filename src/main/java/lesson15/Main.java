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
            stringUtils.div("30", "0");

        } catch (ArithmeticException e) {

        }


            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException..");
            }

        try{
            int num=Integer.parseInt ("XYZ") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }

        }

    }
















