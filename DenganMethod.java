public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjangnaTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalpenghasilan = hitungTotalPenghasilan(gajiPokok, tunjangnaTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalpenghasilan);
        int gajiBersih = hitunhGajiBersih(totalpenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, tunjangnaTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;
    }
    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10/100;
    }
    public static int hitunhGajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan - pajak;
    }

    public static void tampilkanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersib) {
        System.out.println("Gaji pokok: " + gajiPokok);
        System.out.println("Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Bonus: " + bonus);
        System.out.println("pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersib);
    }
}
