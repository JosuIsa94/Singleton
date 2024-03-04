package principal;

// Clase Main para probar la implementación del Singleton
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de DatabaseConnection
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();

        // Ambas instancias son iguales
        System.out.println(dbConnection1 == dbConnection2); // Salida: true

        // Podemos usar cualquiera de las instancias para realizar consultas a la base de datos
        dbConnection1.query("SELECT * FROM users");
        dbConnection2.query("DELETE FROM products");
    }
}
