package ar.maxidelisio.springboot.apirest.models.service;

import java.util.List;

import ar.maxidelisio.springboot.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
