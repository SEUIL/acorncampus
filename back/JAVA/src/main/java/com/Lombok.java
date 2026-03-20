package com;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Lombok {

    // 1️⃣ 실무에서 가장 많이 쓰이고 권장되는 조합 (필요한 것만 골라서 쓰기)
    @Getter
    @Setter
    @ToString // System.out.println(객체) 할 때 안의 내용을 예쁘게 보여줌
    @NoArgsConstructor // Member() 기본 생성자 자동 생성
    @AllArgsConstructor // Member(id, name, age) 모든 속성을 넣는 생성자 자동 생성
    @Builder // 가독성 끝판왕인 빌더 패턴 적용
    public static class Member {
        private String id;
        private String name;
        private int age;
    }

    // 2️⃣ 종합 선물 세트 @Data
    // @Getter, @Setter, @ToString, @EqualsAndHashCode 등을 한 방에 만들어주는 마법의 어노테이션입니다.
    // 코드가 매우 짧아져서 편리하지만, 가끔 원치 않는 기능까지 추가될 수 있어 실무에서는 1번 방식을 더 선호하기도 합니다.
    @Data
    public static class Board {
        private int boardNo;
        private String title;
    }

    public static void main(String[] args) {
        System.out.println("=== 1. 기본 생성자와 Setter 사용 ===");
        Member member1 = new Member();
        member1.setId("user01");
        member1.setName("홍길동");
        member1.setAge(25);
        System.out.println(member1); // @ToString 덕분에 주소값이 아니라 데이터가 예쁘게 출력됩니다.

        System.out.println("\n=== 2. AllArgsConstructor (모든 값을 넣는 생성자) 사용 ===");
        Member member2 = new Member("admin", "관리자", 35);
        System.out.println(member2);

        System.out.println("\n=== 3. Builder 사용 (👍 가장 추천하는 방식!) ===");
        // 순서 상관없이 원하는 값만 쏙쏙 넣을 수 있어서 실수할 확률이 줄어들고 가독성이 매우 좋습니다.
        Member member3 = Member.builder()
                .name("이순신") // id보다 name을 먼저 적어도 전혀 문제없음!
                .age(40)
                .id("hero")
                .build();
        System.out.println(member3);

        System.out.println("\n=== 4. Getter 사용 ===");
        System.out.println("member3의 이름만 쏙 빼오기 : " + member3.getName());

        System.out.println("\n=== 5. @Data 어노테이션 확인 ===");
        Board board = new Board();
        board.setBoardNo(100);
        board.setTitle("롬복 테스트 게시글입니다.");
        System.out.println(board); // @Data 안에 @ToString이 포함되어 있어 깔끔하게 출력됨
    }
}
