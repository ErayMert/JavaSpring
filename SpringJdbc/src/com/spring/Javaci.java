package com.spring;

/**
 * Created by eraym on 22.07.2018.
 */
public class Javaci {
    private int no;
    private String isim;
    private String soyisim;

    public Javaci(int no, String isim, String soyisim) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return "Javaci{" +
                "no=" + no +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                '}';
    }
}
