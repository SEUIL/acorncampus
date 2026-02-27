package com.d0227;

import java.util.ArrayList;
import java.util.List;

public class CalculateGeometricSequence {
    /*
    5. 다음 등비수열에 대하여 7번째 항까지의 합을 구하는 순서도를 작성하시오 2, 6, 18, 54, 162, 486 ...
            (연속한 두 항의 비가 일정한 수열을 등비수열이라 한다. ) ! :팩토리얼 (1부터 자신의 수까지의 곱을 말한다.) 3! =1*2*3
            */
    private final List<Integer> list;

    public CalculateGeometricSequence() {
        this.list = new ArrayList<>();
        run();
    }

    public void run() {
        int scalingFactor = 3;
        int sum = 0;

        list.add(2); //첫번째에 2 넣기

        for (int i = 1; i <= 6; i++){
            list.add(list.get(i-1) * scalingFactor);
        }
        for (int num : list){
            sum += num;
        }
        System.out.println("7번째 항까지의 합 : " + sum);
        System.out.println("등비수열 : " + list);

    }

}
