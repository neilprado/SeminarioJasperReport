package daojpa;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Artista;

public class DAOArtista extends DAO<Artista> {

	public Artista buscaPorNome(String nome) {
		try {
			Query q = manager.createQuery("select a from Artista a where a.nome='" + nome + "'");
			return (Artista) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}

	public List<Artista> listaArtistasPorGenero(String genero){
		try {
			Query q = manager.createQuery("select a.artista from Album a join a.generos g where g.nome='" + genero + "'");
			@SuppressWarnings("unchecked")
			List<Artista> resultados =  q.getResultList();
			if(resultados.size()>0)
				return resultados;
		}catch(NoResultException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


}