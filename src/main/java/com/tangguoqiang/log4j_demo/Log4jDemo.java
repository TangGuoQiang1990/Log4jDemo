package com.tangguoqiang.log4j_demo;

import org.apache.log4j.Logger;

/**
 * http://logging.apache.org/——log4j官网
 * http://log4e.jayefem.de/——eclipse插件,用免费版足够使用，解压放到eclipse目录plugins文件夹
 * @author TangGuoQiang
 *
 */
public class Log4jDemo {
    private static final Logger logger = Logger.getLogger(Log4jDemo.class);
    public static void main(String[] args) {
        //日志级别测试
        logger.debug("Hello,Debug Level");
        logger.info("Hello,Info Level");
        logger.warn("Hello,Warn Level");
        logger.error("Hello,Error Level");
        //工程写法
        try{
            int i = 10/5;
            System.out.println(i);
        }catch(Exception e){
            e.printStackTrace();
            logger.error(e,e.getCause());
        }
    }

}
