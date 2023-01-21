import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static  List<String> permutationsInline(String p , String up)
    {
        if(up.isEmpty())
        {
            List<String > ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ansLatst = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ansLatst.addAll(permutationsInline(first + ch + second,up.substring(1)));



        }
        return ansLatst;
    }
    static void permutations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first + ch + second,up.substring(1));


        }
    }


    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static List<String> subseqInplace(String p, String up)
    {
        if(up.isEmpty())
        {
//            System.out.print(p + " ");
            List<String> subsets = new ArrayList<>();
             subsets.add(p);
            return subsets;


        }
        char ch = up.charAt(0);
       List<String> left = subseqInplace(p + ch,up.substring(1));
        List<String> right = subseqInplace(p,up.substring(1));
        left.addAll(right);
        return left;
     }
    public static void main(String[] args) {
        String name = "jayanth";
        subseq("",name);
        System.out.println();

        String name2 = "dumpo";
        System.out.println(subseqInplace("",name2));

        System.out.println(name2.substring(0,2));

        String perm = "abcd";
//        permutations("",perm);
//        System.out.println(perm);
        System.out.println(permutationsInline("",perm).toString());

    }
}
