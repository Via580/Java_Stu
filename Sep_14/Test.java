package Sep_14;

public class Test
{
    public static void main(String[] args)
    {
        String s = "123";
        char[] ch= new char[200];
        char[] ch1 = new char[200];
        int j = 0;
        int flag = 1;
        int k = 0;
        while(true)
        {
            if(ch[j] == ' ')
            {
                j++;
            }
            if(ch[j] != ' ')
                break;
        }
       if(ch[j] == '+')
           ;
       else if(ch[j] == '-')
           flag = 0;
       else
           flag = '+';
        for (int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(ch[j++]))
                ch1[k++] = ch[j];
            else
                break;

        }
        int c= Integer.parseInt(new String(ch1));
        if(1 == flag) {
            System.out.println(c);
        }
        else
            System.out.println(-c);

    }
}
