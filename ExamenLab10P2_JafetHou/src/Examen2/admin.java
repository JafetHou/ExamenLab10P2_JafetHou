
package Examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admin {
    
    private File archivo = null;
    private ArrayList<Carros> lista = new ArrayList();
    
    public admin(String ruta) {
        archivo = new File(ruta);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Carros> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Carros> lista) {
        this.lista = lista;
    }
    
    public void setCarros(Carros carro){
        this.lista.add(carro);
    }
    
    @Override
    public String toString() {
        return "lista:" + lista + '}';
    }
    public void cargar() {
        try {
            lista = new ArrayList();
            Carros centinela; 
            
            if (archivo.exists()) {
                FileInputStream arch = new FileInputStream(archivo);
                ObjectInputStream escritura = new ObjectInputStream(arch);
                try {
                    while ((centinela = (Carros) escritura.readObject()) != null) {
                        lista.add(centinela);
                    }
                } catch (EOFException e) {
                }
                escritura.close();
                arch.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void escribir() {
        
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carros carro : lista) {
                bw.writeObject(carro);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    
}
