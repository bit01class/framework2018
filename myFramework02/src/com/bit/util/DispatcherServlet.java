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
 * %p debug, info, warn, error, fatal 등의 priority 가 출력된다.
 * %m 로그내용이 출력됩니다
 * %d 로깅 이벤트가 발생한 시간을 기록합니다. 포맷은 %d{HH:mm:ss, SSS}, %d{yyyy MMM dd HH:mm:ss, SSS}같은 형태로 사용하며 SimpleDateFormat에 따른 포맷팅을 하면 된다
 * %t 로그이벤트가 발생된 쓰레드의 이름을 출력합니다.
 * %% % 표시를 출력하기 위해 사용한다.
 * %n 플랫폼 종속적인 개행문자가 출력된다. rn 또는 n 일것이다.
 * %c 카테고리를 표시합니다 예) 카테고리가 a.b.c 처럼 되어있다면 %c{2}는 b.c가 출력됩니다.
 * %C 클래스명을 포시합니다. 예)클래스구조가 org.apache.xyz.SomeClass 처럼 되어있다면 %C{2}는 xyz.SomeClass 가 출력됩니다
 * %F 로깅이 발생한 프로그램 파일명을 나타냅니다.
 * %l 로깅이 발생한 caller의 정보를 나타냅니다
 * %L 로깅이 발생한 caller의 라인수를 나타냅니다
 * %M 로깅이 발생한 method 이름을 나타냅니다.
 * %r 어플리케이션 시작 이후 부터 로깅이 발생한 시점의 시간(milliseconds)
 * %x 로깅이 발생한 thread와 관련된 NDC(nested diagnostic context)를 출력합니다.
 * %X 로깅이 발생한 thread와 관련된 MDC(mapped diagnostic context)를 출력합니다. %X{key} 형태.
 * 
 * log.trace("trace레벨 출력...");
 * log.debug("debug레벨 출력...");
 * log.info("info레벨 출력...");
 * log.warn("warn레벨 출력...");
 * log.error("error레벨 출력...");
 * log.fatal("fatal레벨 출력...");
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




















