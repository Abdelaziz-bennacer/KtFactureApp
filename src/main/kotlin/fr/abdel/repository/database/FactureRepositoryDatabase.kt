package fr.abdel.repository.database

import fr.abdel.entity.Facture
import fr.abdel.repository.InterfaceFactureRepository
import org.springframework.stereotype.Repository

@Repository
class FactureRepositoryDatabase: InterfaceFactureRepository {

    /*
    PreparedStatement...
     */

    override fun create(facture: Facture){
        println("Database: Facture enregistrée avec le numéro ${facture.number} pour ${facture.cutomerName}")
    }
}