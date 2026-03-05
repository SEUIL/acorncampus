package com.d0304;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    사원번호, 일한 시간(주급) , 시간당 임금을 읽어서 사원의 급여를 계산하여 인쇄하
    는 순서도를 작성하시오. 일한 시간이 40시간을 초과한 경우, 40시간 초과 분에 대
    해서는 임금율을 1.5배로 계산한다. 총지급액이 40만원을 초과한 경우에 세금으로
    3만원을 공제한다.
    */

    private int salaryNum;
    private int workTime;
    private int hourlyWage; //시간당 임금
    private final Scanner scanner;
    private final int tax = 30000;
    private final double weeklyHolidayAllowance = 1.5;


    public SalaryCalculator() {
        this.scanner = new Scanner(System.in);
        salaryNum = 0;
        workTime = 0;
        hourlyWage = 0;
        run();
    }

    public void run(){
        System.out.println("사원번호 , 일한 시간(주급), 시간당 임금을 적으시오 ");

        System.out.print("사원번호 : ");
        salaryNum = scanner.nextInt();

        System.out.print("일한 시간(주급) : ");
        workTime = scanner.nextInt();

        System.out.print("시간당 임금 : ");
        hourlyWage = scanner.nextInt();

        if (salaryNum < 0 || workTime < 0 || hourlyWage < 0) {
            System.out.println("올바른 숫자를 입력하시오");
        } else{
            try{
                if (workTime <= 40){
                    int salary = workTime * hourlyWage;
                    System.out.println("사원번호 : " + salaryNum);
                    System.out.println("당신의 임금 : " + salary);
                } else if (workTime > 40){
                    int salary = (int) (workTime * hourlyWage * weeklyHolidayAllowance);
                    int salaryWithTax = salary - tax;
                    System.out.println("사원번호 : " + salaryNum);
                    System.out.println("당신의 임금 : " + salary);
                    System.out.println("세금을 제외한 임금 : " + salaryWithTax);
                }
            }catch (NumberFormatException e){
                System.out.println("올바른 숫자를 입력하시오");
            }
        }
    }
}
