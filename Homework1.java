import java.text.Format;
import java.text.Normalizer.Form;
import java.util.Scanner;

// Задача 1: Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class Homework1 {
    public static void main (String[] args) {
        
        System.out.println("Введите любое целое число от 2 до 10");

        Scanner iScanner = new Scanner (System.in);

        String get_number = iScanner.nextLine();

        int number = Integer.parseInt(get_number);

        System.out.printf("Вы ввели: %d \n ", number);

        int sum = 0;
        int fact = 1;

        for (int i = 0; i<= number; i++) {
            sum += i;
        }

        for (int i = 1; i<= number; i++) {
            fact *=i;
        }

        System.out.printf("n-ое треугольного числа равно: %d \n ", sum);

        System.out.printf( "факториал вашего числа равен: %d \n ", fact);

    }
    
}



// Задача 2: Вывести все простые числа от 1 до 1000

public class Homework1 {
    public static void main(String[] args) {
        

        for (int i = 1; i<=1000; i++){
        
            System.out.println(i);
        }
    }

}



// Задача 3: Реализовать простой калькулятор (+ - / *)

public class Homework1 {


    static int sum (int a, int b) {
        return a + b;
    }
    static int subtract (int a, int b){
        return a - b;
    }
    static int mult (int a, int b) {
        return a * b;
    }
    static int div (int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {

       

        System.out.println("Введите первое любое целое число");

        Scanner iScanner = new Scanner (System.in);

        String get_numberA= iScanner.nextLine();

        int a = Integer.parseInt(get_numberA);

        System.out.println("Введите знак операции: + , - , * или /");

        String get_sign = iScanner.nextLine();

        System.out.println("Введите второе любое целое число");

        String get_numberB= iScanner.nextLine();

        int b = Integer.parseInt(get_numberB);


        switch (get_sign) {
            case "+":
                System.out.println(sum(a, b));
                break;
        
            case "-":
                System.out.println(subtract(a, b));
                break;
            
            case "*":
                System.out.println(mult(a, b));
                break;
            
            case "/":
                System.out.println(div(a, b));
                break;
            
            default:

            System.out.println("Введён неверный знак операции");
            break;

        }

    }


}