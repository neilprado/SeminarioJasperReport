package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Produto;

public class DAOProduto extends DAO<Produto> {
	
	public Produto buscarProduto(String nome) {
		try {
			Query q = manager.createQuery("select p from Produto p where p.nome='" + nome + "'");
			return (Produto) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
}
