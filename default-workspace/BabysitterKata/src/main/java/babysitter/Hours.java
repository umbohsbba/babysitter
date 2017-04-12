package babysitter;

public class Hours {
	private int earlyHourRate = 12;
	private int bedHourRate = 8;
	private int lateHourRate = 16;

	public int getLateHourRate() {
		return lateHourRate;
	}

	public void setLateHourRate(int lateHourRate) {
		this.lateHourRate = lateHourRate;
	}

	public int getEarlyHourRate() {
		return earlyHourRate;
	}

	public void setEarlyHourRate(int earlyHourRate) {
		this.earlyHourRate = earlyHourRate;
	}

	public int getBedHourRate() {
		return bedHourRate;
	}

	public void setBedHourRate(int bedHourRate) {
		this.bedHourRate = bedHourRate;
	}

}
