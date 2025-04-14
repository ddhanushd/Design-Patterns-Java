package DesignPatterns.CreationalDesignPatterns.AbstractFactory;

interface Connection{
    void connect();
}
interface Command {
    void execute(String query);
}
class MySQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
class PostgreSQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}
class MySQLCommand implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: "+query);
    }
}
class PostgreSQLCommand implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Executing PostgreSQL query: "+query);
    }
}
interface DatabaseFactory {
    Connection createConnction();
    Command createCommand();
}
class MySQLFactory implements DatabaseFactory {

    @Override
    public Connection createConnction() {
        return new MySQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }
}
class PostgreSQLFactory implements DatabaseFactory {

    @Override
    public Connection createConnction() {
        return new PostgreSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgreSQLCommand();
    }
}
class Application {
    private Connection connection;
    private Command command;

    public Application(DatabaseFactory factory){
        connection= factory.createConnction();
        command= factory.createCommand();
    }
    void performDatabaseOperations(String query){
        connection.connect();
        command.execute(query);
    }

}
public class AbstractFactoryPattern {
    public static void main(String[] args){
        DatabaseFactory mySQLFactory=new MySQLFactory();
        Application mySQLApp=new Application(mySQLFactory);
        mySQLApp.performDatabaseOperations("SELECT * FROM users;");

        DatabaseFactory postgreSQLFactory=new PostgreSQLFactory();
        Application postgreSQLApp=new Application(postgreSQLFactory);
        postgreSQLApp.performDatabaseOperations("SELECT * FROM employees;");
    }
}
