class Address6
{
	String street;
	int doorNo;
	Country6   country;
	
	Address6(String street, int doorNo)
	{
		System.out.println("invoking Address constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country6  country)
	{
		System.out.println("invoked method initCountry()");
		this.country = country;
	}
	void displayAddressProperties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("doorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
		
	}
}