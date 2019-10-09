/**
Copyright (C) 2019 LUVINA
 * UICaro.java, 05/10/2019 TrinhLe
 */
package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import model.position.LoadFilePosition;

/**
 * @author TrinhLe
 *
 */
public class MainFrame {
	public static void main(String[] args) {
		// Load position from file and keep position values in Common.
		new LoadFilePosition();
		
		// Create TicTacToe's view
		GridPanel jp = new GridPanel();
		jp.createGridCaro();
		jp.showGridCaro();
	}
}