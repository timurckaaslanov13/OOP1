import java.util.Scanner;

public class CalcView {
    public void disp(double result){
        System.out.println("Результат: " + result);
    }
    public double getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num = sc.nextDouble();
        return num;
    }
    public String getChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак: ");
        String ch = sc.next();
        return ch;
    }
}
