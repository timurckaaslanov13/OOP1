import java.util.Scanner;
import java.util.logging.Logger;

public class CalcView extends Logg implements Scan{
    //private static Logger log = Logger.getLogger(CalcView.class.getName());
    public void disp(double result){
        System.out.println("Результат: " + result);
    }
    public double getInput(){
        double num1 = ScanDouble();
        return num1;
    }
    public String getChar(){
        String ch = ScanStr();
        return ch;
    }

    @Override
    public double ScanDouble() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num = console.nextDouble();
        return num;
    }

    @Override
    public String ScanStr(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите знак: ");
        String ch = console.nextLine();
        if (!("+-/*".contains(ch))) {
            log(null);
            System.out.println("Такого знака нет!");
            ch = ScanStr();
        }
        return ch;

    }
}
