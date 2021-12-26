package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateAddressTest {

	//EANG SOKUNTHEA 20180280
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"hanoi, true",
		"4327467, false",
		", false"
	})

	void test(String address, boolean expected) {
		boolean isValid = placeOrderController.validateName(address);
		assertEquals(expected, isValid);
	}

}
