package ftpSubir;

import Variables.Var1;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;


public class FTP {

 FTPClient ftp = new FTPClient();

public void SubirArchivo(Var1 c) throws SocketException, IOException {
    conectar(c.getServidorFTP(),c.getUsuario(),c.getPass());
    desrcargarArchivoFTP(c.getUrl(),c.getNombreArchivo());
    ftp.logout();
    ftp.disconnect();
    
}    

public void conectar(String ip, String user, String pass) throws SocketException, IOException{
    ftp.connect(ip);

    if(ftp.login(user, pass))
        System.out.println("login OK");
    else
        System.out.println("login Error");
}

public void desrcargarArchivoFTP(String localFile, String hostFile) throws FileNotFoundException, IOException{
 FileInputStream fis = null;
    fis = new FileInputStream(localFile);
    BufferedInputStream buffOut = new BufferedInputStream(fis);
    if(ftp.storeFile(hostFile, buffOut))
        System.out.println("Transferencia de Archivo Completo");
    else
        System.out.println("Error al Cargar");
    buffOut.close();
    fis.close();
    //fos.close();
}

}
