/*
   -Crear una interfaz CocheCRUD.
   -Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
   -Como métodos de CocheCRUD podemos poner:
     save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
   -Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 */
package openbootcamp.ejercicioInterfaces;

public class CocheCrudImpl implements CocheCrud{


    @Override
    public void save() {
        System.out.println("Ejecutando metodo save()");
    }

    @Override
    public void findAll() {
        System.out.println("Ejecutando metodo findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Ejecutando metodo delete()");
    }
}
