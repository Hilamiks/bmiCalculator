package calculatorBMI;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("your name: ");
		double height = Double.parseDouble(JOptionPane.showInputDialog("your height (m): "));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("your weight (kg): "));
		double index = weight/(height*height);
		double result = Math.round(index*10)/10.0;
		JOptionPane.showMessageDialog(null, name+", your BMI is: "+result);
		if(result<=18.5) {
			JOptionPane.showMessageDialog(null, "You might be underweight");
		}
		else if (result<25) {
			JOptionPane.showMessageDialog(null, "You might be healthy weight");
		}
		else if (result<30) {
			JOptionPane.showMessageDialog(null, "You might be overweight");
		}
		else
			JOptionPane.showMessageDialog(null, "You might be obese");
	}

}
