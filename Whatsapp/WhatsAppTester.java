class WhatsAppTester
{
	public static void main(String[]args)
	{
		State1 state1 = new State1("Karnataka", "Banglore");
		state1.displayStateProperties();
		
		State1  state2 = new State1("WB", "Kolkatta");
		state2.displayStateProperties();
		
		State1[] states = {state1, state2};
		
		Country1  country = new Country1("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address1 address1 = new Address1(" HSR Layout", 52);
		address1.initCountry(country);
		address1.displayAddressProperties();
		
		Address1 address2 = new Address1("BTM ", 135);
		address2.initCountry(country);
		address2.displayAddressProperties();
		
		Address1[] address = {address1, address2};
		
		Developer1  developer = new Developer1 ("Darshan", "DarshanLP@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Whatsapp application = new Whatsapp ("Whatsapp", 2.06f);
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