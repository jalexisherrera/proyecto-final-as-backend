package co.edu.udea.proyectofinalas.models.dao;

import java.util.List;

import co.edu.udea.proyectofinalas.models.entity.Cliente;
import co.edu.udea.proyectofinalas.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

    @Query("from Region")
    public List<Region> findAllRegiones();
}
