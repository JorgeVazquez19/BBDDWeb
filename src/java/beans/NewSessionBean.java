/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import Modelo.Peliculas;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author Jorgi
 */
@Stateless
public class NewSessionBean {

    @PersistenceUnit
    EntityManagerFactory emf;

    public List findAll() {
        
        
        return emf.createEntityManager().createNamedQuery("Peliculas.findAll").getResultList();
    }

    public void insertPeli(String titulo, java.sql.Date date, double presu) {
        Peliculas peli = new Peliculas();
        peli.setTitulo(titulo);
        peli.setPresupuesto(presu);
        peli.setFecha(date);
        emf.createEntityManager().persist(peli);
        System.out.println("Se ahadio" + peli);
    }

    public List buscarPeli(String titulo) {
        return emf.createEntityManager().createNamedQuery("Peliculas.findByTitulo").setParameter("titulo", titulo).getResultList();

    }

    public List updatePeli(String titulo) {
        return emf.createEntityManager().createNamedQuery("Peliculas.findByTitulo").setParameter("titulo", titulo).getResultList();

    }

    public void deletePeli(int id) {
        
        EntityManager em = emf.createEntityManager();

        Peliculas pelicula = em.find(Peliculas.class, id);

        em.remove(pelicula);

    }

}
