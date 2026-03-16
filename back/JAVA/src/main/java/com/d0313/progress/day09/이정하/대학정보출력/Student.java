package javaprj.day09.이정하.대학정보출력;

public class Student {
    String name;
    String major;
    int number;
    int credit;
    float grade;

    public void input (String name, String major, int number, int credit, float grade) {

        this.name = name;
        this.major = major;
        this.number = number;
        this.credit = credit;
        this.grade = grade;
    }
    public void output() {
        System.out.println(" =======학생 정보 출력=======");
        System.out.println("이름: " + this.name);
        System.out.println("학과: " + this.major);
        System.out.println("학번: " + this.number);
        System.out.println("취득 학점: " + this.credit);
        System.out.println("평점 평균: " + this.grade);

    }

}
