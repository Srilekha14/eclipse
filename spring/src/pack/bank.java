package pack;

import java.util.List;

public class bank {
	private String bankName;
	private List<String> locations;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	public bank(String bankName, List<String> locations) {
		super();
		this.bankName = bankName;
		this.locations = locations;
	}
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
