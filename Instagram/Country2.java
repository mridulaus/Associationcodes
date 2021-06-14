class Country2{
String  name;
int code;
State2[] states;

Country2(String name , int code ){
System.out.println("invoked Country() ");

this.name = name;
this.code = code;

}

void initStates(State2[] states)
	{
		if(states!=null)
		System.out.println("invoking method initStates()");
		this.states = states;
	}

 void displayAllCProperties(){
  System.out.println( " Country name  is   " + this.name );
    System.out.println( " Code is   " + this.code );
	 
	  
	  if( this.states != null ){
	   for (int i = 0 ; i < this.states.length ; i++){
	     this.states[i].displayStateProperties();
	   }
	  }
	  
  }
}

