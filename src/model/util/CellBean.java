/**
Copyright (C) 2019 LUVINA
 * CellBean.java, 07/10/2019 TrinhLe
 */
package model.util;

import javax.swing.JButton;

/**
 * @author TrinhLe
 *
 */
public class CellBean extends JButton {
	private String value; // Giá trị của ô cờ : X, O hoặc D
	private int XPosition; // Hoành độ của quân cờ trên bàn cờ
	private int YPosition; // Tung độ của quân cờ trên bàn cờ
		
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getXPosition() {
		return XPosition;
	}
	public void setXPosition(int xPosition) {
		XPosition = xPosition;
	}
	public int getYPosition() {
		return YPosition;
	}
	public void setYPosition(int yPosition) {
		YPosition = yPosition;
	}
}
