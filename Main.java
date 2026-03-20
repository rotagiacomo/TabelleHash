public class Main{
    public static void main(){
        TabellaHash tHash = new TabellaHash(10);
        tHash.add("casa", "12");
        tHash.add("caas", "199");
        tHash.add("ava", "569");
        System.out.println(tHash);
    }
}