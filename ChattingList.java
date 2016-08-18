package PATING.heesoo;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ChattingList extends JFrame {
	JPanel p_others;
		JLabel l_chatting;
		JPanel p_buttons;
			JButton btn_friend;
			JButton btn_chatting;
			JButton btn_channel;
			JButton btn_more;
		JTextField tf_search;
	
	JPanel p_main;
		JPanel p_chatting[]=new JPanel[10];
		JPanel p;
			Canvas can;
			Toolkit kit;
			Image img_profile;
			JPanel p_center;
			JLabel l_user;
			JLabel l_text;
		
		JScrollPane scroll;
	
	public ChattingList(){
		p_others=new JPanel(new GridLayout(3, 1));
		l_chatting=new JLabel("채팅", JLabel.CENTER);
		l_chatting.setOpaque(true);
		l_chatting.setBackground(new Color(51, 102, 0));
		l_chatting.setForeground(Color.white);
		p_buttons=new JPanel(new GridLayout(1, 4));
		btn_friend=new JButton("친구");
		btn_chatting=new JButton("채팅");
		btn_channel=new JButton("채널");
		btn_more=new JButton("더보기");
		tf_search=new JTextField();
		
		p_main=new JPanel(new GridLayout(10, 1));
		p_main.setBackground(new Color(255, 165, 0));
		p=new JPanel(new BorderLayout());
		p.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));
		can=new Canvas(){
			@Override
			public void paint(Graphics g) {
				g.drawImage(img_profile, 5, 5, 50, 50, this);
			}
		};
		can.setPreferredSize(new Dimension(57, 57));
		Toolkit kit=Toolkit.getDefaultToolkit();
		img_profile=kit.getImage("C:/java_workspace/PATING/res/profile.png");
		p_center=new JPanel(new GridLayout(2, 1));
		p_center.setBorder(BorderFactory.createEmptyBorder(10,30,10,10));
		l_user=new JLabel();
		l_user.setText("aaarisu");
		l_text=new JLabel();
		l_text.setText("hi hellow");

		scroll=new JScrollPane(p_main);
		
		add(p_others, BorderLayout.NORTH);
		p_others.add(l_chatting);
		p_others.add(p_buttons);
		p_buttons.add(btn_friend);
		p_buttons.add(btn_chatting);
		p_buttons.add(btn_channel);
		p_buttons.add(btn_more);
		p_others.add(tf_search);
		
		add(p_main, BorderLayout.CENTER);
		
		//p:채팅목록 1개 Component
		p.add(can, BorderLayout.WEST);
		
		p.add(p_center, BorderLayout.CENTER);
		p_center.add(l_user);
		p_center.add(l_text);
			p_chatting[0]=p;
			//p_chatting[0].setBackground(Color.green);
			p_main.add(p_chatting[0]);
		
		//p_main.add(scroll);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 700);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChattingList();
	}

}


