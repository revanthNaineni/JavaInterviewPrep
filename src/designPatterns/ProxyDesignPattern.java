package designPatterns;
// Subject interface
interface DataAccess {
    void accessData();
}

class RealDataAccess implements DataAccess {
    @Override
    public void accessData() {
        System.out.println("Accessing sensitive data...");
    }
}

class DataAccessProxy implements DataAccess {
    

	private RealDataAccess realDataAccess;
    private String userRole;

    public DataAccessProxy(String userRole) {
        this.userRole = userRole;
        realDataAccess = new RealDataAccess();
    }
    
    

    @Override
    public void accessData() {
        if (userRole.equals("Admin")) {
            realDataAccess.accessData();
        } else {
            System.out.println("Access Denied: You don't have the necessary permissions.");
        }
    }
}


// Client
public class ProxyDesignPattern {
    public static void main(String[] args) { 
    	DataAccess dataAccess = new DataAccessProxy("Admin");
    dataAccess.accessData();  // Allowed

    DataAccess dataAccessUser = new DataAccessProxy("User");
    dataAccessUser.accessData();  // Denied
}
}
