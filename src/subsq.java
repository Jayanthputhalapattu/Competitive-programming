public class subsq {
    static int countSubStr(String p,String up,String s)
    {
        int count = 0;
        if(p.length()==up.length() && p.contentEquals(up) && p.length()>=1)
        {
            System.out.println(p + " " + up + " " + s);
            count+=1;
        }

    if(!s.isEmpty())
    {
        char ch = s.charAt(0);
        count +=  countSubStr(p+ch,up,s.substring(1))+
                countSubStr(p,up,s.substring(1)) + countSubStr(p,up + ch,s.substring(1)) + countSubStr(p,up ,s.substring(1)) ;
    }
    else{
        return 0;
    }
    return count;
    }
    public static void main(String[] args) {
        String name = "abcd";
        System.out.println(countSubStr("","",name));
    }
}
