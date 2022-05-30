package com.MSA.cariHesapTakibiV2.business.abstracts;

import java.util.List;

import com.MSA.cariHesapTakibiV2.core.utilities.results.DataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.Result;
import com.MSA.cariHesapTakibiV2.entities.concretes.CurrentAccount;

public interface CurrentAccountService {
	
	DataResult<List<CurrentAccount>> getAll();
	Result add(CurrentAccount currentAccount);
	Result delete(int id);
}
