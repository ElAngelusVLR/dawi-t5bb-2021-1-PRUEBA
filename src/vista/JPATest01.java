package vista;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class JPATest01 {

	public static void main(String[] args) {
		
		//Crear un objeto de Usuario a grabar
		Usuario u = new Usuario();
		u.setCodigo(6);
		u.setNombre("Eren");
		u.setApellido("Lopez");
		u.setUsuario("usuario1@ciber.com");
		u.setFnacim("2000/11/14");
		u.setTipo(1);
		u.setEstado(1);
		

		//Grabar el objeto
		//1. Fabricar el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Jpa_Sesion01");
		//2. Crear el manejador de actividades
		EntityManager em = fabrica.createEntityManager();
		
		//3.-Empezar mi transacción
		em.getTransaction().begin();
		//Proceso de persistencia
		//Crear pero superponiendose al anterior: em.persist(u);
		//Update o Inserta una columna dependiendo si existe o no: em.merge(u);
		//4.-Confirmar la transacción
		em.getTransaction().commit();
		
		
	}

}
