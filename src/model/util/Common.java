/**
Copyright (C) 2019 LUVINA
 * Common.java, 05/10/2019 TrinhLe
 */
package model.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

/**
 * @author TrinhLe
 *
 */
public class Common {
	public static final int ROWS = 20; // khai báo biến số hàng của bàn cờ caro
	public static final int COLS = 20; // khai báo biến số cột của bàn cờ caro
	public static final int WIDTH = 600; //khai báo biến  chiều rộng của bàn cờ caro
	public static final int HEIGHT = 600; //khai báo biến chiều cao của bàn cờ caro
	
	public static CellBean[][] listCell = new CellBean[ROWS][COLS]; // List chứa các ô cờ
	public static int count = 0;
	
	public static final String FILE_NAME = "CaroPosition.txt";
	
	// List chứa thế cờ đọc từ File
	public static List<String> listPositionFile = new ArrayList<>();

	

}
