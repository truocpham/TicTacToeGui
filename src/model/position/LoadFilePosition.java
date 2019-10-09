/**
Copyright (C) 2019 LUVINA
 * LoadPosition.java, 05/10/2019 TrinhLe
 */
package model.position;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.util.Common;

/**
 * @author TrinhLe
 *
 */
public class LoadFilePosition {
	public static List<String> getListPositionFromFile() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(Common.FILE_NAME));

			System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

			String textInALine;
			StringBuilder position = new StringBuilder();

			while ((textInALine = br.readLine()) != null) {
				if (!textInALine.equals("")) {
					position.append(textInALine);
				} else {
					Common.listPositionFile.add(position.toString());
					position = new StringBuilder();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new IOException();
		} finally {
			br.close();
		}
		return Common.listPositionFile;
	}
}
