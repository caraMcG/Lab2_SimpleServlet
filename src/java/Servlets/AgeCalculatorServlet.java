/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 731258
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String _age = request.getParameter("ageNumber");
        String _submit = request.getParameter ("submit");
        
        if(_submit != null)
        {
            if(_age != null && !_age.equals(""))
            {                
                Integer _total; 
                Integer _intAge = Integer.parseInt(_age);
               
                _total = _intAge + 1; 
                
                request.setAttribute("message", "Your age next birthday will be:" + "&nbsp" + (_total));
                getServletContext().getRequestDispatcher("/agecalculator.jsp").forward(request, response);
            }
            
            else
            {   //name of placeholder first, then what you want displayed on page
                request.setAttribute("error", "You must enter your current age.");
            }
        }
    
        getServletContext().getRequestDispatcher("/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
