package fr.abdel.repository.memory

import fr.abdel.entity.Facture
import fr.abdel.repository.InterfaceFactureRepository
import org.springframework.stereotype.Repository


private var factures = mutableListOf<Facture>()

@Repository
class FactureRepositoryMemory: InterfaceFactureRepository {


    override fun create(facture: Facture){
        factures.add(facture)
        println("Facture enregistrée avec le numéro ${facture.number} pour ${facture.cutomerName}")
    }
}