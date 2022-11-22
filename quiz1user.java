package com.mycompany.quizpbo;
// Aryasuryawardana-202043500124-X5G
public class quiz1user {
    
        private String n = "admin123";
        
        boolean ok = false;
        
        boolean cekID (String n){
        if (this.n.equals(n)){
            ok=true;
        } else {
            System.out.println("");
            System.out.println("ID Anda salah -> " + n );
            System.out.println("");
            System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
            System.out.println("Cek, Data dan Antar, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");
            System.exit(0);
        }
        return ok;
    }
}