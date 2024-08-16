package com.itheima.pattern.responsibility.jdk;

/**
 * @version v1.0
 * @ClassName: Filter
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public interface Filter {
    /**
     * 过滤
     *
     * @param req 请求
     * @param res 响应
     * @param c   过滤器链
     */
    public void doFilter(Request req, Response res, FilterChain c);
}
