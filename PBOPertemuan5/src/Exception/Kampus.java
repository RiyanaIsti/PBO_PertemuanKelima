/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author RIYANA
 */
class NIMTidakValidException extends Exception {
    public NIMTidakValidException(String pesan) {
        super(pesan);
    }
}

public class Kampus {
    public static void validasiNIM(String nim) 
      throws NIMTidakValidException {
        if (nim.length() != 10) {
            throw new NIMTidakValidException(" NIM harus 10 digit, input: " + nim);
        }
        System.out.println("NIM valid: " + nim);
    }

    public static void main(String[] args) {
        try {
            validasiNIM("09010624014");   // contoh input
        } catch (NIMTidakValidException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
