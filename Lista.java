public class Lista {
    private Nodo head;

    private void aggiungiInTesta(Comparable contenuto){
        Nodo newNodo = new Nodo(null, contenuto);
        newNodo.setNextNodo(head);
        head = newNodo;
    }

    public void aggiungiInCoda(String chiave, Comparable contenuto){
        Nodo newNodo = new Nodo(chiave, contenuto);
        if (head == null) {
            aggiungiInTesta(contenuto);
        }else{
            Nodo cursor = raggiungiIndice(getSize()-1);
            cursor.setNextNodo(newNodo);
        }
    }

    private void aggiungiOrdinato(Comparable contenuto){
        Nodo newNodo = new Nodo(null, contenuto);
        if(head == null || newNodo.compareTo(head) < 0){
            aggiungiInTesta(contenuto);
        }else{
            Nodo cursor = head;
            while (cursor.getNextNodo() != null) {
                if (newNodo.compareTo(cursor.getNextNodo()) < 0) {
                    newNodo.setNextNodo(cursor.getNextNodo());
                    cursor.setNextNodo(newNodo);
                    return;
                }
                cursor = cursor.getNextNodo();
            }
            cursor.setNextNodo(newNodo);
        }
    }

    private Nodo raggiungiIndice(int indice){
        Nodo cursor = head;
        for(int i=0; i<indice; i++){
            cursor = cursor.getNextNodo();
        }
        return cursor;
    }

    public int getSize(){
        Nodo cursor = head;
        int size = 0;
        while (cursor != null) {
            cursor = cursor.getNextNodo();
            size++;
        }
        return size;
    }

    public Nodo getHead(){
        return head;
    }

    public Iteratore getIteratore(){
        return new Iteratore(this.head);
    }

    public String toString(){
        Nodo cursor = head;
        String string = "";
        while (cursor != null) {
            string += cursor.getContenuto();
            if (cursor.getNextNodo() != null) {
                string += ",";
            }
            cursor = cursor.getNextNodo();
        }
        return string;
    }
}
