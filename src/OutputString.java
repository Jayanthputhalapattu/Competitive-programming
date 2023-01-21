public class OutputString {
    public static void main(String[] args) {
        System.out.println(56);

        float val = 123.679038f;
        System.out.printf("formated value %.2f",val);
        System.out.printf("pi value : %.2f",Math.PI);
        System.out.println();
        System.out.println('a' + 'b');
        System.out.println('a' + 3);
        System.out.println('a' - 97);
//        System.out.println('A' - );
        System.out.println();
        for (char l='A' ;l<='Z';l++)
        {
            System.out.println(l-65);
        }

        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++)
        {
            builder.append((char)('a' + i ));
        }
        builder.reverse();
        System.out.println(builder);
    }
}
