import static org.junit.Assert.assertTrue;

import java.util.Scanner;

public class CubeSquare{

public static void main(String[] args)

{

try{

Scanner s=new Scanner(System.in);

System.out.println("Enter an number");

double n=s.nextDouble();

double a=0,b=0;

a=nn;

b=nn*n;

System.out.println("The square of number="+a);

System.out.println("The square of number="+b);

assertTrue(a==4);

assertTrue(b==8);

s.close();

}

catch(Exception e)

{

System.out.println("Invalid");

}

}

}
