/*
 * SCEE - PIN Point
 *
 * PartyDTO.java
 *
 * ©2008 SCEE. All Rights Reserved
 */
// ---- Package ---------------------------------------------------------------
package net.sony.app.pmdb.dto;
// ---- Import Statements -----------------------------------------------------

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * $Revision: #1 $
 *
 * @Author: apadigal $
 * $Date: 06/03/2017 $
 * Created Date: 06/03/2017 12:44
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
public class PartyDTO implements Serializable {
    // ---- Static ------------------------------------------------------------
    private static final long serialVersionUID = 7857026008719352611L;

    // ---- Constants ---------------------------------------------------------

    // ---- Member Variables --------------------------------------------------
    private Integer partyLevel;

   	private String partyLevelName;

    // ---- Constructors ------------------------------------------------------

    // ---- Other methods -----------------------------------------------------

    // ---- Bean Properties ---------------------------------------------------


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