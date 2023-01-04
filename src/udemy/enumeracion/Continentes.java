package udemy.enumeracion;

public enum Continentes {
    AFRICA(53,"12000 personas"),
    EUROPA(46,"10000 personas"),
    ASIA(44,"8000 personas"),
    AMERICA(34,"4000 personas"),
    OCEANIA(14,"6000 personas");


    private final int paises;
    private final String habitantes;

    Continentes(int paises,String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
}
