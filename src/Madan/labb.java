package Madan;

import java.util.Scanner;

public class labb {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("No input");
		}
		System.exit(0);
		int n=Integer.parseInt(args[0]);
		
		if(n<0)
			System.out.println("Invali input");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n*n matrix of A :\n");
		int i,j;
		int [][]a=new int[n][n];
		int [][]b=new int[n][n];
		int [][]c=new int[n][n];
		
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					a[i][j]=s.nextInt();
			
			System.out.println("Enter the elements of matrix A: \n");
			
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
				{
					System.out.println("%3d"+a[i][j]);
				}
				System.out.println();
	
			
	
	System.out.println("Enter n*n matrix of B :\n");
	
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			b[i][j]=s.nextInt();
	
	System.out.println("Enter the elements of matrix B: \n");
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			System.out.println("%3d"+b[i][j]);
		}
		System.out.println();
		
		
	}

}
