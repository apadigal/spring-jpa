package net.sony.app.pmdb.controller;

import java.util.List;

import net.sony.app.pmdb.model.PartnerAddress;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.sony.app.pmdb.model.Partner;

@Slf4j
@RestController
@RequestMapping("/partners")
public class PartnerController extends AbstractController{

    @RequestMapping(method = RequestMethod.GET, produces = { APPLICATION_JSON })
    @ResponseStatus(HttpStatus.OK)
    public List<Partner> getPartners() {
        return partnerRepository.findAll();
    }

    @RequestMapping(value="/{guid}", method = RequestMethod.GET, produces = { APPLICATION_JSON })
    @ResponseStatus(HttpStatus.OK)
    public Partner getPartner(@PathVariable Integer guid) {
        return partnerRepository.findOne(guid);
    }

    @RequestMapping(method = RequestMethod.POST, produces = { APPLICATION_JSON })
    @ResponseStatus(HttpStatus.CREATED)
    public void createPartner(@RequestBody Partner partner) {
    	
    	partnerRepository.save(partner);
       
    }

    @RequestMapping(value="/{guid}",method = RequestMethod.PUT, produces = { APPLICATION_JSON })
    @ResponseStatus(HttpStatus.OK)
    public void updatePartner(@RequestBody Partner partner) {

        partnerRepository.save(partner);

    }
}