<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<base href="<%=basePath%>">

<title>增加用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link type="text/css" rel="stylesheet" href="res/css/H-ui.css" />
<link type="text/css" rel="stylesheet" href="res/css/H-ui.admin.css" />
<link type="text/css" rel="stylesheet"
	href="res/font/font-awesome.min.css" />
<style>
body {
	min-height: 200px;
	font-size: 14px;
}

td, th {
	font-size: 14px;
}

input[type="text"] {
	padding: 5px 5px;
	font-size: 14px;
}
</style>
<script type="text/javascript">
  		function Test(){
  			document.getElementById('form1').submit();
  		}
  </script>

</head>

<body>
	<div class="pd-20">
		<div class="Huiform">
			<!--  <form action="userUpdateServlet" method="post"> -->
			<form id="form1" action="AddWaiter" method="post">
				<table class="table table-border table-bordered table-bg">
					<thead>
						<tr>
							<th colspan="2"><font size='4'>增加用户</font></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th width="100" class="text-r"><span class="c-red">*</span><font
								size='3'> 员工姓名：</font></th>
							<td><input type="text" style="width: 300px"
								class="input-text" value="" placeholder="字母或者汉字" id="waiterName"
								name="waiterName" datatype="*2-16" nullmsg="用户名不能为空"></td>
						</tr>
						<tr>
							<th class="text-r"><span class="c-red">*</span><font
								size='3'> 员工密码：</font></th>
							<td><input type="password" style="width: 300px"
								class="input-text" value="" placeholder="输入密码" id="waiterPwd"
								onkeyup="value=value.replace(/[^\d]/g,'') " name="waiterPwd"></td>
						</tr>

						<tr>
							<th class="text-r"><span class="c-red">*</span><font
								size='3'> 员工性别：</font></th>
							<td><input type="text" style="width: 300px"
								class="input-text" value="" placeholder="只能为男和女" id="waiterSex"
								name="waiterSex"></td>
						</tr>
						<tr>
							<th class="text-r"><span class="c-red">*</span><font
								size='3'> 员工TEL:</font></th>
							<td><input type="text" style="width: 300px"
								class="input-text" value="" placeholder="" id="waiterPhone"
								onkeyup="value=value.replace(/[^\d]/g,'') " name="waiterPhone"></td>
						</tr>
						<tr>
							<th></th>
							<td><button class="btn btn-success radius" type="submit">
									<i class="icon-ok"></i> 确定
								</button></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript" src="res/js/jquery.min.js"></script>
	<script type="text/javascript" src="res/js/Validform_v5.3.2_min.js"></script>
	<script type="text/javascript" src="res/js/H-ui.js"></script>
	<script type="text/javascript" src="res/js/H-ui.admin.js"></script>
	<script type="text/javascript">
$(".Huiform").Validform(); 
</script>

</body>
</html>
