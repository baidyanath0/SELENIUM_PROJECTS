package ddt;

import generic.Generic_ddt;

public class Fetch_data {

	public static void main(String[] args) {
		String r = Generic_ddt.read_ddt("Sheet1", 0, 1);
		System.out.println(r);
		
		
		
		String value = Create_generic.ddt("Sheet1", 2, 1);
		System.out.println(value);
		
		

}
}