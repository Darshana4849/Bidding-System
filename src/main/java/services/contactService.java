package services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import controller.DBConnect;
import model.contact;

public class contactService {
	
	public void regContact(contact con) {
		try {
			
			String query = "insert into contact values('"+con.getEmail()+"','"+con.getName()+"','"+con.getNumber()+"','"+con.getMessage()+"')";
			
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
		
		public boolean validate(contact con) {
			try {
				
				String query = "select * from contact where email = '"+con.getEmail()+"' and number = '"+con.getNumber()+"'";
				
				Statement statement = DBConnect.getConnection().createStatement();
				
				ResultSet rs = statement.executeQuery(query);
				
				if(rs.next()) {
					return true;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
			return false;
		}
		
		public contact getone(contact con) {
			try {
				
				String query = "select * from contact where email = '"+con.getEmail()+"' and password = '"+con.getNumber()+"'";
				
				Statement statement = DBConnect.getConnection().createStatement();
				
				ResultSet rs = statement.executeQuery(query);
				
				if(rs.next()) {
					con.setName(rs.getString("name"));
					con.setEmail(rs.getString("email"));
					con.setNumber(rs.getString("number"));
					con.setMessage(rs.getString("message"));
					return con;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
			return null;
		}
		
		public ArrayList<contact> getAllcustomer(){
			try {
				ArrayList<contact> listCus = new ArrayList<contact>();
				
				String query ="select * from contact";
				
				Statement statement = DBConnect.getConnection().createStatement();
				ResultSet rs = statement.executeQuery(query);
				while(rs.next()) {
					contact cus = new contact();
					cus.setName(rs.getString("name"));
					cus.setEmail(rs.getString("email"));
					cus.setNumber(rs.getString("number"));
					cus.setMessage(rs.getString("message"));
					listCus.add(cus);

				}
				return listCus;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			
		}
		
		public contact singleDataButton(contact con) {
			try {
				
				String query = "select * from contact where email = '"+con.getEmail()+"'"; 
				
				Statement statement = DBConnect.getConnection().createStatement();
				
				ResultSet rs = statement.executeQuery(query);
				
				if(rs.next()) {
					con.setName(rs.getString("name"));
					con.setEmail(rs.getString("email"));
					con.setNumber(rs.getString("number"));
					con.setMessage(rs.getString("message"));
					return con;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
			return null;
		}
		
		public void updateCustomer(contact contact) {
			try {
				
				String query ="update contact SET name='"+contact.getName()+"', email='"+contact.getEmail()+"', number='"+contact.getNumber()+"', message='"+contact.getMessage()+"' where email='"+contact.getEmail()+"'";
				
				Statement statement = DBConnect.getConnection().createStatement();
				statement.executeUpdate(query);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public void DeleteContact(contact con) {
			try {
				
				String query ="Delete from contact where email = '"+con.getEmail()+"'";
				Statement statement = DBConnect.getConnection().createStatement();
				statement .executeUpdate(query);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}


