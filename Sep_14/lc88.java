package Sep_14;

import java.util.Arrays;

public class lc88
{
    public static void main(String[] args) {
        int[] nums1 = {1 , 2, 3, 4 , 0 , 0 , 0};
        int[] nums2 = {3 ,5 ,6};
        merge(nums1 , 4 , nums2 , 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        System.arraycopy(nums2 , 0 , nums1 , m , n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));


    }
}
