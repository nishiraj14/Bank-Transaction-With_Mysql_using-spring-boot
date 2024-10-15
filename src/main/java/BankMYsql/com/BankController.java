package BankMYsql.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankController {
	
	@Autowired
	private BankService BS;


	 @GetMapping("/")
	public String home(Model md)
	{
		 md.addAttribute("listTransaction",BS.getAll());
		return "index";
	}
	 @GetMapping("/newTransaction")
	 public String newTransaction(Model md)
	 {
		 Bank bk=new Bank();
		 md.addAttribute("bk",bk);
		 return "create_bank";
	 }
	 
	//------To save data-----
		
		@PostMapping("/saveTransaction")
		public String saveBank(@ModelAttribute("bk") Bank bk)
		{
			BS.saveBank(bk);
			return "redirect:/";		
		}
		
		//---------Update data-----
		
		@GetMapping("/showFormForUpdate/{id}")
		public String editBank(@PathVariable(value="id") int id, Model model)
		{
			Bank bk=BS.getById(id);
			model.addAttribute("bk",bk);
			return "edit_bank";		
		}
		
		@GetMapping("/deleteTransaction/{id}")
		public String deleteBank(@PathVariable(value="id") int id)
		{
			this.BS.deleteById(id);
			return "redirect:/";
			
		}
	

}
