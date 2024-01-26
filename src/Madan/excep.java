package Madan;

import java.util.Scanner;

public class excep {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("NO input");
		}
		System.exit(0);
		
		int n=Integer.parseInt(args[0]);
		if(n<0)
		{
			System.out.println("Invalid input");
		}
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the n*n matrix of A");
		
		int i,j;
		int [][]a=new int[n][n];
		int [][]b=new int[n][n];
		int [][]c=new int[n][n];
		
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		
		System.out.println("Elements of matrix A are: \n");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
			{System.out.printf("%3d",a[i][j]);
		
		System.out.println();
			}
	}
		System.out.println("Enter the n*n matrix of B");
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j]=s.nextInt();
		System.out.println("The elements of matrix B are : \n");
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
			{
				System.out.printf("%3d",b[i][j]);
			}
		System.out.println();
	}
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		
		System.out.println("SUM= \n");
		for(i=0;i<n;i++) 
			for(j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
			{
				System.out.printf("%3d",c[i][j]);
			}
		System.out.println();
	}

}

}