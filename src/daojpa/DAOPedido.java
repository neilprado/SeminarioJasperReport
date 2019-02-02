package daojpa;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;

public class DAOPedido extends DAO<Pedido> {
	public Pedido consultarPedidoCliente(Cliente c) {
		try {
			Query q = manager.createQuery("select p from Pedido p where p.cliente='" + c + "'");
			return (Pedido) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
	
	public List<Pedido> listarPedidosComProduto(Produto p){
		try {
			Query q = manager.createQuery("select p from Pedido p join pr.pedido prod where prod.produto='" + p + "'");
			@SuppressWarnings("unchecked")
			List<Pedido> resultado = q.getResultList();
			return resultado;
		}catch(NoResultException e) {
			return null;
		}
	}
}
