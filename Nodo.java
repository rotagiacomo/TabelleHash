public class Nodo implements Comparable {
    private Nodo nextNodo;
    private Comparable contenuto;
    private String chiave;

    public Nodo(String chiave, Comparable contenuto) {
        this.contenuto = contenuto;
        this.chiave =   chiave;
    }

    public void setNextNodo(Nodo nextNodo) {
        this.nextNodo = nextNodo;
    }

    public void setContenuto(Comparable contenuto) {
        this.contenuto = contenuto;
    }

    public void setChiave(String chiave){
        this.chiave = chiave;
    }

    public Nodo getNextNodo() {
        return nextNodo;
    }

    public Comparable getContenuto() {
        return contenuto;
    }

    public String getChiave(){
        return chiave;
    }

    public String toString() {
        return contenuto.toString();
    }

    public int compareTo(Comparable other) {
        Nodo otherNodo = (Nodo) other;
        return contenuto.compareTo(otherNodo.contenuto);
    }
}
