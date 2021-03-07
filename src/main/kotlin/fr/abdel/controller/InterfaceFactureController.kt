package fr.abdel.controller

import fr.abdel.service.InterfaceFactureService

interface InterfaceFactureController {

    fun createFacture()
    fun setFactureService(factureService: InterfaceFactureService)
}