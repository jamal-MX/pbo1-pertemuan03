package percabangan;

public class ifelse {
    public static void main (String [] args){

        double totalBelanja = 2500;
        double uangDidompet = 5000;

        if(uangDidompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");

        }else if(uangDidompet>totalBelanja) {
            double angsul = uangDidompet - totalBelanja;
            System.out.println("Uang cukup, angsul :" + angsul);
        }else{
            System.out.println("uang pas.. UwU..");

        }
    }


}
