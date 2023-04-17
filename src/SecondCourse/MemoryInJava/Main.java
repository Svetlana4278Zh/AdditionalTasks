package SecondCourse.MemoryInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //region Task 2
        System.out.println("Task 2");
        System.out.println(chipsParty(3, false));
        System.out.println(chipsParty(15, false));
        System.out.println(chipsParty(70, true));
        //endregion
        //region Task 3
        System.out.println("\nTask 3");
        System.out.println(great6(6,4));
        System.out.println(great6(4,5));
        System.out.println(great6(1,5));
        System.out.println(great6(4,10));
        //endregion
        //region Task 4
        System.out.println("\nTask 4");
        System.out.println(teenSum(3,4));
        System.out.println(teenSum(10,13));
        System.out.println(teenSum(13,2));
        //endregion
        //region Task 5
        System.out.println("\nTask 5");
        System.out.println(has77(new int[] {1, 7, 7}));
        System.out.println(has77(new int[] {1, 7, 1, 7}));
        System.out.println(has77(new int[] {1, 7, 1, 1, 7}));
        //endregion
        //region Task 6
        System.out.println("\nTask 6");
        System.out.println(twoTwo(new int[] {4, 2, 2, 3}));
        System.out.println(twoTwo(new int[] {2, 2, 4}));
        System.out.println(twoTwo(new int[] {2, 2, 4, 2}));
        System.out.println(twoTwo(new int[] {2, 3, 4, 1}));
        System.out.println(twoTwo(new int[] {5, 5, 4, 2}));
        System.out.println(twoTwo(new int[] {5, 1, 2, 2}));
        System.out.println(twoTwo(new int[] {5, 1, 4, 6}));
        System.out.println(twoTwo(new int[] {5, 2, 4, 2, 2}));
        //endregion
        //region Task 7
        System.out.println("\nTask 7");
        createArray();
        //endregion
        //region Task 8
        System.out.println("\nTask 8");
        printPositiveDivisors();
        //endregion
    }
    //Task 2
    public static boolean chipsParty(int amount, boolean isWeekend){
        return isWeekend || (amount >= 15 && amount <= 20);
    }
    //Task 3
    public static boolean great6(int a, int b){
        return a == 6 || b == 6 || (a + b) == 6 || Math.abs(a-b) == 6;
    }
    //Task 4
    public static int teenSum(int a, int b){
        int sum = a + b;
        if (sum >= 13 && sum <=19){
            return 19;
        } else {
            return sum;
        }
    }
    //Task 5
    public static boolean has77(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] == 7 && (arr[i+1] == 7 || arr[i+2] == 7) || (arr[i+1] == 7 && arr[i+2] == 7)){
                return true;
            }
        }
        return false;
    }
    //Task 6
    public static boolean twoTwo(int[] arr){
        int count = 0;
        if (arr[arr.length - 2] != 2 && arr[arr.length - 1] == 2){
            return false;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 2){
                count++;
                if (arr[i+1] != 2){
                    return false;
                } else i++;
            }
        }
        return count != 0;
    }
    //Task 7
    public static void createArray(){
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите четное положительное число");
            size = scanner.nextInt();
        } while (size <= 0 || size%2 != 0);
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = -5 + (int) (Math.random()*11);
        }
        System.out.println(Arrays.toString(newArray));
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < newArray.length/2; i++) {
            sumLeft += Math.abs(newArray[i]);
            sumRight += Math.abs(newArray[newArray.length - 1 - i]);
        }
        if (sumLeft > sumRight){
            System.out.println("Сумма модулей левой половины больше");
        } else if (sumLeft < sumRight){
            System.out.println("Сумма модулей правой половины больше");
        } else {
            System.out.println("Суммы модулей справа и слева равны");
        }
    }
    //Task 8
    public static void printPositiveDivisors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            System.out.print("Делителями числа " + num + " являются: ");
            for (int i = 1; i <= num/2; i++){
                if (num%i == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.print(num + "\n");
        } else {
            System.out.println("Ошибка! Введено не натуральное число");
        }
    }
}
