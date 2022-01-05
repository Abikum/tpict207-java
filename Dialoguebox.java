import javax.swing.JOptionPane;



public class Dialoguebox {

    public static void main(String[] args){

        String num1=(JOptionPane.showInputDialog("enter the first number:"));

        String num2=(JOptionPane.showInputDialog("enter the first number:"));
        int num=Integer.parseInt(num1);
        int num0=Integer.parseInt(num2);
        int result=0,i;
        for (i=1;i<+10;i++){

            result= num*i;

            JOptionPane.showMessageDialog(null,  i+ "*" + num + "=" + result);
            
        }
       
        
    }
    
}
 