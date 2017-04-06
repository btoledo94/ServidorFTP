
package Variables;

public class Var1 {

   public String ServidorFTP;
   public String Usuario;
   public String Pass;
   public String Url;
   public String NombreArchivo;

    public Var1() {
    }

    public Var1(String ServidorFTP, String Usuario, String Pass, String Url, String NombreArchivo) {
        this.ServidorFTP = ServidorFTP;
        this.Usuario = Usuario;
        this.Pass = Pass;
        this.Url = Url;
        this.NombreArchivo = NombreArchivo;
    }

    public String getServidorFTP() {
        return ServidorFTP;
    }

    public void setServidorFTP(String ServidorFTP) {
        this.ServidorFTP = ServidorFTP;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

     
}
