package BankMYsql.com;

import java.util.List;


public interface BankService {

	List<Bank> getAll();
	void saveBank(Bank bk);
	Bank getById(int id);	
	void deleteById(int id);
	
	

}
