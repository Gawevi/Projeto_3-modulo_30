package br.com.gal.dao.jpa;

import br.com.gal.dao.IProdutoDAO;
import br.com.gal.dao.generic.jpa.GenericJPADAO;
import br.com.gal.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJPADAO<ProdutoJpa, Long> implements IProdutoDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
