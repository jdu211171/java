import java.sql.*;
// Operating System: Garuda Linux
// Database: MariaDB
public class Database {
    public static void main(String[] args) {
        try {
            /*
            Statement stmt1 = conn.createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT * FROM books;"); // get the result
            while (rs.next()) { // loop through the rows
                int id = rs.getInt("id"); // get the id column value
                String title = rs.getString("title"); // get the title column value
                String author = rs.getString("author"); // get the author column value
                System.out.println(id + " - " + title + " by " + author);
            }
            rs.close();
            stmt1.close();

            PreparedStatement pstmt1 = conn.prepareStatement("UPDATE books SET title = ? WHERE id = ?;");
            pstmt1.setString(1, "The Restaurant at the End of the Universe"); // set the new title
            pstmt1.setInt(2, 1); // set the id of the book to update
            pstmt1.executeUpdate(); // execute the statement
            pstmt1.close();            

            PreparedStatement pstmt2 = conn.prepareStatement("DELETE FROM books WHERE id = ?;");
            pstmt2.setInt(1, 1);
            pstmt2.executeUpdate();
            pstmt2.close();

            conn.close();
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
