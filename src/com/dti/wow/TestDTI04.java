
package com.dti.wow;

import java.util.Scanner;

//คำนวนค่า commission โดยยอดขาย
//ยอดขายเกิน 5000 ให้ค่าคอมฯ 10% ถ้าไม่เกินให้ 5% ของยอดขาย
//แสดงผลทางหน้าจอ


public class TestDTI04 {
    public static void main(String[] args) {
        
        float sale,commission;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ป้อนยอดขาย : ");
        sale = sc.nextFloat();
        System.out.println("+++++++++++++++++++++++++");
        commission = sale > 5000 ? sale * 10/100 : sale *5/100;
        System.out.println("ค่าคอมฯ เป็นเงิน "+(commission)+" บาท");
    }
}
