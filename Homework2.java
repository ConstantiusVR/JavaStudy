import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Задача 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.




public class Homework2 { 
    public static void main(String[] args) throws IOException { 
        Logger logger = Logger.getLogger(Homework2.class.getName());
                    FileHandler fh = new FileHandler("File.txt",false);
                    logger.addHandler(fh);
                    SimpleFormatter sFormat = new SimpleFormatter();
                    fh.setFormatter(sFormat);
                
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Ведите количество элементов массива");
        int size = iScanner.nextInt();
        int arrayA[] = new int[size];
        System.out.println("Введите целочисленные значения в массив, в указанном количестве");
        for (int c = 0; c < size; c++) {
            arrayA[c] = iScanner.nextInt();
        }
        System.out.print ("Полученный массив: ");  
        for (int i = 0; i < size; i++) { 
    
            System.out.print (" " + arrayA[i] + ", ");
            logger.info(" " + arrayA[i] + ", ");
        }
        iScanner.close();

        for (int i = 0; i < arrayA.length - 1; i++) { 
            
            for(int j = 0; j < arrayA.length - i - 1; j++) {

                logger.info(" " + arrayA[i] + ", ");

                if(arrayA[j + 1] < arrayA[j]) {
                    
                    int newArr = arrayA[j];
                    arrayA[j] = arrayA[j + 1];
                    arrayA[j + 1] = newArr;
                    
        
                }
            }
        }

    }
        

    }
    

// Задача 2. Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика".....
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.*;

    

public class Homework2 {  
    public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
            }
        br.close();
        String [] listData = new String [size];
       
        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
            }
        br1.close();
        return listData;
    }

    
    public static void main (String[] args) throws Exception {
        
           

        String [] DataBase  = ReadLineFromFile("database.txt");

        for ( int i = 0; i< DataBase.length; i++) {
            
            System.out.println(PrintLine(DataBase[i]));

        } 
    }
        public static StringBuilder PrintLine(String line) {
            String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] DataBase = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < DataBase.length; i++) {
            String[] newData = DataBase[i].split(":");
            result.append(listName[i]);
            result.append(newData[1]);
            }
        return result;
        }
}
    

    

