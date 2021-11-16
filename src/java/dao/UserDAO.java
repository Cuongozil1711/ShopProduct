package dao;

import model.Customer;
import model.User;

public interface UserDAO {
	
	public void addUser(User u);
	
	public boolean checkUser(String username);
	
	public boolean login(String username, String password);
	
	public void updateUser(Customer u);
        
        public void updateUser(User u);
	
	public User getUser(String username);

        public Customer getCustomer(String username);
}
