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
public class ArithmeticCalculatorServlet extends HttpServlet 
{

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {        
        Integer _total;
        
        String _first = request.getParameter("first");
        String _second = request.getParameter("second");

        //SUBMIT BUTTON VALUES
        String _plus = request.getParameter("plus");
        String _minus = request.getParameter("minus");
        String _times = request.getParameter("times");
        //String _modu = request.getParameter("modu");

        
        if(_plus != null)
        {
            //CHECK THAT ENTRIES ARE NUMBERS
            if(_first.matches("[0-9]+") && _second.matches("[0-9]+"))
            {
                //PARSE THE STRING ENTRIES
                Integer _Fnum = Integer.parseInt(_first);
                Integer _Snum = Integer.parseInt(_second);

                _total = _Fnum + _Snum;
                request.setAttribute("first", _Fnum);
                request.setAttribute("second", _Snum);
                request.setAttribute("message", "Result:" + "&nbsp" + (_total));
            }
            //ENTRIES ARE NOT NUMBERS OR ARE MISSING
            else 
            {
                request.setAttribute("message", "---");
                request.setAttribute("error", "Must enter numeric values. Do not leave any fields blank.");
            }
            
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }
        else if(_minus != null)
        {  
            //CHECK THAT ENTRIES ARE NUMBERS
            if(_first.matches("[0-9]+") && _second.matches("[0-9]+"))
            {
                //PARSE THE STRING ENTRIES
                Integer _Fnum = Integer.parseInt(_first);
                Integer _Snum = Integer.parseInt(_second);

                _total = _Fnum - _Snum;
                
                request.setAttribute("first", _Fnum);
                request.setAttribute("second", _Snum);
                request.setAttribute("message", "Result:" + "&nbsp" + (_total));
            }
            //ENTRIES ARE NOT NUMBERS OR ARE MISSING
            else 
            {
                request.setAttribute("message", "---");
                request.setAttribute("error", "Must enter numeric values. Do not leave any fields blank.");
            }
            
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }
        else if(_times != null)
        {   
            //CHECK THAT ENTRIES ARE NUMBERS
            if(_first.matches("[0-9]+") && _second.matches("[0-9]+"))
            {
                //PARSE THE STRING ENTRIES
                Integer _Fnum = Integer.parseInt(_first);
                Integer _Snum = Integer.parseInt(_second);

                _total = _Fnum * _Snum;
                
                request.setAttribute("first", _Fnum);
                request.setAttribute("second", _Snum);
                request.setAttribute("message", "Result:" + "&nbsp" + (_total));
            }
            //ENTRIES ARE NOT NUMBERS OR ARE MISSING
            else 
            {
                request.setAttribute("message", "---");
                request.setAttribute("error", "Must enter numeric values. Do not leave any fields blank.");
            }
            
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }
        else //(_modu != null)
        {
            //CHECK THAT ENTRIES ARE NUMBERS
            if(_first.matches("[0-9]+") && _second.matches("[0-9]+"))
            {
                //PARSE THE STRING ENTRIES
                Integer _Fnum = Integer.parseInt(_first);
                Integer _Snum = Integer.parseInt(_second);

                _total = _Fnum % _Snum;
                
                request.setAttribute("first", _Fnum);
                request.setAttribute("second", _Snum);
                request.setAttribute("message", "Result:" + "&nbsp" + (_total));
            }     
            //ENTRIES ARE NOT NUMBERS OR ARE MISSING
            else 
            {
                request.setAttribute("message", "---");
                request.setAttribute("error", "Must enter numeric values. Do not leave any fields blank.");
            }
            
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }             
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
