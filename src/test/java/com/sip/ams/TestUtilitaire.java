package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUtilitaire {

	@Test
	void testDisplay() {
		assertEquals(Utilitaire.display("Ynov"),"hello Ynov");
	}


	@Test
	void testRacineCarre() {
		assertEquals(Utilitaire.racineCarre(16),4);
	}
	
	@Test
	void testCarre() {
		assertEquals(Utilitaire.carre(3),9);
	}

}
