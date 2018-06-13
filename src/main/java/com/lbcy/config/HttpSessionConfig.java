package com.lbcy.config;//package com.lbcy.config;
//
//import com.lbcy.utils.Constant;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.security.web.context.support.SecurityWebApplicationContextUtils;
//import org.springframework.security.web.session.HttpSessionCreatedEvent;
//import org.springframework.security.web.session.HttpSessionDestroyedEvent;
//import org.springframework.security.web.session.HttpSessionEventPublisher;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import org.springframework.session.web.http.HeaderHttpSessionStrategy;
//import org.springframework.session.web.http.HttpSessionStrategy;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpSessionEvent;
//
///**
// * session配置
// * session保存在redis中
// *
// * Created by 吴晓冬 on 2017/12/26.
// */
//@EnableRedisHttpSession
//public class HttpSessionConfig
//{
//    @Autowired
//    private StringRedisTemplate redisTemplate;
//
//    /**
//     * session使用header而不是cookie
//     */
//    @Bean
//    public HttpSessionStrategy httpSessionStrategy()
//    {
//        return new HeaderHttpSessionStrategy();
//    }
//
//    @Bean
//    public HttpSessionEventPublisher httpSessionEventPublisher()
//    {
//        HttpSessionEventPublisher httpSessionEventPublisher = new MyHttpSessionEventPublisher();
//        return httpSessionEventPublisher;
//    }
//
//    class MyHttpSessionEventPublisher extends HttpSessionEventPublisher
//    {
//        ApplicationContext getContext(ServletContext servletContext) {
//            return SecurityWebApplicationContextUtils.findRequiredWebApplicationContext(servletContext);
//        }
//
//        public void sessionCreated(HttpSessionEvent event) {
//            HttpSessionCreatedEvent e = new HttpSessionCreatedEvent(event.getSession());
//
//            getContext(event.getSession().getServletContext()).publishEvent(e);
//        }
//
//        public void sessionDestroyed(HttpSessionEvent event) {
//            HttpSessionDestroyedEvent e = new HttpSessionDestroyedEvent(event.getSession());
//
//            Long userId = (Long) event.getSession().getAttribute(Constant.SESSION_USER_ID);
//
//            redisTemplate.opsForHash().delete(Constant.SESSION_SINGLE, String.valueOf(userId));
//
//            getContext(event.getSession().getServletContext()).publishEvent(e);
//        }
//    }
//}