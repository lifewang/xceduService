# 在线教育平台<br>
##1、修改nginx的配置文件nginx.conf中的server如下：<br>
server{<br>
		listen  80;<br>
		server_name  www.xuecheng.com;//服务访问路径<br>
		ssi on;//开启ssi<br>
		ssi_silent_errors on;<br>
		location / {<br>
			alias  前端静态页面的绝对路径;<br>
			index  index.html;<br>
		}<br>
}<br>
##2、启动nginx服务；<br>
##3、http://www.xuecheng.com<br>
