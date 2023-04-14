package argentina_programa.claseCinco.turnero.servicios.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionDAO { // Encargada de gestionar las conexiones

    // Una sistema gestor de base de datos es un servicio
    // 'Todo' servicio trabaja con un "SOCKET"
    // SOCKET => DireccionIP:Puerto (UDP no orientado a la conexion
    // ping google.com.ar -> DNS resuelvo 142.251.133.3
    // TCP Orientado a la conexion)
    // MySQL puerto por defecto 3306 (TCP)
    private String usuario;
    private String contrasena;
    private String direccionIP;
    private String puerto;
    private String nombreBd;

    private String nameClassJdbc;

    private Connection connection;    // Solo declaramos la variable/objeto

    public Connection conectar() {

        // Aca vamos conectar
        this.setDireccionIP("jdbc:mysql://localhost:"); // direccion ip de mi mismo // loopback
        this.setPuerto("3306");
        this.setUsuario("noliva");
        this.setContrasena("nico1234");
        this.setNameClassJdbc("com.mysql.jdbc.Driver");
        this.setNombreBd("arg_prog_clase_13");
        try {
            String urlDb = this.getDireccionIP().concat(this.getPuerto()).concat("/").concat(nombreBd);
            System.out.println("URL: " + urlDb);
            connection = DriverManager.getConnection(
                    this.getDireccionIP()
                            .concat(this.getPuerto())
                            .concat("/")
                            .concat(nombreBd),
                    this.getUsuario(),
                    this.getContrasena());

            System.out.println("Estado de conexion / cerrada: " + !getConnection().isClosed());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return getConnection();
    }

    public void cerrarConexion() throws SQLException {
        if (!getConnection().isClosed()) {
            getConnection().close();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getNombreBd() {
        return nombreBd;
    }

    public void setNombreBd(String nombreBd) {
        this.nombreBd = nombreBd;
    }

    public String getNameClassJdbc() {
        return nameClassJdbc;
    }

    public void setNameClassJdbc(String nameClassJdbc) {
        this.nameClassJdbc = nameClassJdbc;
    }
}
