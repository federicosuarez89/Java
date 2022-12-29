package udemy.contextoEstatico;

public class Persona {
    //Declaramos las variables de clase
    private String name;
    private int idPerson;
    private static int iterator;

    //Creamos el constructor de la clase
    public Persona(String name){
        this.idPerson = ++iterator;
        this.name = name;
    }

    //Creamos los getter
    public  String getName(){
        return this.name;
    }
    public int getIdPerson(){
        return this.idPerson;
    }
    public static int getIterator(){
        return iterator;
    }

    //Creamos los setter
    public void setName(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona: \n");
        sb.append("\tnombre= ").append(name).append("\n");
        sb.append("\tidPerson= ").append(idPerson);
        sb.append("\n******************************");
        return sb.toString();
    }
}
