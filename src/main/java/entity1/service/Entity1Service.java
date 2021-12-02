package entity1.service;


import entity1.dao.WorldDeathRateDao;
import entity1.domain.WorldDeathRate;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class Entity1Service {
	private WorldDeathRateDao entity1Dao = new WorldDeathRateDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldDeathRate form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldDeathRate entity1 = WorldDeathRateDao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new Entity1Exception("This user name has been registered!");
		entity1Dao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void login(WorldDeathRate form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldDeathRate user = WorldDeathRateDao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new Entity1Exception("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new Entity1Exception(" The password is not right");
		
	}
}
