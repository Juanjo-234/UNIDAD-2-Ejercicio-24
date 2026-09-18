//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ConexionBD mysql = new ConexionMySQL();
    ConexionBD mongo = new ConexionMongoDB();

    System.out.println("=== PRUEBA 1: Validaciones y flujo en MySQL ===");
    mysql.ejecutarConsulta("SELECT * FROM usuarios;");
    mysql.conectar();
    mysql.conectar();

    mysql.ejecutarConsulta("SELECT * FROM productos WHERE stock > 0;");
    mysql.desconectar();
    mysql.desconectar();

    System.out.println("\n=== PRUEBA 2: Conexión y consulta en MongoDB ===");
    mongo.conectar();
    mongo.ejecutarConsulta("{ find: 'clientes', filter: { activo: true } }");
    mongo.desconectar();
}
