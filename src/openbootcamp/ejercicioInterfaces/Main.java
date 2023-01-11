package openbootcamp.ejercicioInterfaces;

public class Main {
    public static void main(String[] args) {
        CocheCrudImpl cocheCrud = new CocheCrudImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
