package prob1;

public class ProductTest {

	/***
	 * YOU SHOULD WRITE THESE TEST METHODS.
	 * 
	 */
	public static void main(String[] args) {
		testProductConstructor_Plant_3chars_Batch_2chars();
		testProductConstructor_Plant_3chars_Batch_1chars();
		testProductConstructor_Plant_2chars_Batch_2chars();
		testProductConstructor_Plant_2chars_Batch_1chars();
		testIsAfter2000Test_True_Year2019();
		testIsAfter2000Test_True_Year2000();
		testIsAfter2000Test_False_Year1994();
		testIsMonthEqual_True();
		testIsMonthEqual_False();
		testToString();
	}
	
	/***
	 * Construct a product where the plant has 3 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_2chars() {
		System.out.println("-->testProductConstructor_Plant_3chars_Batch_2chars()");
		Product p = new Product("abc0901202198");
		String msgExpected = String.format("Code expected: %s, Plant expected: %s, "
				+ "Date expected: %s, Batch expected: %d", "abc0901202198", "abc", "09012021", 
				98);
		String msgActual = String.format("Code actual:   %s, Plant actual:   %s, "
				+ "Date actual:   %s, Batch actual:   %d", p.getCode(), p.getPlant(), 
				p.getDate(), p.getBatch());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the plant has 3 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_3chars_Batch_1chars()");
		Product p = new Product("abc090120211");
		String msgExpected = String.format("Code expected: %s, Plant expected: %s, "
				+ "Date expected: %s, Batch expected: %d", "abc090120211", "abc", "09012021", 
				1);
		String msgActual = String.format("Code actual:   %s, Plant actual:   %s, "
				+ "Date actual:   %s, Batch actual:   %d", p.getCode(), p.getPlant(), 
				p.getDate(), p.getBatch());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_2chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_2chars()");
		Product p = new Product("ab0901202198");
		String msgExpected = String.format("Code expected: %s, Plant expected: %s, "
				+ "Date expected: %s, Batch expected: %d", "ab0901202198", "ab", "09012021", 
				98);
		String msgActual = String.format("Code actual:   %s, Plant actual:   %s, "
				+ "Date actual:   %s, Batch actual:   %d", p.getCode(), p.getPlant(), 
				p.getDate(), p.getBatch());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_1chars()");
		Product p = new Product("ab090120211");
		String msgExpected = String.format("Code expected: %s, Plant expected: %s, "
				+ "Date expected: %s, Batch expected: %d", "ab090120211", "ab", "09012021", 
				1);
		String msgActual = String.format("Code actual:   %s, Plant actual:   %s, "
				+ "Date actual:   %s, Batch actual:   %d", p.getCode(), p.getPlant(), 
				p.getDate(), p.getBatch());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the year is 2019 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2019() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2019()");
		Product p = new Product("ab090120191");
		String msgExpected = String.format("Is %s after 2000? Expected: true", p.getDate());
		String msgActual = String.format("Is %s after 2000? Actual:   %b", p.getDate(), p.isAfter2000());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the year is 2000 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2000() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2000()");
		Product p = new Product("ab090120001");
		String msgExpected = String.format("Is %s after 2000? Expected: true", p.getDate());
		String msgActual = String.format("Is %s after 2000? Actual:   %b", p.getDate(), p.isAfter2000());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the year is 1994 and then call isAfter2000() which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_False_Year1994() {
		System.out.println("\n-->testIsAfter2000Test_False_Year1994()");
		Product p = new Product("ab090119941");
		String msgExpected = String.format("Is %s after 2000? Expected: false", p.getDate());
		String msgActual = String.format("Is %s after 2000? Actual:   %b", p.getDate(), p.isAfter2000());
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(2) which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_True() {
		System.out.println("\n-->testIsMonthEqual_True()");
		Product p = new Product("ab020119941");
		String msgExpected = String.format("Is the date %s in the month of Feburary? Expected: true", p.getDate());
		String msgActual = String.format("Is the date %s in the month of Feburary? Actual:   %b", p.getDate(), p.isMonthEqual(2));
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(3) which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_False() {
		System.out.println("\n-->testIsMonthEqual_False()");
		Product p = new Product("ab020119941");
		String msgExpected = String.format("Is the date %s in the month of Feburary? Expected: false", p.getDate());
		String msgActual = String.format("Is the date %s in the month of Feburary? Actual:   %b", p.getDate(), p.isMonthEqual(3));
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}
	
	public static void testToString() {
		System.out.println("\n-->testToString()");
		Product p = new Product("ab020119941");
		System.out.println(p);
	}
}
