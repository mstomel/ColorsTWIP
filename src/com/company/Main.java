package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner hi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("are you inputting RGB, HEX, or name?");
        String inType = hi.next().toLowerCase();
        if (inType.equalsIgnoreCase("rgb")) {
            RGBProcessor();
        }
        else if (inType.equalsIgnoreCase("hex")) {
            HexProcessor();
        }
        else if (inType.equalsIgnoreCase("name")) {
            NameProcessor();
        }
        else {
            System.out.println("invalid input");
        }
    }
    private static void RGBProcessor() {
        System.out.println("input RGB eg 255,255,255");
        int rgb = hi.nextInt();
        //String []rgb = hi.next().split(",");
        System.out.println("Hex is: " + "#"+Integer.toHexString(rgb).substring(2));
    }
    private static void HexProcessor() {
        System.out.println("input hex");
        String hexIn = hi.next();
        System.out.println("RGB is: " + Integer.valueOf(hexIn.substring( 1, 3 ), 16 ).toString() +Integer.valueOf(hexIn.substring( 3, 5 ), 16 ).toString() + Integer.valueOf(hexIn.substring( 5, 7 ), 16 ).toString());
        /*Integer.valueOf(hexIn.substring( 1, 3 ), 16 );
        Integer.valueOf(hexIn.substring( 3, 5 ), 16 );
        Integer.valueOf(hexIn.substring( 5, 7 ), 16 );*/
    }
    private static void NameProcessor() {

    }
}