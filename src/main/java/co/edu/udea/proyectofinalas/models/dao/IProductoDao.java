package co.edu.udea.proyectofinalas.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.udea.proyectofinalas.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

    @Query("select p from Producto p where p.nombre like %?1%")
    public List<Producto> findByNombre(String term);

    public List<Producto> findByNombreContainingIgnoreCase(String term);

    public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
