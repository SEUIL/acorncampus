package javaprj.day09.캡슐화하기.손영석;

import java.util.Scanner;

public class Drink2Info {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 음료의 개수 : ");
        int drinkCnt = Integer.parseInt(sc.nextLine());

        System.out.println("이름(str), 가격(int), HOT/ICE(str), 칼로리(int) 순으로 입력하세요 : ");
        Drink2[] drinks = new Drink2[drinkCnt];

        for(int i=0; i< drinkCnt; i++){
            System.out.printf("%d 번 음료 - 이름 입력%n", (i+1));
            String drinkName = sc.nextLine();

            System.out.printf("%d 번 음료 - 가격 입력%n", (i+1));
            int price = Integer.parseInt(sc.nextLine());

            System.out.printf("%d 번 음료 - HOT/ICE 입력%n", (i+1));
            String temp = sc.nextLine();

            System.out.printf("%d 번 음료 - 칼로리 입력%n", (i+1));
            int calories = Integer.parseInt(sc.nextLine());

            drinks[i] = new Drink2(drinkName, price,temp,calories);
        }
        System.out.println("입력이 끝났습니다.");

        System.out.print("출력할 음료의 번호를 입력하세요");
        int printDrinkNum = Integer.parseInt(sc.nextLine());
        System.out.println(drinks[printDrinkNum-1].getDrinkInfo());






        /*Drink2 drink = new Drink2("초코젤라또 말차라떼",4400,"ICE", 326);
        Drink2 drink2 = new Drink2("라이트 바닐라 아몬드라떼",3900,"HOT", 75);
        Drink2 drink3 = new Drink2("연유 라떼", 4900, "ICE", 351);
        Drink2 drink4 = new Drink2("디카페인 헤이즐럿 아메리카노", 3700, "HOT", 84);
        Drink2 drink5 = new Drink2("디카페인 바닐라 아메리카노", 3700, "HOT", 86);

*/

    }
}
