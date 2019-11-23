package com.lti.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Account_Type")
public class AccountType 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_seq")
	@SequenceGenerator(sequenceName = "accholder_seq", name = "type_seq", allocationSize = 1)
	int TypeId;
	
	@Column(name="TYPE")
	String typeName;
	
	@OneToMany(mappedBy = "accountType")
	private List<AccountDetails> ac;
	
	
	public int getTypeId() {
		return TypeId;
	}
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
