class Address8
{
	String street;
	int doorNo;
	Country8  country;
	
	Address8(String street, int doorNo)
	{
		System.out.println("invoking Address constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country8  country)
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