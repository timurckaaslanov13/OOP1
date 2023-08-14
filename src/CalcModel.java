import java.util.logging.Logger;

public class CalcModel extends Logg{
    private double result;
    public void res(double number1, String ch, double number2){
        switch (ch){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0){
                    log(null);
                    System.out.println("Деление на ноль не возможно!");
                }else {
                    result = number1 / number2;
                    break;
                }
        }
    }
    public double getResult(){
        return result;
    }
}
