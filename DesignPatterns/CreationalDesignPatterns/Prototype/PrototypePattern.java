package DesignPatterns.CreationalDesignPatterns.Prototype;
interface Prototype {
    Prototype clone();
}
class NetworkConnection implements Prototype {
    private String ip;
    private String importData;

    public NetworkConnection(String ip, String importData) {
        this.ip = ip;
        this.importData = importData;
    }

    public NetworkConnection() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportData() {
        return importData;
    }

    public void setImportData(String importData) {
        this.importData = importData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importData='" + importData + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        return new NetworkConnection(ip,importData);
    }

    public void loadImpData() throws InterruptedException {
        this.importData="Very Very Cruial Data";
        Thread.sleep(5000);
    }
}
public class PrototypePattern {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadImpData();
        System.out.println(networkConnection);

        System.out.println("Cloned Objects");
        NetworkConnection clonedNetworkConnection1=(NetworkConnection) networkConnection.clone();
        NetworkConnection clonedNetworkConnection2=(NetworkConnection) networkConnection.clone();
        System.out.println(clonedNetworkConnection1);
        System.out.println(clonedNetworkConnection2);
    }
}
