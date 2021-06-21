package lesson15;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        double s = Integer.parseInt(number1);
        double a = Integer.parseInt(number2);
        double result = 0;

        try {
            if (a==0){
                throw new ArithmeticException("если number2 равно нулю");

        }
            result=s/a;

        }catch (ArithmeticException e){
            System.out.println("если number2 равно нулю");
        }


            return s/a;


    }


    //pattern
    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
