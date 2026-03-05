package com.d0305;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ScheduleList {

    /*
    * 일정관리 프로그램
    * */

    private final Scanner scanner;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static long nextId = 1;

    //DB
    private final ArrayList<Schedule> database = new ArrayList<>();

    // DTO
    private static class Schedule {
        long id;
        String title;
        Date dueDate;
        boolean isCompleted;

        public Schedule(long id, String title, Date dueDate) {
            this.id = id;
            this.title = title;
            this.dueDate = dueDate;
            this.isCompleted = false;
        }

        @Override
        public String toString() {
            return " " + id + ". " + title + " (" + dateFormat.format(dueDate) + ") - " + (isCompleted ? "완료" : "미완료");
        }
    }

    public ScheduleList() {
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        System.out.println(nextId);
        System.out.println("일정관리 프로그램을 실행합니다.");
        while (true){
            System.out.println("--------------------------");
            System.out.print("1.추가 2.목록 3.완료처리 4.삭제 5.종료 : ");
            String input = scanner.nextLine();
            if (input.equals("1")){
                System.out.print("할일 내용: ");
                String title = scanner.nextLine();
                System.out.print("마감일 (yyyy-MM-dd): ");
                String dateString = scanner.nextLine();
                try {
                    Date dueDate = dateFormat.parse(dateString);
                    addSchedule(title, dueDate); //일정추가 실행
                    System.out.println("일정이 추가되었습니다.");
                } catch (Exception e) {
                    System.out.println("날짜 형식이 올바르지 않습니다. (예: 2023-12-25)");
                    System.out.println("--------------------------");
                }
            } else if (input.equals("2")) {
                printAllSchedules(); //일정 출력
            } else if (input.equals("3")) {
                System.out.println("완료 할 일정의 ID를 입력하시오");
                printAllSchedules();
                System.out.println("--------------------------");
                long id = Long.parseLong(scanner.nextLine());
                completeSchedule(id);
            } else if (input.equals("4")) {
                System.out.println("삭제 할 일정의 ID를 입력하시오");
                printAllSchedules();
                System.out.println("--------------------------");
                long id = Long.parseLong(scanner.nextLine());
                deleteSchedule(id); //일정 삭제
            } else if (input.equals("5")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    // 일정 추가
    public void addSchedule(String title, Date dueDate) {
        // ScheduleList가 아닌 Schedule 객체를 생성하여 저장
        Schedule newSchedule = new Schedule(nextId++, title, dueDate);
        database.add(newSchedule);
    }

    // 일정 출력
    private void printAllSchedules() {
        if (database.isEmpty()){
            System.out.println("일정이 없습니다.");
            return;
        }
        for (Schedule schedule : database) {
            System.out.println(schedule);
        }
    }

    //일정 삭제
    private void deleteSchedule(long id) {
        for (Schedule schedule : database) {
            if (schedule.id == id) {
                database.remove(schedule);
                break;
            }
        }
    }

    //완료 상태 변경
    private void completeSchedule(long id) {
        for (Schedule schedule : database) {
            if (schedule.id == id) {
                schedule.isCompleted = true;
                break;
            }
        }
    }

}
