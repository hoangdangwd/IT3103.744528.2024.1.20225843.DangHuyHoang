package F;
	
	import javax.swing.*;
	
public class Calculate {
	public static void main(String[] args) {
	String strNum1, strNum2;
	String strNoti1 = "Sum: ", strNoti2 = "Diff: ", strNoti3 = "Product: ", strNoti4 = "Quotient: ";
	strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number:","Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
	strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number:","Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);
	double num2 = Double.parseDouble(strNum2);
	double sum = num1 + num2;
	strNoti1 += sum;
	double diff = num1 - num2;
	strNoti2 += diff;
	double product = num1 * num2;
	strNoti3 += product;
	if (num2 != 0) {
        double quotient = num1 / num2;
        strNoti4 += quotient;
    } else {
        strNoti4 = "Division by zero is not allowed.";
    }
	JOptionPane.showMessageDialog(null, strNoti1,
			"Answer" , JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, strNoti2,
			"Answer" , JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, strNoti3,
			"Answer" , JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, strNoti4,
			"Answer" , JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}

}
