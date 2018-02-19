package designpatterns.decoratorPatterns;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class LowerCaseInputStreamImplementer {

	public static void main(String[] args) throws IOException {

		InputStream in = new LowerCaseInputStream(
				new BufferedInputStream(
						new FileInputStream(
								"C:\\Users\\Karun Mathew\\workspace\\OrcaleTest\\src\\INPUTSTREAM")));

		int character;
		while ((character = in.read()) > -1) {
			System.out.print((char) character);
		}
		in.close();
	}
}
