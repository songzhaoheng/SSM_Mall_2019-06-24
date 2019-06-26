package com.phonemarket.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Description 项目启动的时候，将一些常用数据放在application域中，大家都能用
 * @author Hern
 * @Date 2019-06-19 08:35
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        //1、将项目路径放在application域中
        servletContext.setAttribute("ctp", servletContext.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
