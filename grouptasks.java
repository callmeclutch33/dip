package groupTask;

public class grouptasks {

	public static void main(String[] args) {

		
			//task
			
			int [][] nums = {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9},	
			};
			int sum = 0;
			
			for (int [] num:nums) {
				for(int all:num) {
					sum+=all;
				}
				
				System.out.println("total sum of all numbers ="+sum);
			}
			
			
			//task2
			
	int [][] numbers = {
					
					{22, 13, 32, 44, 55},
					{41, 54, 61},
					{71, 88, 92}
						
			};
			
			for (int [] numbs:numbers) {
				for (int num:numbs) {
					if (num%2==0) {
						System.out.println(num);
					}
				}
			}
			System.out.println("=================================");
			//task3 
			 int [][] number = {
						
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9},
							
				};
				
				int total=0;
				int sum1 = 0;
				for(int [] numbs : number) {
					for(int numb : numbs) {
						if (numb%2==0) {
							sum1+=numb;
						}else if (numb%2!=0){
							total+=numb;
						}
						
						
					}
					
				}
				System.out.println("The sum of all even numbers in the array is"+sum1);
				System.out.println("The sum of all odd numbers in the array is "+total);
				
				System.out.println("=======================================");
				//task4
				
				int a=15;
				int b=10;
				int lost;
				lost=a;
				a=b;
				b=lost;
				
				System.out.println("a: "+a);
				System.out.println("b: "+b);
				
				
				System.out.println("=================================");
				
				//task 5
				
				int bot =3;
				boolean prime =true;
				
				for(int i =2; i<bot; i++) {
					
					if (bot%i==0) {
						prime=false;
						break;
					}
				}
				
				if (prime) {
					System.out.println( bot + " is a prime number");
				}
				else {
					System.out.println("not  a prime number ");
				}
				
				System.out.println("===============================");
				
				
				
				///task 6
					
				int num1 = 0, num2 = 1, num3, i, count = 100;
				System.out.print(num1 + " " + num2);// printing 0 and 1
				for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
				{
					num3 = num1 + num2;
					
					num1 = num2;
					num2 = num3;
					System.out.print(" " + num3);
						}

						System.out.println("================================");
						
						//task 7
						int [] numbers1 = {432,24324,343,444,532,6213,7467,8657,960};
						int largest = numbers1[0];
						
						largest = numbers1[0];
						for (int n:numbers1) {
							if (n>largest) {
								largest=n;
							}
						}
						System.out.println(largest);
						int smallest = numbers1[0];
						for (int no:numbers1) {
							if (no<smallest) {
								smallest=no;
							}
						}
				//task8
						int[] array= {5,6,8,9,11,25,36,97,48,95,100};
						int largest1=0;
						int secondLargest=0;
						for(int i1=0; i1<array.length; i1++) {
						//System.out.println(array[i]);
						}
						for(int i1=0; i1<array.length; i1++) {
						if(array[i1]>largest1) {
						secondLargest=largest1;
						largest1=array[i1];
						}else if(array[i1]>secondLargest) {
						secondLargest=array[i1];
						}
						}
						              System.out.println("Second largest number is ="+secondLargest);

						
						
						
					
					
					
			
			


	}

}
