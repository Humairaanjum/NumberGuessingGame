import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class HelloWorld {

        public static void main(String args[]) {
                Scanner s = new Scanner(System.in);
                Random random = new Random();
                int a,b;
//System.out.print("Random number is ");
                b = random.nextInt(100);
               // System.out.println(+b);
               while(true){
String input=JOptionPane.showInputDialog("Enter any number:");
a=Integer.parseInt(input);
      
                if (a == b) {

                 JOptionPane.showMessageDialog(null,"You Win!Entered no. is equal to random number");     
break;
                } else if(a>b){

JOptionPane.showMessageDialog(null,"Entered number is greater than random number");}
else if (b>a){
JOptionPane.showMessageDialog(null,"Entered number is less than random number");
}
else {
                       JOptionPane.showMessageDialog(null,"You lose!");
               
 }
}}}