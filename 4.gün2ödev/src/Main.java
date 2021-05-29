import java.time.LocalDate;

import adapter.MerniceServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Merve", "Çakýroðlu", LocalDate.of(1995, 7, 15), "15416956940"));	
	}

}
