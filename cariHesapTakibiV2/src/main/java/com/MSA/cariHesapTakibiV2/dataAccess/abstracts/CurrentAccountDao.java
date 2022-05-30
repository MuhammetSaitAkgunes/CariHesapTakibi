package com.MSA.cariHesapTakibiV2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.MSA.cariHesapTakibiV2.entities.concretes.CurrentAccount;

public interface CurrentAccountDao extends JpaRepository<CurrentAccount, Integer> {

}