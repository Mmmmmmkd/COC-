import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows extends JFrame {
    JFrame windows = new JFrame("Dice");
    ImageIcon imageIcon=new ImageIcon("111.png.");
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();
    JPanel p11=new JPanel();
    JLabel jl=new JLabel("Custom Dice:");
    JLabel jlp=new JLabel(imageIcon);
    JTextField jt=new JTextField(40);
    JTextField jt2=new JTextField(40);
    JTextField jt3=new JTextField(10);
    JButton b1=new JButton("Build PC");
    JButton b2=new JButton("Clean");
    JButton b3=new JButton("Exit");
    JButton badd=new JButton("Add");
    JButton bd2=new JButton("D2");
    JButton bd3=new JButton("D3");
    JButton bd4=new JButton("D4");
    JButton bd6=new JButton("D6");
    JButton bd8=new JButton("D8");
    JButton bd10=new JButton("D10");
    JButton bd12=new JButton("D12");
    JButton bd20=new JButton("D20");
    JButton bd100=new JButton("D100");
    JTextArea jta=new JTextArea();
    mylistener lis=new mylistener();
    boolean ifdx=false;
    int value=0,d2c=0,d3c=0,d4c=0,d6c=0,d8c=0,d10c=0,d12c=0,d20c=0,d100c=0;
    public void runit() {
        b1.addActionListener(lis);b2.addActionListener(lis);
        bd2.addActionListener(lis);bd3.addActionListener(lis);
        bd4.addActionListener(lis);bd6.addActionListener(lis);badd.addActionListener(lis);
        bd8.addActionListener(lis);bd10.addActionListener(lis);b3.addActionListener(lis);
        bd12.addActionListener(lis);bd20.addActionListener(lis);bd100.addActionListener(lis);
        p2.setLayout(null);p3.setLayout(new GridLayout(3,1));
        p1.setLayout(new GridLayout(6,2));
        p11.setLayout(new GridLayout(2,1));
        p11.add(jt);p11.add(jt2);
        p1.add(bd2);p1.add(bd3);p1.add(bd4);p1.add(bd6);
        p1.add(bd8);p1.add(bd10);p1.add(bd12);p1.add(bd20);
        p1.add(bd100);p1.add(b1);p1.add(b2);p1.add(b3);
        p1.setBackground(Color.LIGHT_GRAY);
        p2.add(jta);p2.add(p11);p2.setOpaque(false);
        p3.add(jl);p3.add(jt3);p3.add(badd);
        p4.add(jlp,BorderLayout.CENTER);//p4.setBackground(Color.red);
        windows.add(p1);windows.add(p3);windows.add(p11);
        windows.add(p4);windows.add(p2);
        jl.setLocation(620,90);
        jta.setBounds(10,10,575,300);
        p11.setBounds(9,320,578,46);
        p1.setSize(200,200);p1.setLocation(595,165);
        p2.setSize(600,320);p2.setLocation(0,0);
        p3.setBounds(595,90,200,70);
        p4.setBounds(595,0,200,80);
        windows.setSize(810, 400);
        windows.setLocation(100,100);
        windows.setResizable(false);
        windows.setVisible(true);
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private class mylistener implements ActionListener {
        public void actionPerformed(ActionEvent ccc){
            if(ccc.getSource()==bd2){
                Dice d2=new Dice();
                d2.D2();
                if(value!=0)
                jt.setText(jt.getText()+"+D2("+d2.nd2+")");
                else jt.setText("D2("+d2.nd2+")");
                value+=d2.nd2;
                d2c++;
                repjt2();
            }
            if(ccc.getSource()==bd3){
                Dice d3=new Dice();
                d3.D3();
                if(value!=0)
                jt.setText(jt.getText()+"+D3("+d3.nd3+")");
                else jt.setText("D3("+d3.nd3+")");
                value+=d3.nd3;
                d3c++;
                repjt2();
            }
            if(ccc.getSource()==bd4){
                Dice d4=new Dice();
                d4.D4();
                if(value!=0)
                jt.setText(jt.getText()+"+D4("+d4.nd4+")");
                else jt.setText("D4("+d4.nd4+")");
                value+=d4.nd4;
                d4c++;
                repjt2();
            }
            if(ccc.getSource()==bd6){
                Dice d6=new Dice();
                d6.D6();
                if(value!=0)
                jt.setText(jt.getText()+"+D6("+d6.nd6+")");
                else jt.setText("D6("+d6.nd6+")");
                value+=d6.nd6;
                d6c++;
                repjt2();
            }
            if(ccc.getSource()==bd8){
                Dice d8=new Dice();
                d8.D8();
                if(value!=0)
                jt.setText(jt.getText()+"+D8("+d8.nd8+")");
                else jt.setText("D8("+d8.nd8+")");
                value+=d8.nd8;
                d8c++;
                repjt2();
            }
            if(ccc.getSource()==bd10){
                Dice d10=new Dice();
                d10.D10();
                if(value!=0)
                jt.setText(jt.getText()+"+D10("+d10.nd10+")");
                else jt.setText("D10("+d10.nd10+")");
                value+=d10.nd10;
                d10c++;
                repjt2();
            }
            if(ccc.getSource()==bd12){
                Dice d12=new Dice();
                d12.D12();
                if(value!=0)
                jt.setText(jt.getText()+"+D12("+d12.nd12+")");
                else jt.setText("D12("+d12.nd12+")");
                value+=d12.nd12;
                d12c++;
                repjt2();
            }
            if(ccc.getSource()==bd20){
                Dice d20=new Dice();
                d20.D20();
                if(value!=0)
                jt.setText(jt.getText()+"+D20("+d20.nd20+")");
                else jt.setText("D20("+d20.nd20+")");
                value+=d20.nd20;
                d20c++;
                repjt2();
            }
            if(ccc.getSource()==bd100){
                Dice d100=new Dice();
                d100.D100();
                if(value!=0)
                jt.setText(jt.getText()+"+D100("+d100.nd100+")");
                else jt.setText("D100("+d100.nd100+")");
                value+=d100.nd100;
                d100c++;
                repjt2();
            }
            if(ccc.getSource()==b1){
                jta.setText(
                        "STR="+(new Dice().D6()+new Dice().D6()+new Dice().D6())*5
                        +"\nCON="+(new Dice().D6()+new Dice().D6()+new Dice().D6())*5
                        +"\nSIZ="+(new Dice().D6()+new Dice().D6()+6)*5
                        +"\nDEX="+(new Dice().D6()+new Dice().D6()+new Dice().D6())*5
                        +"\nAPP="+(new Dice().D6()+new Dice().D6()+new Dice().D6())*5
                        +"\nINT="+(new Dice().D6()+new Dice().D6()+6)*5
                        +"\nPOW="+(new Dice().D6()+new Dice().D6()+new Dice().D6())*5
                        +"\nEDU="+(new Dice().D6()+new Dice().D6()+6)*5
                        +"\nLUC="+(new Dice().D6()+new Dice().D6()+new Dice().D6())*5);
            }
            if(ccc.getSource()==b2){
                jta.setText("");jt.setText("");jt2.setText("");value=0;jt3.setText("");
                d2c=d3c=d4c=d6c=d8c=d10c=d12c=d20c=d100c=0;ifdx=false;
            }
            if(ccc.getSource()==b3){System.exit(0);}
            if(ccc.getSource()==badd)
                try {
                    Dice dx = new Dice(new Integer(jt3.getText()));
                    if(new Integer(jt3.getText())<=0||(new Integer(jt3.getText())%1!=0))
                        throw new NumberFormatException();
                    dx.ndx = dx.getNumber();//自定义面数，catch错误输入并弹框提示；
                    if (value != 0)
                        jt.setText(jt.getText() + "+D" + new Integer(jt3.getText()) + "(" + dx.ndx + ")");
                    else jt.setText("D" + new Integer(jt3.getText()) + "(" + dx.ndx + ")");
                    value += dx.ndx;
                    ifdx=true;
                    repjt2();
                }catch(NumberFormatException e){
                    jt3.setText("Error:illegal data");
            }
        }
        public void repjt2(){
            StringBuilder str=new StringBuilder("Total:");
            if(d100c!=0) {str.append(d100c+"D100");if(d20c+d12c+d10c+d8c+d6c+d4c+d3c+d2c!=0)str.append("+");}
            if(d20c!=0) {str.append(d20c+"D20");if(d12c+d10c+d8c+d6c+d4c+d3c+d2c!=0)str.append("+");}
            if(d12c!=0) {str.append(d12c+"D12");if(d10c+d8c+d6c+d4c+d3c+d2c!=0)str.append("+");}
            if(d10c!=0) {str.append(d10c+"D10");if(d8c+d6c+d4c+d3c+d2c!=0)str.append("+");}
            if(d8c!=0) {str.append(d8c+"D8");if(d6c+d4c+d3c+d2c!=0)str.append("+");}
            if(d6c!=0) {str.append(d6c+"D6");if(d4c+d3c+d2c!=0)str.append("+");}
            if(d4c!=0) {str.append(d4c+"D4");if(d3c+d2c!=0)str.append("+");}
            if(d3c!=0) {str.append(d3c+"D3");if(d2c!=0)str.append("+");}
            if(d2c!=0) str.append(d2c+"D2");
            if(ifdx){
                if(d100c+d20c+d12c+d10c+d8c+d6c+d4c+d3c+d2c!=0) str.append("+");
                str.append("Customer Dice");
            }
            String strfinal=new String(str+"="+value);
            jt2.setText(strfinal);
        }
    }
    public static void main(String[] args){
        new Windows().runit();
    }
}