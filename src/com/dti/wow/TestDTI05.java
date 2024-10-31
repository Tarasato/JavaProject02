package com.dti.wow;

//คำนวนค่า commission โดยยอดขาย
//ยอดขายเกิน 5000 ให้ค่าคอมฯ 10% ถ้าไม่เกินให้ 5% ของยอดขาย
//แสดงผลทางหน้าจอ
//ใช้ Buffer

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDTI05 {

    public static void main(String[] args) throws IOException {

        float sale, commission;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("ป้อนยอดขาย : ");
        sale = Float.parseFloat(buffer.readLine());
        System.out.println("+++++++++++++++++++++++++");
        commission = sale > 5000 ? sale * 10 / 100 : sale * 5 / 100;
        System.out.println("ค่าคอมฯ เป็นเงิน " + (commission) + " บาท");
    }
}
