package merkanto.testingjunit5mockito.controllers;

import merkanto.testingjunit5mockito.fauxspring.Model;
import merkanto.testingjunit5mockito.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
