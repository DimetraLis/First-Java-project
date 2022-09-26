import java.util.Scanner;

public class Array {
    private final int n=10;
    private final Scanner sc=new Scanner(System.in);
    private int[] array= new int[n];
    private int max=Integer.MIN_VALUE;
    private int min=Integer.MAX_VALUE;
    private float avg =0;

    /** Чтение массива с клавиатуры*/
    public void read_array(){
        System.out.println("Enter array:");
        for (int i=0;i<array.length;i++){
            System.out.print("Array[" + i + "]=");
            array[i]=sc.nextInt();
        }
    }
    /** Отображение массива на экране*/
    public void print_array(){
        System.out.println("Your array is:");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    /** Сортировка массива по возрастанию*/
    public void sort_up_array(){
        for (int j=0; j< array.length;j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] + array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }
    }
    /** Сортировка массива по убыванию*/
    public void sort_down_array(){
        for (int j=0; j< array.length;j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    array[i] = array[i] + array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }
    }
    /** Нахождение минимального элемента массива*/
    public void find_min(){
        for (int i=0;i<array.length;i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print("Min:" + min);
    }
    /** Нахождение максимального элемента массива*/
    public void find_max(){
        for (int i=0;i<array.length;i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.print("Max:" + max);
    }
    /** Нахождение среднего значения элементов массива*/
    public void find_avg(){
        for (int i=0;i<array.length;i++) {
            avg+=array[i];
        }
        avg=avg/ array.length;
        System.out.print("Average:" + avg);
    }
    /** Нахождение простых чисел среди элементов массива*/
    public void prime_num(){
        System.out.println("1 and 2 are already prime numbers, so they don't count");
        System.out.println("Prime numbers in your array:");
        for(int i = 0; i <array.length;i ++){
            boolean isPrime = true;
            if (array[i]>2) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
    public void delete_num(){
        int offset = 0;
        System.out.print("Enter number to delete:");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        for(int i = 0; i< array.length; i++){
            if(array[i] == val){
                offset++;
            }
            else{
                array[i - offset] = array[i];
            }
        }
        int[] newArray = new int[array.length - offset];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
    }
}


