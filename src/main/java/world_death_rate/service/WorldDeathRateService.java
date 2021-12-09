package world_death_rate.service;


import java.util.List;

import world_death_rate.dao.WorldDeathRateDao;
import world_death_rate.domain.WorldDeathRate;

/**
 * logic functions such as register, login
 * @author Afnan Waseem
 *
 */
public class WorldDeathRateService {
	private WorldDeathRateDao entity1Dao = new WorldDeathRateDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldDeathRate form) throws WorldDeathRateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldDeathRate entity1 = WorldDeathRateDao.findByUsername(form.getCountry());
		if(entity1.getCountry()!=null && entity1.getCountry().equals(form.getCountry())) throw new WorldDeathRateException("This user name has been registered!");
		entity1Dao.add(form);
	}
	public List<Object> findCC() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return entity1Dao.findCC();
		
	}
	public List<Object> findCCD() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return entity1Dao.findCCD();
		
	}
//	/**
//	 * Login function
//	 * @param form
//	 * @return
//	 * @throws UserException 
//	 * @throws ClassNotFoundException 
//	 * @throws IllegalAccessException 
//	 * @throws InstantiationException 
//	 */
//	public void login(WorldDeathRate form) throws WorldDeathRateException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		WorldDeathRate user = WorldDeathRateDao.findByUsername(form.getUsername());
//		if(user.getUsername()==null) throw new WorldDeathRateException("The user is not in the database");
//		
//		String password = user.getPassword();
//		
//		if(password!=null && !password.equals(form.getPassword()))
//			throw new WorldDeathRateException(" The password is not right");
//		
//	}
}
