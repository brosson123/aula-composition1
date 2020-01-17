package entitis;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valePerHour, Integer hours) {
		super();
		this.date = date;
		this.valePerHour = valePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValePerHour() {
		return valePerHour;
	}

	public void setValePerHour(Double valePerHour) {
		this.valePerHour = valePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
}
