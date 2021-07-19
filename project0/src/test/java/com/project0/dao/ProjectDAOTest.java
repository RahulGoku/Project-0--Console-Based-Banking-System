package com.project0.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.project0.dao.impl.ProjectDaoImpl;
import com.project0.exception.BankingException;

class ProjectDAOTest {

	private static ProjectDAO service;

	@BeforeAll
	public static void setup() {
		service = new ProjectDaoImpl();
	}

	@Test
	void testCreateAccount() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCustomerByEmailId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCustomerByPassword() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeByEmailId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeByPassword() {
		fail("Not yet implemented");
	}

	@Test
	void testOpenAccount() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCustomerId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTransactionCredit() {
		try {
			assertEquals(1000f,service.getTransactionCredit(4));
		} catch (BankingException e) {
			fail("No Account Found");
		}
	}

	@Test
	void testGetTransactionDebit() {
		try {
			assertEquals(1000f,service.getTransactionCredit(4));
		} catch (BankingException e) {
			fail("No Account Found");
		}
	}

	@Test
	void testGetTransactionTransfer() {
		try {
			assertEquals(1000f,service.getTransactionCredit(4));
		} catch (BankingException e) {
			fail("No Account Found");
		}
	}

	@Test
	void testGetTransactionTotalAmount() {
		try {
			assertEquals(1000f,service.getTransactionCredit(4));
		} catch (BankingException e) {
			fail("No Account Found");
		}
	}

	

	@Test
	void testGetViewStatement() {
		
	}

	@Test
	void testGetCustomerByCustomerIdString() {
		try {
			assertEquals(4,service.getCustomerByCustomerId("rrjn@1gmail.com"));
		} catch (BankingException e) {
		 fail("Account not Found");
			
		}
		
	}

	@Test
	void testGetCustomerByCustomerIdInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCreditMoney() {
		fail("Not yet implemented");
	}

	@Test
	void testDeductMoney() {
		fail("Not yet implemented");
	}

	@Test
	void testTransferMoney() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCheckForAccount() {
		try {
			assertTrue(service.getCheckForAccount(10));
		} catch (BankingException e) {
			fail("No Account");
		}
	}

}
