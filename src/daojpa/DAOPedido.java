package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Pedido;

public class DAOPedido extends DAO<Pedido> {
	public Pedido buscarPedido(int id) {
		try {
			Query q = manager.createQuery("select p from Pedido p where p.id='" + id + "'");
			return (Pedido) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
}
