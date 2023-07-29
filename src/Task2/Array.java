package Task2;

public class Array<T> {
    public T[] arr;
    public Array(T[] arr){
        this.arr = arr;
    }
    public void Print(){
        for (T iter: arr) {
            System.out.println(iter);
        }
    }
}
