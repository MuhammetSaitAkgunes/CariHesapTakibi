package com.MSA.cariHesapTakibiV2.business.abstracts;

import java.util.List;

import com.MSA.cariHesapTakibiV2.core.utilities.results.DataResult;
import com.MSA.cariHesapTakibiV2.core.utilities.results.Result;
import com.MSA.cariHesapTakibiV2.entities.concretes.AccountDetail;

public interface AccountDetailService {

	DataResult<List<AccountDetail>> getAll();
	DataResult<AccountDetail> getById(int id);
	Result add(AccountDetail accountDetail);
}
