
// 12S24008 - Rospika Sarah Yosefin Siregar
// 12S24013 - Adryan Julianto Panjaitan

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulbuku, penulis, kategori, formatbukuelektronik, penerbit;
        int tahunterbit, stokbuku;
        double hargapembelian, minimummargin, rating;

        iSBN = input.nextLine();
        judulbuku = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stokbuku = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7 && rating <= 5.0) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        kategori = "Average";
                    } else {
                        if (rating < 3.0 && rating >= 0) {
                            kategori = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judulbuku + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stokbuku + "|" + rating + "|" + kategori);
    }
}

