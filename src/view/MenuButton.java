/**
Copyright (C) 2019 LUVINA
 * MenuButton.java, 06/10/2019 TrinhLe
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author TrinhLe
 *
 */
public class MenuButton extends JPanel {
	private static JPanel menu;
	private static JTextArea scoreCaro = new JTextArea("hqehe");
	private static JButton newGameButton;

//	public MenuButton() {
		//Tên hiển thị của button 
//		newGameButton = new JButton("New Game");
		//button New Game vào phần menu bắt đầu từ điểm có tọa độ (50,50), kết thúc ở điểm có tọa độ (150,50)
		//newGameButton.setBounds(0, 0, 800, 600);
		//thêm button New Game vào phần menu
//		menu.add(newGameButton);
//		
//		scoreCaro.setBounds(50, 150, 150, 150);
//		menu.add(scoreCaro);
//	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Game Caro");
		MenuButton menu = new MenuButton();
		
		scoreCaro.setBounds(50, 150, 150, 150);
		
		menu.add(scoreCaro);

		frame.getContentPane();
		frame.add(menu);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
