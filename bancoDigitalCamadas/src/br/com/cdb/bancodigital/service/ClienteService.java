package br.com.cdb.bancodigital.service;

import br.com.cdb.bancodigital.dao.ClienteDAO;
import br.com.cdb.bancodigital.entity.Cliente;

public class ClienteService {
	
	ClienteDAO clienteDao = new ClienteDAO();
	
	public boolean addCliente( String nome, String cpf) {
		if(!validarCPF(cpf))
			return false;
		
		if(!validarNome(nome))
			return false;
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		
		clienteDao.addCliente(cliente);
		
		return true;
	}

	private boolean validarNome(String nome) {
		return nome != null && !nome.trim().isEmpty();
	}

	private boolean validarCPF(String cpf) {
		return cpf != null && cpf.length() == 11 && cpf.matches("\\d+");	}
}
