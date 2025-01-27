package com.my.mycom.myuser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	
		HttpSession session = request.getSession(); 
		Object obj = session.getAttribute("login"); 
		
		if (obj == null) {	//로그인이 안되어있는 경우 
			response.sendRedirect(request.getContextPath() + "/login/login");
	
			return false; 
			
		}
		
		return true; 
		
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) 
			throws Exception {
				
		super.postHandle(request, response, handler, modelAndView); 
	
	}

}
