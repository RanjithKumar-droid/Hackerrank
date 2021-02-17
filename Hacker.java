package hackerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Hacker 
{
	Scanner s = new Scanner(System.in);
	// Round off
	
	void Roundoffresult(int mark) {
		Integer or = mark;
		int last = mark%10;
		if(mark<38) {
			System.out.println("Fail");
		}
		if(mark>38) {
		if((last==3) ||(last == 8)) {
			mark+= 2;
			System.out.println("Rounded off value is "+ mark);
		}
			
		if((last==4) ||(last == 9)) {
			mark+= 1;
			System.out.println("Rounded off value is "+mark);
		}
		}
		if((last<3)||((last>5)&&(last<7)))
		{
			System.out.println("Grade is "+or);
		}
	 }
	
	//Plus Minus
	
	void Counting() {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array of Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		float count[] = {0,0,0};
	        for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
		        count[0]++;
//		    System.out.println("Checking count  "+count[0]);
		 }
		if(arr[i]<0) {
			count[1]++;
		}
		if(arr[i]==0) {
			count[2]++;
		}
	}
	System.out.println("Positive: "+(count[0]/arr.length));
	System.out.println("Negative: "+count[1]/arr.length);
	System.out.println("Zero: "+count[2]/arr.length);
	
     }
	
	// Kangaroo
	
	void kangaroo(int x1,int x2,int v1, int v2)
	{
	for(int i=0;i<100;i++) {
		if(x1 + i*v1 == x2+i*v2) {
			System.out.println("yes");
		}
	   }
       }
	
	
	//birthday candles
	
	void bdycandles() {
		int arr[] = {1,4,4,3,5,2};
		int count = 0;
		int max = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>=max) {
				max = arr[i];
				count = 1;
			}
			else if(max == arr[i]){
				count++;
			}	
		}
		System.out.println("The No of candles will off is "+count);
	}
	
	// Stair case (#)
	
	void staircase(int noofsteps) {
		for(int i=0; i<noofsteps; i++) {
			for(int j=noofsteps; j>i+1; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	//[1,3,5,7,9]
	//min = 1+3+5+7
	//max = 3+5+7+9
	void minmax(int noofelements) {
		
		System.out.println("Enter the elements in array");
		int arr[] = new int[noofelements];
		int sum=0;
//		int len = arr.length;
		for(int i=0;i<noofelements;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0;j<noofelements;j++) {
			sum = sum+arr[j];
		}
		int min = sum - arr[noofelements-1];
		int max = sum - arr[0];
		System.out.println("Minsum is: "+min);
		System.out.println("Maxsum is: "+max);
	}
	
	//Diagonal elements sum
	
	void Diagonal(int row, int column) {

		int dummy = column;
		int sum = 0,count=0;
		int arr[][] = new int[row][column];
		System.out.println("Enter the elements");
		
		for(int i=0; i<row; i++) {
			System.out.println();
			for(int j =0; j<column; j++) {
				arr[i][j] = s.nextInt();
			}
		}
	
		for(int i=0; i<row; i++) {
			System.out.println();
			for(int j =0; j<column; j++) {
				if(arr[i]==arr[j]) {
					sum = sum +arr[i][j];
					count = count+arr[i][dummy-1];
					dummy--;
					}
			}
		}
		
		//new approach to sum the diagonal elements in the array
		int len = arr.length;
		//System.out.println("Length: "+len);
		int right = 0,left=0;
		for (int i=0;i<len;i++) {
			right+= arr[i][i];
			left+=arr[i][len-i-1];
		}
		
		System.out.println("Newly coded right: "+right);
		System.out.println("Newly coded left: "+left);
		int diff = Math.abs(sum-count);
		System.out.println("Added value is: "+sum);
		System.out.println("Added left diag: "+count);
		System.out.println("Difference of diagonals is: "+diff);
	}
	
	// Triplets
	
	void Triplets() {
		int bob[] = {92,80,99};
		int alice[] = {82,80,100};
		int total[] = {0,0};
		for(int i=0; i<3; i++) {
		if(bob[i]>alice[i]) {
			total[0]++;
		}
		else if(bob[i]<alice[i]) {
			total[1]++;
		}
		else {
			System.out.println("No points");
		}
		}
		System.out.println(total[0]);
		System.out.println(total[1]);
		if(total[0]>total[1]) {
			System.out.println("Bob wins");
		}
		else
			System.out.println("Alice wins");
	}
	
}
