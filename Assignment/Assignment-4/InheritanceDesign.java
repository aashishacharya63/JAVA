package awt;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
class InheritanceDesign extends Frame{
    public static InheritanceDesign frame = new InheritanceDesign();
    public static Label num1 = new Label();
    public static TextField num1Text = new TextField();
    public static Label num2 = new Label();
    public static TextField num2Text = new TextField();
    public static Label result = new Label();
    public static TextField resultText = new TextField();
    public static Button addition = new Button("ADD");
    public static Button subtract = new Button("Subtract");
    public static Button multiply = new Button("Multiply");
    public static Button divide = new Button("Divide");
    public static void main(String[] args) {
        num1.setText("Number 1:");
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        frame.add(num1);
        frame.add(num1Text);
        num2.setText("Number 2:");
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        frame.add(num2);
        frame.add(num2Text);
        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        frame.add(result);
        frame.add(resultText);
        addition.setBounds(10,200,50,35);
        frame.add(addition);
        subtract.setBounds(80,200,50,35);
        frame.add(subtract);
        multiply.setBounds(150,200,50,35);
        frame.add(multiply);
        divide.setBounds(220,200,50,35);
        frame.add(divide);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
