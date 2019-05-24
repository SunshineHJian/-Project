package life_game;

import javax.swing.JFrame;


public class Life_GUI extends JFrame{
	static public int size=21;
	static public boolean flag[][]=new boolean[size][size];
	public Life_GUI(){
		this.setSize(800, 800);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	public void game_start() throws InterruptedException {
		
		while(true) {
			Draw_Cell mp=new Draw_Cell(flag,size);
			
//			Button but1=new Button("¿ªÊ¼");
//			but1.setSize(35, 35);
//			but1.setBackground(Color.WHITE);
//			but1.setLocation(800, 800);
//			this.add(but1);
//			but1.addActionListener(new My_ActionListener());
//			
//			Button but2=new Button("Í£Ö¹");
//			but2.setSize(35, 35);
//			but2.setBackground(Color.WHITE);
//			this.add(but2,BorderLayout.SOUTH);
//			but2.addActionListener(new My_ActionListener());
//			
//			
//			JPanel myJ=new JPanel();
//			myJ.setSize(50, 50);
//			myJ.add(but1,BorderLayout.SOUTH);
//			myJ.add(but2,BorderLayout.NORTH);
//			this.add(myJ,BorderLayout.SOUTH);
			
			this.add(mp);
			this.setVisible(true);
			Thread.sleep(1000);
			
			//myJ.removeAll();
		}
	}
}