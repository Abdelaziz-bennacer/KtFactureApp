package fr.abdel.repository

import fr.abdel.entity.Facture

interface InterfaceFactureRepository {

    fun create(facture: Facture){}
}