/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pro
 */

@ControllerAdvice //A rajouter
public class ControllerAdvise {
    
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler (Exception e){
        
        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.getModel().put("messageErreur", e.getMessage());
        modelAndView.setViewName("pageErreur");
        return modelAndView;
    }
    
}
