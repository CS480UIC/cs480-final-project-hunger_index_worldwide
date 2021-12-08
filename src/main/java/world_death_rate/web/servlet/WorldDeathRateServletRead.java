package world_death_rate.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_death_rate.dao.WorldDeathRateDao;
import world_death_rate.domain.WorldDeathRate;
//import entity1.service.Entity1Service;
import world_death_rate.dao.WorldDeathRateDao;
import world_death_rate.domain.WorldDeathRate;


/**
 * Servlet implementation class UserServlet
 */

public class WorldDeathRateServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldDeathRateServletRead() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WorldDeathRate entity1 = null;
		try {
			entity1 = WorldDeathRateDao.findByUsername(request.getParameter("country"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getCountry()!=null){
					System.out.println(entity1.getCountry());
					request.setAttribute("entity1", entity1);
					request.getRequestDispatcher("/jsps/world_death_rate/world_death_rate_read_output.jsp").forward(request, response);
				
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/world_death_rate/world_death_rate_read_output.jsp").forward(request, response);
		}
//		response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
	}
}



