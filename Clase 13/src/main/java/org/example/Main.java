package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        MysqlCon db = new MysqlCon();
        db.connectDatabase("jdbc:mysql://db4free.net:3306/pelisebd","pelise", "Integrador350");
        db.executeUpdate("INSERT departamento (nombre, presupuesto) VALUES ('administracion', 150000)");
        //3.a)  Insertar un empleado nuevo en la nómina de trabajo.
        db.executeUpdate("INSERT empleado VALUES (22232789, 'Mateo', 'Mussu', 'Uruguay', 'administracion')");
        //3.b)  Modificar la nacionalidad de algún empleado.
        db.executeUpdate("UPDATE empleado SET nacionalidad='Peru' WHERE dni=22232789");
        //3.c)  Eliminar un departamento.
        db.executeUpdate("DELETE FROM empleado WHERE departamento = 'administracion'");
        db.executeUpdate("DELETE FROM departamento WHERE nombre = 'administracion'");
        //3.d)  Conocer los empleados que trabajan en el departamento de “logística” (puede ser
        //      cualquiera de los que agreguen).
        db.executeQuery("SELECT * FROM empleado WHERE departamento = 'logistica'");
        //3.e)  Mostrar todos los departamentos ordenados alfabéticamente.
        db.executeQuery("SELECT * FROM departamento ORDER BY nombre ASC");
        db.cerrar();
    }
}
