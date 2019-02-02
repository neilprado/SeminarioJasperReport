package daojpa;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.NoResultException;

import modelo.Musica;

public class DAOMusica extends DAO<Musica> {
	public Musica buscaPorNome(String nome) {
		try {
			Query q = manager.createQuery("Select m from Musica m where m.nome='" + nome + "'");
			return (Musica) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Musica> listarMusicasPorAlbum(String nome){
		try {
			Query q = manager.createQuery("select m from Musica m where m.album.nome='" + nome + "'");
			return q.getResultList();
		}catch(NoResultException e) {
			return null;
		}
	}
}
