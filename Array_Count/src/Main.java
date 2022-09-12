import java.util.Arrays;

public class Main {
    static int kacKere(int[] list, int value){
        int tekrarSayisi=0;
        for (int i : list){
            if (value == i)
                tekrarSayisi++;
        }
        return tekrarSayisi - 1;
    }
    public static void main(String[] args) {
        boolean tekrarEttimi=false;
        int tekrarSayisi=0,tekrarEden=-100;
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        for (int value : dizi){
            System.out.print(value + " ");
        }
        System.out.println();
        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++){
            if (i == dizi.length -1) {
                if (kacKere(dizi, dizi[i]) == 0)
                    System.out.println(dizi[i] + " Sayısı Hiç Tekrar Etmedi.");
                break;
            }
            if (dizi[i] == dizi[i+1] && tekrarEden!=dizi[i]){
                tekrarSayisi = kacKere(dizi, dizi[i]);
                System.out.println(dizi[i] + " Sayısı " + tekrarSayisi + " Kere Tekrar Edildi.");
                tekrarEden=dizi[i];
                tekrarEttimi=true;
            } else if (dizi[i] != dizi[i+1] && tekrarEttimi==false){
                System.out.println(dizi[i] + " Sayısı Hiç Tekrar Etmedi.");
            }
        }
    }
}
