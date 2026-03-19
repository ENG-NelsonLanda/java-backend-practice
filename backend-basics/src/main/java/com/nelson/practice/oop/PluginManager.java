/*

# EJERCICIO OOP — PluginManager

Contexto:

Ahora vas a crear una clase que administre plugins.

El PluginManager debe poder:

* agregar plugins
* listar plugins
* buscar un plugin por nombre
* eliminar un plugin

Conceptos que debes usar:

* List
* ArrayList
* loops
* equals()
* encapsulación

---------------------------------------------------------

Tareas:

1. Crear una lista de plugins

Pista:
List<Plugin> plugins;

2. Crear un constructor que inicialice la lista

Pista:
plugins = new ArrayList<>();

3. Crear método:

public void addPlugin(Plugin plugin)

Debe agregar el plugin a la lista.

4. Crear método:

public void listPlugins()

Debe recorrer la lista e imprimir todos los plugins.

Pista:
usa un for-each

5. Crear método:

public Plugin findPluginByName(String name)

Debe buscar un plugin por nombre.

Si lo encuentra → retornarlo
Si no → retornar null

Pistas:

plugin.getName().equals(name)

6. Crear método:

public boolean removePlugin(String name)

Debe eliminar el plugin si existe.

Si lo elimina → retornar true
Si no existe → retornar false



import java.util.ArrayList;
import java.util.List;

public class PluginManager {
    // TODO: crear lista de plugins


    // TODO: constructor


    // TODO: addPlugin


    // TODO: listPlugins


    // TODO: findPluginByName


    // TODO: removePlugin


}

=========================================================
*/

package com.nelson.practice.oop;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {

    List<Plugin> plugins;

    public PluginManager() {
        plugins = new ArrayList<>();
    }

    public void addPlugin(Plugin plugin) {
        plugins.add(plugin);
    }

    public void listPlugins() {
        for (int i = 0; i < plugins.size(); i++) {
            System.out.println(plugins.get(i));
        }
    }

    public Plugin findPluginByName(String name) {
        for (int i = 0; i < plugins.size(); i++) {

            if (name.equals(plugins.get(i).getName())) {
                return plugins.get(i);
            }
        }
        return null;
    }

    public boolean removePlugin(String name) {
        for (int i = 0; i < plugins.size(); i++) {

            if (name.equals(plugins.get(i).getName())) {
                plugins.remove(i);
                return true;
            }
        }
        return false;
    }
}