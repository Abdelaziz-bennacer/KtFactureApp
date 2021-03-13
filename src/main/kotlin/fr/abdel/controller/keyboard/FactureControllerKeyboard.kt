package fr.abdel.controller.keyboard

import fr.abdel.controller.InterfaceFactureController
import fr.abdel.entity.Facture
import fr.abdel.service.InterfaceFactureService
import org.springframework.stereotype.Controller
import java.util.*

//@Controller
class FactureControllerKeyboard: InterfaceFactureController {

    private lateinit var factureService: InterfaceFactureService

    override fun setFactureService(factureService:InterfaceFactureService) {

        this.factureService = factureService
    }

    override fun createFacture(){

        println("Quel est le nom du client?")
        val sc = Scanner(System.`in`)
        val customerName = sc.nextLine()
        val facture = Facture()
        facture.cutomerName = customerName

        factureService.createFacture(facture)
    }



}