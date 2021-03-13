package fr.abdel.controller.scanner

import fr.abdel.controller.InterfaceFactureController
import fr.abdel.entity.Facture
import fr.abdel.service.InterfaceFactureService
import org.springframework.stereotype.Controller

//@Controller
class FactureControllerScanner: InterfaceFactureController {

    private lateinit var factureService: InterfaceFactureService

    fun getFactureService(): InterfaceFactureService {
        return factureService
    }

    override fun setFactureService(factureService: InterfaceFactureService) {
            this.factureService = factureService
    }

    override fun createFacture() {
        println("Usage d'un scanner de codes barres")
        val facture = Facture()
        facture.cutomerName = "Virgin Galactic"
        factureService.createFacture(facture)
    }

}