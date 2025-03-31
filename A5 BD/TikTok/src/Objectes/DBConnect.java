/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import org.mariadb.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mabardaji
 */
public class DBConnect {
    private static DBConnect instance;
    static final String DRIVER = "org.mariadb.jdbc.Driver";
    static final String PROTOCOL = "jdbc:mariadb:";
    static final String HOST = "127.0.0.1"; //localhost, direcció web on es troba la bd de dades
    static final String BD_NAME = "tiktokdb"; //nombre base datos NO LA TABLA!
    static final String USER = "tiktokDB"; //usuari per accedir a la base de dades
    static final String PASSWORD = "tiktokDB"; //password 

    //carregar driver en memoria
    public DBConnect() throws ClassNotFoundException {
        loadDriver();
    }

    public static void loadDriver() throws ClassNotFoundException {
        Class.forName(DRIVER);
    }
    
    public static DBConnect getInstance() throws ClassNotFoundException{
        if (instance==null)
        {
            instance = new DBConnect();
        }
        return instance;
    }
    
    /* Crea conexió a la nostra BD 
    
      private static final String URL = "jdbc:mariadb://localhost:3306/nombre_base_datos";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";

    public static Connection getConnection() {
        try {
            // Cargar el driver (opcional, MariaDB lo hace automáticamente)
            Class.forName("org.mariadb.jdbc.Driver");

            // Establecer la conexión
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
    */
    public static Connection getConnection() throws SQLException
    {
        final String BD_URL = String.format("%s//%s/%s", PROTOCOL, HOST, BD_NAME);
        Connection conn = null;
        conn = (Connection) DriverManager.getConnection(BD_URL, USER, PASSWORD);
        return conn;
    }
}

