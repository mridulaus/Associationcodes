class Developer1{
String name;
String email;
Address1[] addresses;

Developer1(String name, String email ){
System.out.println("invoked Adress() ");
this.name=name;
this.email = email;


}

void initAddress(Address1[] addresses)
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
				System.out.println(this.addresses[a]);
			}
		}
		
}


}