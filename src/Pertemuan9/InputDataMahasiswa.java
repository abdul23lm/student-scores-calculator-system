/**
 *
 * @author Abdul Latif Munjiat
 */
package Pertemuan9;

import java.util.ArrayList;
public class InputDataMahasiswa {
    
    ArrayList<Mahasiswa> listmahasiswa; 
    public InputDataMahasiswa() 
    { 
        listmahasiswa = new ArrayList (); 
    } 
    public void insertData(String NIM, String Nama, String Alamat) 
    { 
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat); 
        listmahasiswa.add(mhs); 
    }
    public ArrayList<Mahasiswa> getALL() 
    { 
        return listmahasiswa; 
    } 
    public void deleteData(int index) 
    { 
        listmahasiswa.remove(index); 
    }
    
}
