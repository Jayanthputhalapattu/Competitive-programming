public class MediumProblems {
    static int minMoves(int target, int maxDoubles) {
//        return helper(target,maxDoubles,0,1);
        int currentValue = target;
        int moves = 0;
        while (target>1) {
            if (target % 2 == 0 && maxDoubles>=1) {
                moves++;
                maxDoubles--;
                target = target/2;

            } else {
                moves = moves + 1;
                target = target -1;
            }
            System.out.println("Target : "  + target);
        }
        return moves;
    }


    public static void main(String[] args) {
//        System.out.println(minMoves(19,2));
        System.out.println(minMoves(100233430,20));
//        System.out.println(minMoves(10,4));

    }
}
