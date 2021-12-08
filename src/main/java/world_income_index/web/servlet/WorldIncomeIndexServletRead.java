package world_income_index.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_income_index.dao.WorldIncomeIndexDao;
import world_income_index.domain.WorldIncomeIndex;
//import entity1.service.Entity1Service;


/**
 * Servlet implementation class UserServlet
 */

public class WorldIncomeIndexServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldIncomeIndexServletRead() {
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
		WorldIncomeIndex entity1 = null;
		try {
			entity1 = WorldIncomeIndexDao.findByCountry(request.getParameter("country"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getCountry()!=null){
					System.out.println(entity1.getCountry());
//					request.setAttribute("entity1", entity1);
//					request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
					request.setAttribute("country", entity1);
					request.getRequestDispatcher("/jsps/world_income_avg/world_income_avgread_output.jsp").forward(request, response);
				
			}
			else{
//			request.setAttribute("msg", "Entity not found");
//			request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
				request.setAttribute("msg", "Country not found");
				request.getRequestDispatcher("/jsps/world_income_avg/world_income_avgread_output.jsp").forward(request, response);
		}
		//response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
	}
}



