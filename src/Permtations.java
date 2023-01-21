import java.util.ArrayList;
import java.util.List;

public class Permtations {
    static void permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return;

        }
        char c = up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            permutations(first + c + second,up.substring(1));
        }
    }
    static List<String> permutationInline(String p,String up)
    {
        if(up.isEmpty())
        {
//            System.out.println();
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for(int i =0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationInline(first + c + second,up.substring(1)));

        }
        return ans;
    }
    static int countPermutations(String p, String up)
    {
        if(up.isEmpty())
        {
//            System.out.print(p + " ");

            return 1;

        }
        int count = 0;
        char c = up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

           count = count +  countPermutations(first + c + second,up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
    String name = "Jayanth";
    permutations("",name);
    String kingIntheNorth = "aaa";
        System.out.println();
    System.out.println(permutationInline("",kingIntheNorth).toString());

        System.out.println(countPermutations("",kingIntheNorth));

    }
}
