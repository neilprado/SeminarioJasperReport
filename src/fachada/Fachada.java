package fachada;

import daojpa.DAO;
import daojpa.DAOAlbum;
import daojpa.DAOArtista;
import daojpa.DAOMusica;

public class Fachada{
	private static DAOArtista daoartista = new DAOArtista();
	private static DAOAlbum daoalbum = new DAOAlbum();
	private static DAOMusica daomusica = new DAOMusica();
	
	public static void inicializar() {
		DAO.open();
	}
	
	public static void finalizar() {
		DAO.close();
	}
}