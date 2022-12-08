package Lecture;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Curbua Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");

		Product product3 = new Product();
		product3.setName("Kruado Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05343461030");
		individualCustomer.setCustomerNumber("13901266918");
		individualCustomer.setFirstName("Yiğit");
		individualCustomer.setLastName("Yalçın");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("yiba");
		corporateCustomer.setPhone("0523232323");
		corporateCustomer.setTaxNumber("1123123123123");
		corporateCustomer.setCustomerNumber("12232323");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		

	}

}
