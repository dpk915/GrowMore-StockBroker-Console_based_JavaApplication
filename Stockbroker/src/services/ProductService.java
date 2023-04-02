package services;



import java.util.List;
import java.util.Map;

import entities.Customer;
import entities.Product;
import entities.Transaction;
import exceptions.DuplicateDataException;
import exceptions.ProductException;
import exceptions.TransactionException;

public interface ProductService {

	public String addProduct(Product pro, Map<Integer, Product> products);

	public void viewAllProducts(Map<Integer, Product> products) throws ProductException;

	public void deleteProduct(int id, Map<Integer, Product> products) throws ProductException;

	public String updateProduct(int id, Product prod, Map<Integer, Product> products) throws ProductException;

	
	
}
