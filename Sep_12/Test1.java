package Sep_12;

public class Test1
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        if(nums1.length > nums2.length)
        {
            return findMedianSortedArrays(nums2 , nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int m1 = 0;
        int m2 = 0;
        int left = 0;
        int right = m;
        while(left <= right)
        {
            int i = (left + right) / 2;
            int j = (m + n + 1) / 2;
            int im1 = (0 == i ? Integer.MAX_VALUE : nums1[i - 1]);
            int im = (m == i ? Integer.MIN_VALUE : nums1[i]);
            int jm1 = (0 == i ? Integer.MAX_VALUE : nums2[j - 1]);
            int jm = (n == i ? Integer.MIN_VALUE : nums2[j]);

            if(im1 <= jm)
            {
                m1 = Math.max(im1 , jm1);
                m2 = Math.min(im , jm);
                left = i;
            }
            else
            {
                right = i;
            }
        }
        return ((m + n )% 2 == 1 ? m1 : (m1 + m2) / 2.0);
    }
}
