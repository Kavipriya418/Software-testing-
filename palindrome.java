#Open

palindrome.java

#3

Mounikachenna12 opened this issue 1 hour ago · 0 comments

Comments

Mounikachenna12 commented 1 hour ago

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class palindrome

{

public static void main(String args[])

{

Scanner in = new Scanner(System.in);

int r, sum = 0, temp;

System.out.println("Enter the n value: ");

int n = in.nextInt();

temp = n;

while (n > 0)

{

r = n % 10; n = n / 10;

sum = (sum * 10)+r;

}

System.out.println(sum);

assertTrue(787==sum);

if(temp==sum)

System.out.println(sum+" is palindrome number");

else

System.out.println(sum+" is not palindrome number");

	in.close();

	} 

}
