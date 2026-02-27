package com.d0227;

import java.util.Scanner;

public class WorkTimeDivisionCode {
    /*
     * 입력자료로 사원의 이름과 구분코드와 작업시간이 들어온다. 이때 구분코드가 1이면 시간당 2000원
     * 2이면 시간당 2500원
     * 3이면 시간당 3000원
     * 4이면 시간당 4000원으로 계산하여 임금을 출력하는 순서도
     * */

    private final int work01 = 2000;
    private final int work02 = 2500;
    private final int work03 = 3000;
    private final int work04 = 4000;

    private final Scanner sc;

    public WorkTimeDivisionCode() {
        this.sc = new Scanner(System.in);
        run();
    }

    public void run() {
        while (true) {
            System.out.println("구분 코드를 입력해주세요 선택해주세요 (1,2,3,4)");
            String divisionCode = sc.nextLine();
            int changeDivisionCode = Integer.parseInt(divisionCode);

            try {
                if (changeDivisionCode < 1 || changeDivisionCode > 4) {
                    System.out.println("잘못 입력되었습니다 다시 입력해주세요");
                    continue; //여기서 continue 쓰면안되나?
                } else {
                    if (divisionCode.equals("1")) {
                        System.out.println("시간당 " + work01 + "원 입니다");
                        break;
                    } else if (divisionCode.equals("2")) {
                        System.out.println("시간당 " + work02 + "원 입니다");
                        break;
                    } else if (divisionCode.equals("3")) {
                        System.out.println("시간당 " + work03 + "원 입니다");
                        break;
                    } else if (divisionCode.equals("4")) {
                        System.out.println("시간당 " + work04 + "원 입니다");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
                continue;
            }


        }

    }

}
