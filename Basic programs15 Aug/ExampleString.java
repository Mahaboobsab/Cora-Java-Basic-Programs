public class ExampleString
{
	public static void main(String [] args)
{
	String x="MEHEBOOBSAB";
	System.out.println("Hello"+"  "+x);
	System.out.println(x.toLowerCase());
	System.out.println(x.substring(2));
	System.out.println(x.substring(2,7));
	System.out.println(x.charAt(3));
	String age="37";
	String Salary="45786.77";
	//wrapper classses
	float a=Float.parseFloat(age)+2;
	System.out.println(a);
	double s=Double.parseDouble(Salary)*.15;
	System.out.println(s);
	
	
}
}
 
