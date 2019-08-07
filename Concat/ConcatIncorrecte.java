package fr.Concat;

public class ConcatIncorrecte {

    public static void main(String[] args){
        String s = "China Blue";
        System.out.println(s);
        //version incorrecte
        //concatener(s, " Express");

        // version correcte:
        s = concat(s, " Express");
        System.out.println(s);

    }

       /* version incorrecte
    public static void concatener(String s,String s2 )
        {
            s += s2;
        }
    */

    // version corrigée
    public static String concat(String s, String s2) {
        s +=s2;
        return s;
    }

}
