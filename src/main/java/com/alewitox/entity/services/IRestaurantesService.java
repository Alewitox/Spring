package com.alewitox.entity.services;

import java.util.List;

import com.alewitox.entity.models.Restaurantes;

public interface IRestaurantesService {
	public Restaurantes get (int id);
	public List<Restaurantes> getAll();
	public void post(Restaurantes restaurantes);
	public void put(Restaurantes restaurantes, int id);
	public void delete(int id);
}
