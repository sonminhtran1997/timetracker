public class Shift {

	private Date startDate;
	private String startTime;
	private String endTime;
	private String note;
	private int breakTime;
	
	public Shift(String startDate, String startTime, String endTime, String note, int breakTime) {
		this.startDate = new Date(startDate);
		this.startTime = startTime;
		this.endTime = endTime;
		this.note = note;
		this.breakTime = breakTime;
	}
	
	public void setDate(String startDate) {
		this.startDate = new Date(startDate);
	}
	
	public void setStartTime(String startTime){
		this.startTime = startTime;

	}
	
	public void setEndTime(String endTime){
		this.endTime = endTime;

	}
	
	public void setBreakTime(int breakTime){
		this.breakTime = breakTime;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
	public String getStartDate() {
		return startDate.toString();
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public int getBreakTime() {
		return breakTime;
	}
	
	public String getNote(){
		return note;
	}
	public String toString() {
		return String.format("%s %s-%s %d\n%s",getStartDate(),getStartTime(),getEndTime(),getBreakTime(),getNote());
	}
	
	public static void main(String[] args){
		Shift test = new Shift("02/01/2017","11:00","16:00","this employee sucks",30);
		System.out.println(test);
	}
	
}
