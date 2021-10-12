package ar.maxidelisio.springboot.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import ar.maxidelisio.springboot.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
