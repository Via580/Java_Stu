package Sep_13;

public class Test
{

    public static void main(String[] args) {
        int a = reverse(1534236469);
        System.out.println(a);
    }
    public static int reverse(int x)
    {
//        int y = x;
//        int count = 0;
//        while(true)
//        {
//            x /= 10;
//            count++;
//            if(0 == x)
//                break;
//        }
//        int tmp = 0;
//        for (int i = count; i > 0 ; i--)
//        {
//            //pow返回的类型是double ，在存储较大整数时会丢失精度，当这个不确定的整数转换成int时，可能恰好被截断为Integer。MAX_VALUE。在第一次循环时就已经被截断为Integer。MAX_VALUE
//            tmp += y % 10 * Math.pow(10 , i - 1 );
//            y /= 10;
//        }
//        System.out.println(tmp);
//        if(tmp == Math.pow(2 , 31) - 1 || tmp == Math.pow(-2 , 31))
//            return 0;
//        return tmp;
    int tmp = 0;
    while(x != 0)
    {
        if(tmp < Integer.MIN_VALUE / 10 || tmp > Integer.MAX_VALUE / 10)
            return 0;
        int dig = x % 10;
        x /= 10;
        tmp = tmp * 10 + dig;
    }
    return tmp;
}


}
