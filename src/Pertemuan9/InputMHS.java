/**
 *
 * @author Abdul Latif Munjiat
 */
package Pertemuan9;

import java.util.ArrayList;
public class InputMHS {
    ArrayList<DataMahasiswa> listmhs;
    public InputMHS() 
    { 
        listmhs = new ArrayList (); 
    } 
    public void insertDataMHS(String NIM, String Nama, String Alamat, String MataKuliah, String NilaiAkhir) 
    { 
        DataMahasiswa m = new DataMahasiswa(NIM, Nama, Alamat, MataKuliah, NilaiAkhir); 
        listmhs.add(m); 
    }
    public ArrayList<DataMahasiswa> getALL() 
    { 
        return listmhs; 
    } 
    public void deleteDataMhs(int index) 
    { 
        listmhs.remove(index); 
    }   
}
