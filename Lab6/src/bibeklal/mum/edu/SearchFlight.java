package bibeklal.mum.edu;

import java.util.Arrays;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SearchFlight {
	private String from;
	private String to;
	private String departureDate;
	private String returnDate;
	private String trip;
	private String[] selectedOptions;

	public SearchFlight(){
		
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}
	

	public String[] getSelectedOptions() {
		return selectedOptions;
	}

	public void setSelectedOptions(String[] selectedOptions) {
		this.selectedOptions = selectedOptions;
	}

	public void search(){
		System.out.println("From: " + this.getFrom());
		System.out.println("To: " + this.getTo());
		System.out.println("Departure Date: "+ this.getDepartureDate());
		System.out.println("Return Date: " + this.getReturnDate());
		System.out.println("Trip: " + this.getTrip());
		System.out.println("Options: " + Arrays.toString(this.getSelectedOptions()));
	}

}
