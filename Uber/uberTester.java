class uberTester
{
	public static void main(String[]args)
	{
		State4 state1 = new State4("Karnataka", "Banglore");
		State4 state2 = new State4("Maharashatra", "Mumbai");
		State4[] states = {state1, state2};
                                        
		
		Country4 country = new Country4("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address4 address1 = new Address4("Whitefield", 922);
		address1.initCountry(country);
		
		
		Address4 address2 = new Address4(" Baikula", 165);
		address2.initCountry(country);
		
		
		Address4[] address = {address1, address2};
	
		
		Developer4 developer = new Developer4("Harshita", "Harshitagt@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Uber application = new Uber ("Uber", 5.06f);
		application.initDeveloper(developer);
		application.displayApplicationProperties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
		
	}
}