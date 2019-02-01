package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Cliente;

public class DAOCliente extends DAO<Cliente> {
	
	public Cliente buscarCliente(String nome) {
		try {
			Query q = manager.createQuery("select c from Cliente c where c.nome='" + nome +"'" );
			return (Cliente) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
}
