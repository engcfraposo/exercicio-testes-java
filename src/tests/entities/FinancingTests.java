package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	@Test
	public void constructorShouldCreateObjectWhenValidData() {

		double expectedTotalAmount = 100000.0;
		double expectedIncome = 2000.0;
		Integer expectedMonths = 80;

		Financing fin = FinancingFactory.createFinancing(expectedTotalAmount, expectedIncome, expectedMonths);

		Assertions.assertEquals(expectedTotalAmount, fin.getTotalAmount());
		Assertions.assertEquals(expectedIncome, fin.getIncome());
		Assertions.assertEquals(expectedMonths, fin.getMonths());
	}

	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {

		double expectedTotalAmount = 100000.0;
		double expectedIncome = 2000.0;
		Integer expectedMonths = 20;

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(expectedTotalAmount, expectedIncome, expectedMonths);
		});
	}

	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		double newTotalAmount = 90000.0;

		Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

		fin.setTotalAmount(newTotalAmount);

		Assertions.assertEquals(newTotalAmount, fin.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		double newTotalAmount = 110000.0;

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);
			fin.setTotalAmount(newTotalAmount);
		});
	}

	@Test
	public void setIncomeShouldSetDataWhenValidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		double newIncome = 2100.0;

		Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

		fin.setIncome(newIncome);

		Assertions.assertEquals(newIncome, fin.getIncome());
	}

	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		double newIncome = 1900.0;

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);
			fin.setIncome(newIncome);
		});
	}

	@Test
	public void setMonthsShouldSetDataWhenValidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		Integer newMonths = 81;

		Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

		fin.setMonths(newMonths);

		Assertions.assertEquals(newMonths, fin.getMonths());
	}

	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		Integer newMonths = 79;

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);
			fin.setMonths(newMonths);
		});
	}

	@Test
	public void entryShouldGetEntryWhenValidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		double expectedEntry = 20000.0;

		Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

		Assertions.assertEquals(expectedEntry, fin.entry());
	}

	@Test
	public void quotaShouldGetQuotaWhenValidData() {

		double initialTotalAmount = 100000.0;
		double initialIncome = 2000.0;
		Integer initialMonths = 80;
		double expectedQuota = 1000.0;

		Financing fin = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

		Assertions.assertEquals(expectedQuota, fin.quota());
	}
}
