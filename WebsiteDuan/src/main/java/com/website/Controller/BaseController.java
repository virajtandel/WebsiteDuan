//package com.website.Controller;
//
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.http.client.ClientProtocolException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.StringBoot.Lab5.common.GooglePojo;
//import com.StringBoot.Lab5.common.GoogleUtils;
//import com.StringBoot.Lab5.common.RestFB;
//
//@Controller
//public class BaseController {
//
//	@Autowired
//	private GoogleUtils googleUtils;
//
//	@Autowired
//	private RestFB restFb;
//
//	@RequestMapping(value = { "/", "/login" })
//	public String login() {
//		return "login";
//	}
//
//	// Login Google
//	@RequestMapping("/login-google")
//	public String loginGoogle(HttpServletRequest request) throws ClientProtocolException, IOException {
//		String code = request.getParameter("code");
//
//		if (code == null || code.isEmpty()) {
//			return "redirect:/login?google=error";
//		}
//		String accessToken = googleUtils.getToken(code);
//
//		GooglePojo googlePojo = googleUtils.getUserInfo(accessToken);
//		UserDetails userDetail = googleUtils.buildUser(googlePojo);
//		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
//				userDetail.getAuthorities());
//		authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//		return "redirect:/user";
//	}
//
//	// Login Facebook
//	@RequestMapping("/login-facebook")
//	public String loginFacebook(HttpServletRequest request) throws ClientProtocolException, IOException {
//		String code = request.getParameter("code");
//
//		if (code == null || code.isEmpty()) {
//			return "redirect:/login?facebook=error";
//		}
//		String accessToken = restFb.getToken(code);
//
//		com.restfb.types.User user = restFb.getUserInfo(accessToken);
//		UserDetails userDetail = restFb.buildUser(user);
//		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
//				userDetail.getAuthorities());
//		authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//		return "redirect:/user";
//	}
//
//	@RequestMapping("/user")
//	public String user() {
//		return "user";
//	}
//
//	@RequestMapping("/admin")
//	public String admin() {
//		return "admin";
//	}
//
//	@RequestMapping("/403")
//	public String accessDenied() {
//		return "403";
//	}
//}
