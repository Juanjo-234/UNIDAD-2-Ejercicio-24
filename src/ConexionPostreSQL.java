public class ConexionPostreSQL implements ConexionBD{
    private boolean conectada = false;

    public void conectar() {
        if (conectada) {
            System.out.println("[PostgreSQL] La conexión ya se encuentra abierta.");
            return;
        }
        conectada = true;
        System.out.println("[PostgreSQL] Conexión establecida exitosamente.");
    }
    public void ejecutarConsulta(String sql) {
        if (!conectada) {
            System.err.println("[Error PostgreSQL] No se puede ejecutar la consulta. La base de datos está desconectada.");
            return;
        }
        System.out.println("[PostgreSQL] Ejecutando sentencia SQL: " + sql);
    }
    public void desconectar() {
        if (!conectada) {
            System.out.println("[PostgreSQL] La conexión ya estaba cerrada.");
            return;
        }
        conectada = false;
        System.out.println("[PostgreSQL] Conexión cerrada correctamente.");
    }
}
