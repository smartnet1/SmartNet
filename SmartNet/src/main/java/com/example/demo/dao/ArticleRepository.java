package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entity.Article;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long>{

	@RestResource(path = "/Byunite")
	public List<Article> findByuniteContains(@Param("uni") String unite);
	@RestResource(path = "/Byprix")
	public List<Article> findByprixContains(@Param("pri") int prix);
	@RestResource(path = "/Bytype")
	public List<Article> findBytypeContains(@Param("typ") String type);
	
}
