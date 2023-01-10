package udemy.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
       // datos.listar();
        getImprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        getImprimir(datos);


    }
    public static void getImprimir(IAccesoDatos datos){
        datos.listar();
    }
}
