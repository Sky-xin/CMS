package com.vpcloud.cms.controller.execption;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

public class ErrorExceptionHandler{


	@ExceptionHandler({Exception.class})
	public ModelAndView processUnauthenticatedException(NativeWebRequest request, Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.setViewName("/");
		return mv;
	}

}
