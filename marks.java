import java.util.Scnner;
class marks{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
int a[5]=sc.nextInt();
System.out.println("enter the students marks");
for(int i=0;i<=4;i++)
{
 if(a[i]>0&&a[i]<40)
System.out.println("c grade");
if(a[i]>41&&a[i]<75)
System.out.println("b grade");
if(a[i]>76&&a[i]<100)
System.out.println("a grade");
}
}
}

