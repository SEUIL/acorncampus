package javaprj.day09.이정하.problem2;

public class Shopping {
    String orderNum;
    String userId;
    String orderDate;
    String userName;
    String productNum;
    String address;

    public void input (String orderNum, String userId, String orderDate, String userName, String productNum, String address) {
        this.orderNum = orderNum;
        this.userId = userId;
        this.orderDate = orderDate;
        this.userName = userName;
        this.productNum = productNum;
        this.address = address;
    }

    public void output (){
        System.out.println("==== 주문이 들어왔습니다. 주문 정보를 확인해주세요. ====");
        System.out.println("주문 날짜: " + this.orderDate);
        System.out.println("주문번호: " + this.orderNum);
        System.out.println("주문 상품번호: " + this.productNum);
        System.out.println("주문자 아이디: " + this.userId);
        System.out.println("주문자 이름: " + this.userName);
        System.out.println("배송 주소: " + this.address);
    }
}


