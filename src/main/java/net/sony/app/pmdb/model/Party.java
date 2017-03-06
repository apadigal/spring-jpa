package net.sony.app.pmdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="party")
public class Party {
	
	@Id
	@Column(name="party_level", nullable=false)
	private Integer partyLevel;
	
	@Column(nullable=false, length=48)
	private String partyLevelName;
	
	
	public Integer getPartyLevel() {
		return partyLevel;
	}

	public void setPartyLevel(Integer partyLevel) {
		this.partyLevel = partyLevel;
	}

	public String getPartyLevelName() {
		return partyLevelName;
	}

	public void setPartyLevelName(String partyLevelName) {
		this.partyLevelName = partyLevelName;
	}



}
