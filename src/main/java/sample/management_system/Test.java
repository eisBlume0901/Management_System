package sample.management_system;

public class Test
{
    public static void main(String[] args)
    {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.getConnection("sample_ms");

    }
}
