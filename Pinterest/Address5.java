class Address5
{
	String street;
	int doorNo;
	Country5  country;
	
	Address5(String street, int doorNo)
	{
		System.out.println("invoking Address constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country5  country)
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