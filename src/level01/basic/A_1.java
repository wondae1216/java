package com.ohgiraffers.level01.basic;

public class A_1 {

    public  void testSimpleForStatement() {

    /* 1부터 10까지 합계를 구하고 결과를 출력하세요
     *
     * -- 출력 예시 --
     * 1부터 10까지의 합 : 55
     * */

        int sum = 0;
        int i = 1;
        while (true) {

            sum += i;

            if (i == 10){
                break;
            }
            i++;
        }

        System.out.println("1부터 55까지의 합 :" + sum);
    }
}

