import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PostgreSQLJDBCExample {

    public Connection connect() throws SQLException {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/nodog";
        String username = "servacct";
        String password = "prop9613velo";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    public ArrayList<String> getNumbers() {
        String SQL = "SELECT \"integer\" FROM numbers";
        ArrayList<String> integers = new ArrayList<String>();
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            fillNumbers(rs, integers);
            // integers = ; //rs.getArray("integers");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return integers;
    }

    private void fillNumbers(ResultSet rs, ArrayList<String> integers) throws SQLException {
        while (rs.next()) {
            String i = rs.getString("integer");
            integers.add(i);
        }
    }

    public int secondHighest(ArrayList<String> integers) {
        int max = 0;
        int second_max = 0;
        for (String integer : integers) {
            int a_number = Integer.parseInt(integer);
            if (a_number > max) {
                int last_max = max;
                max = a_number;
                if (last_max > second_max) {
                    second_max = last_max;
                }
            } else if (a_number > second_max && a_number < max) {
                second_max = a_number;
            }
        }
        return second_max;
    }

    public static void main(String[] args) {

        PostgreSQLJDBCExample psje = new PostgreSQLJDBCExample();
        ArrayList<String> integers = psje.getNumbers();
        System.out.println(integers.toString());
        System.out.println(psje.secondHighest(integers));

        // String[] integers = {};

        // try {
        // Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        // // Perform database operations
        // integers = getNumbers(conn);
        // conn.close();
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }
        // System.out.println("numbers = " + 0);

    }
}