package services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import entities.Customer;
import entities.Product;
import entities.Transaction;
import exceptions.DuplicateDataException;
import exceptions.InvalidDetailsException;
import exceptions.ProductException;
import exceptions.TransactionException;

public interface CustomerService {

	public boolean login(String email,String password, Map<String, Customer> customers) throws InvalidDetailsException;

	public void signUp(Customer cus, Map<String, Customer> customers) throws DuplicateDataException;

	public boolean buyProduct(int id, int qty, String email, Map<Integer, Product> products,
			Map<String, Customer> customers, List<Transaction> transactions)
			throws InvalidDetailsException, ProductException;

	public boolean addMoneyToWallet(double amount, String email, Map<String, Customer> customers);

	public double viewWalletBalance(String email, Map<String, Customer> customers);

	public Customer viewCustomerDetails(String email, Map<String, Customer> customers);

	public List<Customer> viewAllCustomers(Map<String, Customer> customers) throws ProductException;
   
	public boolean sellProduct(int id, int qty, String email, Map<Integer, Product> products,
			Map<String, Customer> customers, List<Transaction> transactions)
			throws InvalidDetailsException, ProductException;
}

