package fr.abdel.controller.web

import fr.abdel.controller.InterfaceFactureController
import fr.abdel.entity.Facture
import fr.abdel.service.InterfaceFactureService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class FactureControllerWeb: InterfaceFactureController {

    @Autowired
    private lateinit var factureService: InterfaceFactureService

    override fun setFactureService(factureService: InterfaceFactureService) {
        this.factureService = factureService
    }

    override fun createFacture(){
        val customerName = "Tesla"
        val facture = Facture()
        facture.cutomerName = customerName

        factureService.createFacture(facture)
    }
}