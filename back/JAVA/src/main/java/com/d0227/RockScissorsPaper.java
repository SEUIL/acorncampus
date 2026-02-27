package com.d0227;

import java.util.Scanner;

public class RockScissorsPaper {
    String rock;
    String scissor;
    String paper;
    Scanner sc;

    public RockScissorsPaper() {
        this.rock = "바위";
        this.scissor = "가위";
        this.paper = "보";
        this.sc = new Scanner(System.in);
        run();
    }

    public void run(){
        while (true){
            System.out.println(" '시작' or '종료' ");
            String input = sc.nextLine();
            if (input.equals("시작")){
                playGame();
            }else if (input.equals("종료")){
                break;
            }
        }
        sc.close();
    }

    public void playGame() {
        String[] options = {scissor, rock, paper};
        int computerIdx = (int) (Math.random() * 3);
        String computerChoice = options[computerIdx];

        String userChoice;

        while (true) {
            System.out.println("가위 바위 보 중에서 입력하시오");
            userChoice = sc.nextLine();

            if (userChoice == null || userChoice.equals("")) {
                System.out.println("잘못 입력했습니다, 다시 입력하시오");
                continue;
            }
            if (userChoice.equals("가위")) {
                userChoice = scissor;
                break;
            } else if (userChoice.equals("바위")) {
                userChoice = rock;
                break;
            } else if (userChoice.equals("보")) {
                userChoice = paper;
                break;
            }
        }

        System.out.println("나: " + userChoice);
        System.out.println("컴퓨터: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("비겼습니다!");
        } else if ((userChoice.equals(scissor) && computerChoice.equals(paper)) ||
                (userChoice.equals(rock) && computerChoice.equals(scissor)) ||
                (userChoice.equals(paper) && computerChoice.equals(rock))) {
            System.out.println("이겼습니다!");
        } else {
            System.out.println("졌습니다!");
        }
    }

}
