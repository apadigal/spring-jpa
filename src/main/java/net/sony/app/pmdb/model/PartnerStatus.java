package net.sony.app.pmdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "partner_status")
public class PartnerStatus {
	
	@Id
	@Column
	private String partnerStatusCode;
	
	@Column
	private String partnerStatusName;

	public String getPartnerStatusCode() {
		return partnerStatusCode;
	}

	public void setPartnerStatusCode(String partnerStatusCode) {
		this.partnerStatusCode = partnerStatusCode;
	}

	public String getPartnerStatusName() {
		return partnerStatusName;
	}

	public void setPartnerStatusName(String partnerStatusName) {
		this.partnerStatusName = partnerStatusName;
	}

}
