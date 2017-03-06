package net.sony.app.pmdb.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.sony.app.pmdb.model.Partner;
import net.sony.app.pmdb.model.Party;

@RestController
@RequestMapping("/party")
public class PartyController extends AbstractController{

    @RequestMapping(method = RequestMethod.GET, produces = { APPLICATION_JSON })
    @ResponseStatus(HttpStatus.OK)
    public List<Party> getParty() {
        return partyRepository.findAll();
    }
    
    @RequestMapping(value="/{partyLevel}/partner", method = RequestMethod.GET, produces = { APPLICATION_JSON })
    @ResponseStatus(HttpStatus.OK)
    public List<Partner> getPartyPartner(@PathVariable Integer partyLevel) {
        return partnerRepository.findByPartyLevel(partyRepository.findOne(partyLevel));
    }
    

}