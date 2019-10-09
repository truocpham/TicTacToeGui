/**
Copyright (C) 2019 LUVINA
 * CheckWin.java, 06/10/2019 TrinhLe
 */
package model.logic;

import javax.swing.JDialog;

import model.util.CellBean;
import model.util.Common;
import view.GridPanel;

/**
 * @author TrinhLe
 *
 */
public class CheckWin {
	/**
	 * Phương thức check win theo hàng ngang
	 * @param cell ô vừa đánh
	 * @return true nếu có 5 ô giống nhau, false nếu có 5 ô khác nhau
	 */
	public static boolean checkByHorizontal(CellBean cell) {
		//Khai báo biến x là tọa độ x của ô 
		int x = cell.getXPosition();
		//Khai báo biến y là tọa độ y của ô 
		int y = cell.getYPosition();
		//Tạo biến đếm các ô có gia trị giống nhau
		int count = 1;
		//Vòng lặp để check win theo hàng ngang
		for (int i = -4; i <= 4; i++) {
			//Xét điều kiện điểm tiếp theo nằm trong bàn cờ
			if (i != 0 && (y + i) >= 0 && (y + i) < 20) {
				//So sánh giá trị của ô liền có cùng giá trị với ô vừa đánh không
				if (Common.listCell[x][y + i].getValue().equals(cell.getValue())) {
					//Nếu giá trị giống thì biến đếm tăng lên 1
					count++;
				} else {
					//Nếu giá trị khác thì đặt lại biến đếm trở về 1
					count = 1;
				}
				//Xét có 5 ô giá trị giống nhau chưa
				if (count >= 5) {
					//Nếu có 5 ô có giá trị giống nhau thì trả về true
					return true;
				}
			}
		}
		//Nếu không có 5 ô có giá trị giống nhau thì trả về true
		return false;
	}

public static boolean checkByVertical(CellBean cell) {
		
		int x = cell.getXPosition();
		int y = cell.getYPosition();
		int count = 1;

		for (int i = -4; i <= 4; i++) {
			if (i != 0 && (x + i) >= 0 && (x + i) < 20) {
				if (Common.listCell[x + i][y].getValue().equals(cell.getValue())) {
					count++;
				} else {
					count = 1;
				}
				if (count >= 5) {
					return true;
				}
			}
		}
		return false;
	}

public static boolean checkByMainDiagonal(CellBean cell) {
	
	int x = cell.getXPosition();
	int y = cell.getYPosition();
	int count = 1;

	for (int i = -4; i <= 4; i++) {
		if (i != 0 && (x + i) >= 0 && (x + i) < 20 && (y - i) >= 0 && (y - i) < 20) {
			if (Common.listCell[x + i][y-i].getValue().equals(cell.getValue())) {
				count++;
			} else {
				count = 1;
			}
			if (count >= 5) {
				return true;
			}
		}
	}
	return false;
}

public static boolean checkBySubDiagonal(CellBean cell) {
	
	int x = cell.getXPosition();
	int y = cell.getYPosition();
	int count = 1;

	for (int i = -4; i <= 4; i++) {
		if (i != 0 && (x + i) >= 0 && (x + i) < 20 && (y + i) >= 0 && (y + i) < 20) {
			if (Common.listCell[x + i][y+i].getValue().equals(cell.getValue())) {
				count++;
			} else {
				count = 1;
			}
			if (count >= 5) {
				return true;
			}
		}
	}
	return false;
}


	public static boolean checkWin(CellBean cell) {
		if (checkByHorizontal(cell) || checkByVertical(cell) || checkByMainDiagonal(cell) || checkBySubDiagonal(cell)) {
//			System.out.println("win");
			return true;
		}
//		System.out.println("lose");
		return false;
	}
}
