class Tester
{
	public static void main(String[]args)
	{
		State9 state1= new State9("Karnataka", "Banglore");
		state1.displayStateProperties();
		
		State9 state2 = new State9("Ap", "Hyd");
		
		
		State9[] states = {state1, state2};
		
		Country9  country = new Country9("INDIA",12034);
		country.initStates(states);
		country.displayAllCProperties();
		
		Address9 address1 = new Address9("Kormangala", 52);
		address1.initCountry(country);
		address1.displayAddressProperties();
		
		Address9 address2 = new Address9("Nizam Rd ", 412);
		address2.initCountry(country);
		address2.displayAddressProperties();
		
		Address9[] address = {address1, address2};
		
		Developer9 developer = new Developer9("Megha", "meghalp@gmail.com");
		developer.initAddress(address);
		developer.displayAllDevsProperties();
		
		Myntra application = new Myntra("Myntra", 1.06f);
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