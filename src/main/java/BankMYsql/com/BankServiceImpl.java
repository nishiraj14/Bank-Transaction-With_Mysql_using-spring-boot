package BankMYsql.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepository br;

	@Override
	public List<Bank> getAll() {		
		return br.findAll();
	}

	@Override
	public void saveBank(Bank bk) {		
		this.br.save(bk);
	}

	@Override
	public Bank getById(int id) {
		return br.findById(id).get();
	}

	

	@Override
	public void deleteById(int id) {
		br.deleteById(id);
		
	}
 
}
