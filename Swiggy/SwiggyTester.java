class SwiggyTester
{
	public static void main(String[]args)
	{
		State6 state1 = new State6("Karnataka", "Banglore");
		State6 state2 = new State6("TN", "Chenai");
		State6[] states = {state1, state2};
                                        
		
		Country6 country = new Country6("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address6  address1 = new Address6("Whitefield", 137);
		address1.initCountry(country);
		
		
		Address6  address2 = new Address6 (" RB nagar", 85);
		address2.initCountry(country);
		
		
		Address6[] address = {address1, address2};
	
		
		Developer6  developer = new Developer6("Priyanaka", "priyankanaik@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Swiggy application = new Swiggy("Swiggy", 1.06f);
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