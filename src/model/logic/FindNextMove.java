/**
Copyright (C) 2019 LUVINA
 * FindNextMove.java, 08/10/2019 TrinhLe
 */
package model.logic;

import java.util.ArrayList;
import java.util.List;

import model.util.CellBean;
import model.util.Common;
import view.GridPanel;

/**
 * @author TrinhLe
 *
 */
public class FindNextMove {
//	public static void main(String[] args) {
////		GridPanel jp = new GridPanel();
////		jp.createGridCaro();
////		jp.showGridCaro();
////		System.out.println(getPositionBoard(Common.listCell));
////
//		
//		char[] positionFileChars = {'G', 'G', 'G','D'};
//		char[] positionBoardChars = {'G', 'G', 'G','T'};
////		for (int i = 0; i < 4; i++) {
//			findPosition(positionFileChars, positionBoardChars);
////		}
		
		
//	}
//
	public CellBean findNextMove(CellBean[][] listCell) {
		List<String> listPositionBoard = getPositionBoard(listCell);
		CellBean cell = new CellBean();
		for (String position : Common.listPositionFile) {
			for (int i = 0; i < listPositionBoard.size(); i++) {
				char positionFileChars[] = position.toCharArray();
				char positionBoardChars[] = listPositionBoard.get(i).toCharArray();
				System.out.println("vaof hafm timf ddiem 1");
				cell = this.findPosition(positionFileChars, positionBoardChars);
				System.out.println("vaof hafm timf ddiem 2");
				if (cell != null) {
					
					cell.setXPosition(cell.getX() + i / 16);
					cell.setYPosition(cell.getY() + i % 16);
					System.out.println("vaof hafm timf ddiem  If");
					return cell;
				}
			}
		}
		cell = this.randomCell();
		return cell;
	}

	private static CellBean findPosition(char[] positionFileChars, char[] positionBoardChars) {
		CellBean cell = new CellBean();
		for (int i = 0; i < 4; i++) {
			if (positionFileChars[i] == 'D' && positionBoardChars[i] == 'T') {
				cell.setXPosition(i / 5);
				cell.setYPosition(i % 5);
				continue;
			} else if (positionFileChars[i] == positionBoardChars[i]) {
				continue;
			} else if (positionFileChars[i] == 'G') {
				continue;
			} else {
				System.out.println("null");
				return null;
			}
		}
		System.out.println(cell.getXPosition() + ", " + cell.getYPosition());
		return cell;
	}

	// Máy đánh random
	public static CellBean randomCell() {
		int xPostion = (int) (Math.random() * 19);
		int yPostion = (int) (Math.random() * 19);
		CellBean cell = Common.listCell[xPostion][yPostion];
		if ("T".equals(cell.getValue())) {
			return cell;
		} else {
			return randomCell();
		}
	}

//	 lưu giá trị bàn cờ vào list theo 25 kí tự
	public static List<String> getPositionBoard(CellBean[][] listCell) {
		StringBuilder position = new StringBuilder();
		List<String> listPositionBoard = new ArrayList<>();
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {

				for (int m = 0; m < 5; m++) {
					for (int n = 0; n < 5; n++) {
						position.append(Common.listCell[j + m][i + n].getValue());
					}
				}
		//		System.out.println(position);
				listPositionBoard.add(position.toString());
				position = new StringBuilder();
			}
		}
	//	System.out.println();
		return listPositionBoard;
	}
}
