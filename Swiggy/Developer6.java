class Developer6{
String name;
String email;
Address6[] addresses;

Developer6(String name, String email ){
System.out.println("invoked Adress() ");
this.name=name;
this.email = email;


}

void initAddress(Address6[] addresses)
	{
		if(addresses!=null)
		System.out.println("invoking method initAddress()");
		this.addresses = addresses;
	}
	
void displayAllDevsProperties(){
	System.out.println("Start of displayAllDevsProperties()");
		System.out.println(this.name);
		System.out.println(this.email);
		
		if(this.addresses!=null)
		{
		System.out.println("DeveloperAddress: "+this.addresses.length);
			for(int a=0; a<this.addresses.length; a++)
			{
				this.addresses[a].displayAddressProperties();
			}
		}
		
}


}