package ftpDescargar;

import Variables.Var1;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class FTP {

//private static String ip = "ftp.webcindario.com";
//private static String user = "prueba21345";
//private static String pass = "Medina23101969.";
//private static String localFileDownload = "C:\\wamp64\\hola.txt";
//private static String hostFile="/hola.txt";

private FTPClient ftp = new FTPClient();
public void descarga(Var1 dato) throws SocketException, IOException {
    conectar(dato.getServidorFTP(),dato.getUsuario(),dato.getPass());
    desrcargarArchivoFTP(dato.getUrl(), dato.getNombreArchivo());
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
    //fos = new FileOutputStream(localFile);
    BufferedOutputStream buffOut = new BufferedOutputStream(new FileOutputStream(localFile));
    if(ftp.retrieveFile(hostFile, buffOut))
        System.out.println("Descarga correcta");
    else
        System.out.println("Error Descarga");

    buffOut.close();
    //fos.close();
}
    
}

 //uploadFileToFTP("ftp.webcindario.com","prueba21345","Medina23101969.","/test", new File("c:\\readme.txt"),true);