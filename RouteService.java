package com.hall.service;

import com.hall.dao.PageBean;

public interface RouteService {


    /**
     * 进行分页查询
     * @param pageBean
     * @return
     */
    PageBean showRouteByPage(PageBean pageBean);
}
