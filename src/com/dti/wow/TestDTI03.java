package com.dti.wow;

import java.util.Scanner;

public class TestDTI03 {

    public static void main(String[] args) {
        String stu_name;
        int stu_quiz;
        double stu_midterm, stu_final;

        Scanner sc = new Scanner(System.in);

        System.out.print("ป้อนชื่อ : ");
        stu_name = sc.next();
        System.out.print("ป้อนคะแนนเก็บ : ");
        stu_quiz = sc.nextInt();
        System.out.print("ป้อนคะแนนกลางภาค : ");
        stu_midterm = sc.nextDouble();
        System.out.print("ป้อนคะแนนปลายภาค : ");
        stu_final = sc.nextDouble();
        System.out.print("\n---------------------------------------\n");
        System.out.println("\n         คะแนนรวมคือ " + (stu_quiz + stu_midterm + stu_final)+"\n");
        System.out.println("---------------------------------------\n");

    }
}
