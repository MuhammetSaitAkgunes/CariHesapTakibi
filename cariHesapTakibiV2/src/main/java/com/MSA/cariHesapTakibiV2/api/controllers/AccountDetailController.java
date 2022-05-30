package com.MSA.cariHesapTakibiV2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MSA.cariHesapTakibiV2.business.abstracts.AccountDetailService;
import com.MSA.cariHesapTakibiV2.core.utilities.results.DataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.Result;
import com.MSA.cariHesapTakibiV2.entities.concretes.AccountDetail;

@RestController
@RequestMapping("/api/accountDetail")
public class AccountDetailController {

	private AccountDetailService accountDetailService;
	
	@Autowired
	public AccountDetailController(AccountDetailService accountDetailService) {
		this.accountDetailService = accountDetailService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<AccountDetail>> getAll(){
		return this.accountDetailService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult getById(int id) {
		return this.accountDetailService.getById(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody AccountDetail accountDetail) {
		return this.accountDetailService.add(accountDetail);
	}
}
