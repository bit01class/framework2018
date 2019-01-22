package com.bit.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.bit.controller.AddFormController;
import com.bit.controller.IndexController;
import com.bit.controller.InsertController;
import com.bit.controller.IntroController;
import com.bit.controller.ListController;

/*
 * TRACE > DEBUG > INFO > WARN > ERROR > FATAL
 * %p debug, info, warn, error, fatal ���� priority �� ��µȴ�.
 * %m �α׳����� ��µ˴ϴ�
 * %d �α� �̺�Ʈ�� �߻��� �ð��� ����մϴ�. ������ %d{HH:mm:ss, SSS}, %d{yyyy MMM dd HH:mm:ss, SSS}���� ���·� ����ϸ� SimpleDateFormat�� ���� �������� �ϸ� �ȴ�
 * %t �α��̺�Ʈ�� �߻��� �������� �̸��� ����մϴ�.
 * %% % ǥ�ø� ����ϱ� ���� ����Ѵ�.
 * %n �÷��� �������� ���๮�ڰ� ��µȴ�. rn �Ǵ� n �ϰ��̴�.
 * %c ī�װ��� ǥ���մϴ� ��) ī�װ��� a.b.c ó�� �Ǿ��ִٸ� %c{2}�� b.c�� ��µ˴ϴ�.
 * %C Ŭ�������� �����մϴ�. ��)Ŭ���������� org.apache.xyz.SomeClass ó�� �Ǿ��ִٸ� %C{2}�� xyz.SomeClass �� ��µ˴ϴ�
 * %F �α��� �߻��� ���α׷� ���ϸ��� ��Ÿ���ϴ�.
 * %l �α��� �߻��� caller�� ������ ��Ÿ���ϴ�
 * %L �α��� �߻��� caller�� ���μ��� ��Ÿ���ϴ�
 * %M �α��� �߻��� method �̸��� ��Ÿ���ϴ�.
 * %r ���ø����̼� ���� ���� ���� �α��� �߻��� ������ �ð�(milliseconds)
 * %x �α��� �߻��� thread�� ���õ� NDC(nested diagnostic context)�� ����մϴ�.
 * %X �α��� �߻��� thread�� ���õ� MDC(mapped diagnostic context)�� ����մϴ�. %X{key} ����.
 * 
 * log.trace("trace���� ���...");
 * log.debug("debug���� ���...");
 * log.info("info���� ���...");
 * log.warn("warn���� ���...");
 * log.error("error���� ���...");
 * log.fatal("fatal���� ���...");
 * 
*/
public class DispatcherServlet extends HttpServlet {
	Logger log = Logger.getLogger("com.bit.util.DispatcherServlet");
	
	HashMap<String,BitController> map = new HashMap<String,BitController>();
	
	@Override
		public void init() throws ServletException {
			log.debug("init bind map...");
			super.init();
			map.put("/index.do", new IndexController());
			map.put("/intro.do", new IntroController());
			map.put("/bbs/list.do", new ListController());
			map.put("/bbs/add.do", new AddFormController());			
			map.put("/bbs/insert.do", new InsertController());			
			log.debug("put (key, value)...");
		}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String prifix="/WEB-INF/view/";
		String suffix=".jsp";
		String view="";

		BitController controller=null;
		String url=req.getRequestURI().substring(req.getContextPath().length());
		
		controller = map.get(url);
		
		try {
			view=controller.execute(req);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(view.startsWith("redirect:")){
			resp.sendRedirect(view.substring("redirect:".length()));
		}else{
			req.getRequestDispatcher(prifix+view+suffix).forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}
}




















