package fr.abdel.service

import fr.abdel.entity.Facture
import fr.abdel.repository.InterfaceFactureRepository

interface InterfaceFactureService {


        fun createFacture(facture: Facture)
        fun setFactureRepository(factureRepository: InterfaceFactureRepository)

}