public class DemoOnStrings {
    public static void main(String[] args) {
        String name = "jayanth";
        String name2 = "jayanth";
        System.out.println(name==name2);



        String a = new String("jayanth");
        String b = new String("jayanth");

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));

    }
}
