package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public BookDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	public boolean Customerinsert(Customer customer) throws SQLException {
		String sql = "INSERT INTO customer (customer_id, name, city,grade) VALUES (?, ?, ?,?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, Customer.getTitle());
		statement.setString(2, Customer.getAuthor());
		statement.setFloat(3, Customer.getPrice());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	public boolean Salesinsert(Customer customer) throws SQLException {
		String sql = "INSERT INTO salesman (Salesman_id, name, city,comission) VALUES (?, ?, ?,?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, Customer.getTitle());
		statement.setString(2, Customer.getAuthor());
		statement.setFloat(3, Customer.getPrice());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	public boolean Ordensinsert(Book book) throws SQLException {
		String sql = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, book.getTitle());
		statement.setString(2, book.getAuthor());
		statement.setFloat(3, book.getPrice());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}

	

	
}
