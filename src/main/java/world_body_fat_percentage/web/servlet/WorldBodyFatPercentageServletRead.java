package world_body_fat_percentage.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_body_fat_percentage.dao.WorldBodyFatPercentageDao;
import world_body_fat_percentage.domain.WorldBodyFatPercentage;
//import entity1.service.Entity1Service;


/**
 * Servlet implementation class UserServlet
 */

public class WorldBodyFatPercentageServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldBodyFatPercentageServletRead() {
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
//		WorldBodyFatPercentage entity1 = null;
//		try {
//			entity1 = WorldBodyFatPercentageDao.findBybody_fat_percentage(request.getParameter("username"));
//		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (InstantiationException e1) {
//			e1.printStackTrace();
//		} catch (IllegalAccessException e1) {
//			e1.printStackTrace();
//		}
//		
//		if(entity1.getUsername()!=null){
//					System.out.println(entity1);
//					request.setAttribute("entity1", entity1);
//					request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//				
//			}
//			else{
//			request.setAttribute("msg", "Entity not found");
//			request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//		}
	}
}



