package com.MSA.cariHesapTakibiV2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSA.cariHesapTakibiV2.business.abstracts.CurrentAccountService;
import com.MSA.cariHesapTakibiV2.core.utilities.results.DataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.Result;
import com.MSA.cariHesapTakibiV2.core.utilities.results.SuccessDataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.SuccessResult;
import com.MSA.cariHesapTakibiV2.dataAccess.abstracts.CurrentAccountDao;
import com.MSA.cariHesapTakibiV2.entities.concretes.CurrentAccount;

@Service
public class CurrentAccountManager implements CurrentAccountService{
	
	private CurrentAccountDao currentAccountDao;

	@Autowired
	public CurrentAccountManager(CurrentAccountDao currentAccountDao) {
		super();
		this.currentAccountDao = currentAccountDao;
	}
	
	@Override
	public DataResult<List<CurrentAccount>> getAll() {
		return new SuccessDataResult<List<CurrentAccount>>(this.currentAccountDao.findAll(),"Cari hesaplar :");
	}

	@Override
	public Result add(CurrentAccount currentAccount) {
		this.currentAccountDao.save(currentAccount);
		return new SuccessResult("Cari hesap eklendi.");
	}

	@Override
	public Result delete(int id) {
		this.currentAccountDao.deleteById(id);
		return new SuccessResult("Kayıt başarıyla silindi.");	
	}
}