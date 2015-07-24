package com.kael.surf.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kael.surf.server.WebSocketServer;

/**
 * @author hanyuanliang
 * 2015-7-23 下午4:01:27 
 */
public class StartServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1501839144944207153L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

	@Override
	public void init() throws ServletException {
		try {
			new Thread(new WebSocketServer(8080)).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
