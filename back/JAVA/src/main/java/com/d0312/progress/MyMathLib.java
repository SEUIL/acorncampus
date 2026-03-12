// package com.d0312.progress;
//
// public class MyMathLib {
//
//     // 정수의 약수를 구하여 문자열로 반환하는 메서드
//     public static String getDivisors(int number) {
//         StringBuilder sb = new StringBuilder();
//         sb.append(number).append("의 약수: ");
//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 sb.append(i).append(" ");
//             }
//         }
//         return sb.toString();
//     }
//
//
//     // * 금액을 입력받아 화폐 단위별 매수를 출력하는 메서드
//     public static void printCurrencyCount(int money) {
//         int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//
//         System.out.println("=== 화폐 매수 구하기 (" + money + "원) ===");
//         for (int unit : units) {
//             int count = money / unit;
//             money %= unit;
//             if (count > 0) {
//                 System.out.println(unit + "원: " + count + "매");
//             }
//         }
//     }
//
//     // Math 클래스 기능 활용 (최대값 반환)
//     public static int max(int a, int b) {
//         return Math.max(a, b);
//     }
// }
