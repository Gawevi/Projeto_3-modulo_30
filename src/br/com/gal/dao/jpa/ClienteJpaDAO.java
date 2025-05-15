package br.com.gal.dao.jpa;

import br.com.gal.dao.generic.jpa.GenericJPADAO;
import br.com.gal.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJPADAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}