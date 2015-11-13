package edu.cwu;

/**
 * @author Taban Cosmos
 * 
 * */
public class DriverLicense extends Individual implements
		Comparable<DriverLicense> {

	// Create records
	public static DriverLicense createRecord(String line) {

		String[] records = line.split("  *");
		DriverLicense dl;

		if (records != null) {
			dl = new DriverLicense();
			int month, date, year, id;
			id = Integer.parseInt(records[0]);
			for (int i = 0; i < 1; i++) {
				if (id != i) {

					dl.driverLicNum = id;
					month = Integer.parseInt(records[1]);
					date = Integer.parseInt(records[2]);
					year = Integer.parseInt(records[3]);
					dl.setDate(month, date, year);
					dl.expDate = Integer.parseInt(records[4]);
					dl.setSsnId(records[5]);
					dl.setLname(records[6]);
					dl.setFname(records[7]);
					dl.setMiddleI(records[8]);
				}
			}

		} else {

			dl = null;
			System.out.println("File read ");
		}
		return dl;
	}

	private Integer driverLicNum;

	private int expDate; // expiration date

	public DriverLicense() {
		this.driverLicNum = 0;
		this.expDate = 0;
	}

	@Override
	public int compareTo(DriverLicense o) {
		return this.driverLicNum.compareTo(o.driverLicNum);
	}

	public int getDriverLicNum() {
		return driverLicNum;
	}

	public int getExp() {
		return this.expDate;
	}

	@Override
	public String toString() {
		return " " + this.driverLicNum + " " + this.expDate;
	}

}
