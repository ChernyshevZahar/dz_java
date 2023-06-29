// 1) Вычисление n-ого треугольного числа и факториала:
package dz1;
import java.util.Scanner;
// public class prodject {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите значение n: ");
//         int n = scanner.nextInt();

//         int triangularNumber = calculateTriangularNumber(n);
//         System.out.println("Треугольное число для " + n + ": " + triangularNumber);

//         int factorial = calculateFactorial(n);
//         System.out.println("Факториал для " + n + ": " + factorial);
//     }

//     private static int calculateTriangularNumber(int n) {
//         return (n * (n + 1)) / 2;
//     }

//     private static int calculateFactorial(int n) {
//         int factorial = 1;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
//         }
//         return factorial;
//     }
// }
 

/**
 * 2) Вывод всех простых чисел от 1 до 1000:
 */

// public class prodject {
//     public static void main(String[] args) {
//         System.out.println("Простые числа от 1 до 1000:");
//         for (int i = 2; i <= 1000; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     private static boolean isPrime(int number) {
//         if (number <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
    
// }



// 3) Простой калькулятор:


// public class prodject {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Введите первое число: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Введите оператор (+, -, *, /): ");
//         char operator = scanner.next().charAt(0);

//         System.out.print("Введите второе число: ");
//         double num2 = scanner.nextDouble();

//         double result = calculate(num1, num2, operator);
//         System.out.println("Результат: " + result);
//     }

//     private static double calculate(double num1, double num2, char operator) {
//         double result = 0;
//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             default:
//                 System.out.println("Неверный оператор!");
//         }
//         return result;
//     }
// }


// 4) Восстановление уравнения:  2? + ?5 = 69.


// public class prodject {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         boolean solutionFound = false;

//         System.out.print("Введите уровнение: ");
//         String primer = scanner.nextLine().replace(" ", "");
//         String [] primer1 = primer.split("=");
//         int result = Integer.parseInt(primer1[1]);
//         String [] nums = primer1[0].split("\\+");
//         for (int q = 0; q <= 9; q++) {
//             for (int w = 0; w <= 9; w++) {
//                 int f = Integer.parseInt(nums[0].replace("?", Integer.toString(q)));
//                 int k = Integer.parseInt(nums[1].replace("?", Integer.toString(w)));
//                 if (f + k == result) {
//                     System.out.println(f + " + " + k + " = " + result);
//                     solutionFound = true;
//                 }
            
//             }
//         }

//         if (!solutionFound) {
//             System.out.println("Решение не найдено!");
//         }
//     }
// }