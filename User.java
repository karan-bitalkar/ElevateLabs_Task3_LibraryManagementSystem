public class User {
    private int userId;
    private String name;

    //constructor
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    //getters
    
    public int getUserId() {
    	return userId; 
    	}
    
    
    public String getName() { 
    	return name; 
    	}
    

    @Override
    public String toString() {
        return "User ID: " + userId + " | Name: " + name;
    }
}
