class InstaTester
{
	public static void main(String[]args)
	{
		State2 state1 = new State2("AP", "Hyderabad");
		state1.displayStateProperties();
		
		State2  state2 = new State2("Maharashatra", "Mumbai");
		
		
		State2[] states = {state1, state2};
		
		Country2  country = new Country2("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address2  address1 = new Address2("hyd street", 62);
		address1.initCountry(country);
		address1.displayAddressProperties();
		
		Address2 address2 = new Address2(" bandra ", 125);
		address2.initCountry(country);
		address2.displayAddressProperties();
		
		Address2[] address = {address1, address2};
		
		Developer2  developer = new Developer2("Mrinal Shetty", "Mrinalshetty@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		 Instagram application = new Instagram ("Instagram", 1.65f);
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