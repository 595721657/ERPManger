<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/Site.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/zy.all.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/font-awesome.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/amazeui.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/admin.css" />
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
		<style>
		
		</style>
	<body>
		<div class="dvcontent">

			<div>
				<!--tab start-->
				<div class="tabs">
					<div class="hd">
						<ul style="">
							<li style="box-sizing: initial;-webkit-box-sizing: initial;" class="on">查看分类</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">添加分类</li>
						</ul>
					</div>
					<div class="bd">
						<ul style="display: block;padding: 20px;">
							<li>
								<!--分页显示角色信息 start-->
								<div id="dv1">
									<table class="table" id="tbRecord">
										<thead>
											<tr>
											    <th>序号</th>
												<th>分类编号</th>
												<th>分类名称</th>
												<th>分类描述</th>
												<th>备注</th>
												<th>编辑</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
					                      <c:forEach items="${typeList}" var="t" varStatus="status">
											<tr>
											    <td><c:out value="${status.count}"></c:out></td>
												<td>${t.tid }</td>
												<td>${t.tname }</td>
												<td>${t.describe }</td>
												<td>${t.notes }</td>
												<td class="edit"><button onclick="btn_edit(${t.tid })" data-toggle="modal" data-target="#myModal"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(${t.tid })"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
										  </c:forEach>
										</tbody>									
									</table>
								</div>
								<!--分页显示角色信息 end-->
							</li>
						</ul>
						<ul class="theme-popbod dform" style="display: none;">
							<div class="am-cf admin-main" style="padding-top: 0px;">
			<!-- content start -->
			
	<div class="am-cf admin-main" style="padding-top: 0px;">
		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
						
					</div>
					<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4"
						style="padding-top: 30px;">
						<form class="am-form am-form-horizontal">
						
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									分类名称</label>
								<div class="am-u-sm-9">
									<input type="text" id="user-name" required
										placeholder="分类名称" name="tname">
										<small>10字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									备注</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="user-intro" name="remark"
										placeholder="输入备注"></textarea>
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
					</div>
				</div>
			</div>
		
		</div>
		<!-- content end -->
	</div>
							<!-- end-->
						</ul>
					</div>
				</div>
				<!--tab end-->

			</div>
<div class="modal fade" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">
 
      <!-- 模态框头部 -->
      <div class="modal-header">
        <h4 class="modal-title">编辑类别</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
      </div>
 
      <!-- 模态框主体 -->
      <div class="modal-body">
        		<form class="am-form am-form-horizontal">
						    <input name="tid" value="" type="hidden" id="user_tid"/>
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									分类名称</label>
								<div class="am-u-sm-9">
									<input type="text" id="user_name" required
										placeholder="分类名称" name="tname" value="">
										<small>10字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									描述</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="user_desc" name="remark"
										placeholder="输入描述" ></textarea>
									<small>250字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									备注</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="user_intro" name="remark"
										placeholder="输入备注"></textarea>
									<small>250字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
								    <button onclick="btn_update()"><i class="icon-trash bigger-120"></i>修改分类</button>
									<!-- <input type="button" class="am-btn am-btn-success" value="添加分类" /> -->
								</div>
							</div>
						</form>
      </div>
 
      <!-- 模态框底部 -->
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
      </div>
 
    </div>
  </div>
</div>
			
			 <script src="${pageContext.request.contextPath }/static/js/jquery.min.js" type="text/javascript"></script>
             <script src="${pageContext.request.contextPath }/static/js/plugs/Jqueryplugs.js" type="text/javascript"></script>
             <script src="${pageContext.request.contextPath }/static/js/_layout.js" type="text/javascript"></script>
             <script src="${pageContext.request.contextPath }/static/js/plugs/jquery.SuperSlide.source.js" type="text/javascript"></script>
			 <!-- 引用bootstrap -->
             <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.js"></script>
			<script>
				var num = 1;
				$(function() {

				 $(".tabs").slide({ trigger: "click" });

				});
				
	            //增加类别
				var btn_save = function() {
					var name = $("#user-name").val();
					var desc = $("#user-intro").val();
					$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath }/type/AddType",
						data: { tname: name,notes: desc},
						dataType:"json",
						success: function(data) {
                             if(data.isok == "true"){
                            	 location.reload();
                             }else{
                            	 alert("增加失败");
                             }
						},error:function(e){
							alert("增加失败");
						}
					});
				}
                //编辑
				var btn_edit = function(id) {
					/* $.jq_Panel({
						url: "/RawMaterialsType/EditRawMaterialsType?id=" + id,
						title: "编辑分类",
						dialogModal: true,
						iframeWidth: 500,
						iframeHeight: 400
					}); */
					/* window.open("${pageContext.request.contextPath }/type/FindbyTid?tid="+id,"newwindow","width=500,height=300,status='no'"); */
					$.ajax({
						url:"${pageContext.request.contextPath }/type/FindbyTid",
						type: "GET",
						data: { tid: id },
						dataType:"json",
						success: function(data) {
							$("#user_name").val(data.tname);
							$("#user_intro").val(data.notes);
							$("#user_desc").val(data.describe);
							$("#user_tid").val(data.tid);
						}
					});
				}
                //修改类别
				var btn_update = function() {
					var name = $("#user_name").val();
					var notes = $("#user_intro").val();
					var desc = $("#user_desc").val();
					var tid= $("#user_tid").val();
					$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath }/type/UpdateType",
						data: { tid: tid,tname: name,describe: desc,notes: notes},
						dataType:"json",
						success: function(data) {
				             if(data.isok == "true"){
				            	 $("#myModal").hide();
				            	 location.reload();
				             }else{
				            	 location.reload();
				             }
						},error:function(e){
							alert("修改失败");
						}
					});
				}
				//删除
				var btn_delete = function(id) {
					$.jq_Confirm({
						message: "您确定要删除吗?",
						btnOkClick: function() {
							$.ajax({
								type: "post",
								url: "${pageContext.request.contextPath }/type/DelType",
								data: {id: id },
								dataType:"json",
								success: function(data) {
		                             if(data.isok == "true"){
		                            	 location.reload();
		                             }else{
		                            	 location.reload();
		                            	 alert("删除失败");
		                             }
								}
							});
						}
					});
				}
			</script>
		</div>
	</body>
</html>