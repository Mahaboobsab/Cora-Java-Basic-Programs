class ParameterAddMulDemo4
{
	public static void main(String []args)
	{
		int a=10;
		int b=25;
		int c=0;
		System.out.println("value of c befor calling"+c);
		c=add(a,b);
		System.out.println("value of c after calling"+c);
		int f;
		f=mul(a,b);
		System.out.println("value of f after calling"+f);
		}
static int  add(int v,int n)
{
	int z=0;
	z=v+n;
	return z;
	}
static int  mul(int q,int w)
{
	int e=0;
e= q*w;
return e;
}	

}
