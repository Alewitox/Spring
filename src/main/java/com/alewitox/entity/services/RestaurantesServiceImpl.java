package com.alewitox.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alewitox.entity.dao.IRestaurantesDao;
import com.alewitox.entity.models.Restaurantes;


@Service
public class RestaurantesServiceImpl implements IRestaurantesService{
	
	@Autowired
	private IRestaurantesDao  restaurantesDao;

	@Override
	public Restaurantes get(int id) {
		return restaurantesDao.findById(id).get();
		
	}

	@Override
	public List<Restaurantes> getAll() {
		return (List<Restaurantes>) restaurantesDao.findAll();
	}

	@Override
	public void post(Restaurantes restaurantes) {
		restaurantesDao.save(restaurantes);
		
	}

	@Override
	public void put(Restaurantes restaurantes, int id) {
		restaurantesDao.findById(id).ifPresent((x)->{
			restaurantes.setId(id);
			restaurantesDao.save(restaurantes);
		});
		
	}

	@Override
	public void delete(int id) {
		restaurantesDao.deleteById(id);
		
	}

}
