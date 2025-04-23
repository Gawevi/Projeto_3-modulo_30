package br.com.gal.dao;

import br.com.gal.dao.generic.IGenericDAO;
import br.com.gal.domain.Venda;
import br.com.gal.exceptions.DAOException;
import br.com.gal.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}