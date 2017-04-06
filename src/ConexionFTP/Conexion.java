
package ConexionFTP;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

public class Conexion {
    
    private FTPClient ftp = new FTPClient();

    public Conexion() {
        
    }

public void Conectar(String ip, String usuario, String pass) throws IOException{
    ftp.connect(ip,21);

    if(ftp.login(usuario, pass))
       // JOptionPane.showMessageDialog(null, "Conexion Correcta");
        System.out.println("Login OK");
    else
       // JOptionPane.showMessageDialog(null, "Conexion Incorrecta");
        System.out.println("Login Error");
}

public void desconectar() throws IOException{
    ftp.logout();
    ftp.disconnect();
}

public void Subir(String filename, String hostfile) throws FileNotFoundException, IOException{
FileInputStream fis = null;
    fis = new FileInputStream(filename);
    BufferedInputStream buffOut = new BufferedInputStream(fis);
    if(ftp.storeFile(hostfile, buffOut))
        System.out.println("Carga correcta");
    else
        System.out.println("Error al Cargar");
    buffOut.close();
    fis.close();
}
    
}
