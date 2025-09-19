package Sep_19;

import java.util.Arrays;
import java.util.Scanner;

public class Test3
{
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0)
            {
                int a = s1.charAt(i--) - '0';
                sum += a;
            }
            if(j >= 0)
            {
                int b = s2.charAt(j--) - '0';
                sum += b;
            }
            sb.append(sum % 2);
            carry =sum / 2;
        }
        if(0 != carry)
            sb.append(1);
        sb.reverse();
        System.out.println(sb.toString());


    }
}
