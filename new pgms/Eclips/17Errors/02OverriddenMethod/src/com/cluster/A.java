package com.cluster;

import java.io.IOException;//Added by computer Explicitly

public class A {
	void m1() throws IOException
	{
		
	}

}

class B extends A
{
	void m1()
	{
		//The overriddedn method can ommit the Exception
	}
	}
