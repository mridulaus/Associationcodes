class Tester
{
	public static void main(String[]args)
	{
		State state1 = new State("Goa", "Panaji");
		state1.displayStateProperties();
		
		State state2 = new State("Maharashatra", "Mumbai");
		
		
		State[] states = {state1, state2};
		
		Country country = new Country("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address address1 = new Address("St. Anne's Junction", 102);
		address1.initCountry(country);
		address1.displayAddressProperties();
		
		Address address2 = new Address("Dr Dada Vaidya Rd ", 125);
		address2.initCountry(country);
		address2.displayAddressProperties();
		
		Address[] address = {address1, address2};
		
		Developer developer = new Developer("Mridua Shetty", "Mridulashetty@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Application application = new Application("Snapchat", 1.06f);
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