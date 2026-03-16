package javaprj.day09.이정하.problem3;

public class ScoreInfo {
    public static void main(String[] args) {
        Score score = new Score();
        input(score, "홍길동", 90, 80, 0);
        output(score);
    }
    public static void input (Score score, String name, int kor, int eng, int avg){
        avg = (kor + eng) / 2;
        score.name = name;
        score.kor = kor;
        score.eng = eng;
        score.avg = avg;
    }

    public static void output(Score score) {
        System.out.println("학생이름: " + score.name);
        System.out.println("국어: " + score.kor);
        System.out.println("영어: " + score.eng);
        System.out.println("평균: " + score.avg);
    }
}
