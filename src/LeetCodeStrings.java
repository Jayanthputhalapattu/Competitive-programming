import java.util.Arrays;

public class LeetCodeStrings {
    static boolean isPalindrome(String s)
    {
        for (int i =0;i<=s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
    static boolean check(String s,String b)
    {
        int len = s.length();
        int left = 0;
        int right = len-1;
        if(s.length()==1)
            return true;
        while(left<right)
        {
            if(s.charAt(left)!=b.charAt(right))
            {
                break;
            }

            left++;
            right--;
        }
        if(isPalindrome(s.substring(left,right + 1)) || isPalindrome((b.substring(left,right + 1))))
        {
            return true;
        }
        return false;
    }
    static boolean checkPalindromeFormation(String a, String b) {
            return check(a,b) || check(b,a);
    }
    static int oneCOunt(String s,int start ,int end)
    {
        char bin[] =  s.toCharArray();
        int count = 0;
        for(int i =0;i<=end;i++)
        {
            if( bin[i]== '1')
            {
//                System.out.println("hello");
            count++;
            }
        }
        return count;
    }
    static int numWays(String s)
    {

       int ones = 0;
       int n =  s.length();
       for(int i =0;i<s.length();i++)
       {
               ones = ones + s.charAt(i)-'0';
       }
//        System.out.println(ones);
       if(ones%3!=0)
       {
           return 0;
       }
       if(ones==0)
       {
           return (n-1)*(n-2)/2;
       }
       int left = 0;
       int count = 0;
       int count1 = 0;
       int right = 0;
       for(int i=0;i<n;i++)
       {
                left+= s.charAt(i) -'0';
                right+=s.charAt(n-i-1) - '0';
                if(left==ones/3)
                {
                    count++;
                }
                if(right==ones/3)
           {
               count1++;
           }
       }
    return count1*count;
    }

    public boolean isValid(String s) {
            for (int i =0;i<s.length()-1;i++)
            {
                if (s.charAt(i) !=s.charAt(i + 1))
                {
                    return false;
                }
            }
            return true;
    }
    static void operator(String s1[],String key)
    {
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].contentEquals(key))
            {
                s1[i] = "";
            }
        }

    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
               String s1[] = sentence1.split(" ");
               String s2[] = sentence2.split(" ");
               if(sentence1.length()>sentence2.length())
               {
                   for (int i=0;i<s2.length;i++)
                   {
                       operator(s1,s2[i]);
                   }
                   String ans = "";
                   for(int i=0;i<s1.length-1;i++)
                   {
                       ans   +=s1[i] + " ";
                   }
                   ans+=s1[s1.length-1];
                   return sentence1.contains(ans);
               }
               else{
                   for (int i=0;i<s1.length;i++)
                   {
                       operator(s2,s1[i]);
                   }
                   String ans = "";
                   for(int i=0;i<s2.length-1;i++)
                   {
                       ans   +=s2[i] + " ";
                   }
                   ans+=s2[s2.length-1];
                   return sentence2.contains(ans);
               }


    }
    public static void main(String[] args) {
        String a = "x";
        String b = "y";
//        System.out.println(checkPalindromeFormation(a,b));
//      numWays("10101");
        String s = "213";
//        System.out.println((s.charAt(2)) - '0');
        System.out.println(numWays("111111"));
        String s1 = "Luky";
        String s2 = "Lucccky";
        System.out.println(areSentencesSimilar(s1,s2));
    }


}
