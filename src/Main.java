
import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("Help menu:");
        System.out.print("""
                1-Enter array
                2-Print array
                3-Find max element in array
                4-Find min element in array
                5-Sort up array
                6-Sort down array
                7-Find average num of array
                8-find prime num in array
                9-help menu
                0-exit""");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array A = new Array();
        A.read_array();
        Menu();
        boolean fl=true;
        while (fl) {
            System.out.println("\n\nchoose case:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> A.read_array();
                case 2 -> A.print_array();
                case 3 -> A.find_max();
                case 4 -> A.find_min();
                case 5 -> {
                    System.out.println("Sort up array");
                    A.sort_up_array();
                    A.print_array();
                }
                case 6 -> {
                    System.out.println("Sort down array");
                    A.sort_down_array();
                    A.print_array();
                }
                case 7 -> A.find_avg();
                case 8 -> A.prime_num();
                case 9 -> Menu();
                case 0 -> {
                    fl = false;
                    System.out.print("Goodbye!");
                }
                default -> System.out.println("No such an option");
            }
        }
    }
}