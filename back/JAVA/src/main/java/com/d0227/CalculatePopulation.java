package com.d0227;

import java.text.DecimalFormat;

public class CalculatePopulation {
    /*
    * 1999년 H시의 인구는 250만명, 연증가율은 3.6%이고 k시의 인구는 180만명이며
    * 연증가율은 4.2%일 때 K시의 인구가 H시의 인구보다 많아지게 되는 해를 구하는 순서도를 작성하시오
    * */

    double cityH = 2500000;
    double cityK = 1800000;
    double rateH = 0.036;
    double rateK = 0.042;

    public CalculatePopulation() {
        run();
    }

    public void run() {
        int year = 1999; // 시작 년도 설정
        DecimalFormat df = new DecimalFormat("#,###");

        while(true){
            cityH += cityH * rateH;
            cityK += cityK * rateK;
            year++;
            if (cityH < cityK){
                System.out.println("K시의 인구가 H시의 인구를 초과");
                System.out.println("K시의 인구 : " + df.format((int)cityK) + "명");
                System.out.println("H시의 인구 : " + df.format((int)cityH) + "명");
                System.out.println(year + "년");
                break;
            }
        }
    }

}
