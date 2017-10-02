import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener
{
	JPanel p;
	JTextField area;
	JButton clear,off,on;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton b0,dot,equal;
	JButton plus,minus,star,divide;
	static double result=0.0;
	static String str;
	static char ch=' ';
	static int flag;
	
	Calculator()
	{
	    p=new JPanel();
	    
	    area=new JTextField(15);
	    area.setHorizontalAlignment(JTextField.RIGHT);
	    area.setText("0.");
	    
	    clear=new JButton("Clear");
	    off=new JButton("Off");
	    on=new JButton("On");
	    clear.addActionListener(this);clear.setLocation(0,10);
	    off.addActionListener(this);off.setLocation(50,10);
	    on.addActionListener(this);on.setLocation(100,10);
	    
	    b1=new JButton("1");b2=new JButton("2");b3=new JButton("3");
	    b4=new JButton("4");b5=new JButton("5");b6=new JButton("6");
	    b7=new JButton("7");b8=new JButton("8");b9=new JButton("9");

	    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
	    b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
	    b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);

	    b0=new JButton("0");dot=new JButton(".");equal=new JButton("=");plus=new JButton("+");
	    divide=new JButton("/");star=new JButton("*");minus=new JButton("-");
	    b0.addActionListener(this);dot.addActionListener(this);minus.addActionListener(this);divide.addActionListener(this);
	    plus.addActionListener(this);equal.addActionListener(this);star.addActionListener(this);
	    
	    p.add(area);
	    p.add(clear);p.add(off);p.add(on);
	    p.add(b7);p.add(b8);p.add(b9);p.add(divide);
	    p.add(b4);p.add(b5);p.add(b6);p.add(star);
	    p.add(b1);p.add(b2);p.add(b3);p.add(minus);
	    p.add(b0);p.add(dot);p.add(equal);p.add(plus);
	
	    add(p);
	    setTitle("Calculator");
	    setVisible(true);
	    setSize(200,250);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String []args)
	{
		Calculator cal=new Calculator();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==clear || e.getSource()==on)
		{
			area.setText("0.");result=0.0;
		}
		if(e.getSource()==off)
		{
			System.exit(1);
		}
		if(e.getSource()==b1){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("1");flag=1;}
		   else { String t=area.getText();area.setText(t+"1");}}
		if(e.getSource()==b2){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("2");flag=1;}
		   else { String t=area.getText();area.setText(t+"2");}}
		if(e.getSource()==b3){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("3");flag=1;}
		   else { String t=area.getText();area.setText(t+"3");}}
		if(e.getSource()==b4){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("4");flag=1;}
		   else { String t=area.getText();area.setText(t+"4");}}
		if(e.getSource()==b5){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("5");flag=1;}
		   else { String t=area.getText();area.setText(t+"5");}}
		if(e.getSource()==b6){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("6");flag=1;}
		   else { String t=area.getText();area.setText(t+"6");}}
		if(e.getSource()==b7){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("7");flag=1;}
		   else { String t=area.getText();area.setText(t+"7");}}
		if(e.getSource()==b8){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("8");flag=1;}
		   else {String t=area.getText();area.setText(t+"8");}}
		if(e.getSource()==b9){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("9");flag=1;}
		   else { String t=area.getText();area.setText(t+"9");}}
		if(e.getSource()==b0){ 
		   if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("0");flag=1;}
		   else { String t=area.getText();area.setText(t+"0");}}
		if(e.getSource()==dot){if(area.getText().equals("0.")||area.getText().equals("0.0")||flag==0) {area.setText("0.");flag=1;}
		 else {String t=area.getText();area.setText(t+".");}}
		if(e.getSource()==plus)
		{
			str=area.getText();
			double a=Double.parseDouble(str);
			if(result==0.0)
			{
				result=a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			else
			{
				result=result+a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			ch='+';
			flag=0;
		}
		if(e.getSource()==minus)
		{
			str=area.getText();
			double a=Double.parseDouble(str);
			if(result==0.0)
			{
				result=a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			else
			{
				result=result-a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			ch='-';
			flag=0;
		}
		if(e.getSource()==star)
		{
			str=area.getText();
			double a=Double.parseDouble(str);
			if(result==0.0)
			{
				result=a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			else
			{
				result=result*a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			ch='*';flag=0;
		}
		if(e.getSource()==divide)
		{
			str=area.getText();
			double a=Double.parseDouble(str);
			if(result==0.0)
			{
				result=a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			else
			{
				result=result/a;
				String r=String.valueOf(result);
				area.setText(r);
			}
			ch='/';flag=0;
		}
		if(e.getSource()==equal)
		{
			switch(ch)
			{
				case '+':str=area.getText();
				             double a1=Double.parseDouble(str);
				             result=result+a1;break;
				case '-':str=area.getText();
				             double a2=Double.parseDouble(str);
				             result=result-a2;break;
				case '*':str=area.getText();
				             double a3=Double.parseDouble(str);
				             result=result*a3;break;
				case '/':str=area.getText();
				             double a4=Double.parseDouble(str);
				             result=result/a4;break;
			}
			String ss=String.valueOf(result);
			area.setText(ss);
			result=0.0;
			ch=' ';flag=1;
				
		}
	
	}
		
}
	
	
	