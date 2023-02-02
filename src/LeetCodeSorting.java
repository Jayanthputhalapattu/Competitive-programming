import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeSorting {
    static int[] swap(int arr[],int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    static String swap(String s,int i ,int j)
    {
       char[] c= s.toCharArray();
       char temp = c[i];
       c[i] = c[j];
       c[j] = temp;
       String tempString = new String(c);
        System.out.println(tempString);
       return tempString;

    }
    static String restoreString(String s,int[] indices)
    {
        //cyclic sorting
        int index=0;
        while(index<indices.length)
        {
            if(indices[index] !=index )
            {
                int a = indices[index];
                swap(indices,index,indices[index]);
                s = swap(s,a,index);
            }
            else{
                index++;
            }

        }
        return s;
    }
    static  String interpret(String command)
    {
        char[] chars = command.toCharArray();
        String ans = "";
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]=='G')
            {
                    if(chars[i+1] ==')')
                    {
                        ans+="o";
                    }
            }
            else if(chars[i]!=')'){
                ans+=chars[i];
            }
        }
            return ans;
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//       int count = 0;
    return  items.stream().map(item -> {
            int ans = 0;
            if (ruleKey.contentEquals("type")) {
                if (item.get(0).contentEquals(ruleValue)) {
                    ans += 1;
                }
            } else if (ruleKey.contentEquals("color")) {
                if (item.get(1).contentEquals(ruleValue)) {
                    ans += 1;
                }
            } else if (ruleKey.contentEquals("name")) {
                if (item.get(2).contentEquals(ruleValue)) {
                    ans += 1;
                }
            }
            return ans;

        }).reduce(0,(i1,i2)->(i1 + i2));


    }
    static boolean canReach(String s,int minJump,int maxJump,int i)
    {
        char[] bin = s.toCharArray();

        if(i==s.length()-1 && bin[i]=='0')
//            System.out.println("yes");
            return true;
        boolean ans = false;
        for(int step = minJump;step<=maxJump;step++)
        {
            if(i + step<s.length() && bin[i + step]=='0' )
                 ans =   canReach(s,minJump,maxJump,i+ step);


        }
        return ans;
    }
    public static void main(String[] args) {

        String s = "aiohn";
        int[] arr = {3,1,4,2,0};
//        System.out.println();
        System.out.println(restoreString(s,arr));

//        String command = "(al)G(al)()()G";
//        System.out.println(interpret(command));
        List<String >a = Arrays.asList("computer","silver","lenovo");
        List<String> b = Arrays.asList("phone","gold","iphone");
        String ruleKey = "color";
        String ruleValue = "silver";
       List<List<String>> items = Arrays.asList(a,b);
        System.out.println(countMatches(items,ruleKey,ruleValue));

        String s2 = "00";
        System.out.println(canReach("01111111011110",1,1,0));
//        System.out.println(canReach("01",2,3,0));
    }
}
