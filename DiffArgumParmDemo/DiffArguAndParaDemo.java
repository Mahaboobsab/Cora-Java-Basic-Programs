class Box
{
int w;
int h;
int d;
Box (int x,int y,int z)
{
	w=x;
	h=y;
	d=z;
}
int volume()
{
	int l=0;
	l=w*h*d;
	return l;
}
}
class Hello
{
void m1()
{
System.out.println("Inside m1");
}
void m2 (int a)
{
	System.out.println("Inside m1");
    System.out.println("value of a is"+a);

}
class DiffArguAndParaDemo
