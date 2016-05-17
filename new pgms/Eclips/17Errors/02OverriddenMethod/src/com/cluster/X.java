package com.cluster;

import java.io.IOException;

public class X {
	void m1() throws IOException {

	}

}

class Y extends X {
	void m1() throws IOException {
		// The overridden method can throw the same method level Exception as
		// used with the super class method
	}
}
