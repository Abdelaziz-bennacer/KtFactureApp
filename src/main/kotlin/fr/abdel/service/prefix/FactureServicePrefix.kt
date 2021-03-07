package fr.abdel.service.prefix

import fr.abdel.entity.Facture
import fr.abdel.repository.InterfaceFactureRepository
import fr.abdel.service.InterfaceFactureService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class FactureServicePrefix: InterfaceFactureService {

    @Value("\${facture.lastNumber}")
    var lastNumber: Long = 0

    @Value("\${facture.prefix}")
    lateinit var prefix: String

    @Autowired
    private lateinit var factureRepository: InterfaceFactureRepository

    override fun setFactureRepository(factureRepository: InterfaceFactureRepository) {
        this.factureRepository = factureRepository
    }

    override fun createFacture(facture: Facture){
        facture.number = prefix + (++lastNumber)
        factureRepository.create(facture)
    }
}