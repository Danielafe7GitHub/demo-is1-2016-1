package com.example.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.dominio.Curso;

public interface CursoRepositorio extends CrudRepository<Curso, String> {
	List<Curso> findAll();
	
	@Query("SELECT c FROM Curso c WHERE c.codigo = :cod AND nombre = :nombre")
	Curso buscarPorCodigoYNombre(String cod, String nombre);
	
	Curso findByCodigo(String cod);
}
