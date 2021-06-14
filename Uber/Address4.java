class Address4
{
	String street;
	int doorNo;
	Country4   country;
	
	Address4(String street, int doorNo)
	{
		System.out.println("invoking Address constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country4  country)
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