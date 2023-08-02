public class CalcModel {
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
                result = number1 / number2;
                break;

        }
    }
    public double getResult(){
        return result;
    }
}
