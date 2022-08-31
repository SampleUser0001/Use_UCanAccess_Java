package ittimfn.sample.db;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        final String DB_FILE_PATH = Paths.get(
            Thread.currentThread()
                  .getContextClassLoader()
                  .getResource("sample.db.odb") // resources下のファイルパスを指定する。
                  .getPath()
        ).toString();    
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_FILE_PATH);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from SampleTable;");
            while (rs.next()) {
                System.out.println(String.format("ID: %d, VALUE: %s", rs.getInt("ID"), rs.getString("VALUE")));
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
