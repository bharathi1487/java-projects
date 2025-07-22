import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2,result;
        char choice='y';
        String operator;
    while(choice=='y'||choice=='Y') 
    {
       System.out.println("Enter number1:");
       num1 =sc.nextDouble();
       System.out.println("enter operator(+,-,*,/,%):");
       operator=sc.next();
       System.out.println("Enter number2:");
        num2 = sc.nextDouble();
if(operator.equals("+"))
  { result=num1+num2;
  System.out.println("RESULT IS:" + result);

} 
 else if(operator.equals("-"))
  { result=num1-num2;
  System.out.println("RESULT IS:" + result);

} 
 else if(operator.equals("*"))
 { result=num1*num2;
 System.out.println("RESULT IS:" + result);

} 
else if(operator.equals("/"))
 { result=num1/num2;
 System.out.println("RESULT IS:" + result);

} 
else if(operator.equals("%"))
 { result=num1%num2;
 System.out.println("RESULT IS:" + result);

} 

 else{
    System.out.println("Invalid operation");
 }
 


 
System.out.println("DO U WANT TO PERFORM AGAIN(y/n):");
choice = sc.next().charAt(0); 
}
    

    
sc.close();
}
}
    

