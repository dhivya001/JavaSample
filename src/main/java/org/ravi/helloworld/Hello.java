package org.ravi.helloworld;

public class Hello {
	
	public String displayHelloMessage(String message){
		String msg;
		if(message != null) {
			msg = message;
		} else {
			msg = "test";	
		}

		return msg;
	}

}
