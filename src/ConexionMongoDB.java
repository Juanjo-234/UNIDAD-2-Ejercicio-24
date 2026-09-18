public class ConexionMongoDB implements ConexionBD{
    private boolean conectada = false;

    public void conectar() {
        if (conectada) {
            System.out.println("[MongoDB] La conexión ya se encuentra abierta.");
            return;
        }
        conectada = true;
        System.out.println("[MongoDB] Conexión establecida exitosamente con el cluster.");
    }
    public void ejecutarConsulta(String sql) {
        if (!conectada) {
            System.err.println("[Error MongoDB] No se puede ejecutar la consulta. La base de datos está desconectada.");
            return;
        }
        System.out.println("[MongoDB] Mapeando y ejecutando consulta en formato de documentos: " + sql);
    }
    public void desconectar() {
        if (!conectada) {
            System.out.println("[MongoDB] La conexión ya estaba cerrada.");
            return;
        }
        conectada = false;
        System.out.println("[MongoDB] Conexión cerrada correctamente.");
    }
}
