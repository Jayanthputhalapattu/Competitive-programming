import java.util.ArrayList;
import java.util.List;

public class Dice {
    static List<String> dice(String p , int target)
        {
            if(target ==0)
            {
//                System.out.println(p);

                List<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            List<String> ans = new ArrayList<>();
            for (int i=1;i<=6 && i<=target;i++)
            {
               ans.addAll( dice(p + i,target-i));
            }
            return ans;
        }
    public static void main(String[] args) {
        System.out.println(dice("",6).toString());

    }
}
