package com.MSA.cariHesapTakibiV2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.MSA.cariHesapTakibiV2.entities.concretes.AccountDetail;

public interface AccountDetailDao extends JpaRepository<AccountDetail, Integer>{
	

}