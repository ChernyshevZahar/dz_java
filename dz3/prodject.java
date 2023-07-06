package dz3;

import java.util.ArrayList;  
import java.util.List;  
  
public class prodject {  
    public static void main(String[] args) {  
        // Создаем произвольный список целых чисел  
        List<Integer> numbers = new ArrayList<>() ;  
        numbers.add(3);  
        numbers.add(8);  
        numbers.add(2);  
        numbers.add(5);  
        numbers.add(7);  
        numbers.add(10);  
  
        // Удаляем четные числа  
        numbers.removeIf(number -> number % 2 == 0);  
  
        // Находим минимальное значение  
        int min = numbers.stream().min(Integer::compareTo).orElse(0);  
  
        // Находим максимальное значение  
        int max = numbers.stream().max(Integer::compareTo).orElse(0);  
  
        // Находим среднее значение  
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);  
  
        // Выводим результаты  
        System.out.println("Список без четных чисел: " + numbers);  
        System.out.println("Минимальное значение: " + min);  
        System.out.println("Максимальное значение: " + max);  
        System.out.println("Среднее значение: " + average);  
    }  
}  
