package com.MSA.cariHesapTakibiV2.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CurrentAccount")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","AccountDetail"})
public class CurrentAccount {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Account_Detail")
	private AccountDetail accountDetail;
	
	@NotNull
	@JoinColumn(name = "Account_Content")
	private String accountContent;
	
	@NotNull
	@Column(name = "Tax_Number")
	private String taxNumber;
	
	@NotNull
	@Column(name = "Tax_Administration")
	private String taxAdministration;
	
	@NotNull
	@Column(name = "Address")
	private String address;
}
