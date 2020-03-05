<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="UTF-8">
    <title>拼多商城首页</title>
    <link href="../css/index.css" rel="Stylesheet"/>
    <link href="../css/animate.css" rel="Stylesheet"/>
    <link rel="stylesheet" href="../css/slide.css"/>
    <link rel="stylesheet" href="../css/layui.css">
</head>
<body>
<!-- 页面顶部-->
<jsp:include page="commons/header.jsp"></jsp:include>
<!-- banner部分-->
<div class="ck-slide">
    <ul class="ck-slide-wrapper">
        <li>
            <a href="/item_food.html" id="index_image1"><img src="../images/index/index_banner1.png" alt=""></a>
        </li>
        <li style="display:none">
            <a href="/itemCat.html" id="index_image2"><img src="../images/index/index_banner2.1.png" alt=""></a>
        </li>
        <li style="display:none">
            <img src="../images/index/index_banner1.3.png" alt="">
        </li>
        <li style="display:none">
            <img src="../images/index/index_banner1.4.png" alt="">
        </li>
        <li style="display:none">
            <img src="../images/index/index_banner1.5.jpg" alt="">
        </li>
    </ul>
    <a href="javascript:;" class="ctrl-slide ck-prev">上一张</a> <a href="javascript:;" class="ctrl-slide ck-next">下一张</a>
    <div class="ck-slidebox">
        <div class="slideWrap">
            <ul class="dot-wrap">
                <li class="current"><em>1</em></li>
                <li><em>2</em></li>
                <li><em>3</em></li>
                <li><em>4</em></li>
                <li><em>5</em></li>
            </ul>
        </div>
    </div>
</div>
<!-- 特推部分-->
<div id="product">
    <div class="product_1 lf">
        <div class="aside lf">
        	<a href="/item/toItemInfo.html?itemId=1">
            	<img id="aside_image" src="../images/index/index_Sbanner_img1.1.png" alt=""/>
            </a>
        </div>
        <div class="text rt">
            <p class="ys1">iphone8<b class="ys2"> 64G</b></p>
            <p class="ys3">依旧可靠 99新</p>
        </div>
    </div>
    <div class="product_2 lf">

        <div class="aside lf">
        	<a href="/item/toItemInfo.html?itemId=2">
            	<img id="aside_image2" src="../images/index/index_Sbanner_img2.1.png" alt=""/>
            </a>
        </div>
        <div class="text rt">
            <p class="ys1 ys4">iPhone7<b class="ys2 ys4"> 128GB内存</b></p>

            <p class="ys3 ys4">备用机首选 99新</p>
        </div>

    </div>
    <div class="product_3 lf">
        <div class="aside lf">
        	<a href="/item/toItemInfo.html?itemId=31">
            	<img id="aside_image3" src="../images/index/index_Sbanner_img3.1.png" alt=""/>
            </a>
        </div>
        <div class="text rt">
            <p class="ys1">倍思蓝牙耳机</p>
            <p class="ys3">主动降噪磁吸耳麦</p>
        </div>
    </div>
</div>
<!-- welcome部分-->
<div id="welcome">
    <a href="">阅读更多>></a>
</div>
<!-- 手机配件-->
<div id="study">
    <p>手机配件<span>爱生活 享品质</span></p>

    <div class="study_left lf">
        <div id="product_parameters_main">
            <p><img src="../images/index/wenan.png" alt=""/></p>

            <h3 id="product_name_main">AirPods2 无线版苹果蓝牙耳机</h3>

            <h3 id="product_preferential_main">限时特惠<b id="product_price_main">￥1199.00</b></h3>

            <p class="view_details"><a href="/item/toItemInfo.html?itemId=28">查看详情</a></p>
        </div>
        <a href="/item/toItemInfo.html?itemId=28">
        	<img id="study_product_main" src="../images/index/index_hot_study_img1.1.png" alt=""/>
        </a>
    </div>
    <div class="study_right rt">
        <div class="right_top">
            <div id="product_parameters_vice1">
                <h3 id="product_name_vice1">iPhone四边包裹小牛皮壳 头层小牛皮 精准开孔</h3>

                <h3 id="product_preferential_vice1"><b id="product_price_vice1">￥88.00</b></h3>

                <p class="view_details"><a href="/item/toItemInfo.html?itemId=29" >查看详情</a></p>
            </div>
            <img id="study_product_vice1" src="../images/index/index_hot_study_img2.1.png" alt=""/>
        </div>
        <div class="right_bottom">
            <div id="product_parameters_vice2">
                <h3 id="product_name_vice2">iPhone11/XR/XS <br>max热弯 3D全覆盖钢化</h3>

                <h3 id="product_preferential_vice2"><b id="product_price_vice2">￥69.00</b></h3>

                <p class="view_details"><a href="/item/toItemInfo.html?itemId=30" >查看详情</a></p>
                <img id="study_product_vice2" src="../images/index/index_hot_study_img3.1.png" alt=""/>
            </div>
        </div>
    </div>
</div>
<!-- 美食餐饮-->
<div id="gourmet">
    <p>手机维修<span>安全快速的专业维修</span></p>

    <div class="bellows lf">
        <div class="bellows_item">
            <div class="bellows_header">
                <h3>维修流程</h3>
            </div>
            <div class="">
                <div class="bellows_content">
                    <p>
                             手机维修需要进行以下步骤：选取机型、参数、填写串号、估价、邮寄、拼多商城质检评估、确认成交价、完成交易。如果您还有任何其他的需求，可随时联系我们的在线客服，这边会及时为您解答的。
                    </p></div>
            </div>
        </div>
        <div class="bellows_item">
            <div class="bellows_header">
                <h3>保修问题</h3>
            </div>
            <div class="bellows_content-wrapper" style="display: block">
                <div class="bellows_content">
                    <p>当您使用拼多商城提供的维修服务后，可能导致您无法使用此设备官方品牌提供的售后服务，如果您介意，请不要在拼多商城寄修设备。</p>
                </div>
            </div>
        </div>
        <div class="bellows_item">
            <div class="bellows_header active">
                <h3>售后保障</h3>
            </div>
            <div class="bellows_content-wrapper">
                <div class="bellows_content">
                    <p>拼多商城承诺对仅在拼多商城进行维修且维修成功的设备提供180天故障点配件免费保修服务，以维修设备签收日算。</p>
                </div>
            </div>
        </div>

    </div>
    <div class="food_detail rt">
        <div>
            <div class="food1 lf">
                <img src="../images/index/index_hot_food_img1.1.jpg" alt=""/>

                <h3>拼多维修全程采用顺丰包邮服务，让 您足不出户即可享受到高效快捷的维 修服务。</h3>
            </div>
            <div class="food1 lf">
                <img src="../images/index/index_hot_food_img1.2.jpg" alt="" id="food1"/>

                <h3>拼多维修全程采用顺丰包邮服务，让 您足不出户即可享受到高效快捷的维 修服务。</h3>
            </div>
            <div class="food1 lf" >
                <img src="../images/index/index_hot_food_img1.3.jpg" alt=""/>

                <h3>拼多维修全程采用顺丰包邮服务，让 您足不出户即可享受到高效快捷的维 修服务。</h3>
            </div>
        </div>
    </div>
</div>
<!-- 品质保障，私人定制等-->
<div id="foot_box">
    <div class="icon1 lf">
        <img src="../images/footer/icon1.png" alt=""/>
        <h3>品质保障</h3>
    </div>
    <div class="icon2 lf">
        <img src="../images/footer/icon2.png" alt=""/>
        <h3>闪电发货</h3>
    </div>
    <div class="icon3 lf">
        <img src="../images/footer/icon3.png" alt=""/>
        <h3>专属客服</h3>
    </div>
    <div class="icon4 lf">
        <img src="../images/footer/icon4.png" alt=""/>
        <h3>无忧分期</h3>
    </div>
</div>
<!-- 页面底部-->
<div class="foot_bj">
    <div id="foot">
        <div class="lf">
             <p class="footer1"><img src="../images/footer/logo.png" alt="" class=" footLogo"/></p>
             <p class="footer2"><img src="../images/footer/footerFont.png" alt=""/></p>
            
        </div>
        <div class="foot_left lf" >
            <ul>
                <li><a href="#"><h3>买家帮助</h3></a></li>
                <li><a href="#">新手指南</a></li>
                <li><a href="#">服务保障</a></li>
                <li><a href="#">常见问题</a></li>
            </ul>
            <ul>
                <li><a href="#"><h3>商家帮助</h3></a></li>
                <li><a href="#">商家入驻</a></li>
                <li><a href="#">商家后台</a></li>
            </ul>
            <ul>
                <li><a href="#"><h3>关于我们</h3></a></li>
                <li><a href="#">关于拼多</a></li>
                <li><a href="#">联系我们</a></li>
                <li>
                    <img src="../images/footer/wechat.png" alt=""/>
                    <img src="../images/footer/sinablog.png" alt=""/>
                </li>
            </ul>
        </div>
        <div class="service">
            <p>拼多商城客户端</p>
            <img src="../images/footer/ios.png" class="lf">
            <img src="../images/footer/android.png" alt="" class="lf"/>
        </div>
        <div class="download">
            <img src="../images/footer/erweima.png">
        </div>
		<!-- 页面底部-备案号 #footer -->
            <div class="record">
                &copy;2020 拼多集团有限公司 版权所有 京ICP证xxxxxxxxxxx
            </div>
    </div>
</div>
<script src="../js/jquery-3.1.1.min.js"></script>
<script src="../js/index.js"></script>
<script src="../js/layui.all.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});
</script>

<script>
	//轮播图注册点击事件
	$("#index_image1").click(function(){
		$.post("/item/setcid",{"cid":560});	
	});
	$("#index_image2").click(function(){
		$.post("/item/setcid",{"cid":567});	
	});
    //手风琴效果
    $(function () {
        $(".bellows_content-wrapper").hide();
        $(".bellows_header").click(function (){
            $(this).next().slideDown()
            $(this).parent(".bellows_item").addClass("bellows_open")
            $(".bellows_header").not(this).next().slideUp()
            $(".bellows_header").not(this).parent(".bellows_item").removeClass("bellows_open")
        });
        $('.bellows_header').on('click', 'h3', function (e) {
            $(e.target).removeClass('active').siblings('.active').addClass('active');
        });
    })
</script>
<script src="../js/slide.js"></script>
<script>
    $('.ck-slide').ckSlide({
        autoPlay: true,//默认为不自动播放，需要时请以此设置
        dir: 'x',//默认效果淡隐淡出，x为水平移动，y 为垂直滚动
        interval:3000//默认间隔2000毫秒
    });
    //搜索页面跳转
    $("#search").click(function(){
    	window.location.href="search.html";
    })
</script>
</body>
</html>