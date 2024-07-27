package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CustomerTest {

	@Test
	public void testStatement() {
		Movie movie1 = new Movie("Regular film", 0);
		Movie movie2 = new Movie("New Releae film", 1);
		Movie movie3 = new Movie("Children film", 2);
		
		Rental rental1 = new Rental(movie1, 1);
		Rental rental2 = new Rental(movie2, 2);
		Rental rental3 = new Rental(movie3, 3);
		
		Customer customer = new Customer("John Doe");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		
		String statement = customer.statement();
		String expectedStatement = "Rental Record for John Doe\n";
		expectedStatement += "\tRegular film	2.0\n";
		expectedStatement += "\tNew Releae film	6.0\n";
		expectedStatement += "\tChildren film	1.5\n";
		expectedStatement += "Amount owed is 9.5\n";
		expectedStatement += "You earned 4 frequent renter points";
		
		assertEquals(statement, expectedStatement);
	}
}
