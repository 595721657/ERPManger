<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/Site.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/zy.all.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/font-awesome.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/amazeui.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/admin.css" />
</head>
<body>
						<form class="am-form am-form-horizontal">
						<input name="tid" value="${type.tid }" type="hidden"/>
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									分类名称</label>
								<div class="am-u-sm-9">
									<input type="text" id="user-name" required
										placeholder="分类名称" name="tname" value="${type.tname }">
										<small>10字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									描述</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="user-intro" name="remark"
										placeholder="输入描述" >${type.describe }</textarea>
									<small>250字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									备注</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="user-intro" name="remark"
										placeholder="输入备注">${type.notes }</textarea>
									<small>250字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
								    <button onclick="btn_save()"><i class="icon-trash bigger-120"></i>添加分类</button>
									<!-- <input type="button" class="am-btn am-btn-success" value="添加分类" /> -->
								</div>
							</div>
						</form>
</body>
</html>