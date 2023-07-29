package Task2;
public class Main2 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println("Первый массив:");
        Array<Integer> mas1 = new Array<>(arr1);
        mas1.Print();
        System.out.println();
        String[] arr2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "11"};
        System.out.println("Второй массив:");
        Array<String> mas2 = new Array<>(arr2);
        mas2.Print();
    }
}
