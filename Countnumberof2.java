package pattern.matching;
import java.util.*;
public class Countnumberof2 
{
public static void main(String...s)
{
	Countnumberof2 c = new Countnumberof2();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  value of integer:");
	int Integervalue = sc.nextInt();//taking input from user
	c.count(Integervalue);
}
void count(int Integervalue)
{int value = 0;
int number = 0;
if(1<=Integervalue && Integervalue<=100)//our input must lies between 1 to 100,including 1 and 100
{
	for(int i = 0;i<=Integervalue;i++)
	{
		number = 0;
		if(i<10)//if our value is smaller than 10 we need to check only for one digit
		{
		if(i==2)
		{
			value++;
		}
		}
		else//if our value is greater than 10 then we need to check both the digits for 2
		{
			number = this.istwo(i);//calling a function(istwo)which will check both digits whether they are equal to 2 or not
			value+=number;
		}
	}
	System.out.println("the no. of occurance of two are:"+value);}
else// if input doesn't lies between 1 and 100 then it is going to be a invalid output
{
	System.out.println("Invalid input");
}
}
int istwo(int a)
{
	int value= 0;
	int modulos = 0;
     int element = a;
	while(element>0)
	{
		modulos = element%10;
		if(modulos == 2)//if modulos is equal to 2 then it will increment the variable value
		{
			value++;
		}
		element = element/10;
	}
	return value;//return the overall value that we will get depending upon both the digits
}
}
