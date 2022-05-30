package com.MSA.cariHesapTakibiV2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSA.cariHesapTakibiV2.business.abstracts.AccountDetailService;
import com.MSA.cariHesapTakibiV2.core.utilities.results.DataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.Result;
import com.MSA.cariHesapTakibiV2.core.utilities.results.SuccessDataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.SuccessResult;
import com.MSA.cariHesapTakibiV2.dataAccess.abstracts.AccountDetailDao;
import com.MSA.cariHesapTakibiV2.entities.concretes.AccountDetail;

@Service
public class AccountDetailManager implements AccountDetailService {

	private AccountDetailDao accountDetailDao;
	
	@Autowired
	public AccountDetailManager(AccountDetailDao accountDetailDao) {
		super();
		this.accountDetailDao = accountDetailDao;
	}

	@Override
	public DataResult<List<AccountDetail>> getAll() {
		return new SuccessDataResult<List<AccountDetail>>(this.accountDetailDao.findAll(),"Hesap Detay Listesi");
	}

	@Override
	public DataResult<AccountDetail> getById(int id) {
		return new SuccessDataResult<AccountDetail>(this.accountDetailDao.getById(id));
	}

	@Override
	public Result add(AccountDetail accountDetail) {
		this.accountDetailDao.save(accountDetail);
		return new SuccessResult("Hesap detayları eklendi.");
	}
}
