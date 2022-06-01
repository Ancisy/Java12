public class Main {
    public static void main(String[] args) {
        int a = 2 ;
        int b = 3 ;
        int i = 0, c ,d ;

        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("b-a = " + (b-a));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("b/a = " + (b/a));

        System.out.println("Giá trị ban đầu của i = " + i);

        c= i++;
        System.out.println("Giá trị trả lại của i++ là  " + c);
        System.out.println("Giá trị của i sau i++ là " + i);

        i=0;
        d= ++i;
        System.out.println("Giá trị trả lại của ++i là " + d);
        System.out.println("Giá trị của i sau ++i là  " + i);
    }
}
