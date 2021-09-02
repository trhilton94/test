package prob1;

public class BasketballPlayer {
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private String name;
	private int threePointersAttempted;
	private int threePointersMade;
	private int twoPointersAttempted;
	private int twoPointersMade;
	
	public BasketballPlayer(String name) {
		this.name = name;
	}
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}
	public int getFreeThrowsMade() {
		return freeThrowsMade;
	}
	public double getFreeThrowPercent() {
		if(freeThrowsAttempted==0) {
			return 0.0;
		}
		double percent = 100.0 * freeThrowsMade/freeThrowsAttempted;
		return percent;
	}
	public String getName() {
		return name;
	}
	public int getThreePointersAttempted() {
		return threePointersAttempted;
	}
	public int getThreePointersMade() {
		return threePointersMade;
	}
	public double getThreePointerPercent() {
		if(threePointersAttempted==0) {
			return 0.0;
		}
		double percent = 100.0 * threePointersMade/threePointersAttempted;
		return percent;
	}
	public int getTwoPointersAttempted() {
		return twoPointersAttempted;
	}
	public int getTwoPointersMade() {
		return twoPointersMade;
	}
	public double getTwoPointerPercent() {
		if(twoPointersAttempted==0) {
			return 0.0;
		}
		double percent = 100.0 * twoPointersMade/twoPointersAttempted;
		return percent;
	}
	public int getTotalPoints() {
		int totPoints = freeThrowsMade + (2 * twoPointersMade) + ( 3 * threePointersMade);
		return totPoints;
	}
	public void shootFreeThrow(boolean isMade) {
		freeThrowsAttempted++;
		if(isMade) {
			freeThrowsMade++;
		}
	}
	public void shootThreePointer(boolean isMade) {
		threePointersAttempted++;
		if(isMade) {
			threePointersMade++;
		}
	}
	public void shootTwoPointer(boolean isMade) {
		twoPointersAttempted++;
		if(isMade) {
			twoPointersMade++;
		}
	}
	
	@Override
	public String toString() {
		String msg = String.format("Player:%s, points:%d\n   Free Throws: made:%d, "
				+ "attempted:%d, percent:%.1f\n    2 Pointers: made:%d, attempted:%d, "
				+ "percent:%.1f\nThree Pointers: made:%d, attempted:%d, percent:%.1f", 
				name, getTotalPoints(), freeThrowsMade, freeThrowsAttempted, 
				getFreeThrowPercent(), twoPointersMade, twoPointersAttempted, 
				getTwoPointerPercent(), threePointersMade, threePointersAttempted,
				getThreePointerPercent());
		return msg;
	}
}
