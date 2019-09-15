package com.company.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int numberfOfFive =0;
    static int getNumberfOfTwo = 0;
    static int factorial = 0;
    public static void main(String[] args) throws IOException{
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-->0)
        {
             factorial = Integer.parseInt(br.readLine());
             factorOfFive(factorial);
          sb.append(numberfOfFive);
          if (T!=0)
              sb.append("\n");
            numberfOfFive  =0;
        }
        System.out.println(sb.toString());
    }
    private static void factorOfFive(int i) {
        for (int j=5;j<=factorial;j*=5)
        {
            numberfOfFive+=(factorial/j);
        }

    }
}
