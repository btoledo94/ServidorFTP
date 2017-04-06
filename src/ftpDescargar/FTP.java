package ftpDescargar;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;

public class FTP {

private static String ip = "ftp.webcindario.com";
private static String user = "prueba21345";
private static String pass = "Medina23101969.";
private static String localFileDownload = "C:\\wamp64\\hola.txt";
private static String hostFile="/hola.txt";

private static FTPClient ftp = new FTPClient();
public static void main(String[] args) throws SocketException, IOException {
    conectar(ip,user,pass);
    desrcargarArchivoFTP(localFileDownload, hostFile);
    ftp.disconnect();
    
}    

public static void conectar(String ip, String user, String pass) throws SocketException, IOException{
    ftp = new FTPClient();
    ftp.connect(ip);

    if(ftp.login(user, pass))
        System.out.println("login OK");
    else
        System.out.println("login Error");
}

public static void desrcargarArchivoFTP(String localFile, String hostFile) throws FileNotFoundException, IOException{
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