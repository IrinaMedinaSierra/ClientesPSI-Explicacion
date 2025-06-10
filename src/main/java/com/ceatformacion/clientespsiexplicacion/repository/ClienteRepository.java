package com.ceatformacion.clientespsiexplicacion.repository;

import com.ceatformacion.clientespsiexplicacion.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Esta interfase conecta nuestra aplicación con la base de datos para evitar escribir manualmente sentencias SQL
 * Para indicar a que clase hace referencia este repositorio se lo tentemos que indicar entre <nombreClase,tipoWrapper de la clave principal >
 */
@Repository
public interface ClienteRepository  extends JpaRepository <Clientes, Integer>{
}
