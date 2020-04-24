package com.andrian.topuniversityjabar;

import java.util.ArrayList;

public class UniversityData {
    private static String[] universityName = {
            "Universitas Telkom",
            "Universitas Katolik Parahyangan",
            "Universitas Islam Bandung",
            "Universitas Gunadarma",
            "Universitas Djuanda",
            "Universitas Pasundan",
            "Universitas Presiden",
            "Universitas Komputer",
            "Universitas Pakuan",
            "Universitas Widyatama"
    };
    private static String[] universityDetails = {
            "Perguruan tinggi swasta di Indonesia. Kampus utama Tel-U terletak di Kabupaten Bandung, Jawa Barat, tepatnya di Jalan Telekomunikasi - Terusan Buahbatu, di kawasan Bandung Technoplex Kampus lainnya berlokasi di daerah Gegerkalong Hilir, sebelah utara Kota Bandung, di kompleks perkantoran PT. Telkom",
            "Perguruan tinggi swasta yang terletak di Kota Bandung, Indonesia. Kampus utamanya terletak di Jalan Ciumbuleuit, dan kampus lainnya terletak di Jalan Merdeka, Jalan Aceh, dan Jalan Nias. Sebelum memiliki gedung sendiri di Jalan Merdeka, kegiatan akademis juga sempat menggunakan gedung 'Panti Budaya'",
            "UNISBA terdiri dari dua kampus, kampus I terdiri dari Jl.Tamansari No. 1, Jl.Tamansari No. 22, Jl.Tamansari No. 24, Jl.Hariangbanga No. 2, Jl.Rangga Gading No. 8, Jl.Ranggamalela No. 1, Jl.Purnawarman No. 59, Jl.Purnawarman No. 63 dan kampus II ialah kampus yang berada di kawasan Ciburial-Bandung Utara",
            "Universitas Gunadarma (UG) atau biasa disebut Gunadarma, adalah salah satu Perguruan Tinggi Swasta di Indonesia. Kampus utamanya berada di Kota Depok, Jawa Barat",
            "Universitas swasta yang terletak di Kabupaten Bogor Jawa Barat Indonesia. Universitas yang berslogan Universitas Bertauhid di dirikan pada tanggal 21 Maret 1987 yang bertempat di Jalan Tol Ciawi No.1 Ciawi Bogor Kecamatan Ciawi Kabupaten Bogor",
            "Universitas swasta di Bandung, Indonesia, yang memiliki Kampus di lima lokasi, yaitu di Jalan Lengkong Besar No. 68 (Kampus I), Jalan Tamansari No. 6-8 (Kampus II), Jalan Wartawan IV No. 22 (Kampus III), Jalan Dr. Setiabudhi No. 193 (Kampus IV), dan Jalan Sumatra No. 41 (Kampus V)",
            "Universitas Presiden (President University) terletak di Kawasan Industri Jababeka, Cikarang",
            "Perguruan tinggi swasta terkemuka yang berada di kota Bandung, Jawa Barat, tepatnya berlokasi di Jl.Dipatiukur No 112-114. Rektornya saat ini dijabat oleh Dr. Ir.Eddy Soeryanto Soegoto",
            "Perguruan tinggi swasta di Bogor, Indonesia, yang berdiri pada tahun 1980",
            "Perguruan Tinggi Swasta terkemuka yang terletak Kota Bandung, Jawa Barat. Tepatnya di Jalan Jl. Cikutra No. 204A Bandung, Jawa Barat"
    };
    private static String[] universityPeringkat = {
            "peringkat 14 nasional",
            "Peringkat 26 Nasional",
            "Peringkat 44 Nasional",
            "Peringkat 55 Nasional",
            "Peringkat 60 Nasional",
            "Peringkat 65 Nasional",
            "Peringkat 78 Nasional",
            "Peringkat 79 Nasional",
            "Peringkat 92 Nasional",
            "Peringkat 95 Nasional"
    };
    private  static String[] universityKlaster = {
            "Klaster II",
            "Klaster II",
            "Klaster II",
            "Klaster II",
            "Klaster II",
            "Klaster II",
            "Klaster II",
            "Klaster II",
            "Klaster III",
            "Klaster III"
    };
    private static int[] universityImages = {
            R.drawable.universitas_telkom,
            R.drawable.universitas_katholik_parahyangan,
            R.drawable.universitas_islam_bandung,
            R.drawable.universitas_gunadarma,
            R.drawable.universitas_djuanda,
            R.drawable.universitas_pasundan,
            R.drawable.universitas_presiden,
            R.drawable.universitas_komputer,
            R.drawable.universitas_pakuan,
            R.drawable.universitas_widyatama
    };

    static ArrayList<University> getListData() {
        ArrayList<University> list = new ArrayList<>();
        for (int position = 0; position < universityName.length; position++) {
            University university = new University();
            university.setName(universityName[position]);
            university.setDetail(universityDetails[position]);
            university.setPhoto(universityImages[position]);
            university.setPeringkat(universityPeringkat[position]);
            university.setKlaster(universityKlaster[position]);
            list.add(university);
        }
        return list;
    }
}
