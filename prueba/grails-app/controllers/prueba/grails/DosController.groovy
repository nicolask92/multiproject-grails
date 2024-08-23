package prueba.grails

import registrofallidoplugin.PruebaController

class DosController {

    def hola() {
        throw new IllegalAccessError()
        new PruebaController()
    }
}
