<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改类别</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/Site.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/zy.all.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/font-awesome.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/amazeui.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/admin.css" />
</head>
<body>
						<form class="am-form am-form-horizontal">
						<input name="tid" value="${type.tid }" type="hidden" id="user_tid"/>
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
									<textarea class="" rows="5" id="user-desc" name="remark"
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
								    <button onclick="btn_save()"><i class="icon-trash bigger-120"></i>修改分类</button>
									<!-- <input type="button" class="am-btn am-btn-success" value="添加分类" /> -->
								</div>
							</div>
						</form>
<script src="${pageContext.request.contextPath }/static/js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
//增加类别
var btn_save = function() {
	var name = $("#user-name").val();
	var notes = $("#user-intro").val();
	var desc = $("#user-desc").val();
	var tid= $("#user_tid").val();
	$.ajax({
		type: "post",
		url: "${pageContext.request.contextPath }/type/UpdateType",
		data: { tid: tid,tname: name,describe: desc,notes: notes},
		dataType:"json",
		success: function(data) {
             if(data.isok == "true"){
            	 window.close();
            	 location.reload();
             }else{
            	 location.reload();
             }
		},error:function(e){
			alert("增加失败");
		}
	});
}
</script>
</body>
</html>