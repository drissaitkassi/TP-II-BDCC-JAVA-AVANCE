//TP 1 POO

package org.akdriss;

public class Main {
    public static void main(String[] args) {


        Compte c1=new Compte(11111,"AHMED",20000);
        Compte c2=new Compte(22222,"HAJAR",30000);
        c1.afficherCompteInfo();
        c1.retirer(19000);
        c1.deposer(15000);
        c1.afficherCompteInfo();

        System.out.println();
        c2.afficherCompteInfo();
        
        try {
            c2.retirer(45000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        c2.afficherCompteInfo();

    }
}

//---------------------------------------------------------------

package org.akdriss;

public class Compte {
    private long num;
    private String nomClient;
    private double solde;

    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public Compte() {
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void afficherCompteInfo(){
        System.out.println(this.toString());
    }

    public void deposer(double mnt){
        this.solde +=mnt;
    }
    public void retirer(double mnt){

        if (mnt <= this.solde){
            this.solde=this.solde-mnt;
        }else {
            throw new RuntimeException("sold insuffisant");
        }
    }


    @Override
    public String toString() {
        return "Compte{" +
                "num=" + num +
                ", nomClient='" + nomClient + '\'' +
                ", solde=" + solde +
                '}';
    }
}
