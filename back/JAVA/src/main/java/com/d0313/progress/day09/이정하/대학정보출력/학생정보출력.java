package javaprj.day09.이정하.대학정보출력;

import java.util.Scanner;

public class 학생정보출력 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Student student = new Student();

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("학과: ");
            String major = sc.nextLine();

            System.out.print("학번: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("이수 학기(1~8 ex. 3학년 1학기 => 5): ");
            int trem = sc.nextInt();
            sc.nextLine();

            int temp = 0;
            int credit;
            float score = 0;
            float sum = 0;

            for (int i = 1 ; i <= trem ; i++) {
                System.out.print(i + "학기 이수 학점: ");
                credit = sc.nextInt();
                temp += credit;
                System.out.print(i + "학기 학점: ");
                score = sc.nextFloat();
                sum += score;
            }
            float ave = sum / trem;


            student.input (name, major, number, temp, ave);
            student.output();
        }
    }