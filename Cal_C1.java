package practice_section;
import java.util.Scanner;
public class Cal_C1 {

	 Scanner n = new Scanner(System.in);

	public  void addition() {// addition fuction 
	int sum=0,u,h;
	System.out.println("enter the value");
	u=n.nextInt();
	for(int i=0;i<u;i++) {                                      									
	h=n.nextInt();
	sum=sum+h;
	}
	System.out.println("sum is: "+sum);
	}
	public void subtract() {// substraction function
	int Sub=0,b,j;
	System.out.println("enter the value");
	b=n.nextInt();
	for(int i=0;i<b;i++) {
	j=n.nextInt();
	Sub=Sub-j;
	}

	System.out.println("substraction of number is :"+Sub);
	}
	public void multiplication() {// multiplication function
	int mul1,mul2,Mutiply;
	System.out.println("enter the value of mul1");
	mul1=n.nextInt();
	System.out.println("enter the value of mul2");
	mul2=n.nextInt();
	Mutiply=mul1*mul2;
	System.out.println("the multiplication  is:"+Mutiply);

	}
	public void percentage() {// percentage function 
	int num1,num2,percentage ;
	System.out.println("enter the value of e");
	num1=n.nextInt();
	System.out.println("enter the value of r");
	num2=n.nextInt();
	percentage =num1%num2;
	System.out.println("the percentage is :"+percentage);	
	}
	}
	
	
