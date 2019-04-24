package nl.gragt.controller;

import nl.gragt.model.Bier;
import nl.gragt.service.BierService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bier")
public class BierController {

    private BierService bierService;

    public BierController(BierService bierService) {
        this.bierService = bierService;
    }

    @RequestMapping(value = "")
    public List<Bier> getAllBiers()
    {
        return bierService.getAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Bier getBierById(@PathVariable String id)
    {
        return bierService.getById(id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public void addBier(@RequestBody Bier bier)
    {
        bierService.addBier(bier);
    }
}
