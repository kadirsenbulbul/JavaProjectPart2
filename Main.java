public class Main {
    public static void addEntry(IDatabase database){
        database.add();
    }
    public static void main(String[] args) {
        Employee employee = new Employee(10,"Kadir",30000);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

        MySqlDatabase mysql = new MySqlDatabase();

        mysql.add();
        mysql.delete();

        IDatabase database = new OracleDatabase();
        database.add();
        database.delete();

        addEntry(database);






    }
}