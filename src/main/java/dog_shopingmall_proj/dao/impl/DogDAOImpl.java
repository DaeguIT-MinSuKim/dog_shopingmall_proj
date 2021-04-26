package dog_shopingmall_proj.dao.impl;

import java.sql.Connection;
import java.util.List;

import dog_shopingmall_proj.dao.DogDAO;
import dog_shopingmall_proj.dto.Dog;

public class DogDAOImpl implements DogDAO {
	private static final DogDAOImpl instance = new DogDAOImpl();
	private Connection con;

	public static DogDAOImpl getInstance() {
		return instance;
	}

	private DogDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	@Override
	public List<Dog> selectDogList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dog selectDog(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertDog(Dog dog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReadCount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
