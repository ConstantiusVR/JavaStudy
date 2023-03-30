import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

// Задача 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class Homework3 {

    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList <Integer> ();
        Random numbers = new Random();
        for (int i = 0; i<15; i++){
            int o = numbers.nextInt(100);
            myList.add(o);
        }
        System.out.println(myList);

        for (int j = myList.size()-1; j >= 0; j--){
            if (myList.get(j)%2 == 1){
                myList.remove(j); 
                
            }
        }
        System.out.println(myList);

    }
    
} 

//  Задача 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка. 

public class Homework3 {

    public static void main(String[] args) {

        ArrayList <Integer> anyList = new ArrayList <Integer> ();
        Random numbers = new Random();
        for (int i = 0; i<10; i++){
            int o = numbers.nextInt(20);
            anyList.add(o);
        }
        System.out.println(anyList);
        System.out.println(Collections.max(anyList));
        System.out.println(Collections.min(anyList));

        double averageNum = 0;
        if (anyList.size()>0){
            int sumOfNumbers = 0;
            for (int j = 0; j<10; j++){
                sumOfNumbers += anyList.get(j);
            }
            averageNum = sumOfNumbers / anyList.size();
            System.out.printf("%.2f", averageNum);
        }
        
   


    }


}
