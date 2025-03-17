package br.com.cdb.bancoDigitalTeste.Service;

import java.util.ArrayList;

import br.com.cdb.bancoDigitalTeste.dao.ClienteDAO;
import br.com.cdb.bancoDigitalTeste.entity.Cliente;

public class ClienteService {
	
	private ClienteDAO clienteDAO = new ClienteDAO();
	
	public void addCliente( String nome, long cpf) {
		// VALIDAR CPF
		// VALIDAR NOME
		
		Cliente cliente = new Cliente(nome, cpf);
		clienteDAO.save(cliente);
	}
	
	public ArrayList<Cliente> getClientes(){
		return clienteDAO.listAll();
	}
}
