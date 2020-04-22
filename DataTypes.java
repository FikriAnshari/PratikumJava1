import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String namaDepan ="Muhammad";
        String namaTengah ="Fikri";
        String namaBelakang ="Anshari";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.90;
        char nilaiAbjad = 'A';
        boolean Tampan = true;

        System.out.print("Input Nama Depan : ");
        namaDepan = scanner.nextLine();
        System.out.print("Input Nama Tengah : ");
        namaTengah = scanner.nextLine();
        System.out.print("Input Nama Belakangs : ");
        namaBelakang = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Target Kuliah : ");
        usia = scanner.nextInt();
        System.out.print ("Input IPK : ");
        ipk = scanner.nextDouble();
        System.out.print ("Input Nilai PBO : ");
        nilaiAbjad = scanner.next().charAt(0);
        System.out.print ("Tampan? : ");
        Tampan = scanner.nextBoolean();


        System.out.println("======= OUTPUT =======");
        System.out.println("Nama depan : " + namaDepan);
        System.out.println("Nama Tengah : " + namaTengah );
        System.out.println("Nama belakang : " + namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO : " + nilaiAbjad);
        System.out.println("Tampan : " + Tampan);

        JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + namaTengah + namaBelakang);


    }
}