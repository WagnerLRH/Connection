package Connection;
import java.sql.*;
public class First_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver"); //Aca lo estoy mandando a buscar el Driver 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nabenik?useSSL=false", "root", "Puntitos1"); //Una vez encontrado el Driver aca estoy estableciendo la conecci�n y 
			// Root=usuario ""=contrase�a que esta vac�a y lo demas es por default, siempre tiene que ser as�
			Statement stmt = conn.createStatement(); //Este es el puente o traductor para ejecutar los queries
			ResultSet rs =stmt.executeQuery("SELECT NOMBRE, IDANIMAL, NVULGAR FROM zoológico");//Ac� estoy ejecutando el query
			
			while(rs.next()) { //Aca estoy mandando a leer los resultados del query y los almacena en un String separado por tablas 
				String NOMBRE =rs.getString("NOMBRE");
				String IDANIMAL = rs.getString("IDANIMAL");
				String NVULGAR = rs.getString("NVULGAR");
				System.out.println("Nombre:"+NOMBRE+" IDAnimal:" +IDANIMAL+" NVulgar:"+NVULGAR);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
