package com.example.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chatbot extends JFrame{
	
	private JTextArea Chatarea=new JTextArea();
	private JTextField chatbox=new JTextField();
	public chatbot() {
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(500 , 600);
		frame.setTitle("chatbot");
		frame.add(Chatarea);
		frame.add(chatbox);
		//FOR TEXTAREA
		
		Chatarea.setSize(500 , 450);
		Chatarea.setLocation(2 , 2);
		
		//FOR TEXTFIELD
		
		chatbox.setSize(540 , 30);
		chatbox.setLocation(2 , 500);
		
		
		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String gtext=chatbox.getText().toLowerCase();
				Chatarea.append("YOU->"+gtext+"\n");
				chatbox.setText("");
				
				if (gtext.contains("hi")) {
					chtbot("Hello");
				}else {
					
					int rand=(int) (Math.random()*3 +1);
					 System.out.println(rand); 
					if(rand==1) {
						chtbot("I DONT UNDERSTAND YOU");
					}else if(rand==2){
						chtbot("I DONT UNDERSTAND YOU BRO");
					}
				}	
				
				
			}
		});
		
	}
	
	private void chtbot(String string) {
		
		Chatarea.append("BOT->"+string+"\n");
	}
	
	public 	static void main(String arg[]) {
		
		new chatbot();
	
		
		
		
	}
}
