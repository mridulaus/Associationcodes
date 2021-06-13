class Tester
{
	public static void main(String[]args)
	{
		State7 state1 = new State7("Karnataka", "Banglore");
		State7 state2 = new State7("Maharashatra", "Mumbai");
		State7[] states = {state1, state2};
                                        
		
		Country7 country = new Country7("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address7 address1 = new Address7("Eectronics", 922);
		address1.initCountry(country);
		
		
		Address7 address2 = new Address7(" Baikula", 165);
		address2.initCountry(country);
		
		
		Address7[] address = {address1, address2};
	
		
		Developer7  developer = new Developer7("Nihal", "nihalsn@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Zomato application = new Zomato("Zomato", 1.06f);
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