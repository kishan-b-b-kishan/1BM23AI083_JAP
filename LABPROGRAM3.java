//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LABPROGRAM3 {
    public static boolean compareStrings(String str1,String str2){
        return str1.equals(str2);
    }
    public static String concat(String str1,String str2){
        return str1+str2;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String str1= "Mahit";
        String str2 = "Mahit";
        String str3 = " how are u?";
        if (compareStrings(str1,str2)){
            System.out.println("Mahit is a Good Boy");
            System.out.println(concat(str2,str3));
        }

    }
}