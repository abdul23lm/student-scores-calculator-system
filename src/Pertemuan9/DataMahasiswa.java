/**
 *
 * @author Abdul Latif Munjiat
 */
package Pertemuan9;

public class DataMahasiswa {
    private String NIM, Nama, Alamat, MataKuliah, NilaiAkhir; 
    public DataMahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, String NilaiAkhir) 
    { 
        this.NIM = NIM; 
        this.Nama = Nama; 
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.NilaiAkhir = NilaiAkhir;
    } 
    public String getAlamat() 
    { 
        return Alamat; 
    } 
    public String getNIM() 
    { 
        return NIM; 
    } 
    public String getNama() 
    { 
        return Nama; 
    }
    public String getMataKuliah()
    {
        return MataKuliah;
    }
    public String getNilaiAkhir()
    {
        return NilaiAkhir;
    }
}
