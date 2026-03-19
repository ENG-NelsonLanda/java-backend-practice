/* EJERCICIO OOP — CLASE Plugin

Contexto:

Imagina que estás desarrollando una aplicación que puede instalar
plugins para agregar nuevas funcionalidades.

Cada plugin tiene:

* nombre
* versión
* autor

Tu tarea es crear la clase Plugin correctamente usando
Programación Orientada a Objetos.

Conceptos que debes usar:

* encapsulación
* constructor
* getters
* método toString()

---------------------------------------------------------

Tareas:

1. Crear los atributos privados:

String name
String version
String author

2. Crear un constructor que reciba:

(name, version, author)

3. Crear getters para todos los atributos

4. Sobrescribir toString() para que devuelva algo así:

"AutoBackup v1.2 by Alex"


public class Plugin {
    // TODO: crear atributos privados


    // TODO: crear constructor


    // TODO: crear getters


    // TODO: sobrescribir toString()

}

=========================================================
*/

package com.nelson.practice.oop;

public class Plugin {

    private String name;
    private String version;
    private String author;

    public Plugin(String name, String version, String author) {
        this.name = name;
        this.version = version;
        this.author = author;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getVersion() {
        return version;
    }

//    public void setVersion(String version) {
//        this.version = version;
//    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    @Override
    public String toString() {
        return name + " v" + version + " by " + author;
    }
}
