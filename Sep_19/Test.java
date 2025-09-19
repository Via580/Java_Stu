package Sep_19;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int  num  = 0;
        int[] nums = new int[200];
        int tar = 0;
        Scanner sc  = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        tar = sc.nextInt();
        int pos = -1;
        int pos1 = -1;
        int sub = 1000;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if(nums[i] + nums[j] == tar){
                    if (j - i < sub) {
                        pos = i;
                        pos1 = j;
                        sub = j - i;
                    }
                }
            }

        }
        if(sub == 1000)
            System.out.println("");
        else
        System.out.println(pos + " " + pos1);
    }
}
