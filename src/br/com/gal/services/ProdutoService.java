package br.com.gal.services;

import br.com.gal.dao.IProdutoDAO;
import br.com.gal.domain.Produto;
import br.com.gal.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}