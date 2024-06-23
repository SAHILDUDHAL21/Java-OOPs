class Sort
{
	void bubble(int a[],int n)
	{
		int i,t,pass;
		for(pass=1;pass<n;pass++)
		{
			for(i=0;i<n-pass;i++)
			{
				if(a[i]>a[i+1])
				{
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}

			}
		}

		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}
	}
	public static void main(String arg[])
	{
		int a[]=new int[20];
		int i,n=arg.length;

		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(arg[i]);
		}
		Sort ob =new Sort();
		System.out.println("Sorting n numbers using bubble sort :: ");
		ob.bubble(a,n);
	}

}