package br.com.cdb.bancoDigitalTeste.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cdb.bancoDigitalTeste.Service.ClienteService;
import br.com.cdb.bancoDigitalTeste.entity.Cliente;

@RestController
public class ClienteController {

	private ClienteService clienteService = new ClienteService();
	
	@PostMapping("/add/{nome}/{cpf}")
	public void addCliente(@PathVariable String nome, @PathVariable Long cpf) {
		clienteService.addCliente(nome, cpf);
	}
	
	@GetMapping("/all")
	public ArrayList<Cliente> getAllClientes(){
		return clienteService.getClientes();
	}
}
