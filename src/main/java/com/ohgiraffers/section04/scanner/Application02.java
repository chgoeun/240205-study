package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. Scanner 의 nextInt() 과 next() 에 대해 구분하여 사용할 수 있다.  */
        /* 필기.
        *   nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행 문자 전까지 읽어서 문자열로 반환한다. (공백문자 포함)
        *   next()     : 공백 문자나 개행 문자 전 까지를 읽어서 문자열로 반환한다. (공백문자 포함 x)
        *  */

        /* 목차. 1. Scanner 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 목차. 2. 문자열 입력 */
        /* 목차. 2-1. nextLine() */
        System.out.print("인삿말을 입력해주세요 : ");
        String greeting = sc.nextLine(); // 안녕하세요 반갑습니다.6
        System.out.println(greeting);

        /* 목차. 2-2. next() */
        System.out.print("인삿말을 \n 입력해주세요2 : ");
        String greeting2 = sc.next(); // 안녕하세요 반갑습니다. // 안녕하세요 만 출력
        System.out.println(greeting2);


    }

}
