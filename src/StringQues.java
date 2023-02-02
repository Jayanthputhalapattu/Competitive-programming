public class StringQues {
    static void countSubStr(String s1,String s2,String s,int count)
    {

        if(s.isEmpty())
        {
//            System.out.println(count);
//            System.out.println("hello");
            return;
        }
        if(s1.length()== s2.length() &&!s1.isEmpty() &&!s2.isEmpty())
        {
            count =   count + 1;

        }
        char ch = s.charAt(0);
        countSubStr(s1+ch,s2,s.substring(1),count) ;
        countSubStr(s1,s2+ch,s.substring(1),count);
        System.out.println(count);
    }
    public static void main(String[] args) {
        String name = "abcd";
        countSubStr("","",name,0);
    }
}








