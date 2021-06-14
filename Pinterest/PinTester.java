class PinTester
{
	public static void main(String[]args)
	{
		State5 state1 = new State5("Delhi", "South Delhi");
		State5 state2 = new State5("Bubneshwar", "Odisha");
		State5 [] states = {state1, state2};
                                        
		
		Country5 country = new Country5("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address5 address1 = new Address5("Lajpat Rd", 922);
		address1.initCountry(country);
		
		
		Address5  address2 = new Address5(" MD Rd", 165);
		address2.initCountry(country);
		
		
		Address5[] address = {address1, address2};
	
		
		Developer5 developer = new Developer5("Akhila Gowda", "akhilagowda@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Pinterest application = new Pinterest("pinterest", 6.1f);
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