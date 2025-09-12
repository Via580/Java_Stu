package Sep_12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        int[] nums1 = {1 , 2, 3, 4};
        int[] nums2 = {2 , 3};
        int[] newnum1 = Arrays.copyOf(nums1 , nums1.length + nums2.length);
        int j = 0;
        for (int i = nums1.length ; i < newnum1.length; i++)
        {
            newnum1[i] = nums2[j++];
        }
        Arrays.sort(newnum1);
        System.out.println(Arrays.toString(newnum1));
        if(newnum1.length % 2 == 1)
            System.out.println(newnum1[(newnum1.length - 1) / 2]);
        else {
            double mid = (newnum1[newnum1.length / 2] + newnum1[newnum1.length / 2 - 1]) / 2.0;
            System.out.println(newnum1[newnum1.length / 2]);
            System.out.println(newnum1[newnum1.length / 2 - 1]);
            System.out.println(mid);
        }
    }
}
