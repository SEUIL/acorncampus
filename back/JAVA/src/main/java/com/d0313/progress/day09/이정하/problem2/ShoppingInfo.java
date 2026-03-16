package javaprj.day09.이정하.problem2;

public class ShoppingInfo {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();

        shopping.input("201803120001", "abc123", "2018년 3월 12일", "홍길순", "D0345-12", "서울시 영등포구 여의도동 20번지");
        shopping.output();
    }
}
