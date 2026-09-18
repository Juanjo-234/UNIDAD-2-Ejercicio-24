class ConexionMySQL implements ConexionBD{
    private boolean conectada = false;

    public void conectar(){
        if(conectada){
            System.out.println("La conexión ya se encuentra abierta");
            return;
        }
        conectada = true;
        System.out.println("[MySQL] Conexión establecida exitosamente.");
    }
    public void ejecutarConsulta(String sql) {
        if (!conectada) {
            System.err.println("[Error MySQL] No se puede ejecutar la consulta. La base de datos está desconectada.");
            return;
        }
        System.out.println("[MySQL] Ejecutando sentencia SQL: " + sql);
    }
    public void desconectar() {
        if (!conectada) {
            System.out.println("[MySQL] La conexión ya estaba cerrada.");
            return;
        }
        conectada = false;
        System.out.println("[MySQL] Conexión cerrada correctamente.");
    }
}

