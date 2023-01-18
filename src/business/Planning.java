package business;

import java.util.Date;

public class Planning {
	
	private Date date;

	/**
	 * @param date
	 */
	public Planning(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Palnning [date = " + date + "]";
	}
	
	
	

}
