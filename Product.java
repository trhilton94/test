package prob1;

public class Product {

	private int batch;
	private String code; //PlantDateBatch //Plant 2 or 3 chars // Date: mmddyyyy //Batch 1 or 2 nums
	private String date;
//	private int indexDateBegins;
	private String plant;
	
	public Product(String code) {
		this.code = code;
		extractBatch();
		extractDate();
		extractPlant();
	}
	
	private int extractBatch() {
		int batch = 0;
		int len = code.length();
		if(Character.isDigit(code.charAt(2))) {
			if(len == 11) {
				batch = Integer.parseInt(code.substring(len-1));
			}
			else {
				batch = Integer.parseInt(code.substring(len-2));
			}
		}
		else {
			if(len == 12) {
				batch = Integer.parseInt(code.substring(len-1));
			}
			else {
				batch = Integer.parseInt(code.substring(len-2));
			}
		}
		this.batch = batch;
		return batch;
	}
	private String extractDate() {
		String date = "";
		if(Character.isAlphabetic(code.charAt(2))) {
			date = code.substring(3, 11);
		}
		else {
			date = code.substring(2, 10);
		}
		this.date = date;
		return date;
	}
	private String extractPlant() {
		String plant = "";
		for(int i=0; i<code.length(); i++) {
			if(Character.isAlphabetic(code.charAt(i))) {
				plant += code.charAt(i);
			}
		}
		this.plant = plant;
		return plant;
	}
	public int getBatch() {
		return batch;
	}
	public String getCode() {
		return code;
	}
	public String getDate() {
		return date;
	}
	public String getMonth() {
		return getDate().substring(0,2);
	}
	public String getDay() {
		return getDate().substring(2,4);
	}
	public String getYear() {
		return getDate().substring(4);
	}
	public String getPlant() {
		return plant;
	}
	public boolean isAfter2000() {
		String date = getDate();
		int year = Integer.parseInt(date.substring(4));
		if(year>=2000) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isMonthEqual(int month) {
		String date = getDate();
		int codeMonth = Integer.parseInt(date.substring(0,2));
		if(codeMonth==month) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String msg = String.format("code=%s, plant=%s, date=%s/%s/%s, batch=%d", 
				getCode(), getPlant(), getMonth(), getDay(), getYear(), getBatch());
		return msg;
	}
}
