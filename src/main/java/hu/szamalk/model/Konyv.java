package hu.szamalk.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Konyv  {
    private List<String> szerzok;
    private String szerzo;
    private String cim;
    private int ar;
    private int kiadasiEv;

    public Konyv(List<String> szerzok, String cim, int ar, int kiadasiEv) {
        this.szerzok = new ArrayList<>(szerzok);
        this.cim = cim;
        this.ar = ar;
        this.kiadasiEv = kiadasiEv;
        nemLetezoKiadasiEv();
    }

    public Konyv(String szerzo, String cim, int ar, int kiadasiEv) {
        this.szerzo = szerzo;
        this.cim = cim;
        this.ar = ar;
        this.kiadasiEv = kiadasiEv;
        nemLetezoKiadasiEv();

    }

    public void nemLetezoKiadasiEv(){
        if(kiadasiEv <1000 || kiadasiEv > 2025 ){
            throw new NemLetezoKiadasiEvException("Nem létező kiadási év");
        }
    }
    public List<String> getSzerzok() {
        if(szerzok.size() == 1){
            szerzok.set(0,getSzerzo());
        }
        return szerzok;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public void setSzerzok(List<String> szerzok) {
        this.szerzok = szerzok;
    }

    public void setSzerzok(String szerzo) {
        this.szerzo = szerzo;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setKiadasiEv(int kiadasiEv) {
        this.kiadasiEv = kiadasiEv;
        nemLetezoKiadasiEv();
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "szerzok=" + szerzok +
                ", cim='" + cim + '\'' +
                ", ar=" + ar +
                ", kiadasiEv=" + kiadasiEv +
                '}';
    }
}
