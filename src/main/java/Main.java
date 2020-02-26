public class Main {
    public static void main(String[] argc){

    }
    public static boolean czyJednolity(String s){
        if(s.isEmpty())
            throw new IllegalArgumentException();
        char firstChar = s.charAt(0);
        int i = 1;
        while(i < s.length()){
            if(firstChar == s.charAt(i)) {
                i++;
            }
            else
                return false;
        }
        return true;
    }
    public static int zad681(Para[] para){
        int licznik = 0;
        for(int i = 0; i<para.length; i++){
            if(czyJednolity(para[i].a) == true && para[i].a.equals(para[i].b))
                licznik ++;
        }
        return licznik;
    }
    public static boolean czyAnagram(String a, String b){
        if(a.length() != b.length())
            return false;
        int[] licznikiA = new int[10];
        int[] licznikiB = new int[10];
        for(int i = 0; i<a.length(); i++){
            int znakA = (int)a.charAt(i) - 'A';
            int znakB = (int)b.charAt(i) - 'A';
            if(znakA < 0 || znakA >= 10 || znakB <0 || znakB >=10 )
                throw new IllegalArgumentException();
            licznikiA[znakA] ++;
            licznikiB[znakB] ++;
        }
        for(int i = 0; i<10; i++){
            if(licznikiA[i] != licznikiB[i])
                return false;
        }
        return true;
    }
    public static int liczbaAnagramow(Para[] napisy){
        int licznik = 0;
        int max = 0;
        /*for(int j = 0; j<napisy.length; j++) {
            for (int i = 0; i < napisy.length; i++) {
                if (czyAnagram(napisy[j].a, napisy[i].b) == true || czyAnagram(napisy[j].a, napisy[i].a) == true)
                    licznik++;
            }
        }
        licznik--;
        return licznik;*/
        String[] tab = new String[napisy.length*2];
        for(int i = 0; i<napisy.length; i++){
            tab[2*i] = napisy[i].a;
            tab[2*i+1] = napisy[i].b;
        }
        for(int i = 0; i<tab.length; i++){
            licznik = 1;
            for(int j=i+1; j<tab.length; j++) {
                if (czyAnagram(tab[i], tab[j]) == true){
                    licznik ++;
                }
            }
            if(licznik > max)
                max = licznik;
        }
        return max;
    }/*BABABB BBBABA
    AAAA AAAA
    AHHAH AHHAH
    BBABBABB BABBAB
    BBAABB CCCCC */
}
//zad 69, fraktal(poprzednie zajęcia)
