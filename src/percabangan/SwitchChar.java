package percabangan;

public class SwitchChar {
    public static void main(String [] args){
        char nilai = 'A';
         switch(nilai) {
             case 'A':
                 System.out.println("Mhs    :\"Terima kasih pak\"");
                 System.out.println("Dosen  :\"Selamat ya !!\"");
                 break;
             case 'B':
                 System.out.println("Mhs    :\"Kenapan ulun kada dapat A,pak?\"");
                 System.out.println("Dosen  :\"!%#$@*&\"");
                 break;
             case 'C':
                 System.out.println("Mhs    :\"Ulun turun pul Pak ai, tugas pul jua\"");
                 System.out.println("Dosen  :\"Tapi bisa lah majawab ujian \"");
                 System.out.println("Mhs    :\"Hhihihihi\"");
                 break;

                default:

                 System.out.println("Mhs    :\"Ulun turun pul Pak ai, tugas pul jua \"");
                 System.out.println("Dosen  :\"Bujur jua kah?\"");
                 System.out.println("Dosen  :\"*memeriks berkas\"");
                 System.out.println("Dosen  :\"*menceleng\"");
                 System.out.println("Mhs    :\"kabur\"");
                 break;

         }
    }
}
