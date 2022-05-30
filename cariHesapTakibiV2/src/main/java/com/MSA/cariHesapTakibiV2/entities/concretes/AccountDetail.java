package com.MSA.cariHesapTakibiV2.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.MSA.cariHesapTakibiV2.entities.concretes.AccountDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AccountDetail")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","CurrentAccount"})
public class AccountDetail {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Column(name = "Date")
	private Date date;
	
	@NotNull
	@Column(name = "Receipt_Code")
	private String receiptCode;
	
	@NotNull
	@Column(name = "Receipt_Date")
	private Date receiptDate;
	
	@NotNull
	@Column(name = "Receipt_Detail")
	private String receiptDetail;
	
	@NotNull
	@Column(name = "Debt")
	private Float debt;
	
	@NotNull
	@Column(name = "WReceive")
	private Float wReceive;
	
	@NotNull
	@Column(name = "Balance")
	private Float balance;
	
	@NotNull
	@Column(name = "Type")
	private String type;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "accountDetail")
	@JsonIgnore
	private CurrentAccount currentAcount;
}
