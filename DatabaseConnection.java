
package principal;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    // Constructor privado para evitar la creación de instancias fuera de la clase
    private DatabaseConnection() {
        // Simular la inicialización de la conexión a la base de datos
        System.out.println("Conexión a la base de datos establecida");
    }

    // Método estático para obtener la única instancia de la clase DatabaseConnection
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para realizar consultas a la base de datos
    public void query(String sqlQuery) {
        // Simulación de una consulta a la base de datos
        System.out.println("Ejecutando la consulta: " + sqlQuery);
    }
}
