package Sep_16;

public class lc_8
{
    public static void main(String[] args) {
        int a = myAtoi("1234");
        System.out.println(a);

    }

        public static int myAtoi(String s)
        {
            char[] ch = s.toCharArray();
            int n = ch.length;
            long res = 0;
            int pos = 0;
            boolean op = true;
            boolean f = false;
            while(ch [pos] == ' ')
                pos++;
            if(ch[pos] == '-') {
                pos++;
                op = false;
            }
            else if(ch[pos] == '+') {
                pos++;
            }
            while(pos < n  && (ch[pos] > '0' && ch[pos] < '9'))
            {

                res = res*10 + (ch[pos++]  - '0');
                if(res >= Integer.MAX_VALUE )
                {
                    f = true;
                    break;
                }
            }
            if(!op)
                res = -res;
            if(f && res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(f && res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int)res;
        }
}

