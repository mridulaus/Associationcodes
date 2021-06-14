class Whatsapp
{
	String appName;
	float version;
	Developer1 developer;
	
	Whatsapp(String appName, float version)
	{
		System.out.println("invoking Application constructor");
		this.appName = appName;
		this.version = version;
	}
	
	
	void initDeveloper(Developer developer)
	{
		System.out.println("invoking method initDeveloper()");
		this.developer = developer;
	}
	
	void displayApplicationProperties()
	{
		System.out.println("AppName: "+this.appName);
		System.out.println("AppVersion: "+this.version);
		System.out.println("AppDeveloper: "+this.developer);
	}
	
	
	void displayDeveloperName()
	{
		System.out.println("DeveloperName is : --  "+this.developer.name);
	}
	
	
	void displayDeveloperAddressSize()
	{
		if(this.developer.addresses!=null){
		System.out.println("DeveloperAddressSize: "+this.developer.addresses.length);
		}
	}
	
	
	void displayDeveloperCountryStateSize()
	{
		if(this.developer.addresses!=null)
		{
			for(int i=0; i<this.developer.addresses.length;i++)
			{
				Address address =developer.addresses[i];
				String street = address.street ;
				Country cont = address.country;
				State[] states = cont.states;
				System.out.println("SizeOfStates: "+states.length);
			}
		}
	}
	
	void displayDeveloperAddressStreet()
	{
		if(this.developer.addresses!=null)
		{
			for(int j=0; j<this.developer.addresses.length; j++)
			{
				Address address = developer.addresses[j];
				String street = address.street;
				System.out.println("Street: "+street);
			}
		}
	}
	void displayDeveloperCountry()
	{
		if(this.developer.addresses!=null)
		{
			for(int k=0; k<this.developer.addresses.length; k++)
			{
				Address address= developer.addresses[k];
				Country country = address.country;
				System.out.println("CountryName: "+country.name);
				//System.out.println("CountryCode: "+country.code);
			}
		}
	}
	void displayDeveloperCityName()
	{
		if(this.developer.addresses!=null)
		{
			for(int x=0; x<this.developer.addresses.length; x++)
			{
				Address address = developer.addresses[x];
				Country country = address.country;
				State[] states = country.states;
				for(int index=0; index<states.length; index++)	
				{ 
					State state =states[index];
					String capitalCityName = state.capitalCity;
					System.out.println("CapitalCityName: "+capitalCityName);
				}
				
			}
		}
	}
	
	
}
//void displayAllAppProperties(){
	//System.out.println("Start of displayAllAppProperties()");
	//System.out.println(this.name);
		//System.out.println(this.email);
		
		//if(this.developer!=null)
		//{
		//this.developer.displayAllDevsProperties();
		//}
		
	