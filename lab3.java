public class lab3
{
   /* static void velocity()
    {
        int Vi = 100;
        int a = 2;
        int t = 10;

        int Vf = Vi + a * t;


        System.out.println("The final velocity is " + Vf );
    }
    
    public static void main(String[] args)
    {
        velocity();
    }*/

    /*public static void main(String[] args)
    {
        int intValue = 100;
        String strValue = "john";

        System.out.println(strValue + "scorad" + intValue );


    }*/

    /*public static void main(String[] args)
    {
        String strValue = "188";
        int intValue = 80 + Integer.parseInt(strValue);

        System.out.println("john's score is " + intValue );

        int score = 50;
        String shirtno =  Integer.toString(score) + "A";

        System.out.println("john's T-shirt no is " + shirtno);

    }*/

    /*public static void main(String[] args)
    {
        int num1 = 9;
        int num2 = 4;

        System.out.println("the result of additio " + num1 + " and " + num2 + " is " +( num1 + num2) );
        System.out.println("the result of subtracting " + num1 + " and " + num2 + " is " + (num1 - num2 ));
        System.out.println("the result of multiplicatin " + num1 + " and " + num2 + " is " + num1 * num2 );
        System.out.println("the result of division " + num1 + " with " + num2 + " is " + num1/num2 );
        System.out.println("the riminder after dividing  " + num1 + " with " + num2 + " is " + num1 % num2 );

        System.out.println("the result of division " + num1 + " with " + num2 + " is " + (float)num1 / num2 );


    }*/


    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(x*x + y*y);

        System.out.println("the distance from (" + x + " , " + y + ") to the (0,0) is = " + distance);

    }








}