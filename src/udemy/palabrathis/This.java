package udemy.palabrathis;
/*
    PALABRA THIS
    *Es una referencia implicita al objeto que se esta ejecutando
    *Es util para evitar la ambiguedad entre variable de clase y local
    *Permite a un objeto enviarse el mismo como parametro
    *La palabra this no se puede utilizar en un contexto estatico
 */
public class This {
    //Atributos de la clase
    String nombre;

    //Evitamos la ambiguedad entre variable de clase y local
    //Creamos el constructor de la clase
     public This(String nombre){
         this.nombre = nombre;
         System.out.println("Impresion del operador this dentro de la clase This: "+
                 this);
     //En este momento this apunta a un objeto de tipo This
        Imprimir imprimir = new Imprimir();
        imprimir.setImprimir(this);
        //this contiene una referencia al objeto This
     }
}
