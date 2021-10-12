package ar.maxidelisio.springboot.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.maxidelisio.springboot.apirest.models.dao.IClienteDao;
import ar.maxidelisio.springboot.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll() {		
		return (List<Cliente>) clienteDao.findAll();
	}

}
