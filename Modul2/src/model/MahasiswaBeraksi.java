package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParselExcerption {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630787";
        mahasiswa.nama = "Muhammad Yoga Pratama Rais";
        mahasiswa.taggalLahir = simpleDateFormat.parse(source:"15-08-2001");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa(npm:"19638888", nama:"Delapu", tangalLahir:"08-08-2008");
        mahasiswa2.tampilkanAtribut();

    }
}