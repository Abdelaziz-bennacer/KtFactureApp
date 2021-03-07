package fr.abdel


import fr.abdel.controller.InterfaceFactureController
import fr.abdel.service.InterfaceFactureService
import fr.abdel.service.prefix.FactureServicePrefix
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.*

@Configuration
@ComponentScan("fr.abdel.controller.web", /*"fr.abdel.repository.database",*/ "fr.abdel.service.prefix")
@PropertySource("classpath:application.properties")
open class MainApp

@Bean
fun configure(): InterfaceFactureService{
    return FactureServicePrefix()
}


fun main(args:Array<String>) {


    //val context: ApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
    val context: ApplicationContext = AnnotationConfigApplicationContext(MainApp::class.java)
    val factureController = context.getBean(InterfaceFactureController::class.java)

    factureController.createFacture()
}





   /* val sc = Scanner(System.`in`)
    println("Quelle est la classe du controller?")
    val controllerClass = sc.nextLine()

    println("Quelle est la classe du service?")
    val serviceClass = sc.nextLine()

    println("Quelle est la classe du repository?")
    val repositoryClass = sc.nextLine()

    lateinit var factureController: InterfaceFactureController

    lateinit var factureService: InterfaceFactureService

    lateinit var factureRepository: InterfaceFactureRepository

    try {
        factureController =
            Class.forName(controllerClass).getDeclaredConstructor().newInstance() as InterfaceFactureController

        factureService =
            Class.forName(serviceClass).getDeclaredConstructor().newInstance() as InterfaceFactureService

        factureRepository =
            Class.forName(repositoryClass).getDeclaredConstructor().newInstance() as InterfaceFactureRepository

    }catch (e: Exception){
        e.printStackTrace()
    }

    factureController.setFactureService(factureService)
    factureService.setFactureRepository(factureRepository)

    factureController.createFacture()*/

   /* val sc = Scanner(System.`in`)

    println("Quel est le type de controller? 1(Console) - 2(WebForm) - 3(Scanner)")
    val controllerType: Int = sc.nextInt()

    println("Quel est le type de service? 1(Number) ou 2(Prefix)")
    val serviceType: Int = sc.nextInt()

    println("Quel est le type de repository? 1(Memory) ou 2(Database)")
    val repositoryType: Int = sc.nextInt()

    lateinit var factureController: InterfaceFactureController
    when (controllerType) {
        1 -> factureController = FactureControllerKeyboard()

        2 -> factureController = FactureControllerWeb()

        3 -> factureController = FactureControllerScanner()

        else -> println("Erreur: Recommencez")
    }

    lateinit var factureService: InterfaceFactureService
    when(serviceType){
        1 -> factureService = FactureServiceNumber()

        2 -> factureService = FactureServicePrefix()

        else -> println("Erreur: Recommencez")
    }

    lateinit var factureRepository: InterfaceFactureRepository
    when(repositoryType){
        1 -> factureRepository = FactureRepositoryMemory()

        2 -> factureRepository = FactureRepositoryDatabase()

        3 -> println("Erreur: Recommencez")
    }

    factureController.setFactureService(factureService)
    factureService.setFactureRepository(factureRepository)

    factureController.createFacture()}*/
