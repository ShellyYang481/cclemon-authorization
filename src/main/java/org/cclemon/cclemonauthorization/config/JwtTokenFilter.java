//package org.cclemon.cclemonauthorization.config;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.filter.OncePerRequestFilter;
//@Configuration
//public class JwtTokenFilter extends OncePerRequestFilter {
//
//  @Override
//  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
//      FilterChain filterChain) throws ServletException, IOException {
//    // 从请求头中获取JWT Token
//    String token = extractToken(request);
//
//    if (token != null) {
//      try {
//        // 解析JWT Token
//        Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
//        // 根据需要进行进一步的验证操作，比如检查Token是否过期，是否包含特定的角色等
//        // 如果验证通过，可以将解析后的信息存储在SecurityContext中，以供后续的认证和授权操作使用
//      } catch (Exception e) {
//        // Token验证失败
//        response.setStatus(HttpStatus.UNAUTHORIZED.value());
//        return;
//      }
//    }
//
//    // 继续执行过滤器链
//    filterChain.doFilter(request, response);
//  }
//}
