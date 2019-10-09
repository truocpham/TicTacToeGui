/**
Copyright (C) 2019 LUVINA
 * GridPanel.java, 06/10/2019 TrinhLe
 */
package view;


import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.CellActionListener;
import model.util.CellBean;
import model.util.Common;

/**
 * 
 * @author TrinhLe
 *
 */
public class GridPanel extends JFrame {
	/**
	 * Hàm vẽ bàn cờ
	 * 
	 * @throws IOException
	 */
	public void createGridCaro() {
		// Khởi tạo một khung chứa các thành phần trong chương trình
		Container container = getContentPane();
		// Khởi tạo một panel để chứa các ô cờ
		JPanel gridPanel = new JPanel();
		// Đặt layout cho panel
		gridPanel.setLayout(new GridLayout(Common.ROWS, Common.COLS, 0, 0));

		// Tạo bàn cờ 20x20
		for (int i = 0; i < Common.COLS; i++) {
			for (int j = 0; j < Common.ROWS; j++) {
				// Khởi tạo một ô cờ
				CellBean cell = new CellBean();
				// Đặt nền cho ô cờ
				cell.setBackground(Color.WHITE);
				// Khởi tạo giá trị mặc định cho ô cờ là T - trống
				cell.setValue("T");
				// Khởi tạo hoành độ của quân cờ trên bàn cờ
				cell.setXPosition(i);
				// Khởi tạo tung độ của quân cờ trên bàn cờ
				cell.setYPosition(j);
				// Gán sự kiện cho quân cờ khi quân cờ được click
				cell.addActionListener(new CellActionListener());
				// Thêm quân cờ vào một List để xử lý
				Common.listCell[i][j] = cell;
				// Thêm quân cờ vào panel bàn cờ
				gridPanel.add(cell);
			}
		}
		// Thêm layout vào khung chứa
		container.add(gridPanel);
	}

	/**
	 * Hàm hiển thị bàn cờ lên màn hình
	 */
	public void showGridCaro() {
		// Đặt tiêu đề cho chương trình
		this.setTitle("Game Caro");
		// Đặt kích thước chương trình
		this.setSize(900, 900);
		// Đặt chế độ tắt hẳn chương trình khi click vào nút thoát
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Đặt chương trình khởi động chính giữa màn hình
		this.setLocationRelativeTo(null);
		// Hiển thị chương trình
		this.setVisible(true);
		// Đặt chế độ không thay đổi được kích thước chương trình
		this.setResizable(true);
	}
}
