package optionalclass;

import java.util.Optional;



public class QOptional {
	
	public static Optional<String> getAddress() {
		Optional<String> optional=Optional.of("Hyderabad");
		return optional;
	}

	public static void main(String[] args) {
                       Optional<String> address = getAddress();
                       if(address.isPresent()) {
                    	   String string = address.get();
                    	   System.out.println(string);
                       }
                       
                       Optional<String> optionalValue = Optional.ofNullable("test");
                       if(optionalValue.isPresent()) {
                    	   String string = optionalValue.get();
                    	   System.out.println(string);
                       }
	}

}
