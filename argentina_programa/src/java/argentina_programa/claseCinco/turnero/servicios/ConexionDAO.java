package argentina_programa.claseCinco.turnero.servicios;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConexionDAO {

    private Connection conexion;
    private String servidor;
    private String usuario;
    private String puerto;
    private String basedato;
    private String password;
    private String motor;
    private String nameClass;
    private boolean conecta;

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getServidor() {
        return servidor;
    }

    public boolean isConecta() {
        return conecta;
    }

    public void setConecta(boolean conecta) {
        this.conecta = conecta;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getBasedato() {
        return basedato;
    }

    public void setBasedato(String basedato) {
        this.basedato = basedato;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public void conectar() throws Exception {
        try {
            instanciarPro();
            Class.forName(nameClass);
            if (nameClass.equals("com.mysql.jdbc.Driver")) {
                conexion = DriverManager.getConnection(motor + servidor + ":" + puerto + "/" + basedato, usuario, password);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void instanciarPro() throws FileNotFoundException, IOException {
        try {
            Properties prop = new Properties();
            String home = System.getProperty("user.dir");
            File f = new File(home + "/propiedades.properties"); // da una ruta absoluta al archivo
            prop.load(new FileInputStream(f));
            servidor = (prop.getProperty("servidor"));
            basedato = (prop.getProperty("database"));
            usuario = (prop.getProperty("usuario"));
            password = (prop.getProperty("password"));
            puerto = (prop.getProperty("puerto"));
            motor = (prop.getProperty("motor"));
            nameClass = (prop.getProperty("nameClass"));
//            entrada.close();
        } catch (Exception e) {
            throw e;
        }
    }


    public void cerrar() throws Exception {
        try {
            if (conexion != null) {
                if (conexion.isClosed() == false) {
                    conexion.close();
                }
            }
        } catch (Exception e) {
        }
    }

    public Connection getConexionDAO() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/geo", "nico", "nicograt");
        } catch (Exception e) {
            throw e;
        }
        return conexion;
    }

}
