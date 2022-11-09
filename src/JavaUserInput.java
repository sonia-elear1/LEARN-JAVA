import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner newInput = new Scanner(System.in); //System.in  -> read from the keyword
        System.out.println("Enter number 1");
        int a = newInput.nextInt(); // type of variable we are taking int/byte/float
        System.out.println("Enter number 2");
        int b = newInput.nextInt();
        int sum = a + b;
        System.out.println("sum of number " + a + " and " + b + " is " + sum );
//        if you want to use float variable
//        float a = newInput.nextFloat();
//        float b = newInput.nextFloat();
//        float sum = a + b

//        to check valid type of input
//        System.out.println("Enter value to check is integer");
//        boolean b1 = newInput.hasNextInt(); // to check what type of literal is
//        System.out.println(b1);

//         to read one work use  scannerObject.next()
//         to read line use scannerObj.nextLine
//         to read character use charAt after next
//        String str = newInput.next()
//        System.out.println(str);
    }
}
