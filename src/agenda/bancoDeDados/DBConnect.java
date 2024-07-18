package agenda.bancoDeDados;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    private static final String ROOT = "jdbc:postgresql://localhost:5432/treino";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    public static Connection conexaoBanco(){   
        try {
            Connection cn = DriverManager.getConnection(ROOT,USER,PASSWORD);
            return cn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
