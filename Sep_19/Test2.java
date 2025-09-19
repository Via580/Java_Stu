package Sep_19;

import java.util.*;

public class Test2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        Integer[] array = new Integer[200];
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
        Integer[] res = set.toArray(new Integer[0]);
        for (int i = 0; res[i] != null; i++) {
            System.out.print(res[i]);
            if(res[i + 1] != null)
                System.out.print("->");
        }
    }

}
