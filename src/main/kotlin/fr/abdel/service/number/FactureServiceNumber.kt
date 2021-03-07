package fr.abdel.service.number

import fr.abdel.entity.Facture
import fr.abdel.repository.InterfaceFactureRepository
import fr.abdel.service.InterfaceFactureService
import org.springframework.stereotype.Service

private var lastNumber: Long = 0L
@Service
class FactureServiceNumber: InterfaceFactureService {


    private lateinit var factureRepository: InterfaceFactureRepository

    override fun createFacture(facture: Facture) {
        facture.number = (++lastNumber).toString()
        factureRepository.create(facture)
        }

    override fun setFactureRepository(factureRepository: InterfaceFactureRepository) {
        this.factureRepository = factureRepository
    }



}