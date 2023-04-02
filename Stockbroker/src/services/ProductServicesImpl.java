package services;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import entities.Customer;
import entities.Product;
import entities.Transaction;
import exceptions.ProductException;
import exceptions.TransactionException;

public class ProductServicesImpl implements ProductService {

	@Override
	public String addProduct(Product prod, Map<Integer, Product> products) {
		products.put(prod.getId(), prod);

		return "stock added successfully";

	}

	@Override
	public void viewAllProducts(Map<Integer, Product> products) throws ProductException {
		// TODO Auto-generated method stub
		if (products != null && products.size() > 0) {
			for (Map.Entry<Integer, Product> me : products.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new ProductException("stocks List is empty");
		}
	}

	@Override
	public void deleteProduct(int id, Map<Integer, Product> products) throws ProductException {

		// System.out.println(products);
		if (products != null && products.size() > 0) {

			if (products.containsKey(id)) {
				products.remove(id);
				System.out.println("stock deleted successfully");

			} else {
				throw new ProductException("stock not found");
			}

		} else {
			throw new ProductException("stocks list is empty");
		}

	}

	@Override
	public String updateProduct(int id, Product prod, Map<Integer, Product> products) throws ProductException {

		if (products != null && products.size() > 0) {

			if (products.containsKey(id)) {
				products.put(id, prod);
				return "stock has successfully updated";
			} else {
				throw new ProductException("stock not found");
			}

		} else {
			throw new ProductException("stocks list is empty");
		}

	}


}

