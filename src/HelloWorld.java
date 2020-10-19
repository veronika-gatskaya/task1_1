public class HelloWorld {
    public static void main(String[] args) {
        //1
        System.out.println("Hello World");
        //2
        final String name = "Veronika";
        System.out.println("Hello " + name);
        //3
        final int NUMBER_1 = 8;
        final double NUMBER_2 = 15.1;
        final double RESULT = NUMBER_1*NUMBER_2;
        //4
        if(RESULT < 20) System.out.println("Something went wrong");
        else System.out.println(RESULT);
        //5
        System.out.println(Math.round(RESULT));
    }
}
