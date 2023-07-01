package dz2;
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
import java.util.Scanner;


// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть 
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
// select * from students where 'name=Ivanov' and 'country=Russia' and...

// public class prodject {
//     public static void main(String[] args) {
//         StringBuilder stringBuilder = new StringBuilder();
//         stringBuilder.append("* select * from students where ");
//         Scanner scanner = new Scanner(System.in);
//         String [] srts = scanner.nextLine().replace(" ", "").replace("\"", "").replace("{", "").replace("}", "").split(",");
//         for( int i=0; i < srts.length; i++){

//             if(!srts[i].split(":")[1].equals("null")){
                
//                 stringBuilder.append(srts[i].split(":")[0] + "=" + srts[i].split(":")[1]);
//                 if(srts.length != i && !srts[i+1].split(":")[1].equals("null")){
//                     stringBuilder.append(" and ");
//                 }
//             }
//         }
//         System.out.println(stringBuilder);
//     }
// }


// 2)* Реализуйте алгоритм сортировки пузырьком числового массива, результат 
// после каждой итерации запишите в лог-файл.


// import java.io.FileWriter;
// import java.io.IOException;

// public class prodject {
//     public static void main(String[] args) {
//         int[] array = {5, 3, 8, 2, 1};

//         try {
//             FileWriter logFile = new FileWriter("log.txt");

//             bubbleSort(array, logFile);

//             logFile.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     private static void bubbleSort(int[] array, FileWriter logFile) throws IOException {
//         int n = array.length;
//         logFile.write("Iteration 0: ");
//             for (int num : array) {
//                 logFile.write(num + " ");
//             }
//             logFile.write("\n");
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (array[j] > array[j + 1]) {
//                     int temp = array[j];
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                 }
//             }
//             logFile.write("Iteration " + (i + 1) + ": ");
//             for (int num : array) {
//                 logFile.write(num + " ");
//             }
//             logFile.write("\n");
//         }
//     }
// }