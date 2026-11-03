package day14;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		ReadDataFromExcel re = new ReadDataFromExcel();
		re.readExcel("./src/day14/testData.xlsx", "data");

	}

}
