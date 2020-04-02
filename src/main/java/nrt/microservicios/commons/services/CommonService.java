package nrt.microservicios.commons.services;

import java.util.Optional;

public interface CommonService<E> {

	public Iterable<E> findAll();
	
	public Optional<E> findById(Long id);
	
	public E save(E entity) throws Exception;
	
	public void deleteById(Long id);
}
