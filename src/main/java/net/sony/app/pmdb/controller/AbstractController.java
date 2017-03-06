/*
 * SCEE - PIN Point
 *
 * AbstractControllers.java
 *
 * ©2008 SCEE. All Rights Reserved
 */
// ---- Package ---------------------------------------------------------------
package net.sony.app.pmdb.controller;
// ---- Import Statements -----------------------------------------------------

import net.sony.app.pmdb.repository.AddressTypeRepository;
import net.sony.app.pmdb.repository.PartnerRepository;
import net.sony.app.pmdb.repository.PartyRepository;
import net.sony.app.pmdb.repository.RegionRepository;
import org.hibernate.StaleObjectStateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by IntelliJ IDEA.
 * $Revision: #1 $
 *
 * @Author: apadigal $
 * $Date: 03/03/2017 $
 * Created Date: 03/03/2017 09:12
 */
public class AbstractController {
    // ---- Static ------------------------------------------------------------
    protected static final String APPLICATION_JSON = "application/json";

    // ---- Constants ---------------------------------------------------------

    // ---- Member Variables --------------------------------------------------

    @Autowired
    protected PartnerRepository partnerRepository;

    @Autowired
    protected PartyRepository partyRepository;

    @Autowired
    protected RegionRepository regionRepository;

    @Autowired
    protected AddressTypeRepository addressTypeRepository;

    // ---- Constructors ------------------------------------------------------

    // ---- Other methods -----------------------------------------------------

    // ---- Exception Handling -----------------------------------------------------
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(StaleObjectStateException.class)
    @ResponseBody
    public String handleStaleObjectStateException(StaleObjectStateException exception) {
        return " Stale Data : Already updated by another user";
    }

}