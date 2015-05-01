/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;
 

/*
*  Importamos todas las clases el package java.sql
*/
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
* @author esteban
*/
public class Main {
/**
* @param args the command line arguments
*/
public static void main(String[] args)  {
/*
Declaramos una variable "con" del tipo Connection
con ello podremos conectarnos a la base de datos
*/
Connection con = null;
try {
/*
Seteamos el driver-libreria de nuestro motor que usaremos, MySQL
*/
Class.forName("com.mysql.jdbc.Driver").newInstance();
/*
Creamos la coneccion, pasamos como parametros:
* /
* jdbc:mysql://localhost/test
*
* 
* root
*
* 
* root
*/
con = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "blackjals");
if (con != null) {
/*
creamos un objeto Statement , con el podremos enviar al servidor sql  consultas
*/
Statement st = con.createStatement();
/*
Ahora enviaremos una consulta para seleccionar todos los alumnos y que nota se han sacado
y lo guardaremos en un objeto del tipo ResultSet
*/
ResultSet r = st.executeQuery("SELECT a.nombre as nombre, n.nota as nota FROM alumno a,nota n WHERE n.rut = a.rut ORDER BY n.nota");
/*
Iteramos el resultado para mostrar cada fila y especificamos que columna queremos con el metodo getString o getDouble segun este en la base de datos
*/
while(r.next()) {
/*
Imprimo por consola el nombre y la nota de todos los alumnos ingresados a la base de datos
*/
System.out.println("[Alumno: "+r.getString("nombre")+"] [Nota:"+r.getDouble("nota")+"]");
}
}
} catch (InstantiationException ex) {
Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
} catch (ClassNotFoundException ex) {
Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
} catch (SQLException ex) {
Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
}
 
}