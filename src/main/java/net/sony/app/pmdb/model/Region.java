/*
 * SCEE - PIN Point
 *
 * Region.java
 *
 * ©2008 SCEE. All Rights Reserved
 */
// ---- Package ---------------------------------------------------------------
package net.sony.app.pmdb.model;
// ---- Import Statements -----------------------------------------------------

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * $Revision: #1 $
 *
 * @Author: apadigal $
 * $Date: 03/03/2017 $
 * Created Date: 03/03/2017 08:36
 */
@Entity
@Table
public class Region {
    // ---- Static ------------------------------------------------------------

    // ---- Constants ---------------------------------------------------------

    // ---- Member Variables --------------------------------------------------
    @Id
    @Column
    private String regionCode;

    @Column
    private  String regionName;

    // ---- Constructors ------------------------------------------------------

    // ---- Other methods -----------------------------------------------------

    // ---- Bean Properties ---------------------------------------------------


    public String getRegionCode() {
        return regionCode;
    }

    public String getRegionName() {
        return regionName;
    }
}