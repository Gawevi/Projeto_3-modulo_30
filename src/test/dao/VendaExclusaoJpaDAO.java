package test.dao;

import br.com.gal.dao.generic.jpa.GenericJPADAO;
import br.com.gal.dao.jpa.IVendaJpaDAO;
import br.com.gal.domain.jpa.VendaJpa;
import br.com.gal.exceptions.DAOException;
import br.com.gal.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJPADAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}