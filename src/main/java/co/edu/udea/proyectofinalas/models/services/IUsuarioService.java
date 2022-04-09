package co.edu.udea.proyectofinalas.models.services;

import co.edu.udea.proyectofinalas.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
}
