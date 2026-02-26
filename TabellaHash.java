import java.util.Iterator;

public class TabellaHash{
    private Lista lista;

    public TabellaHash(){
        lista = new Lista();
    }

    public void aggiungi(String chiave, Comparable valore) {
        lista.aggiungiInCoda(chiave, valore);
    }

    public Comparable cerca(String chiave) {
        Iteratore iteratore = lista.getIteratore();
        while (iteratore != null) {
            Nodo nodo = iteratore.next();
            if(nodo.getChiave().equals(chiave)){
                return nodo.getContenuto();
            }
        }
        return null;
    }

    public void elimina(String chiave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elimina'");
    }

    public void modifica(String chiave, Comparable nuovoValore) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifica'");
    }

    public int contaChiavi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contaChiavi'");
    }

    public String[] mostraChiavi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostraChiavi'");
    }

    public int numeroCollisioni(String chiave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numeroCollisioni'");
    }
    
    public String toString(){
        return lista.toString();
    }
    
}