package thidk.codelean.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	private DataSource dataSource;

	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Student> getStudents() throws Exception {
		
		List<Student> students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// get a connection
			String url = "jdbc:mysql://localhost:3306/student_manager";
			String username = "root";
			String password = "";
			Class.forName("com.mysql.jdbc.Driver");

			myConn = DriverManager.getConnection(url,username,password);
//			myConn = dataSource.getConnection();
			
			// create sql statement
			String sql = "select * from product order by last_name";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				String image = myRs.getString("image");
				double price = myRs.getDouble("price");  // Sửa lỗi: Lấy giá trị price dưới dạng double

				// create new student object
				Student tempStudent = new Student(id, firstName, lastName, email, image, price);

				// add it to the list of students
				students.add(tempStudent);
			}
			
			return students;		
		}
		finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}		
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public void addStudent(Student theStudent) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
//			myConn = dataSource.getConnection();
			// get a connection
			String url = "jdbc:mysql://localhost:3306/student_manager";
			String username = "root";
			String password = "";
			Class.forName("com.mysql.jdbc.Driver");

			myConn = DriverManager.getConnection(url,username,password);

			// create sql for insert


			String sql = "INSERT INTO product (first_name, last_name, email, image, price) VALUES (?, ?, ?, ?, ?)";
			myStmt = myConn.prepareStatement(sql);

			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			myStmt.setString(4, theStudent.getImage());
			myStmt.setDouble(5, theStudent.getPrice());
			// execute sql insert
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public Student getStudent(String theStudentId) throws Exception {

		Student theStudent = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int studentId;
		
		try {
			// convert student id to int
			studentId = Integer.parseInt(theStudentId);
			
			// get connection to database
//			myConn = dataSource.getConnection();
			// get a connection
			String url = "jdbc:mysql://localhost:3306/student_manager";
			String username = "root";
			String password = "";
			Class.forName("com.mysql.jdbc.Driver");

			myConn = DriverManager.getConnection(url,username,password);
			
			// create sql to get selected student
			String sql = "select * from product where id=?";
			
			// create prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, studentId);
			
			// execute statement
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			if (myRs.next()) {
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				String image = myRs.getString("image");
				double price = myRs.getDouble("price");

				// use the studentId during construction
				theStudent = new Student(studentId, firstName, lastName, email, image, price);
			}
			else {
				throw new Exception("Could not find student id: " + studentId);
			}				
			
			return theStudent;
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	public void updateStudent(Student theStudent) throws Exception {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
//			myConn = dataSource.getConnection();
			// get a connection
			String url = "jdbc:mysql://localhost:3306/student_manager";
			String username = "root";
			String password = "";
			Class.forName("com.mysql.jdbc.Driver");

			myConn = DriverManager.getConnection(url,username,password);
			
			// create SQL update statement
			String sql = "update product "
						+ "set first_name=?, last_name=?, email=?, image=?, price=? "
						+ "where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			myStmt.setInt(4, theStudent.getId());
			myStmt.setString(5, theStudent.getImage());
			myStmt.setDouble(6, theStudent.getPrice());
			
			// execute SQL statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public void deleteStudent(String theStudentId) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// convert student id to int
			int studentId = Integer.parseInt(theStudentId);
			
			// get connection to database
//			myConn = dataSource.getConnection();
			// get a connection
			String url = "jdbc:mysql://localhost:3306/student_manager";
			String username = "root";
			String password = "";
			Class.forName("com.mysql.jdbc.Driver");

			myConn = DriverManager.getConnection(url,username,password);
			
			// create sql to delete student
			String sql = "delete from product where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, studentId);
			
			// execute sql statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}	
	}
}















