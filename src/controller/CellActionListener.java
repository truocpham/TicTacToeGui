/**
Copyright (C) 2019 LUVINA
 * CellActionListener.java, 07/10/2019 TrinhLe
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.metal.MetalButtonUI;

import model.logic.CheckWin;
import model.logic.FindNextMove;
import model.util.CellBean;
import model.util.Common;
import view.GridPanel;

/**
 * @author TrinhLe
 *
 */
public class CellActionListener implements ActionListener {
		
	/**
	 * Phương thức đặt giá trị và màu giá trị cho các button
	 * @param cell ô cờ được truyền vào
	 * @param value giá trị X nếu máy đánh, O nếu là người
	 */
	public void checkToPlay(CellBean cell, String value) {
//		cell.setText(value);
		System.out.println(cell.getXPosition() + ", " + cell.getYPosition());
		cell.setUI(new MetalButtonUI() {
			protected Color getDisabledTextColor() {
				if (value == "X") {
					return Color.BLUE;
				} else {
					return Color.RED;
				}
			}
		});
		cell.setValue(value);
		cell.setEnabled(false);
		CheckWin.checkWin(cell);
		Common.count++;
	}

	// Ghi đè lại phương thức actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		FindNextMove findNextMove = new FindNextMove();
		
		// Lấy giá trị cell vừa được click
		CellBean cell = (CellBean) e.getSource();
		CellBean cellComputer = findNextMove.findNextMove(Common.listCell);
		System.out.println(cellComputer.getXPosition() + ", " + cellComputer.getYPosition());
		cell.setBackground(Color.WHITE);

		if (Common.count % 2 == 0) {
			checkToPlay(cell, "O");
		}

		if (Common.count % 2 != 0) {
			checkToPlay(cellComputer, "X");
		}
		
//		if ("D".equals(cell.getValue())) {
//			Common.count++;
//			cell.setValue("X");
//			
//			if (CheckWin.checkWin(cell)) {
//				System.out.println("Human win");
//			} else {
//				Common.count++;
//				
//				CellBean cellComputer = findNextMove.findNextMove(Common.listCell);
//				System.out.println(cellComputer.getXPosition() + ", " + cellComputer.getYPosition());
//				cellComputer.setValue("O");
//				
//				if (CheckWin.checkWin(cellComputer)) {
//					System.out.println("Computer win");
//				}
//			}
//		}
	}
}
