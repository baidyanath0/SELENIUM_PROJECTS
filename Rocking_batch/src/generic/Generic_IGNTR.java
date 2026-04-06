package generic;

	import java.io.FileInputStream;

	public class Generic_IGNTR {

	    static String path = "testdata/selenium_test_data.xlsx";
	    static Workbook book;
	    static Sheet sheet;

	    // 🔹 Load Excel (IMPORTANT)
	    public static void loadSheet(String sheetName) {
	        try {
	            FileInputStream fis = new FileInputStream(path);
	            book = WorkbookFactory.create(fis);
	            sheet = book.getSheet(sheetName);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    // 🔹 Generic Read Method (Your read_ddt)
	    public static String read_ddt(int row, int cell) {
	        String value = "";

	        try {
	            Cell c = sheet.getRow(row).getCell(cell);
	            value = c.toString();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return value;
	    }

	    // 🔹 Row Count
	    public static int getRowCount() {
	        return sheet.getLastRowNum();
	    }
	}
}
