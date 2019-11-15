<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<title>Home</title>
<link href="/Mshop/CSS/front/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary JavaScript plugins) -->
<script type='text/javascript' src="/Mshop/js/front/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<link href="/Mshop/CSS/front/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Gretong Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
<!-- start menu -->
<link href="/Mshop/CSS/front/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="/Mshop/js/front/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<script src="/Mshop/js/front/menu_jquery.js"></script>
<script src="/Mshop/js/front/simpleCart.min.js"> </script>
</head>
<body>
<!-- header_top -->
<!-- header -->
<div class="header_bg">
<div class="container">
	<div class="header">
	<div class="head-t">
		<div class="logo">
			<a href="index.jsp"><img src="/Mshop/images/index/logo.png" class="img-responsive" alt=""/> </a>
		</div>
		<!-- start header_right -->
		<div class="header_right">
		<div class="rgt-bottom">
		        <c:if test="${mid==null}">
		            <div class="reg">
					     <a href="/Mshop/pages/login.jsp">登录</a>
					</div>
					<div class="reg">
					     <a href="/Mshop/pages/register.jsp">注册</a>
					</div>
				</c:if>
				<c:if test="${mid!=null}">
				<div class="reg">
					<img src="upload/member/${photo}" style="width:26px;height:26px;">
				</div>
				<div class="reg">
					<a href="#">个人中心</a>
				</div>
				<div class="reg">
					<a href="/Mshop/MemberServletfront/out">注销信息</a>
				</div>
				</c:if>
			<div class="reg">
				<a href="#">购物车</a>
				<div class="clearfix"> </div>
			</div>
			<div class="create_btn">
				<a href="#">结算</a>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="search">
		    <form>
		    	<input type="text" value="" placeholder="search...">
				<input type="submit" value="">
			</form>
		</div>
		<div class="clearfix"> </div>
		</div>
		<div class="clearfix"> </div>
	</div>
    	<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>
		<!-- start header menu -->
		<ul class="megamenu skyblue">
			<li class="active grid"><a class="color1" href="index.html">Home</a></li>
			<li class="grid"><a class="color2" href="#">new arrivals</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">Pools&Tees</a></li>
									<li><a href="#">shirts</a></li>
									<li><a href="#">shorts</a></li>
									<li><a href="#">twinsets</a></li>
									<li><a href="#">kurts</a></li>
									<li><a href="#">jackets</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">Handbag</a></li>
									<li><a href="#">Slingbags</a></li>
									<li><a href="#">Clutches</a></li>
									<li><a href="#">Totes</a></li>
									<li><a href="#">Wallets</a></li>
									<li><a href="#">Laptopbags</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="#">login</a></li>
									<li><a href="register.html">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">Belts</a></li>
									<li><a href="#">Pens</a></li>
									<li><a href="#">Eyeglasses</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">Watches</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>
			<li><a class="color4" href="#">TUXEDO</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">Pools&Tees</a></li>
									<li><a href="#">shirts</a></li>
									<li><a href="#">shorts</a></li>
									<li><a href="#">twinsets</a></li>
									<li><a href="#">kurts</a></li>
									<li><a href="#">jackets</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">Handbag</a></li>
									<li><a href="#">Slingbags</a></li>
									<li><a href="#">Clutches</a></li>
									<li><a href="#">Totes</a></li>
									<li><a href="#">Wallets</a></li>
									<li><a href="#">Laptopbags</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="#">login</a></li>
									<li><a href="register.html">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">Belts</a></li>
									<li><a href="#">Pens</a></li>
									<li><a href="#">Eyeglasses</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">Watches</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>				
				<li><a class="color5" href="#">SWEATER</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">Pools&Tees</a></li>
									<li><a href="#">shirts</a></li>
									<li><a href="#">shorts</a></li>
									<li><a href="#">twinsets</a></li>
									<li><a href="#">kurts</a></li>
									<li><a href="#">jackets</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">Handbag</a></li>
									<li><a href="#">Slingbags</a></li>
									<li><a href="#">Clutches</a></li>
									<li><a href="#">Totes</a></li>
									<li><a href="#">Wallets</a></li>
									<li><a href="#">Laptopbags</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="#">login</a></li>
									<li><a href="register.html">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">Belts</a></li>
									<li><a href="#">Pens</a></li>
									<li><a href="#">Eyeglasses</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">Watches</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>
				<li><a class="color6" href="#">SHOES</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">Pools&Tees</a></li>
									<li><a href="#">shirts</a></li>
									<li><a href="#">shorts</a></li>
									<li><a href="#">twinsets</a></li>
									<li><a href="#">kurts</a></li>
									<li><a href="#">jackets</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">Handbag</a></li>
									<li><a href="#">Slingbags</a></li>
									<li><a href="#">Clutches</a></li>
									<li><a href="#">Totes</a></li>
									<li><a href="#">Wallets</a></li>
									<li><a href="#">Laptopbags</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="#">login</a></li>
									<li><a href="register.html">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">Belts</a></li>
									<li><a href="#">Pens</a></li>
									<li><a href="#">Eyeglasses</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">Watches</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>				
			
				<li><a class="color7" href="#">GLASSES</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">Pools&Tees</a></li>
									<li><a href="#">shirts</a></li>
									<li><a href="#">shorts</a></li>
									<li><a href="#">twinsets</a></li>
									<li><a href="#">kurts</a></li>
									<li><a href="#">jackets</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">Handbag</a></li>
									<li><a href="#">Slingbags</a></li>
									<li><a href="#">Clutches</a></li>
									<li><a href="#">Totes</a></li>
									<li><a href="#">Wallets</a></li>
									<li><a href="#">Laptopbags</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="#">login</a></li>
									<li><a href="register.html">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">Belts</a></li>
									<li><a href="#">Pens</a></li>
									<li><a href="#">Eyeglasses</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">Watches</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>				
			
				<li><a class="color8" href="#">T-SHIRT</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">trends</a></li>
									<li><a href="#">sale</a></li>
									<li><a href="#">style videos</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">trends</a></li>
									<li><a href="#">sale</a></li>
									<li><a href="#">style videos</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="pages/login.jsp">login</a></li>
									<li><a href="pages/register.jsp">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">trends</a></li>
									<li><a href="#">sale</a></li>
									<li><a href="#">style videos</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>
				<li><a class="color9" href="#">WATCHES</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">brands</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>kids</h4>
								<ul>
									<li><a href="#">trends</a></li>
									<li><a href="#">sale</a></li>
									<li><a href="#">style videos</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Bags</h4>
								<ul>
									<li><a href="#">trends</a></li>
									<li><a href="#">sale</a></li>
									<li><a href="#">style videos</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>												
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>account</h4>
								<ul>
									<li><a href="/pages/login.jsp">login</a></li>
									<li><a href="/pages/register.jsp">create an account</a></li>
									<li><a href="#">create wishlist</a></li>
									<li><a href="#">my shopping bag</a></li>
									<li><a href="#">brands</a></li>
									<li><a href="#">create wishlist</a></li>
								</ul>	
							</div>						
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
								<ul>
									<li><a href="#">trends</a></li>
									<li><a href="#">sale</a></li>
									<li><a href="#">style videos</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
									<li><a href="#">new arrivals</a></li>
									<li><a href="#">men</a></li>
									<li><a href="#">women</a></li>
									<li><a href="#">accessories</a></li>
									<li><a href="#">kids</a></li>
									<li><a href="#">style videos</a></li>
								</ul>	
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col2"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
						<div class="col1"></div>
					</div>
    				</div>
				</li>
		 </ul> 
	</div>
</div>
</div>
<div class="arriv">
	<div class="container">
		<div class="arriv-top">
			<div class="col-md-6 arriv-left">
				<img src="/Mshop/images/index/1.jpg" class="img-responsive" alt="">
				<div class="arriv-info">
					<h3>NEW ARRIVALS</h3>
					<p>REVIVE YOUR WARDROBE WITH CHIC KNITS</p>
					<div class="crt-btn">
						<a href="details.html">TAKE A LOOK</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 arriv-right">
				<img src="/Mshop/images/index/2.jpg" class="img-responsive" alt="">
				<div class="arriv-info">
					<h3>TUXEDO</h3>
					<p>REVIVE YOUR WARDROBE WITH CHIC KNITS</p>
					<div class="crt-btn">
						<a href="details.html">SHOP NOW</a>
					</div>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="arriv-bottm">
			<div class="col-md-8 arriv-left1">
				<img src="/Mshop/images/index/3.jpg" class="img-responsive" alt="">
				<div class="arriv-info1">
					<h3>SWEATER</h3>
					<p>REVIVE YOUR WARDROBE WITH CHIC KNITS</p>
					<div class="crt-btn">
						<a href="details.html">SHOP NOW</a>
					</div>
				</div>
			</div>
			<div class="col-md-4 arriv-right1">
				<img src="/Mshop/images/index/4.jpg" class="img-responsive" alt="">
				<div class="arriv-info2">
					<a href="details.html"><h3>Trekking Shoes<i class="ars"></i></h3></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="arriv-las">
			<div class="col-md-4 arriv-left2">
				<img src="/Mshop/images/index/5.jpg" class="img-responsive" alt="">
				<div class="arriv-info2">
					<a href="details.html"><h3>Casual Glasses<i class="ars"></i></h3></a>
				</div>
			</div>
			<div class="col-md-4 arriv-middle">
				<img src="/Mshop/images/index/6.jpg" class="img-responsive" alt="">
				<div class="arriv-info3">
					<h3>FRESH LOOK T-SHIRT</h3>
					<div class="crt-btn">
						<a href="details.html">SHOP NOW</a>
					</div>
				</div>
			</div>
			<div class="col-md-4 arriv-right2">
				<img src="/Mshop/images/index/7.jpg" class="img-responsive" alt="">
				<div class="arriv-info2">
					<a href="details.html"><h3>Elegant Watches<i class="ars"></i></h3></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
<div class="special">
	<div class="container">
		<h3>Special Offers</h3>
		<div class="specia-top">
			<ul class="grid_2">
		<li>
				<a href="details.html"><img src="/Mshop/images/index/8.jpg" class="img-responsive" alt=""></a>
				<div class="special-info grid_1 simpleCart_shelfItem">
					<h5>Lorem ipsum dolor</h5>
					<div class="item_add"><span class="item_price"><h6>ONLY $40.00</h6></span></div>
					<div class="item_add"><span class="item_price"><a href="#">add to cart</a></span></div>
				</div>
		</li>
		<li>
				<a href="details.html"><img src="/Mshop/images/index/9.jpg" class="img-responsive" alt=""></a>
				<div class="special-info grid_1 simpleCart_shelfItem">
					<h5>Consectetur adipis</h5>
					<div class="item_add"><span class="item_price"><h6>ONLY $60.00</h6></span></div>
					<div class="item_add"><span class="item_price"><a href="#">add to cart</a></span></div>
			</div>
		</li>
		<li>
				<a href="details.html"><img src="/Mshop/images/index/10.jpg" class="img-responsive" alt=""></a>
				<div class="special-info grid_1 simpleCart_shelfItem">
					<h5>Commodo consequat</h5>
					<div class="item_add"><span class="item_price"><h6>ONLY $14.00</h6></span></div>
					<div class="item_add"><span class="item_price"><a href="#">add to cart</a></span></div>
			</div>
		</li>
		<li>
				<a href="details.html"><img src="/Mshop/images/index/11.jpg" class="img-responsive" alt=""></a>
				<div class="special-info grid_1 simpleCart_shelfItem">
					<h5>Voluptate velit</h5>
					<div class="item_add"><span class="item_price"><h6>ONLY $37.00</h6></span></div>
					<div class="item_add"><span class="item_price"><a href="#">add to cart</a></span></div>
				</div>
		</li>
		<div class="clearfix"> </div>
	</ul>
		</div>
	</div>
</div>
<div class="foot-top">
	<div class="container">
		<div class="col-md-6 s-c">
			<li>
				<div class="fooll">
					<h5>follow us on</h5>
				</div>
			</li>
			<li>
				<div class="social-ic">
					<ul>
						<li><a href="#"><i class="facebok"> </i></a></li>
						<li><a href="#"><i class="twiter"> </i></a></li>
						<li><a href="#"><i class="goog"> </i></a></li>
						<li><a href="#"><i class="be"> </i></a></li>
						<li><a href="#"><i class="pp"> </i></a></li>
							<div class="clearfix"></div>	
					</ul>
				</div>
			</li>
				<div class="clearfix"> </div>
		</div>
		<div class="col-md-6 s-c">
			<div class="stay">
						<div class="stay-left">
							<form>
								<input type="text" placeholder="Enter your email to join our newsletter" required="">
							</form>
						</div>
						<div class="btn-1">
							<form>
								<input type="submit" value="join">
							</form>
						</div>
							<div class="clearfix"> </div>
			</div>
		</div>
			<div class="clearfix"> </div>
	</div>
</div>
</body>
</html>