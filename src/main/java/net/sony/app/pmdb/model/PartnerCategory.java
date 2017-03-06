package net.sony.app.pmdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partner_category")
public class PartnerCategory {

	@Id
	@Column
	private String partnerCategoryCode;
	
	@Column
	private String partnerCategoryName;

	public String getPartnerCategoryCode() {
		return partnerCategoryCode;
	}

	public void setPartnerCategoryCode(String partnerCategoryCode) {
		this.partnerCategoryCode = partnerCategoryCode;
	}

	public String getPartnerCategoryName() {
		return partnerCategoryName;
	}

	public void setPartnerCategoryName(String partnerCategoryName) {
		this.partnerCategoryName = partnerCategoryName;
	}
}
