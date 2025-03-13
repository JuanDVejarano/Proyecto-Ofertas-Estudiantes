Compilar con el controlador de SQLite

```bash
javac -cp .:sqlite-jdbc-3.49.1.0.jar ./src/Model/Conexion.java ./src/Model/Cargo.java ./src/Model/Empleado.java ./src/Model/Departamento.java ./src/Model/Empresa.java ./src/Model/OficinaDeTrabajo.java
```

Ejecutar con el controlador de SQLite

```bash
java -cp .:sqlite-jdbc-3.49.1.0.jar:. src.View.Index

```
