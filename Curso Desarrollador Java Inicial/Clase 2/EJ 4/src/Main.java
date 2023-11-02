//Dado un string obtener un string con un desplazamiento de dos.
public class Main {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnopqrstuvwxyz ";
        String texto = "ahola que tal";
        String textoDesplazado = desplazar2(texto, abc);
        System.out.println("El string con desplazamiento de 2 quedaría: " + (char)34 + textoDesplazado + (char)34);
    }
    public static String desplazar2 (String texto, String abc){
        for (int i=0; i<texto.length(); i++){
            int pos=abc.indexOf(texto.charAt(i))+2;
            if (pos>26){
                pos-=27;
            }
            StringBuilder auxTexto = new StringBuilder(texto);
            auxTexto.setCharAt(i, abc.charAt(pos));
            texto = auxTexto.toString();
        }
        return texto;
    }
}