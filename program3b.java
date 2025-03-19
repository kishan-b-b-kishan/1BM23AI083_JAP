import java.util.Scanner;
public class program3b {
   /* public static boolean compareStrings(String str1,String str2){
        return str1.equals(str2);
    }
    public static String concat(String str1,String str2){
        return str1+str2;
    }*/
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        /*String str1= "Mahit";
        String str2 = "Mahit";
        String str3 = " how are u?";
        if (compareStrings(str1,str2)){
            System.out.println("Mahit is a Good Boy");
            System.out.println(concat(str2,str3));*/
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of StringBuffer object sb1: "+sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Hello!");
        System.out.println("Capacity of StringBuffer object sb2: "+ sb2.capacity());
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a string ");
        String inputString  = scanner.nextLine();

        StringBuffer reversedBuffer  = new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed String in upperCase:" + reversedUpperCase);

        System.out.print("Enter a string to append ");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending:"+reversedBuffer);

        scanner.close();

    }
}