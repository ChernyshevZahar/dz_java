package dz4;

import java.util.LinkedList;




//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// public class prodject {
//     public static void main(String[] args) {
//         LinkedList<Integer> myList = new LinkedList<>();  
//         myList.add(1);  
//         myList.add(2);  
//         myList.add(3);  
//         myList.add(4);  
//         myList.add(5);  
  
//         System.out.println("Перевернутый список:");  
//         LinkedList<Integer> reversedList = new LinkedList<>();  
//         for (int i = myList.size() - 1; i >= 0; i--) {  
//             reversedList.add(myList.get(i));  
//         }

//         for (int number : reversedList) {  
//             System.out.print(number + " ");  
//         }  
//     }
// }


// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - 
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди 
// и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


public class prodject {
    public static void main(String[] args) {
        LinkedList<Integer> queueList = new LinkedList<>();  
        queueList.add(1);  
        queueList.add(2);  
        queueList.add(3);  
        queueList.add(4);  
        queueList.add(5);  
          
  
        System.out.println("Первый элемент очереди: " + first(queueList));  
        System.out.println(queueList);

        enqueue(7,queueList);
        System.out.println(queueList);
        
        int dequeuedElement = dequeue(queueList);  
        System.out.println("Извлеченный элемент из очереди: " + dequeuedElement);
        System.out.println(queueList);  
    }  
  
    public static void enqueue(int element,LinkedList<Integer> queueList) {  
        queueList.addLast(element);  
    }  
  
    public static int dequeue(LinkedList<Integer> queueList) {  
        return queueList.pollFirst();  
    }  
  
    public static int first(LinkedList<Integer> queueList) {  
        return queueList.peekFirst();  
    }  
    
}