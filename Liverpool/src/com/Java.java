package com;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" sonni kiriting");
        int a=scanner.nextInt();
        switch (a){
            case 1->{
                System.out.println("->dushanba");
            }case 2->{
                System.out.println(" seshanba");
            }case 3->{
                System.out.println("chorshanba");
            }case 4->{
                System.out.println("payshanba");
            }case 5->{
                System.out.println("juma");
            }default -> {
                System.out.println("dam olish kunlari");
            }
        }
    }
}
