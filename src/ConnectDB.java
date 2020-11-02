public class ConnectDB {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static ConnectDB connectDB;

    private ConnectDB(String name) {
        this.name = name;
    }

    public static ConnectDB getConnectDB(String name){
        if (connectDB == null) connectDB = new ConnectDB(name);
        return connectDB;
    }
}
