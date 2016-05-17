package com.cluster;

public class XX {
	void m1() {
		// The overridden method can throw any unchecked Exception regardless of
		// weather super class method throws an Exception or not
	}

}

class YY extends XX {
	void m1() throws ArrayIndexOutOfBoundsException {

	}
}