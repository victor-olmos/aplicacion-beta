package com.API.App.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.API.App.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public List <Usuario> findAll();
}
