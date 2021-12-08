package world_vaccination_info.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_vaccination_info.dao.WorldVaccinationInfoDao;
import world_vaccination_info.domain.WorldVaccinationInfo;
//import entity1.service.Entity1Service;


/**
 * Servlet implementation class UserServlet
 */

public class WorldVaccinationInfoServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldVaccinationInfoServletRead() {
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
		WorldVaccinationInfo entity1 = null;
		try {
			entity1 = WorldVaccinationInfoDao.findByCountry(request.getParameter("country"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getCountry()!=null){
					System.out.println(entity1);
//					request.setAttribute("entity1", entity1);
//					request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
					request.setAttribute("Country", entity1);
					request.getRequestDispatcher("/jsps/world_vaccination_info/world_vaccination_inforead_output.jsp").forward(request, response);
				
			}
			else{
//			request.setAttribute("msg", "Entity not found");
//			request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
				request.setAttribute("msg", "Country not found");
				request.getRequestDispatcher("/jsps/world_vaccination_info/world_vaccination_inforead_output.jsp").forward(request, response);
		}
		//response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
	}
}



