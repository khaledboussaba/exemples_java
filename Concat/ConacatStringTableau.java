package fr.Concat;

public class ConacatStringTableau {
    public static void main(String[] args) {
        String[] str = {"bar", "f", "o", "o", "bar"};
        System.out.println(StringUtils.concat(str));
    }
}
class StringUtils {
    public static String concat(String[]tab){
        String out = tab[0];
        for (int i = 1; i < tab.length; i++){
            out += tab[i];
        }
        return out;
    }
}
