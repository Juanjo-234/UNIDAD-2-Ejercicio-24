 interface ConexionBD {
     void conectar();
     void ejecutarConsulta(String sql);
     void desconectar();
}
