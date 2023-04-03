import java.util.LinkedList;
import java.util.Scanner;

// Задача 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.


public class Homework4 { 

public static void main(String[] args) {
    LinkedList <String> anyList = new LinkedList<String>();
    anyList.add("start");
    anyList.add ("first");
    anyList.add("second");
    anyList.add("third");
    anyList.add("fourth");
    anyList.add("fifth");
    anyList.add("stop"); 
    System.out.println(anyList);
    anyList = viceVersa(anyList);
    System.out.println(anyList);
    
}
    
public static LinkedList <String> viceVersa (LinkedList <String> anyList) {
    LinkedList <String> reversList = new LinkedList<String>();
    for (int i = anyList.size() - 1; i >= 0; i--) {
        reversList.add(anyList.get(i));
    }
    return reversList;  
}

}

// Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class Homework4 {  

    public static void main(String[] args) {
        LinkedList <String> anyList = new LinkedList<String>();
        anyList.add("0");
        anyList.add ("1");
        anyList.add("2");
        anyList.add("3");
        anyList.add("4");
        anyList.add("5");
        anyList.add("6"); 
        System.out.println(anyList);

        enqueue(anyList, "11");
        System.out.println(anyList);

        System.out.println(dequeue(anyList));
        System.out.println(anyList);

        System.out.println(first(anyList));
        System.out.println(anyList);

    }

    public static void enqueue(LinkedList<String> anyList, String anyString) {
        anyList.addLast(anyString);
    }

    public static String dequeue(LinkedList<String> anyList) {
        String number  = "0";
        number = anyList.get(0);
        anyList.remove(0);
        return number;
    }

    public static String first(LinkedList<String> anyList) {
        String anyNumber = "0";
        anyNumber = anyList.get(0);
        return anyNumber;
    }

} 



