package udemy.overriding;

public class TestPolimorfismo {
    public static void main(String[] args) {
        SobreescrituraMetodos obj1 = new SobreescrituraMetodos("Federico",10000);
        //System.out.println(obj1.getDetalles());
        getImprimir(obj1);

        HijaOverriding obj2 = new HijaOverriding("Yury",11500,"Marketing");
        //System.out.println(obj2.getDetalles());
        getImprimir(obj2);
    }
    public static void getImprimir(SobreescrituraMetodos objeto){
        System.out.println(objeto.getDetalles());
    }
}
