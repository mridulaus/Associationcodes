class Country7{
String  name;
int code;
State7[] states;

Country7(String name , int code ){
System.out.println("invoked Country() ");

this.name = name;
this.code = code;

}

void initStates(State7[] states)
	{
		if(states!=null)
		System.out.println("invoking method initStates()");
		this.states = states;
	}

 void displayAllCProperties(){

System.out.println("invoking method displayAllCProperties()");
  System.out.println( " Country name  is   " + this.name );
    System.out.println( " Code is   " + this.code );
	 
	  
	  if( this.states != null ){
	   for (int i = 0 ; i < this.states.length ; i++){
System.out.println( " Country Size is   " + this.states.length );
	     this.states[i].displayStateProperties();
	   }
	  }
	  
  }
}

