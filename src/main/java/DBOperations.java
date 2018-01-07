import java.sql.*;
public class DBOperations {

        public void addOperationDetail()
        {
            ConnectionDB instance = ConnectionDB.getInstance();
            Connection conn = instance.getConnection();
            Statement std;
            try {
                std =conn.createStatement();

                String sql = "select * from ";
                ResultSet rs = std.executeQuery(sql);

                while(rs.next()){
                    int id  = rs.getInt("alumni_ID");
                    String first = rs.getString("first_name");
                    String last = rs.getString("last_name");

                    //Display values
                    System.out.print("ID: " + id);
                    System.out.print(", First: " + first);
                    System.out.println(", Last: " + last);

                }

            }
            catch(Exception e){

            }
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            //stmt = conn.createStatement();


        }
    }
}
