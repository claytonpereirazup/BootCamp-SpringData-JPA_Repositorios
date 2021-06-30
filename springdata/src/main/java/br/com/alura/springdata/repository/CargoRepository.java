package br.com.alura.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.modelo.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long> {

}
