package net.sony.app.pmdb.model;

import javax.persistence.*;

import net.sony.app.pmdb.model.converter.PartnerCategoryConverter;
import net.sony.app.pmdb.model.converter.PartyLevelConverter;

import java.util.Collection;

@Entity
@Table(name = "partner")
public class Partner extends TransactionEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer guid;

	@Column(nullable = false, length = 255)
	private String partnerName;

	@Column(nullable = false, length = 255)
	private String displayName;

	@ManyToOne
	@JoinColumn(name="party_level")
	@Convert(converter = PartyLevelConverter.class)
	private Party partyLevel;
	
	@ManyToOne
	@JoinColumn(nullable=false, name="partner_category_code")
	@Convert(converter=PartnerCategoryConverter.class)
	private PartnerCategory partnerCategory;
	
	@ManyToOne
	@JoinColumn(nullable=false, name="partner_status_code")
	private PartnerStatus partnerStatus;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="guid")
	private Collection<PartnerAddress> partnerAddresses;
	
	@Column(nullable=true, length=64)
	private String updatedBy;

	@Column(nullable=false, length=64)
	private String createdBy;

	@Version
	private Integer version;
	
	public Integer getGuid() {
		return guid;
	}

	public void setGuid(Integer guid) {
		this.guid = guid;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public Integer getVersion() {
		return version;
	}

	public Party getPartyLevel() {
		return partyLevel;
	}

	public void setPartyLevel(Party partyLevel) {
		this.partyLevel = partyLevel;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public PartnerCategory getPartnerCategory() {
		return partnerCategory;
	}

	public void setPartnerCategory(PartnerCategory partnerCategory) {
		this.partnerCategory = partnerCategory;
	}
	
	public PartnerStatus getPartnerStatus() {
		return partnerStatus;
	}

	public void setPartnerStatus(PartnerStatus partnerStatus) {
		this.partnerStatus = partnerStatus;
	}

	public Collection<PartnerAddress> getPartnerAddresses() {
		return partnerAddresses;
	}

	public void setPartnerAddresses(Collection<PartnerAddress> partnerAddresses) {
		this.partnerAddresses = partnerAddresses;
	}

	@Override
	@PrePersist
	public void prePersist()
	{
		super.prePersist();
		if (this.partnerStatus == null)
		{
			this.partnerStatus = new PartnerStatus();
			this.partnerStatus.setPartnerStatusCode("ACTIVE");
		}
	}

}
