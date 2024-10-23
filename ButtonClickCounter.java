import java.awt.*;  
import java.awt.event.*;  

public class ButtonClickCounter extends Frame implements ActionListener {  
    Button button;  
    Label label;  
    int count = 0;  

    public ButtonClickCounter() {  
        
        button = new Button("Click Me");  
        label = new Label("Click count: 0");  
        
        
        setLayout(new FlowLayout());  
        add(button);  
        add(label);  

        
        button.addActionListener(this);  
        
        
        setSize(300, 100);  
        setVisible(true);  
    }  

    @Override
    public void actionPerformed(ActionEvent e) {  
        count++;  
        label.setText("Click count: " + count);  
    }  

    public static void main(String[] args) {  
        new ButtonClickCounter();  
    }  
}
