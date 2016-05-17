package com.cluster;

import java.sql.SQLException;

public class XXX {
	void m1() {
		// It cannot throw upper level Exception it can through only lower level
		// exception
	}

}

class YYY extends XXX {
	void m1() throws SQLException {

	}
}