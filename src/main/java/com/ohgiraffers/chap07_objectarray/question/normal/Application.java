package com.ohgiraffers.chap07_objectarray.question.normal;

public class Application {

    public static void main(String[] args) {

        /* Q1. 다음 조건에 맞는 클래스를 작성하고, 객체 배열을 생성하여 평균 급여를 출력하세요.
         *
         * 복습 포인트:
         * - 객체 배열의 개념을 이해하고 설명할 수 있다.
         * - 객체 배열을 활용하여 여러 객체를 관리할 수 있다.
         *
         * 클래스명: Employee
         * 필드: 이름(name, 문자열), 급여(salary, 정수)
         *
         * 객체 배열 생성: 크기가 3인 Employee 배열을 생성하고,
         * 각각의 객체는 "직원1", 3000, "직원2", 4000, "직원3", 5000의 값을 가짐
         *
         * 평균 급여를 계산하여 출력
         *
         * 출력 예시:
         * 평균 급여: 4000
         * */

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("직원1", 3000);
        employees[1] = new Employee("직원2", 4000);
        employees[2] = new Employee("직원3", 5000);

        int average = 0;

        for (Employee employee : employees) {
            average += employee.salary;
        }

        System.out.println("평균 급여 : " + average/employees.length);


        /* Q2. 다음 조건에 맞는 클래스를 작성하고, 객체 배열을 생성하여 가장 높은 기록을 출력하세요.
         *
         * 복습 포인트:
         * - 객체 배열의 개념을 이해하고 설명할 수 있다.
         * - 객체 배열을 활용하여 여러 객체를 관리할 수 있다.
         *
         * 클래스명: Athlete
         * 필드: 이름(name, 문자열), 기록(record, 정수)
         *
         * 객체 배열 생성: 크기가 3인 Athlete 배열을 생성하고,
         * 각각의 객체는 "선수1", 10, "선수2", 20, "선수3", 15의 값을 가짐
         *
         * 가장 높은 기록을 찾아 출력
         *
         * 출력 예시:
         * 최고 기록: 20
         * */

        Athlete[] athletes = new Athlete[3];

        athletes[0] = new Athlete("선수1", 10);
        athletes[1] = new Athlete("선수2", 20);
        athletes[2] = new Athlete("선수3", 15);

        int max = athletes[0].record;

        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i].record > max) {
                max = athletes[i].record;
            }
        }
        System.out.println("최고 기록 : " + max);
    }

}
