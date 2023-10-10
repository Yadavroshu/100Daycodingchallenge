import java.util.*;
class triangle
{
 public static void main(String[]args)
{
  
  Scanner sc=new Scanner(System.in);
System.out.println("enter three angles");
   int a = sc.nextint();
   int b = sc.nextint();
   int c = sc.nextint();
int sum;
   sum=a+b+c;
  if(sum==180){
   System.out.println("triangle is vaild");
}
  else{
   System.out.println("triangle is not vaild");
    }
  }
}
       