package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Album;

public class DAOAlbum extends DAO<Album> {
	
	public Album listarPorNome(String nome) {
		try {
			Query q = manager.createQuery("select a from Album a where a.nome='"+ nome +"'");
			return (Album) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
}
