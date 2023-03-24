// 1) Hello World program

// public class Test{
//     public static void main(String args[]){
//         System.out.println("Hello World");  
//     }
// }



// 2) Variables and Data Types:

// Non-primitiive data types:

// class Test{
//     int x=5;
//     int y=3;
// }

// class Test{
//     public static void main(String args[]){
//         Point p = new Point();
//         System.out.println("Value of x "+p.x+" "+"Value of y "+p.y);
//     }
// }

// class Test{
//     int x;
//     int y;
// }

// class Test{
//     public static void main(String args[]){
//         Point p1 = new Point();
//         System.out.println("Value of x "+p1.x+" "+"Value of y");
//     }
// }


//Swap two numbers:

// class Test{
//     public static void main(String args[]){
//         int x = 10;
//         int y = 30;
//         int temp = 0;
//         temp = x;
//         x = y;
//         y = temp;
//         System.out.println("Value of x : "+x+"\nValue of y : "+y);
//     }
// }


//Wrapper class:

// class Test{
//     public static void main(String args[]){
//         int x1 = 50;
//         Integer x2 = new Integer(13);
//         System.out.println("Value of x1 : "+x1+"\nValue of x2 : "+x2);
//     }
// }


//autoboxing and autounboxing:

//Eg:1
// class Test{
//     public static void main(String args[]){
//         int x1=34;
//         Integer x2=x1;
//         int x3=x2;
//         System.out.println(x1);
//         System.out.println(x3);
//         System.out.println(x3);
//     }
// }

// Eg:2
// class Test{
//     public static void main(String args[]){
//         Integer x1=300,x2=300;
//         int y1=200,y2=200;
//         System.out.println(x1+" "+x2);
//         System.out.println(y1+" "+y2);    
//         if(x1==x2){
//             System.out.println("x1 and x2 are same");
//         }   
//         else{
//             System.out.println("x1 and x2 are not same");
//         }
//         if(y1==y2){
//             System.out.println("y1 and y2 are same");
//         }
//         else{
//             System.out.println("y1 and y2 are not same");
//         }
//     }
// }




//Type conversion:

//Eg:1
//Type conversion from lower data type to higher data type

// class Test{
//     public static void main(String args[]){
//         int x1 = 24;
//         double x2 = x1;
//         System.out.println("Value of x1 : "+x1+"\nValue of x2 : "+x2);
//     }
// }

// Eg:2
// Type conversion from higher data type to lower data type

// class Test{
//     public static void main(String args[]){
//         double x1 = 35.28;
//         int x2 = (int)x1;
//         System.out.println("Value of x1 : "+x1+"\nValue of x2 : "+x2);
//     }
// }




// Input:
// BufferedReader input

// Eg:1

// import java.io.*;

// class Test{
//     public static void main(String args[]) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your name : ");
//         String name = br.readLine();
//         System.out.println("Enter your age : ");
//         int age = Integer.parseInt(br.readLine());
//         System.out.println("\nName : "+name+"\nAge : "+age);    
//     }
// }


// Scanner class input

// Eg:2
// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner obj = new Scanner(System.in);
//         System.out.println("Enter your name : ");
//         String name = obj.next();
//         System.out.println("Hello "+name+"\nEnter your age : ");
//         int age = obj.nextInt();
//         System.out.println("Enter your current CGPA");
//         float cgpa = obj.nextFloat();
//         System.out.println("Name : "+name+"\nAge : "+age+"\nCGPA : "+cgpa);
//     }
// }



//Output:

// Eg:1

// class Test{
//     public static void main(String args[]){
//         String name1 = "Nathis";
//         String name2 = "Hello";
//         char name3 = 'I';
//         int age = 20;
//         System.out.print(name1);
//         System.out.println(name2);
//         System.out.print(name3);
//         System.out.print(age);
//     }
// }

// Eg:2

// class Test{
//     public static void main(String args[]){
//         int age1 = 30;
//         int age2 = 34;
//         int age3 = 40;
//         System.out.format("Age is %d. You are eligible for voting",age1);
//         System.out.format("\nAge1 is %d,Age2 is %d,Age3 is %d",age1,age2,age3);
//         double pi1 = Math.PI;
//         System.out.format("\nValue of pi is %f",pi1);
//         System.out.format("\nValue of pi is %.2f",pi1);
//         System.out.format("\nValue of pi is %6.2f",pi1);
//         System.out.format("\nValue of pi is %06.2f",pi1);
//     }
// }




// Escape sequence:

// Eg:1

// class Test{
//     public static void main(String args[]){
//         System.out.println("Hello Guys \"How\" are you?");
//         System.out.println("Hello Guys \nHow are you?");
//         System.out.println("Hello Guys \tHow are you?");
//         System.out.println("Hello Guys \\How are you?");
//         System.out.println("Hello Guys 'How are' you?");
//         System.out.println("C:\\xyz\\abc.txt");
//     }
// }




// Operators:

// Arithmeetic operators:

// Eg:1

// class Test{
//     public static void main(String args[]){
//         int x = 20, y = 40, z = 50;
//         System.out.println(x+y);
//         System.out.println(x*y);
//         System.out.println(x+(y*z));
//         System.out.println(x*y+z);
//         System.out.println(x+y*z);
//         System.out.println(y/x);
//         System.out.println(y%x);
//         System.out.println(x++);
//         System.out.println(x);
//         System.out.println(++y);
//         System.out.println(x+=5);
//         System.out.println(x-=5);
//         System.out.println(x*=5);
//         System.out.println(x/=5);
//         System.out.println(y%=x);
//     }
// }

// Logical operators:
// Eg:1

// class Test{
//     public static void main(String args[]){
//         int x=10,y=20;
//         if(x!=y){
//             System.out.println("x and y are not same");
//         }
//         System.out.println(x==10 && y==10);
//         System.out.println(x==10 && y==20);
//         System.out.println(x==20 && y==10);
//         System.out.println(x==20 && y==20);
//         System.out.println(x==10 || y==10);
//         System.out.println(x==10 || y==20);
//         System.out.println(x==20 || y==20);
//         System.out.println(x==20 || y==10);
//     }
// }




// Bitwise operators:

// class Test{
//     public static void main(String args[]){
//         int x=6,y=9;    
//         System.out.println("Bitwise AND value : "+(x&y));
//         System.out.println("Bitwise OR value : "+(x|y));
//         System.out.println("Bitwise XOR value : "+(x^y));       
//     }
// }

//Right shift:

// class Test{
//     public static void main(String args[]){
//         int x=33,y = -3;
//         System.out.println(x>>2);
//         System.out.println(y>>>1);
//     }
// }



//Sum of N natural numbers:

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number : ");
//         int n = sc.nextInt();
//         int sum = (n*(n+1))/2;
//         System.out.format("Sum of %d natural number is %d",n,sum);
//     }
// }



// Find last digit of a number:

// Eg:1

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any integer : ");
//         int n = Math.abs(sc.nextInt());
//         int sum = n%10;
//         System.out.println("Last digit from given input is : "+ sum);
//     }
// }



// Days before N days:

// full code is not written.only the logic is written.

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Select the number of a day : ");
//         int d = sc.nextInt();
//         System.out.print("Choose the which is before the actual day : ");
//         int n = sc.nextInt();
//         int x = n%7;
//         int res = d-x;
//         if(res>0){
//             System.out.format("The day(%d) before actual day(%d) is : %d",n,d,res);
//         }
//         else{
//             System.out.format("The day(%d) before actual day(%d) is : %d",n,d,res+7);
//         }
//     }
// }


// if-else:
// (Positive even
// Positive odd
// Negative even
// Negative odd
// Zero):

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n<0){
//             if(n%2==0){
//                 System.out.println("Given number is Negative even");
//             }
//             else{
//                 System.out.println("Given number is Negative odd");
//             }
//         }
//         else if(n>0){
//             if(n%2==0){
//                 System.out.println("Given number is Positive even");
//             }
//             else{
//                 System.out.println("Given number is Positive odd");
//             }
//         }
//         else{
//             System.out.println("Given number is Zero");
//         }
//     }   
// }




// Switch:

// Eg:1

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string : ");
//         String str = sc.next();
//         switch(str){
//             case "left":
//                 System.out.println("Left");
//                 break;
//             case "right":
//                 System.out.println("Right");
//                 break;
//             case "top":
//                 System.out.println("Top");
//                 break;
//             case "bottom":
//                 System.out.println("Bottom");
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
//     }
// }



// Largest of 3 numbers:

// import  java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3 integers : ");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int z = sc.nextInt();
//         if(x>y && x>z){
//             System.out.println("Largest of 3 numbers is : "+x);
//         }
//         else if(y>x && y>z){
//             System.out.println("Largest of 3 numbers is : "+y);  
//         }
//         else{
//             System.out.println("Largest of 3 numbers is : "+z);          
//         }
//     }
// }



// Leap year:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year : ");
//         int num = sc.nextInt();
//         if(num%4==0 && num%100!=0){
//             System.out.println("Yes");
//         }

//         else if(num%400==0){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
//     }
// }



// Calculator:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number : ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter 2nd number : ");     
//         int num2 = sc.nextInt();
//         System.out.print("Enter an operation : ");
//         String opn = sc.next();
//         int res = 0;
//         switch(opn){
//             case "add":
//                 res = num1+num2;
//                 System.out.println("Result for an operation : "+res);
//                 break;
//             case "sub":
//                 res = num1-num2;
//                 System.out.println("Result for an operation : "+res);
//                 break;
//             case "mul":
//                 res = num1*num2;
//                 System.out.println("Result for an operation : "+res);
//                 break;
//             case "div":
//                 res = num1/num2;
//                 System.out.println("Result for an operation : "+res);
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
//     }
// }



// loop  statements:

// for loop:

// class Test{
//     public static void main(String args[]){
//         for(int i=0;i<8;i++){
//             System.out.println("GeeksForGeeks");
//         }
//     }
// }



// while loop:

// class Test{
//     public static void main(String args[]){
//         int x = 0;
//         while(x<10){
//             System.out.format("x value is %d\n",x);
//             x++;
//         }		
//     }
// }



// do while:

// class Test{
//     public static void main(String args[]){
//         int	x = 0;
//         do{
//             System.out.println(x);
//             x++;
//         } 	
//         while(x<10);    
//     }
// }



// continue:

// Eg:1

// class Test{
//     public static void main(String args[]){
//         int x = 0;
//         while(x<10){
//             if(x==5){
//                 x++;
//                 continue;
//             }
//             System.out.println("Value of x is : "+x);
//             x++;
//         }
//     }
// }

// Eg:2

// class Test{
//     public static void main(String args[]){
//         int x = 0;
//         while(x<10){
//             if(x==5){
//                 break;
//             }
//             System.out.println("Value of x is : "+x);
//             x++;
//         }	
//     }
// }

// Eg:3

// class Test{
//     public static void main(String args[]){
//     	int i=0;
//         while(i<5){
//             i++;
//             System.out.println("Before"+i);
//             if(i==2||i==4){
//                 continue;
//             }
//             System.out.println("After"+i);
//         }
//     }
// }

// Eg:4

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	for(int i=0;i<3;i++)
//         {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter  the value of x : ");
//             int x = sc.nextInt();
//             System.out.print("Enter the value  of y : ");
//             int y = sc.nextInt();
//             if(y==0)
//                  continue;
//             System.out.println(x/y);
//         }
//     }
// }

// Eg:5

// class Test{
//     public static void main(String args[]){
//     	for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 if(j==1){
//                     break;
//                 }
//                 System.out.println("Value of j is : "+j);
//             }
//         }
//     }
// }



// Count digits:

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the integer : ");
//         int num = sc.nextInt();
//         int count = 0;
//         while(num>0){
//             num /= 10;
//             count++;
//         }
//         System.out.println("Length of the given integer is : "+count);
//     }
// }



// Table of a number:

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i=1;
//         while(i<=10){
//             int res = i*n;
//             System.out.format("%d's multiple of %d is : %d\n",i,n,res);
//             i++;
//         }
//     }
// }



// Square patter printing
// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i = 1;
//         while(i<=n){
//             int j=1;
//             while(j<=n){
//                 System.out.print("*");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }



// Triangle Pattern printing:

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i = 1;
//         while(i<=n){
//             int j=1;
//             while(j<=i){
//                 System.out.print("*");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }



// pyramid pattern printing:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i*2-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Factorial of a number:

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int var1 = 1;
//         while(n>0){
//             var1 = var1*n;
//             n--;
//         }
//         System.out.println(var1);
//     }
// }



// GCD of  2 numbers:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number : ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter 2nd number : ");
//         int n2 = sc.nextInt();
//         int div=0;
//         int min = Math.min(n1,n2);
//         int i = 1;
//         while(i<=min){
//             if(n1%i==0 && n2%i==0){
//                 div = i;
//             }
//             i++;
//         }
//         System.out.println("Greatest common divisor of 2 numbers is : "+div);
//     }
// }



// LCM of 2 numbers:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc =new Scanner(System.in);
//         System.out.print("Enter 1st number : ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter 2nd number : ");
//         int n2 = sc.nextInt();
//         int mulmax = n1*n2;
//         int max = Math.max(n1,n2);
//         int i = max;
//         int lcm = mulmax;
//         while(i<mulmax){
//             if(i%n1==0 && i%n2==0){
//                 lcm = i;
//                 break;
//             }            
//             i++;
//         }
//         System.out.println("LCM of 2 numbers is : "+lcm);
//     }
// }



// All divisors of a number:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i = 1;
//         System.out.print("Divisors of a number are : ");
//         while(i<=n){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }
//             i++;
//         }
//     }
// }



// Check for Prime number:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i = 2;
//         int flag = 1;
//         while(i<n){
//             if(n%i==0){
//                 flag = 0;
//                 break;
//             }
//             i++;
//         }
//         if(flag==1){
//             System.out.println("Given number is prime number");
//         }
//         else{
//             System.out.println("Given number is not a Prime number");
//         }
//     }
// }



// Fibonacci numbers:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int a=1,b=1;
//         if(n==0){
//             System.out.println("Fibonacci series : "+a);
//         }
//         else if(n==1){
//             System.out.println("Fibonacci series : "+a+" "+b);
//         }
//         else{
//             System.out.print("Fibonacci series : "+a+" "+b+" ");
//             for(int i= 2;i<=n;i++){
//                 int c=a+b;
//                 System.out.print(c+" ");
//                 a=b;
//                 b=c;
//             }
//         }
//     }
// }



// Function:

// Eg:1


// class demo1{
//     public void demo2(){
//         System.out.println("Inside demo2");
//     }

//     public static void demo3(){
//         System.out.println("Inside demo3");
//     }
// }

// class demo4{
//     public int demo5(int x,int y){
//         return x+y;
//     }
//     public int demo6(){
//         int a = 46;
//         int b = 54;
//         return a+b;
//     }
// }

// class Test{
//         public static void main(String args[]){
//         demo1 d1 = new demo1();
//         d1.demo2();
//         d1.demo3();
//         System.out.println("Inside main");

//         fun1();

//         fun2();

//         demo4 d4 = new demo4();

//         int x = 10;
//         int y = 20;
//         int z = d4.demo5(x,y);
//         System.out.println(z);

//         int c =  d4.demo6();   
//         System.out.println(c);    

        
//     }

//     public static void fun1(){
//         System.out.println("Inside fun1");
//     }

//     public static void fun2(){
//         System.out.println("Inside fun2");
//     }
// }



// Eg:2

// class demo1{
//     public int sum(int x,int y){
//        return x+y;
//     }
// }

// class Test{
//     public static void main(String args[]){
//         demo1 d1 = new demo1();
//         int x = 10;
//         int y = 20;
//         int sum = d1.sum(x,y); 
//         System.out.println(sum);
//     }
// }



// First digit of a number:

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         while(n>=10){
//             n = n/10;
//         }
//         System.out.println("First digit of a number is : "+n);
//     }
// }



// Prime factorization:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         int i = 2;
//         System.out.print("Prime factors are : ");
//         while(i<n){
//             while(n%i==0){
//                 System.out.print(i+" ");
//                 n = n/i;
//             }
//             i++;
//         }
//         if(n>2){
//             System.out.println(n);
//         }
//     }
// }



// Array:

// Eg:1
// 1d array:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//     	int a[] = new int[5];
//         for(int i=0;i<a.length;i++){
//             a[i] = sc.nextInt();
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }



// Eg:2
// 1d array:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");  
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter an array : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int j=0;j<arr.length;j++){
//             System.out.print(arr[j]+" ");   
//         }
//     }
// }



// Eg:3
// 2d array:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number of rows : ");
//         int m = sc.nextInt();
//         System.out.print("Enter a number of columns : ");    
//         int n = sc.nextInt();
//         int arr[][] = new int[m][n];
//         System.out.print("Enter an 2d array : ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("2d array of an elements are : ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println(" ");
//         }
//     }
// }



// Check if array is sorted:

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();    
//         int arr[] = new int[n];
//         System.out.println("Enter an array elements : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int flag = 0;
//         for(int i=1;i<n;i++){
//             if(arr[i]<arr[i-1]){
//                 flag = 0;
//                 break;
//             }
//             flag = 1;
//         }
//         if(flag == 1){
//             System.out.println("Given array is a sorted array");
//         }
//         else{
//             System.out.println("Given array is an unsorted array");
//         }
//     }
// }



// Count distinct elements:

// import java.util.Scanner;

// class DistinctElement{
//     public int distinct(int arr[],int n){
//         int count = 0;
//         for(int i=0;i<n;i++){
//             int flag = 1;
//             for(int j=i-1;j>=0;j--){
//                 if(arr[i]==arr[j]){
//                     flag=0;
//                     break;
//                 }
//             }
//             if(flag==1){
//                 count++;
//             } 
//         }
//         return count;
//     }
// }

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         System.out.println("Enter an array : ");
//         int arr[] = new int[n];
//         // Creating an array of elements
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
       
//         // Creating object and calling the distinctelement class\
//         DistinctElement de = new DistinctElement();
//         int count = de.distinct(arr,n);
//         System.out.print("Total distinct elements are : "+  count);  
//     }
// }



// Find average   

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for(int j=0;j<n;j++){
//             sum = sum+arr[j];
//         }
//         System.out.println("Average of array elements : "+sum/n);
//     }
// }


 
//  Strings:

// Eg:1

// From the below program str1 & str2 are immutable types
// str3 & str4 are mutable types

// class Test{
//     public static void main(String args[]){
//         String str1 = "geeks";
//         System.out.println("Str1 data : "+str1);

//         String str2 = new String("geeks");
//         System.out.println("Str2 data : "+str2);

//         //creating a string buffer object
//         StringBuffer str3 = new StringBuffer("geeks");
//         System.out.println("Str3 data : "+str3);

//         // creating a string builder object
//         StringBuilder str4 = new StringBuilder("geeks");
//         System.out.println("Str4 data : "+str4);

//         if(str1 == str2){
//             System.out.println("Str1 & Str2 are true");
//         }
//         else{
//             System.out.println("Str1 & Str2 are false");
//         }
//     }
// } 
// we can't compare mutable and immutable string types



// Eg:2

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);

//         String str1 = sc.next();
//         System.out.println("\n"+str1);

//         String str2 = new String("geeks");
//         System.out.println(str2+"\n");

//         //creating a string buffer object
//         StringBuffer sb = new StringBuffer();
//         //getting string buffer input 
//         String str3 = sc.next();
//         System.out.println("\n"+str3);
//     }
// } 



// Eg:3

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         String str1 = sc.next();
//         System.out.println(str1);
//         System.out.println(str1.length());
//         System.out.println(str1.charAt(2));
//         System.out.println(str1.substring(2));
//         System.out.println(str1.substring(2,4));
//     }
// }



// Eg:4

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//     	Scanner sc = new Scanner(System.in);
//         String str1 = new String(sc.next());
//         String str2 = new String(sc.next());
//         if(str1 == str2){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }

//         String str3 = sc.next();
//         String str4 = sc.next();
//         if(str3 == str4){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }
//     }
// }



// Eg:5

// Here in java,string is case senitive

// class Test{
//     public static void main(String args[]){
//     	String str1 = "GeeksforGeeks";
//         String str2 = "Geeks";
//         String str3 = "geeks";
//         String str4 = "GeeksforGeeks";
//         String str5 = "GeeksforGeeksJava";
//         String str6 = "for";
//         String str7 = "gor";

//         System.out.println(str1.contains(str2));
//         System.out.println(str1.contains(str3));     

//         System.out.println(str1.compareTo(str2));
//         System.out.println(str1.compareTo(str4));
//         System.out.println(str1.compareTo(str5));       

//         System.out.println(str1.indexOf(str6));  
//         System.out.println(str1.indexOf(str7));
//         System.out.println(str1.indexOf(str2));
//         System.out.println(str1.indexOf(str2,1));
//         System.out.println(str1.indexOf(str3));
//     }
// }



// String operations:

// Eg:1

// 1.equals ignore case:
// 2.uppercase:

// import java.util.Scanner; 

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.next();
//         String str2 = sc.next();
//         System.out.println("Given 2 strings are equal : "+str1.equalsIgnoreCase(str2));
//         System.out.println("Converting string1 to uppercase : "+str1.toUpperCase());
//         System.out.println("Print string1 from & to a particular index : "+str1.substring(1,5));
//     }
// }



// Stringbuilder and Stringbuffer:

// Eg:1

// normal string type - which is immutable

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string1 input : ");
//         String str1 = sc.next();
//         System.out.println("String1 : "+str1);	
//         String str2 = str1;
//         System.out.println("String2 : "+str2);	
//         System.out.print("Enter a string to concat with string1 : ");
//         str1 = str1.concat(sc.next());
//         System.out.println("String1 after making changes : "+str1);
//         System.out.println("String2 after making changes : "+str2);
//     }
// }



// Eg:2

// string buffer - which is mutable

// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string1 input : ");		
//         StringBuffer str1 = new StringBuffer(sc.next());
//         StringBuffer str2 = str1;
//         System.out.println("String1 : "+str1);
//         System.out.println("String2 : "+str2);
//         System.out.print("Enter a string to concat with string1 : ");
//         str1 = str1.append(sc.next());
//         System.out.println("String1 after making changes : "+str1);
//         System.out.println("String2 after making changes : "+str2);
//     }
// }



// Panagram checking

//import java.util.Scanner;
//
//class isPanagram{
//    boolean panagram(String str){
//        int n = str.length();
//        if(n<26){
//            return false;
//        }
//        boolean visited[] = new boolean[26];
//        for(int i=0;i<n;i++){
//            char k = str.charAt(i);
//            if(k>='a' && k<='z'){
//                visited[k-'a'] = true;
//            }
//            if(k>='A' && k<='Z'){
//                visited[k-'A'] = true;
//            }
//        }
//        for(int i=0;i<26;i++){	
//            if(visited[i] == false){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//class Test{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        isPanagram pg = new isPanagram();
//        String str = sc.nextLine();
//        System.out.println(pg.panagram(str));		
//    }
//}



//Find one extra character:

//import java.util.Scanner;
//import java.util.Arrays;
//
//class Extra_char
//{ 
//	char isExtra_char(String str1,String str2){
//		char arr1[] = str1.toCharArray();
//		Arrays.sort(arr1);
// 		char arr2[] = str2.toCharArray();
// 		Arrays.sort(arr2);
// 		int n = str1.length();
// 		for(int i=0;i<n;i++){
// 			if(arr1[i]!=arr2[i]){
// 				return arr2[i]; 
// 			}
// 		}
// 		return arr2[n];
// 	}
// }
//
//class Test
//{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String str1 = new String(sc.nextLine());
//		String str2 = new String(sc.nextLine());
//		Extra_char ec = new Extra_char();
//		System.out.println(ec.isExtra_char(str1,str2));
//	}
//}



// Check for Anagram:

//import java.util.Scanner;
//import java.util.Arrays;
//
//class Anagram
//{
//	boolean isanagram(String str1,String str2){
//		if(str1.length() == str2.length()){	  
//			char arr1[] = str1.toCharArray();
//			char arr2[] = str2.toCharArray();
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);
//			for(int i=0;i<str1.length();i++){
//				if(arr1[i] != arr2[i]){
//					return false;
//				}
//				return true;
//			}
//		}
//		else{
//			return false;
//		}
//	}
//}
//
//class Test
//{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String str1 = new String(sc.nextLine());
//		String str2 = new String(sc.nextLine());
//		Anagram ag = new Anagram();
//		System.out.println(ag.isanagram(str1,str2));
//	}
//}



//Eg:2

//import java.io.*;
//import java.util.Scanner;
//
//class Anagram{
//	boolean isAnagram(String str1,String str2){
//		int char_limit = 256;
//		int arr[] = new int[char_limit];
//		if(str1.length() == str2.length()){
//			for(int i=0;i<str1.length();i++){
//				arr[str1.charAt(i)]++;
//				arr[str2.charAt(i)]--;
//			}
//			for(int i=0;i<str1.length();i++){
//				if(arr[i] != 0){
//					return false;
//				}
//			}
//			return true;
//		}
//		else{
//			return false;
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String str1 = new String(sc.nextLine());
//		String str2 = new String(sc.nextLine());
//		Anagram ag = new Anagram();
//		System.out.println(ag.isAnagram(str1,str2));
//	}
//}	



//<!-- Check for Palindrome -->

//import java.util.Scanner;
//
//class Palindrome{
//	boolean isPalindrome(String str1){
//		char arr[] = str1.toCharArray();
//		int array_length = arr.length;
//		int start = 0;
//		int end = array_length-1;
//		if(array_length == 1){
//			return true;
//		}
//		else{
//			while(start<end){
//				if(arr[start] != arr[end]){
//					return false;
//				}
//				else{
//	   				start++;
//					end--;
//				}
//			}
//			return true;		
//		}
//	}
//}
//
//class Test{
//	public static void main(String [] args){
//		Scanner sc = new Scanner(System.in);
//		String str1 = new String(sc.nextLine());
//		Palindrome pd = new Palindrome();
//		System.out.println(pd.isPalindrome(str1));
//	}
//}	



//Eg:2

//import java.util.Scanner;
//
//class Palindrome{
//	boolean isPalindrome(String input_str){
//		int start = 0;
//		int end = input_str.length()-1;
//		if(input_str.length()==1){
//			return true;
//		}
//		else{
//			while(start<end){
//				if(input_str.charAt(start) != input_str.charAt(end)){
//					return false;
//				}
//				start++;
//				end--;
//			}
//			return true;
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String input_str = new String(sc.nextLine());
//		Palindrome pd = new Palindrome();
//		System.out.println(pd.isPalindrome(input_str));
//	}
//}



//<!-- Reverse a string -->

//import java.util.Scanner;
//
//class Reverse{
//	String make_Reverse(String input_str){
//		String reverse_str = "";
//		int start = input_str.length()-1;
//		while(start>=0){
//			reverse_str = reverse_str+input_str.charAt(start);
//			start--;
//		}
//		return reverse_str;
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String input_str = new String(sc.nextLine());
//		Reverse rs = new Reverse();
//		System.out.println(rs.make_Reverse(input_str));
//	}
//}



//<!-- Classes and objects -->
// Constructors

// import java.util.Scanner;

// class Maths{
// 	int x,y;
// 	int default_const(){
// 		System.out.println(x+" "+y);
// 		return 0;
// 	}
// 	Maths(){
// 		int add1 = 100;
// 		int add2 = 200;
// 		int sum = add1 + add2;
// 		System.out.println(sum);
// 	}
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);		
// 		Maths mt = new Maths();
// 		mt.default_const();
// 	}
// }



// This reference:

// Eg:1

// import java.util.Scanner;

// class Maths{
// 	int add1=24,add2=34;
	
// 	void addition1(){
// 		System.out.println(add1+add2);
// 	}

// 	void addition2(int add1,int add2){
// 		this.add1 = add1;
// 		this.add2 = add2;
// 		System.out.println(add1+add2);
// 	}

// 	void addition3(){
// 		System.out.println(add1+add2);
// 	}	
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);
// 		int add1 = sc.nextInt();
// 		int add2 = sc.nextInt();
// 		Maths mt1 = new Maths();
// 		mt1.addition1();
// 		Maths mt2 = new Maths();
// 		mt2.addition2(add1,add2);
// 		mt2.addition3();
// 	}
// }



// Static member:

// Eg:1

// import java.util.Scanner;

// class Students{
// 	static int roll_no = 101;
// 	void student_details(String student_name){
// 		// this.roll_no = roll_no;
// 		System.out.println(roll_no+" "+student_name);
// 		roll_no++;
// 	}
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);
// 		int limit = sc.nextInt();
// 		Students sd = new Students();
// 		while(limit>0){
// 			String student_name = new String(sc.nextLine());
// 			sd.student_details(student_name);
// 			limit--;
// 		}
// 	}
// }



// Eg:2

//import java.util.Scanner;
//
//class {
//
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		
//	}
//}



//import java.util.Scanner;
//
//class Solution
//{
//    void subarraySum(int[] arr, int n, int s) 
//    {
//        for(int i=0;i<n-1;i++){
//			int sum = arr[i];
//            int j=i+1;
//            while(sum<s){
//                sum=sum+arr[j];
//                if(j<n){
//					j++;
//				}
//            }
//            if(sum==0){
//                System.out.printf("%d %d",i,j);
//                return;
//            }
//        }
//        return;
//    }
//}
//
//class Test{
//	public static void main(String[] args){
//		int n=5;
//		int s=12;
//		int arr[]={1,2,3,7,5};
//		Solution st = new Solution();
//		st.subarraySum(arr,n,s);
//	}
//}



// ArrayList:

//Eg:1

//import java.util.Scanner;
//import java.util.ArrayList;	
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++){
//			al.add(sc.nextInt());
//		}
//		System.out.println(al);
//		System.out.println(al.contains(55));
//		al.remove(4);
//		System.out.println(al);
//		System.out.println(al.add(654));
//		al.set(1,44);
//		System.out.println(al);
//		System.out.println(al.get(4));
//		System.out.println(al.indexOf(44));
//		System.out.println(al.lastIndexOf(44));	
//		System.out.println(al.isEmpty());
//	}
//}

//Eg:2

//import java.util.Scanner;
//import java.util.ArrayList;	
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> al = new ArrayList<String>();
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++){
//			al.add(sc.nextLine());
//		}
//		System.out.println(al);
//		System.out.println(al.contains("vimal"));
//		al.remove(4);
//		System.out.println(al);
//		System.out.println(al.add("vikash"));
//		al.set(1,"nabb");
//		System.out.println(al);
//		System.out.println(al.get(4));
//		System.out.println(al.indexOf("vikash"));
//
//	}
//}



//import java.util.Scanner;
//
//class reverseString{
//	String reverse(StringBuffer str){
//		int 
//	}
//}
//
//class Test{
//	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		reverse rv = new reverse();
//		StringBuffer str = new StringBuffer(sc.nextLine());
//		rv.reverse(str);



//<!-- Smaller elements -->

//import java.util.Scanner;
//import  java.util.ArrayList;
//
//class smallerelements{
//	ArrayList<Integer> issmaller(Integer al,int n,int k){
//		int start=0;
//		int index=0;
//		ArrayList<Integer> bl = new ArrayList<Integer>();
//		while(start<n){
//			if(al.get(start)<k){
//				bl.set(index)=al.get(start);
//				index++;
//			}
//			start++;
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		for(int i=0;i<n;i++){
//			al.add(sc.nextInt());
//		}
//		smallerelements se = new smallerelements();
//		
//	}
//}



//<!-- Bubble sort -->

//import java.util.Scanner;
//import java.util.Arrays;
//
//class sort{
//	void bubblesort(int arr[],int n){
//		for(int i=0;i<n-1;i++){
//			for(int j=0;j<n-i-1;j++){
//				if(arr[j]>arr[j+1]){
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		for(int i=0;i<n;i++){
//			System.out.println(arr[i]);
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		sort st = new sort();
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for(int i=0;i<n;i++){
//			arr[i] = sc.nextInt();
//		}
//		st.bubblesort(arr,n);
//	}
//}



//<!-- Linear search -->

//import java.util.Scanner;
//
//class linear_search{
//	void issearch(int arr[],int n,int k){
//		for(int i=0;i<n;i++){
//			if(arr[i]==k){
//				System.out.printf("The given element %d is found in index %d\n",k,i);
//			}
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++){
//			arr[i]=sc.nextInt();
//		}
//		int k=sc.nextInt();
//		linear_search ls = new linear_search();
//		ls.issearch(arr,n,k);
//	}
//}



// <!-- HashSet -->

//import java.util.Scanner;
//import java.util.HashSet;
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		HashSet<String> hs = new HashSet<String>();
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++){
//			hs.add(sc.nextLine());
//		}
//		for(var s:hs){
//			System.out.println(s);
//		}
//		System.out.println(hs);
//		hs.remove(sc.nextLine());
//		System.out.println(hs);
//		System.out.println(hs.contains(sc.nextLine()));
//		System.out.println(hs.size());
//		System.out.println(hs.isEmpty());
// 	}
//}	



//<!-- Count distinct elements using HashSet -->

//import java.util.Scanner;
//import java.util.HashSet;
//
//class distinct{
//	int isdistinct(int arr[]){
//		int size=arr.length;
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int i=0;i<size;i++){
//			hs.add(arr[i]);
//		}
//		int res=hs.size();
//		return res;
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++){
//			arr[i]=sc.nextInt();
//		}
//		distinct dt=new distinct();
//		System.out.println(dt.isdistinct(arr));
//	}
//}



//<!-- hashmap -->

// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;

// class hashmap{
// 	void hash(){
// 		HashMap <Integer,Integer> hm=new HashMap<>();
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		for(int i=0;i<n;i++){
// 			Integer a=sc.nextInt();
// 			Integer b=sc.nextInt();
// 			hm.put(a,b);
// 		}
// 		for(Map.Entry<Integer,Integer> s:hm.entrySet()){
// 			System.out.println(s.getkey()+" "+s.getvalue());
// 		}
// 	}
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc=new Scanner(System.in);
// 		hashmap hm=new hashmap();
// 		hm.hash();
// 	}
// }



//<!-- Frequencies of array elements - Naive solution -->
//Eg:1

//import java.util.Scanner;
//
//class frequencies{
//	void isfrequencies(int arr[]){
//		int n=arr.length;
//		for(int i=0;i<n;i++){
//			int flag=0;
//			int count=1;
//			for(int j=i+1;j<n;j++){
//				if(arr[j]==arr[i])
//					count++;
//			}
//			for(int k=i-1;k>=0;k--){
//				if(arr[k]==arr[i])
//					 flag=1;
//			}
//			if(flag==0)
//				System.out.println(arr[i]+" "+count);
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++){
//			arr[i]=sc.nextInt();
//		}
//		frequencies dt=new frequencies();
//		dt.isfrequencies(arr);
//	}
//}



//<!-- Eg:2 using HashMap -->

// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;

// class frequencies{
//     void isfrequencies(int arr[]){
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(var x:arr){
//             hm.put(x,hm.getOrDefault(x,0)+1);
//         }
//         for(Map.Entry<Integer,Integer> s:hm.entrySet()){
//             System.out.println(s.getKey()+" "+s.getValue());
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         frequencies fq=new frequencies();
//         fq.isfrequencies(arr);
//     }
// }



// <!-- Intersection of two arrays -->

// Eg:1 - Naive solution:

// import java.util.Scanner;

// class intersection{
// 	void isintersection(int a[],int a_n,int b[],int b_n){
//         System.out.print("Intersect elements are : ");
// 		for(int i=0;i<a_n;i++){
//             int flag=0;
// 			for(int j=i-1;j>=0;j--){
// 				if(a[i]==a[j]){
//                     flag=1;
// 					break;
//                 }
// 			}
//             if(flag==0){
//                 for(int k=0;k<b_n;k++){
//                     if(a[i]==b[k]){
//                         System.out.print(b[k]+" ");
//                         break;
//                     }
//                 }
//             }
// 		}
// 	}
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the 1st array length : ");
// 		int a_n=sc.nextInt();
//         System.out.print("Enter the 2nd array length : ");
//      	int b_n=sc.nextInt();
// 		int a[]=new int[a_n];
//         int b[]=new int[b_n];
//         System.out.println("Enter the 1st array : ");   
// 		for(int i=0;i<a_n;i++){
// 			a[i]=sc.nextInt();
// 		}
//         System.out.println("Enter the 2nd array : ");
//         for(int i=0;i<b_n;i++){
//             b[i]=sc.nextInt();
//         }
// 		intersection dt=new intersection();
// 		dt.isintersection(a,a_n,b,b_n);
// 	}

// }



// Eg:2 - HashSet:

// import java.util.Scanner;
// import java.util.HashSet;

// class intersection{
// 	void isintersection(int a[],int a_n,int b[],int b_n){
//         HashSet<Integer> hs=new HashSet<>();
//         System.out.print("Intersect elements are : ");
//         for(int i=0;i<a_n;i++){
//             for(int j=0;j<b_n;j++){
//                 if(a[i]==b[j]){
//                     hs.add(b[j]);
//                     break;
//                 }
//             }
//         }
//         for(var s:hs){
//             System.out.print(s+" ");
//         }
// 	}
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the 1st array length : ");
// 		int a_n=sc.nextInt();
//         System.out.print("Enter the 2nd array length : ");
//      	int b_n=sc.nextInt();
// 		int a[]=new int[a_n];
//         int b[]=new int[b_n];
//         System.out.println("Enter the 1st array : ");   
// 		for(int i=0;i<a_n;i++){
// 			a[i]=sc.nextInt();
// 		}
//         System.out.println("Enter the 2nd array : ");
//         for(int i=0;i<b_n;i++){
//             b[i]=sc.nextInt();
//         }
// 		intersection dt=new intersection();
// 		dt.isintersection(a,a_n,b,b_n);
// 	}

// }



// <!-- Union of two arrays -->
// Eg:2

// import java.util.Scanner;

// class union{
//     void isunion(int a[],int a_n,int b[],int b_n){
//         for
//     }
// }

// class Test{
// 	public static void main(String[] args){
// 		Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the 1st array length : ");
// 		int a_n=sc.nextInt();
//         System.out.print("Enter the 2nd array length : ");
//      	int b_n=sc.nextInt();
// 		int a[]=new int[a_n];
//         int b[]=new int[b_n];
//         System.out.println("Enter the 1st array : ");   
// 		for(int i=0;i<a_n;i++){
// 			a[i]=sc.nextInt();
// 		}
//         System.out.println("Enter the 2nd array : ");
//         for(int i=0;i<b_n;i++){
//             b[i]=sc.nextInt();
//         }
// 		union dt=new union();
// 		dt.isunion(a,a_n,b,b_n);
// 	}

// }



// <!-- Simple implementation of linked list -->
// Eg:1

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Print{
//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=new Node(sc.nextInt());
//         Node temp1=new Node(sc.nextInt());
//         Node temp2=new Node(sc.nextInt());
//         Node temp3=new Node(sc.nextInt());
//         head.next=temp1;
//         temp1.next=temp2;
//         temp2.next=temp3;

//         Print pt=new Print();
//         pt.printlist(head);
//     }
// }



// Eg:2

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=new Node(sc.nextInt());
//         Node second=new Node(sc.nextInt());
//         Node third=new Node(sc.nextInt());
//         head.next=second;
//         second.next=third;
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- Insert all nodes at beginning -->

// Eg:1

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){    
//         data=x;
//         next=null;
//     }
// }

// class print{

//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class insertbeg{
//     Node isinsbeg(Node head,int x){
//         Node temp=new Node(x);
//         temp.next=head;
//         return temp;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         insertbeg ib=new insertbeg();
//         int n=sc.nextInt();
//         while(n!=0){
//             head=ib.isinsbeg(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- Insert all nodes at end -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- delete first node -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){    
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class deletebeg{
//     Node delete(Node head){
//         if(head==null){
//             return null;
//         }
//         head=head.next;
//         return head;
//     }
// }

// class print{

//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }


// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);
//         deletebeg db=new deletebeg();
//         head=db.delete(head);
//         System.out.println();
//         pt.printlist(head);
//     }
// }



// <!-- delete node at end -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){    
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class deleteend{
//     Node delete(Node head){
//         if(head==null || head.next==null){
//             return null;
//         }
//         Node curr1=head;
//         while(curr1.next.next!=null){
//             curr1=curr1.next;
//         }
//         curr1.next=null;
//         return head;
//     }
// }

// class print{

//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }


// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);
//         deleteend db=new deleteend();
//         head=db.delete(head);
//         System.out.println();
//         pt.printlist(head);
//     }
// }



// <!-- Insert node at given position -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){    
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class insertpos{
//     Node insert(Node head,int k,int val){
//         Node curr=head;
//         Node temp=new Node(val);
//         int count=1;
//         while(curr.next!=null){
//             if(count==k-1){
//                 temp.next=curr.next;
//                 curr.next=temp;
//                 return head;
//             }
//             curr=curr.next;
//             count++;
//         }
//         if(count<k){
//             return head;
//         }
//         curr.next=temp;
//         return head;
//     }
// }

// class print{

//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }


// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         int k=sc.nextInt();
//         int val=sc.nextInt();
//         print pt=new print();
//         pt.printlist(head);

//         insertpos ip=new insertpos();
//         ip.insert(head,k,val);
//         System.out.println();
//         pt.printlist(head);
//     }
// }



// <!-- Search in a linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){    
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class searchele{
//     int search(Node head,int k){
//         Node curr=head;
//         int count=1;
//         while(curr!=null){
//             if(curr.data==k){
//                 System.out.printf("The given element %d is found at position %d",k,count);
//                 return 0;
//             }
//             curr=curr.next;
//             count++;
//         }
//         return 0;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }


// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);
//         System.out.println("Size of the linked list : ",head.length());
//         System.out.println("\nEnter the element to search : ");
//         int k=sc.nextInt();
//         searchele se=new searchele();
//         se.search(head,k);
//     }
// }



// <!-- Insert node at end of doubly linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);
//     }
// }



// <!-- Reverse printing of a Doubly linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
//     void printrev(Node head){
//         Node curr2=head;
//         while(curr2.next!=null){
//             curr2=curr2.next;
//         }
//         System.out.println();
//         while(curr2!=null){
//             System.out.print(curr2.data+" ");
//             curr2=curr2.prev;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);
//         pt.printrev(head);
//     }
// }



// <!-- Insert at beginning of doubly linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }

//     Node insertbeg(Node head,int x){
//         Node temp=new Node(x);
//         if(head==null){
//             head=temp;
//             return head;
//         }
//         head.prev=temp;
//         temp.next=head;
//         head=temp;
//         return head;
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         System.out.println("Enter new elements : ");
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);

//         System.out.println();

//         System.out.println("Enter the element to be inserted at beginning : ");
//         head=ie.insertbeg(head,sc.nextInt());

//         pt.printforw(head);
//     }
// }



// <!-- Reversing the doubly linked list if tail pointer is not maintained -->

// Eg:1

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//             if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }
// }

// class reverse{
//     Node reverselist(Node head){
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }   
//         head=curr;
//         return head; 
//     }

//     void reverseprint(Node head){
//         Node curr=head;
//         System.out.println();
//         System.out.println("Reversed list : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             Wcurr=curr.prev;
//         }
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         System.out.println("Enter new elements : ");
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);

//         reverse rv=new reverse();
//         head=rv.reverselist(head);

//         rv.reverseprint(head);
//     }
// }



// Eg:2

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//             if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }
// }

// class reverse{
//     Node reverselist(Node head){
//         int temp;
//         Node curr1=head;
//         Node curr2=head;    
//         int count1=1;
       
//         while(curr2.next!=null){
//             curr2=curr2.next;
//             count1++;
//         }
//         int high=count1;
//         int low=1;
//         while(low<=high&&curr1!=null&&curr2!=null){
//             temp=curr2.data;
//             curr2.data=curr1.data;
//             curr1.data=temp;
//             curr1=curr1.next;
//             curr2=curr2.prev;
//             low++;
//             high--;
//         }   
//         return head; 
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         System.out.println("Enter new elements : ");
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);

//         reverse rv=new reverse();
//         head=rv.reverselist(head);

//         System.out.println();
//         pt.printforw(head);
//     }
// }



// <!-- Delete the beginning node in doubly linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
// }

// class delete{
//     Node deletebeg(Node head){
//         if(head==null || head.next==null){
//             return null;
//         }
//         head=head.next;
//         head.prev=null;
//         return head;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);

//         System.out.println();
//         delete dt=new delete();
//         head=dt.deletebeg(head);

//         pt.printforw(head);
//     }
// }



// <!-- Delete last node in doubly linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node prev;
//     Node next;
//     Node(int x){
//         data=x;
//         prev=null;
//         next=null;
//     }
// }

// class  insert{
//     Node insertend(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//             return head;
//         }
//         Node curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=tail;
//         tail.prev=curr;
//         return head;
//     }
// }

// class print{
//     void printforw(Node head){
//         Node curr1=head;
//         System.out.println("List of elements are : ");
//         while(curr1!=null){
//             System.out.print(curr1.data+" ");
//             curr1=curr1.next;
//         }
//     }
// }

// class delete{
//     Node deleteend(Node head){
//         if(head==null || head.next==null){
//             return null;
//         }
//         Node curr=head;
//         while(curr.next.next!=null){
//             curr=curr.next;
//         }
//         curr.next=null;
//         return head;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();

//         Node head=null;
//         insert ie=new insert();
//         while(n!=0){
//             head=ie.insertend(head,sc.nextInt());
//             n--;
//         }

//         print pt=new print();
//         pt.printforw(head);

//         System.out.println();
//         delete dt=new delete();
//         head=dt.deleteend(head);

//         pt.printforw(head);
//     }
// }



// <!-- Implementation of circular linked list -->
                    // (or)
// <!-- Insert at end of the circular linked list without maintaining tail -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insert{
//     Node insertend(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         Node temp=null;
//         while(n!=0){
//             temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//                 head.next=head;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=head){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//                 temp.next=head;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         System.out.println("List of elements are : ");
//         if(head==null){
//             return;
//         }
//         Node curr=head.next;
//         System.out.print(head.data+" ");
//         while(curr!=head){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insert ie=new insert();
//         System.out.println("Enter the elements : ");
//         head=ie.insertend(head,n);
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- Insert at end of the circular linked list by maintaining tail -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insert{
//     Node insertend(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         Node tail=null;
//         while(n!=0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//                 tail=temp;
//                 tail.next=head;
//             }
//             else{
//                 tail.next=temp;
//                 tail=temp;
//                 tail.next=head;
//             }    
//             n--;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         System.out.println("List of elements are : ");
//         if(head==null){
//             return;
//         }
//         Node curr=head.next;
//         System.out.print(head.data+" ");
//         while(curr!=head){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insert ie=new insert();
//         System.out.println("Enter the elements : ");
//         head=ie.insertend(head,n);
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- Insert at beginning of circular linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insert{
//     Node insertbeg(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         Node tail=null; 
//         Node temp=null;
//         System.out.println("Enter the elements : ");     
//         while(n!=0){
//             temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//                 tail=temp;
//                 tail.next=head;
//             }         
//             else{
//                 temp.next=head;
//                 tail.next=temp;
//                 head=temp;                
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         System.out.print(head.data+" ");
//         Node curr=head.next;
//         while(curr!=head){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         Node head=null;
//         insert ie=new insert();
//         head=ie.insertbeg(head,n);
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- Delete head of circular linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insert{
//     Node insertend(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         Node temp=null;
//         while(n!=0){
//             temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//                 head.next=head;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=head){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//                 temp.next=head;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         System.out.println("\nList of elements are : ");
//         if(head==null){
//             return;
//         }
//         Node curr=head.next;
//         System.out.print(head.data+" ");
//         while(curr!=head){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class delete{
//     Node deletebeg(Node head){
//         if(head.next==null){
//             return null;
//         }
//         Node curr=head;
//         while(curr.next!=head){
//             curr=curr.next;
//         }        
//         Node temp=head.next;
//         curr.next=temp;
//         head=temp;
//         return head;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insert ie=new insert();
//         System.out.println("Enter the elements : ");
//         head=ie.insertend(head,n);
//         print pt=new print();
//         pt.printlist(head);

//         delete dt=new delete();
//         head=dt.deletebeg(head);

//         pt.printlist(head);
//     }
// }



// <!-- Delete kth element from the linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insert{
//     Node insertend(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         Node temp=null;
//         while(n!=0){
//             temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//                 head.next=head;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=head){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//                 temp.next=head;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         System.out.println("\nList of elements are : ");
//         if(head==null){
//             return;
//         }
//         Node curr=head.next;
//         System.out.print(head.data+" ");
//         while(curr!=head){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class delete{
//     Node deletekth(Node head,int k){
//         Node curr=head;
//         int count=0;
//         while(curr.next!=head){
//             count++;
//             if(count==k-1){
//                 curr.next=curr.next.next;
//             }
//             curr=curr.next;
//         }
//         return head;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insert ie=new insert();
//         System.out.println("Enter the elements : ");
//         head=ie.insertend(head,n);
//         print pt=new print();
//         pt.printlist(head);

//         System.out.println("\nEnter the kth position of the node to be deleted : ");
//         int k=sc.nextInt();
//         delete dt=new delete();
//         head=dt.deletekth(head,k);

//         pt.printlist(head);
//     }
// }



// <!-- Sorted insert in singly linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insert{
//     Node insertsorted(Node head,int n){
//         while(n!=0){
//             Scanner sc=new Scanner(System.in);
//             Node temp=new Node(sc.nextInt());
//             int flag=0;
//             if(head==null){
//                 head=temp;
//             }
//             else if(head.data>temp.data){
//                 temp.next=head;
//                 head=temp;
//             }
//             else if(head.next==null && temp.data<head.data){
//                 temp.next=head;
//                 head=temp;
//             }
//             else if(head.next==null && temp.data>head.data){
//                 head.next=temp; 
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     if(curr.data==temp.data){
//                         temp.next=curr.next;
//                         curr.next=temp;
//                         break;
//                     }
//                     if(curr.data<temp.data && curr.next.data>temp.data){
//                         flag=1;
//                         temp.next=curr.next;
//                         curr.next=temp;
//                         break;
//                     }
//                     curr=curr.next;
//                 }
//                 if(flag==0){
//                     if(curr.data<temp.data){
//                         curr.next=temp;
//                     }
//                 }
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }


// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insert ie=new insert();
//         System.out.println("Enter the elements : ");
//         head=ie.insertsorted(head,n);
//         print pt=new print();
//         pt.printlist(head);
//     }
// }



// <!-- Middle of the linked list -->
// Eg:1 -- Naive solution:

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }

//     void printmiddle(Node head){
//         Node curr1=head;
//         int count=0;
//         while(curr1!=null){
//             count++;
//             curr1=curr1.next;
//         }
//         Node curr2=head;    
//         int count2=0;
//         while(curr2!=null){
//             count2++;
//             if(count2==((count/2)+1)){
//                 System.out.println("\n"+curr2.data);
//             }
//             curr2=curr2.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);

//         pt.printmiddle(head);
//     }
// }



// Eg:2 -- Optimized solution

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }

//     void printmiddle(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         System.out.println("\n"+slow.data);
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);

//         pt.printmiddle(head);
//     }
// }



// <!-- Find nth node from end of the linked list -->
// Eg:1 - using counting total nodes

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }

//     void nthfromend(Node head,int k){
//         Node curr1=head;
//         int count1=0;
//         while(curr1!=null){
//             count1++;
//             curr1=curr1.next;
//         }
//         int rescount=count1-k;
//         Node curr2=head;
//         int count2=0;
//         while(curr2!=null){
//             if(count2==rescount){
//                 System.out.println(curr2.data);
//             }
//             curr2=curr2.next;
//             count2++;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);

//         System.out.println("\nEnter the postition to print that element : ");
//         int k=sc.nextInt();
//         pt.nthfromend(head,k);
//     }
// }



// Eg:2 -- using two pointer

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }

//     void nthfromend(Node head,int k){
//         Node slow=head;
//         Node fast=head;
//         while(k!=1){
//             fast=fast.next;
//             if(fast==null){
//                 return;
//             }
//             k--;
//         }
//         while(fast.next!=null){
//             slow=slow.next;
//             fast=fast.next;
//         }
//         System.out.println(slow.data);
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);

//         System.out.println("\nEnter the postition to print that element : ");
//         int k=sc.nextInt();
//         pt.nthfromend(head,k);
//     }
// }



// <!-- reverse a linked list in groups of size k -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int x){
//         Node tail=new Node(x);
//         if(head==null){
//             head=tail;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=tail;
//         }
//         return head;
//     }
// }

// class reverse{
//     Node reversegroup(Node head,int k){

//     }
// }

// class print{
//     void printlist(Node head){
//         Node curr=head;
//         System.out.println("List of elements are : ");
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         while(n!=0){
//             head=ie.insert(head,sc.nextInt());
//             n--;
//         }
//         print pt=new print();
//         pt.printlist(head);

//         System.out.println("Enter the length of group : ");
//         int k=sc.nextInt();
//         reverse rs=new reverse();
//         head=rs.reversegroup(head,k);

//         pt.printlist(head);
//     }
// }



// <!-- Detect loop in linked list -->

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class insertend{
//     Node insert(Node head,int n,int loop_index){
//         int count=1;
//         while(n!=0){
//             Node tail=new Node(sc.nextInt());
//             if(head==null){
//                 head=tail;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=tail;
//             }
//             count++;
//             if(count==loop_index){
//                 Node loop_element=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Node head=null;
//         System.out.println("Enter the no.of elements : ");
//         int n=sc.nextInt();
//         insertend ie=new insertend();
//         System.out.println("Enter the elements : ");
//         int loop_index=sc.nextInt();
//         ie.insert(head,n,loop_index);
//         // detect dt=new detect();
//         // System.out.println(dt.isloop);
//     }
// }



// <!-- Stack -->

// import java.util.Scanner;   
// import java.util.Stack;

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Stack<Integer> s=new Stack<>();
//         s.push(sc.nextInt());
//         s.push(sc.nextInt());
//         System.out.println(s);
//         s.pop();
//         System.out.println(s);
//         s.push(sc.nextInt());
//         System.out.println(s);
//         System.out.println(s.peek());
//         s.push(sc.nextInt());
//         System.out.println(s);
//         System.out.println(s.peek());
//         s.pop();
//         System.out.println(s);
//         s.push(sc.nextInt());
//         s.push(sc.nextInt());
//         System.out.println(s);
//         s.pop();
//         System.out.println(s);
//         s.push(sc.nextInt());
//         System.out.println(s);
//     }
// }



// <!-- Selection sort -->
// Eg:1

// import java.util.Scanner;

// class select{
//     void selectionsort(int arr[],int n){
//         int res[]=new int[n];
//         int index=0;
//         int max_value=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             int min=arr[0];
//             for(int j=1;j<n;j++){
//                 if(arr[j]<min){
//                     min=arr[j];
//                     index=j;
//                 }
//             }
//             res[i]=min;
//             arr[index]=max_value;            
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(res[i]+" ");
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no.of elements : " );
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the array elements : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         select sl=new select();
//         sl.selectionsort(arr,n);
//     }
// }



// Eg:2

// import java.util.Scanner;

// class select{
//     void selectionsort(int arr[],int n){
//         int index=0;
//         for(int i=0;i<n-1;i++){
//             int min=arr[i];
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<min){
//                     min=arr[j];
//                     index=j;
//                 }
//             }
//             int temp=arr[index];
//             arr[index]=arr[i];
//             arr[i]=temp;
//         }

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no.of elements : " );
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the array elements : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         select sl=new select();
//         sl.selectionsort(arr,n);
//     }
// }



// <!-- Stack -->

// import java.util.Scanner;
// import java.util.Stack;

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Stack<Integer> s=new Stack<>();
//         s.push(5);
//         System.out.println(s.peek());
//         if(s.pop()==0);{
//             System.out.println("Empty");
//         }
//         s.push(23);
//         s.push(36);
//         int var=s.pop();
//         System.out.println(var);
//         System.out.println(s.peek());
//         s.push(43);
//         System.out.println(s);
//     }
// }



// <!-- ArrauDeque -->

// import java.util.Scanner;
// import java.util.ArrayDeque;

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         ArrayDeque<Integer> ad=new ArrayDeque<>();
//         ad.push(sc.nextInt());
//         ad.push(sc.nextInt());
//         ad.push(sc.nextInt());
//         ad.push(sc.nextInt());
//         System.out.println(ad);
//         System.out.println(ad.pop());
//         System.out.println(ad);
//         System.out.println(ad.pop());
//         System.out.println(ad);
//     }
// }



// <!-- Previous greater element using stack -->

// import java.util.Scanner;
// import java.util.Stack;

// class previousgreater{
//     void ispreviousgreater(int arr[],int n){
//         Stack<Integer> s=new Stack<>();
//         int res[]=new int[n];
//         int val=-1;
//         for(int i=0;i<n;i++){
//             if(i==0){
//                 s.push(arr[i]);
//                 res[i]=val;
//                 continue;
//             }
//             while(s.size()!=0 && arr[i]>=s.peek()){
//                 s.pop();
//             }
//             if(s.size()==0){
//                 res[i]=val;
//             }
//             else{
//                 res[i]=s.peek();
//             }
//             s.push(arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(res[i] +" ");
//         }
//         return;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         previousgreater pg=new previousgreater();
//         pg.ispreviousgreater(arr,n);
//     }
// }



// <!-- Array implementaion using Stack -->

// import java.util.Arrays;
// import java.util.Scanner;

//  class MyStack{
//     int arr[];
//     int top;
//     MyStack(int input){
//         arr=new int[input];
//         top=-1;
//     }
//     void push(int x){
//         top++;
//         arr[top]=x;
//     }
//     void pop(){
//         if(top>=0){
//             arr[top]=0;
//             top--;
//         }
//     }
//     int peek(){
//         if(top==-1){
//             return 0;
//         }
//         return arr[top];
//     }
//     int size(){
//         return top+1;
//     }
//     boolean isempty(){
//         if(top==-1){
//             return true;
//         }
//         return false;
//     }
//  }

// class Test{
//     public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
//             int n=sc.nextInt();
//             MyStack s=new MyStack(n);
//             s.push(sc.nextInt());
//             for(int i=0;i<s.arr.length;i++){
//                 System.out.print(s.arr[i]+" ");
//             }
//             System.out.println();
//             s.pop();
//             s.push(sc.nextInt());
//             s.push(sc.nextInt());
//             System.out.println(s.peek());
//             s.pop();
//             for(int i=0;i<s.arr.length;i++){
//                 System.out.print(s.arr[i]+" ");
//             }
//             System.out.println();
//             System.out.println(s.peek());
//             s.push(sc.nextInt());
//             for(int i=0;i<s.arr.length;i++){
//                 System.out.print(s.arr[i]+" ");
//             }
//             System.out.println();
//             sc.close();
//     }
// }



// <!-- Leftmost repeating character -->
// Eg:1

// import java.util.Scanner;

// class repeat{
//     void left_most_repeat(String str){
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length();j++){
//                 if(str.charAt(i)==str.charAt(j)){
//                     System.out.println(i);
//                     return;
//                 }
//             }
//         }
//         System.out.println("-1");
//         return;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         repeat rp=new repeat();
//         rp.left_most_repeat(str);
//     }
// }



// Eg:2

// import  java.util.Scanner;

// class repeat{
//     void left_most_repeat(String str){
//         int arr[]=new int[26];
//         int j=0;
//         for(int i=0;i<str.length();i++){
//             j=str.charAt(i)-'a';
//             arr[j++]++;
//         }
//         for(int i=0;i<str.length();i++){
//             if(arr[str.charAt(i)-'a']>1){
//                 System.out.println(i);
//                 return;
//             }
//         }
//         System.out.println("-1");
//         return;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         repeat rp=new repeat();
//         rp.left_most_repeat(str);
//     }
// }



// <!-- Leftmost non repeating character -->

// import  java.util.Scanner;

// class repeat{
//     void left_most_repeat(String str){
//         int arr[]=new int[26];
//         int j=0;
//         for(int i=0;i<str.length();i++){
//             j=str.charAt(i)-'a';
//             arr[j++]++;
//         }
//         for(int i=0;i<str.length();i++){
//             if(arr[str.charAt(i)-'a']==1){
//                 System.out.println(i);
//                 return;
//             }
//         }
//         System.out.println("-1");
//         return;
//     }
// }

// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         repeat rp=new repeat();
//         rp.left_most_repeat(str);
//     }
// }