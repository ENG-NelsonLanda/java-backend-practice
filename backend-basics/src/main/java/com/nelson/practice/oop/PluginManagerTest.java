/*

# EJERCICIO OOP — PRUEBA DEL SISTEMA

Aquí vas a probar tu PluginManager.

Tareas:

1️⃣ Crear un PluginManager

2️⃣ Crear algunos plugins de ejemplo

Ejemplos:

"AutoBackup"
"DarkTheme"
"SyntaxHighlighter"

3️⃣ Agregar los plugins al manager

4️⃣ Listar todos los plugins

5️⃣ Buscar un plugin por nombre

6️⃣ Eliminar un plugin

7️⃣ Volver a listar plugins



public class PluginManagerTest {


    public static void main(String[] args) {

        // TODO: crear PluginManager


        // TODO: crear plugins


        // TODO: agregarlos


        // TODO: listar plugins


        // TODO: buscar plugin


        // TODO: eliminar plugin


        // TODO: listar nuevamente

    }
}

========================================
*/

package com.nelson.practice.oop;

public class PluginManagerTest {

    public static void main(String[] args) {
        PluginManager manager = new PluginManager();

        Plugin plugin1 = new Plugin("AutoBackup", "5.3", "Alex");
        Plugin plugin2 = new Plugin("DarkTheme", "2.1", "Kevin");
        Plugin plugin3 = new Plugin("SyntaxHighlighter", "1.8", "Natan");

        manager.addPlugin(plugin1);
        manager.addPlugin(plugin2);
        manager.addPlugin(plugin3);

        manager.listPlugins();

        Plugin encontrado = manager.findPluginByName("DarkTheme");

        if (encontrado != null) {
            System.out.println("Se ha encontrado el plugin " + encontrado + ".");
        } else {
            System.out.println("No se ha encontrado el plugin.");
        }

        if (manager.removePlugin("AutoBackup")) {
            System.out.println("Se ha eliminado el plugin AutoBackup.");
        } else {
            System.out.println("No se pudo eliminar el plugin AutoBackup.");
        }

        manager.listPlugins();
    }

}
