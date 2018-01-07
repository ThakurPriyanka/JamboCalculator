
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static  ConnectionDB instance = null ;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/jamboCalculator";

    static final String USER = "root";
    static final String PASS = "addlife@94";

    static  Connection conn = null;

    private ConnectionDB()   {
        //STEP 2: Register JDBC driver
        try{
            Class.forName(JDBC_DRIVER);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();

        }
        //STEP 3: Open a connection
        System.out.println("Connecting to database...");

    }
    public  Connection getConnection()
    {

        if(conn ==  null){

            synchronized(ConnectionDB.class){
                if(conn == null){
                    try{
                        conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    }
                    catch(SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;

    }

    public static ConnectionDB getInstance()
    {
        if(instance == null){
            synchronized(ConnectionDB.class){
                if(instance == null)
                {
                    instance = new ConnectionDB();
                }
            }

        }
        return instance;
    }
}

