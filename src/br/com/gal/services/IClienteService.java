package br.com.gal.services;

import br.com.gal.domain.Cliente;
import br.com.gal.exceptions.DAOException;
import br.com.gal.exceptions.TipoChaveNaoEncontradaException;
import br.com.gal.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}