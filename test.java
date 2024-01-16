import java.util.Scanner;
public class test{
public static void main (String[] args){
char func;
Scanner myInput = new Scanner( System.in );
System.out.println("Calculator! Enter: '+' '-' ' x' '/'"); 
func = myInput.next().charAt(0);
System.out.println("Enter first number: 'num1'"); 
int first = myInput.nextInt();
System.out.println("Enter second number: 'num2'");
int second = myInput.nextInt();
if (func == '+'){
  System.out.print(add(first, second));
}
else if (func == '-'){
  System.out.print(sub(first, second));
}
else if (func == '*'){
  System.out.print(mul(first, second));
}
else if (func == '/'){
  System.out.print(div(first, second));
}
else{
  System.out.print("Incorrect Format. Re-enter function");
}
}

public static int add (int first, int second){
  return first + second;
}

public static int sub (int first, int second){
  return first - second;
}

public static int mul (int first, int second){
  return first * second;
}

public static int div (int first, int second){
  return first / second;
}
}