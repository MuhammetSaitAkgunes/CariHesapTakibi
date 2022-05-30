package com.MSA.cariHesapTakibiV2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MSA.cariHesapTakibiV2.business.abstracts.CurrentAccountService;
import com.MSA.cariHesapTakibiV2.core.utilities.results.DataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.Result;
import com.MSA.cariHesapTakibiV2.entities.concretes.CurrentAccount;

@RestController
@RequestMapping("/api/currentAccount")
public class CurrentAccountController {

	private CurrentAccountService currentAccountService;
	
	@Autowired
	public CurrentAccountController(CurrentAccountService currentAccountService) {
		 this.currentAccountService = currentAccountService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CurrentAccount>> getAll(){
		return this.currentAccountService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CurrentAccount currentAccount) {
		return this.currentAccountService.add(currentAccount);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.currentAccountService.delete(id);
	}
	
}
