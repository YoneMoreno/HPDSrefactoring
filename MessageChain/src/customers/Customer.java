package customers;



public class Customer {
    
    private final String name;
    private Server server;


    public Customer(String name, Server server) {
        this.name = name;
        this.server = server;
    }

    public String getName() {
        return name;
    }

    public Server getServer(){return server;}
}
