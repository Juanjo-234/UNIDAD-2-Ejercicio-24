Resolución del ejercicio N°24 de la unidad 2 de programación 2.
Este programa simula un sistema de gestión y conectividad con bases de datos heterogéneas, permitiendo alternar entre distintos motores de almacenamiento mediante una única interfaz polimórfica, controlando de manera segura los estados de conexión y previniendo errores operativos.

Clases e Interfaz Utilizadas
ConexionBD (Interfaz): Define el contrato estándar para conectar, ejecutar consultas y desconectar.
ConexionMySQL: Implementa la interfaz simulando la gestión de conexiones con un servidor relacional MySQL.
ConexionPostgreSQL: Implementa la interfaz simulando la interacción con un clúster de base de datos PostgreSQL.
ConexionMongoDB: Implementa la interfaz simulando la conexión a un servidor de base de datos NoSQL.
