//import java.util.Scanner;
class FirstClass
{
    public static void main(String args[]) 
    {
    //System.out.println("Hello World");
       /* System.out.println("*");
          System.out.println("**");
          System.out.println("***");
          System.out.println("****");*/
//Scanner sc = new Scanner(System.in);
/*int x=sc.nextInt();
//conditional statements
if(x%2==0)
{
    System.out.println("the entered number is even");
}
else
{
    System.out.println("the entered number is odd");
} */
 /*int a = sc.nextInt();
   int b = sc.nextInt();
 
 if(a==b)
 {
    System.out.println("entered numbers are equal"); 
 }
 else if(a>b)
 {
    System.out.println("a is greater than b");
 }
   else
 {
    System.out.println("a is less than b");
 }*/
  /*int button = sc.nextInt();
  switch(button)
  {
    case 1: System.out.println("hello");
    break;
    case 2:System.out.println("Namaste");
    break;
    case 3:System.out.println("bonjur");
    break;
    default:System.out.println("Invalid Button");
  }*/
  //program for calculator
/*System.out.println("Enter a :");
      int a = sc.nextInt();
      System.out.println("Enter b:");
       int b = sc.nextInt();
       System.out.println("Enter operator:");
       char operator = sc.next().charAt(0);
       switch(operator) {
           case '+' : System.out.println(a+b);
           break;
           case '-': System.out.println(a-b);
           break;
           case '*' : System.out.println(a*b);
           break;
           case '/' : System.out.println(a/b);
            break;
           case '%' : System.out.println(a%b);
	    break; 
           default : System.out.println("Invalid Operator");
       }*/
      /*  System.out.println("Enter the number:");
       int n=sc.nextInt();
       if(n>0)
       {
        System.out.println("number is positive");
       }
       else
       {
        System.out.println("number is negative");
       }*/
      /*  double temp=99.5;
       if(temp>100)
       {
        System.out.println("fever");
       }
       else
       {
        System.out.println(" not in fever");
       }*/
       /*System.out.println("Enter the day:");
      int day=sc.nextInt();
       switch(day)  
       {
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("Tuesday");
        break;
        case 3: System.out.println("Wednesday");
        break;
        case 4: System.out.println("Thursday");
        break;
        case 5: System.out.println("Friday");
        break;
        case 6: System.out.println("Saturday");
        break;
        case 7: System.out.println("Sunday");
        }   */
       /*System.out.println("enter the year:");
       int year=sc.nextInt();
       if(year%4==0)
      {
        System.out.println("Leap year");
      }
       else if(year%100==0)
       {
        System.out.println(" Leap year");
       }
       else if(year%400==0)
       {
       System.out.println("Leap year");
      }
      else 
      {
        System.out.println("Not a leap year");
      }*/
     //loops
    /*for(int i=0;i<5;i=i+1)
    {
      System.out.println("hello world");
      i+=2;
    }*/
    /*for(int i=0;i<=10;i++)
    {
      System.out.println(i);
    }*/
   // int i=0;
    //while(i<=10)
    //{
     // System.out.println(i);
      //i++;
    //}
    /*int i=0;
    do{
      System.out.println(i);
      i++;
    }
    while(i<=10);*/
   /*int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<=n;i++)
    {
      sum=sum+i;
    }
    System.out.println(sum);*/
    /*int n=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      System.out.println(n*i);
    }*/
    //QUESTIONS FOR PRACTICE:1
  /*  System.out.println("Enter the integer:");
   int n = sc.nextInt();
   int sum =0;
   for(int i=0;i<=n;i++)
   {
    i=n%10;
    sum=sum+i;
    n=n/100;
   }
  System.out.println("sum of digits:"+sum);*/
  //QUESTIONS ON PATTERN: solid rectangle
    /*for(int i=1;i<=4;i++)
   {
  
   for(int j=1;j<=5;j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }*/
   //hollow rectangle
  /* for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=5;j++)
  {
    if(i==1||j==1||i==4||j==5)
    {
      System.out.print("*");
    }
    else
    {
      System.out.print(" ");
    }
  }
  System.out.println();

  }*/
  // Half Pyramid
   for(int i=1;i<=4;i++)
   {
    for(int j=1;j<=i;j++)
    {
      System.out.print("*");
    }
    System.out.println();
   }
   //invert half pyramid
  /*  for(int i=4;i>=1;i--) 
    {
      for(int j=1;j<=i;j++)

       {
      System.out.print("*");
    }
    System.out.println();
   }*/
   // inverted half pyramid rotataed by 180 deg
  /*  for(int i=1;i<=4;i++)
   {
    for(int j=1;j<=4-i;j++)
    {
    System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    { 
      System.out.print("*");
    }
    System.out.println( );
   }*/
//Half Pyramid with numbers
 /*int n=5;
for(int i =1;i<=n;i++)
 {
  for(int j=1;j<=i;j++)
  {
    System.out.print(j+" ");
  }
  System.out.println();
    } */
    //inverted half pyraid with numbers
   /* int n=5;
    for(int i =1;i<=n;i++)
     {
      for(int j=1;j<=n-i+1;j++)
      {
        System.out.print(j+" ");
      }
      System.out.println();
        } */ 
//half pyramid with Alphabets
      /*  char n='E';
    for(char i='A';i<=n;i++)
     {
      for(char j='A';j<=i;j++)
      {
        System.out.print(j+" ");
      }
      System.out.println();
        } */ 
        //FLOYD'S TRIANGLE
       /*  int n=5;
        int number=1;
    for(int i=1;i<=n;i++)
     {
      for(int j=1;j<=i;j++)
      {
        System.out.print(number+" ");
        number++;
      }
      System.out.println();
        }*/
//0-1 Triangle
/*int n=5;
int sum=0;

for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
  if((i+j)%2==0 )
{
System.out.print("1"+" ");
}
else
{
  System.out.print("0"+" ");
}
}
System.out.println();
}*/

 

} 
  }
