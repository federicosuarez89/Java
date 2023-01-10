/*
    -Las interfaces solo contienen metodos abstractos y constantes (no variables)
    -No se pueden instanciar
    -Todos sus metodos son public y abstract, no se implementan.
    -Puede tener el modificador de acceso public y por defecto nada mas.
 */
package pildorasinformaticas.interfaces;

public interface Interfaces extends Trabajadores{
    String tomar_decisiones(String decision);
}
