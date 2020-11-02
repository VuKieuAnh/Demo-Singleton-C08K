public class StudentManager {

    public static void main(String[] args) {

        ConnectDB connectDB = ConnectDB.getConnectDB("C0820K1");
        System.out.println(connectDB.getName());

        ConnectDB connectDB1 = ConnectDB.getConnectDB("C0820K2");
        System.out.println(connectDB1.getName());
    }


}
