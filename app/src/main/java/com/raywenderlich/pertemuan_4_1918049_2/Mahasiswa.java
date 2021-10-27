package com.raywenderlich.pertemuan_4_1918049_2;

public class Mahasiswa {
    private String nama,nim,angkatan;
    private int images;
    public Mahasiswa(String nama, String nim, String angkatan,int images){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.images = images;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama)    {

        this.nama = nama;
    }
    public String getNim(){

        return nim;
    }
    public void setNim(String nim){

        this.nim = nim;
    }
    public String getAngkatan(){

        return angkatan;
    }
    public void setAngkatan(String angkatan){

        this.angkatan = angkatan;
    }
    public int getimages(){

        return images;
    }
    public void setimages(int images){

        this.images = images;
    }
}


