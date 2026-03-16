package javaprj.day09.이정하.problem1;

public class Human {
    String name;
    int age;
    boolean isMarried;
    int children;

    public void input(String name, int age, boolean isMarried, int children){
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.children = children;
    }
    public void output(){
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        if (this.isMarried) { //this.isMarried 가 true 라면
            System.out.println("결혼여부: YES");
            System.out.println("자녀 수: " + this.children);
        } else {
            System.out.println("결혼여부: NO");
        }
    }
}


