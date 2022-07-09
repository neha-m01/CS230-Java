package Lab12;
import java.awt.event.*;
import javax.swing.*; 
import java.awt.*; 

public class Lab12Demo{
    public static void main(String[] args){
        // create frame 
        JFrame frame = new JFrame("Prime Calculator");

        // set close operation to when user clicks exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the look and feel to the computer
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
        
        JPanel panel = createMainPanel();

        // add panel to frame
        frame.add(panel); 
        frame.setSize(400,300); 
        frame.setVisible(true);

    }

    /**
     * Adds components to the main panel.
     * 
     * @return JPanel
     * @param none
     */
    public static JPanel createMainPanel(){
        // panels to hold contents
        JPanel panel = new JPanel();
        JPanel helper_panel = new JPanel();;

        // set layout for the panel - here we use the BoxLayout manager
        BoxLayout layout = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        // label to say hi   
        JLabel greetingLabel = new JLabel("Hi! Welcome to the Prime calculator.");
        greetingLabel.setFont(new Font("Times", Font.BOLD, 15));
        helper_panel.add(greetingLabel);
        panel.add(helper_panel);

        // label to ask user for input
        helper_panel = new JPanel();
        JLabel inputLabel = new JLabel("Enter an integer :");
        inputLabel.setHorizontalAlignment(0);
        helper_panel.add(inputLabel);
        // text field to get user input
        JTextField text = new JTextField(8);
        text.setBackground(new Color(255,255,255));
        helper_panel.add(text);
        panel.add(helper_panel);

       
        // label to show result
        JTextField result = new JTextField("The result will be here!");
        result.setHorizontalAlignment(JTextField.CENTER);
        result.setFont(new Font("Apple Casual", Font.BOLD, 20));
        result.setEditable(false);
        result.setBackground(new Color(255,255,255));

        
        // button for user to click after entering a number in
        helper_panel = new JPanel();
        JButton getPrime = new JButton("Find prime (click me)");
        getPrime.setHorizontalAlignment(0);
        getPrime.addActionListener(new ActionListener(){
            // anonymous inner class
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int number = Integer.parseInt(text.getText());
                    boolean prime = isPrime(number);
                    if(prime == true){
                        result.setText(String.format("%s is a prime number",text.getText()));
                    }else{
                        result.setText(String.format("%s is not a prime number",text.getText()));
                    }
                }catch(NumberFormatException ex){
                    // incorrect input
                    result.setText(String.format("<%s> is not a valid input!",text.getText()));
                }
            }
        });
        getPrime.setSize(20,20);
        helper_panel.add(getPrime);
        panel.add(helper_panel);
        panel.add(result);

        return panel;
    }

    /**
     * Checks if a number is prime or not.
     * 
     * @param num
     * @return boolean
     */
    public static boolean isPrime(int num){
        int bound = num/2;
        boolean answer;
        if(num == 0 || num == 1){
            answer = false;
        }else{
            for(int i=2; i<=bound; i++){
                if(num%i == 0){
                    return false;
                }
            }
            answer = true;
        }
        return answer;
    }
}