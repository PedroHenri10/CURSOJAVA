package br.com.cdb.bancoDigitalTeste.dao;

import java.util.ArrayList;

import br.com.cdb.bancoDigitalTeste.entity.Cliente;

public class ClienteDAO {

	ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	public void save(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	public ArrayList<Cliente> listAll(){
		return listaClientes;
	}
}
