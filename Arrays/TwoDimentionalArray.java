class TwoDimentionalArray
{
	public static void main(String[] args) 
	{
	int a[][]=[3][2];
	a[0][0]=10;
	a[0][1]=20;
	a[1][0]=30;
	a[1][1]=40;
	a[2][0]=50;
	a[2][1]=60;
	for (int i=0;i<a.lenght;i++)
	{
		for(j=0;j<=2;j++)
		{
			System.out.println(" "+a[i][j]);
			}
		System.out.println();
		}
}
