

package number.converter;
import java.awt.*;  
import java.awt.event.*;
class NumberConverter {
      Font myFont =new Font("copper black",Font.BOLD,14);
       Font Font1=new Font("forte",Font.ITALIC,12);
       Font Font2=new Font("arial black",Font.BOLD,14);
        int flag;
        Frame f= new Frame();  
      
        NumberConverter (){    
          Label l1=new Label("NUMBER SYSTEM CONVERTION");
          l1.setBounds(75,50,250,20);
          l1.setForeground(Color.blue);
         CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("Decimal to Binary converter", cbg, false);    
        checkBox1.setBounds(100,100, 300,25);    
        Checkbox checkBox2 = new Checkbox("Decimal to hexadecimal converter", cbg, false);    
        checkBox2.setBounds(100,140, 300,25);    
        Checkbox checkBox3 = new Checkbox("Decimal to octal converter", cbg, false);    
        checkBox3.setBounds(100,180, 300,25); 
       Checkbox checkBox4 = new Checkbox("Binary to Decimal converter", cbg, false);    
        checkBox4.setBounds(100,220, 300,25); 
        Checkbox checkBox5 = new Checkbox("Binary to hexadecimal converter", cbg, false);    
        checkBox5.setBounds(100,260, 300,25); 
        Checkbox checkBox6 = new Checkbox("Binary to octal converter", cbg, false);    
        checkBox6.setBounds(100,300, 300,25); 
        f.add(checkBox1);    
        f.add(checkBox2);   
         f.add(checkBox3); 
          f.add(checkBox4); 
           f.add(checkBox5);
            f.add(checkBox6);
            f.setBackground(Color.cyan);
            l1.setFont(myFont);
            
      checkBox1.setForeground(Color.RED);
      checkBox1.setFont(Font2);
      checkBox2.setForeground(Color.RED);
       checkBox2.setFont(Font2);
      checkBox3.setForeground(Color.RED);
      checkBox3.setFont(Font2);
      checkBox4.setForeground(Color.RED);
      checkBox4.setFont(Font2);
      checkBox5.setForeground(Color.RED);
      checkBox5.setFont(Font2);
      checkBox6.setForeground(Color.RED);
      checkBox6.setFont(Font2);
        f.add(l1);
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);  
        
        f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
           {
f. dispose();
           }
        });

               checkBox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                             flag=0;
                           secondframe f=new secondframe();          
            }
      });
          
               checkBox2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                          flag=1;
                        secondframe f=new secondframe();            
        }
       });
       
               checkBox3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                        flag=2;
                        secondframe f=new secondframe();            
        }
      });
       
      checkBox4.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                    flag=3;
                      secondframe f=new secondframe();            
         }
       });
      
      checkBox5.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                  flag=4;
                   secondframe f=new secondframe();            
            }
          });
         
      checkBox6.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                   flag=5;
                  secondframe f=new secondframe();            
            }
          });
      }    
 
        
  class secondframe implements ActionListener 
{
     Frame f1=new Frame();
    Label l1=new Label("Enter Number :");
    Label l3=new Label("Result :");
    TextField t1=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("convert");
    Button b2=new Button("cancel");
    
    
      public secondframe()
     {
       switch(flag)
             {
                 case 0:
                 {
                        Label   l2=new Label("DECIMAL TO BINARY CONVERTER");
                          l2.setBounds(75,50,250,20);
                            f1.add(l2);

                           break;
                 }
                 case 1:
                 {  Label l2=new Label("DECIMAL TO HEXADECIMAL CONVERTER");
                          l2.setBounds(75,50,250,20);
                            f1.add(l2);

                     break;
                     
                 }
                 case 2:
                 {   Label l2=new Label("DECIMAL TO OCTAL CONVERTER");
                          l2.setBounds(75,50,250,20);
                            f1.add(l2);

                      break;
                 }
                 case 3:
                 {   Label l2=new Label("BINARY TO DECIMAL CONVERTER");
                          l2.setBounds(80,50,250,20);
                            f1.add(l2);

                     break;
                 }
                     case 4:
                 {   Label l2=new Label("BINARY TO HEXADECIMAL CONVERTER");
                          l2.setBounds(80,50,250,20);
                            f1.add(l2);

                    break;
                 
                 }
                 case 5:
                 {   Label l2=new Label("BINARY TO OCTAL CONVERTER");
                          l2.setBounds(80,50,250,20);
                            f1.add(l2);

                    break;

                 }
                 }
       
       
    l1.setBounds(50,100,100,20);
      l3.setBounds(50,180,100,20);
      t1.setBounds(200,100,100,20);
     t3.setBounds(200,180,100,20);
    b1.setBounds(100,250,50,20);
       b2.setBounds(170,250,50,20);
       
       l1.setFont(myFont);
       l3.setFont(myFont);
       b1.setFont(Font1);
       b2.setFont(Font1);
       b1.setBackground(Color.black);
b2.setBackground(Color.black);
b1.setForeground(Color.yellow);
b2.setForeground(Color.yellow);
f1.setBackground(Color.pink); 
l1.setForeground(Color.blue);
l3.setForeground(Color.blue);
   
f1.add(l1); 
f1.add(l3);
 f1.add(t1);        
 f1.add(t3);
  f1.add(b1);
   f1.add(b2);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
            f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(400,350);
  
        f1.addWindowListener(new WindowAdapter()
        {
public void windowClosing(WindowEvent e)
           {
f1. dispose();
           }
        });
     }

      public void actionPerformed(ActionEvent e)
    {  
        int n1=Integer.parseInt(t1.getText());
        String n= (t1.getText());
        if(e.getSource()==b1)
        {
             switch(flag)
             {
                 case 0:
                 {
                          
                          t3.setText(String.valueOf(Integer.toBinaryString(n1)));
                          
                           break;
                 }
                 case 1:
                 {  
                     t3.setText(String.valueOf(Integer.toHexString(n1)));
                     break;
                     
                 }
                 case 2:
                 {   
                      t3.setText(String.valueOf( Integer.toOctalString(n1)));
                      break;
                 }
                 case 3:
                 {   
                     t3.setText(String.valueOf(Integer.parseInt(n,2)));
                     break;
                 }
                     case 4:
                 {   
                     int hex = Integer.parseInt(n, 2);
        
t3.setText(String.valueOf(Integer.toHexString(hex)));
break;
                 
                 }
                 case 5:
                 {   
                     int oct = Integer.parseInt(n, 2);
       
t3.setText(String.valueOf(Integer.toOctalString(oct)));
break;

                 }
                 }
                 
        }
        if(e.getSource()==b2)
        {
            System.exit(0);
        }
    }}

 
public static void main(String[] args) {
       
        new NumberConverter();
    }
}



