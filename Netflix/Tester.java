class Tester
{
	public static void main(String[]args)
	{
		State8 state1 = new State8("Kerala", "Kochi");
		State8 state2 = new State8("Gujrat", "Ahmedabad");
		State8[] states = {state1, state2};
                                        
		
		Country8 country = new Country8("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address8 address1 = new Address8("NH Rd", 625);
		address1.initCountry(country);
		
		
		Address8 address2 = new Address8("kt Nagar", 874);
		address2.initCountry(country);
		
		
		Address8[] address = {address1, address2};
	
		
		Developer8  developer = new Developer8("Kriti", "kritiho1@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Netflix application = new Netflix ("Netflix ", 3.06f);
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