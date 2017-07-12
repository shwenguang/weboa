<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<title>CSS文章列表</title>
<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
a,a:visited{color:#5e5e5e; text-decoration:none;}
a:hover{color:#b52725;text-decoration:underline;}
.clear{display:block;overflow:hidden;clear:both;height:0;line-height:0;font-size:0;}
body{font:12px/180% Arial, Helvetica, sans-serif;}
.mainapp{width:90%;height:100%;margin:20px auto;border:solid 0px;}
.apphead{color:#CECECE; margin:10px auto auto 10px ;}
.ranklist{border:solid 0px #ddd;padding:10px 10px 0 1px;margin:10px;height:80%}
.ranklist li{height:20px;line-height:16px;overflow:hidden;position:relative;padding:0 70px 0 30px;margin:0 0 10px 0;}
.ranklist li em{width:20px;height:20px;overflow:hidden;display:block;position:absolute;left:0;top:0;text-align:center;font-style:normal;color:#333;}
.ranklist li em{background-position:0 -16px;}
.ranklist li .zs{position:absolute;right:10;top:0;color:#999;}
.pagination{
	border-bottom:solid 1px #ddd;
	text-align:center;
}
.pagination span {
	margin:3px;	
	cursor:pointer;
}
</style>
<div class="mainapp" id="app">
	<div class="apphead">
	<h3>> {{m1}} > {{m2}}</h3>
	</div>
    <div class="ranklist">
        <ol>
            <li v-for="doc in docs">
            	<em>{{doc.rowid}}</em>
            	<p><a v-bind:href="doc.url" target="view_window">{{doc.name}}</a></p>
            	<span class="zs">{{doc.zs}}</span></li>
        </ol>
        <div class="clear"></div>
    </div>
	<div class="pagination">
		<span @click="prev">上一页</span>
		<span v-for="p in pageNos">{{p}}</span>
		<span @click="next">下一页</span>
	</div>
</div>

	<script src="//vuejs.org/js/vue.min.js"></script>
	<script src="//libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="//unpkg.com/axios/dist/axios.min.js"></script>
	<script type="text/javascript">
		var data = {
			paramCode:'文件列表',
			m1:'',
			m2:'',
			pageNo:1,
			totalPage:5,
			docs:[
				{rowid:'01',name:'aaaaaaaa',zs:'dfldfalfalf',url:"//www.baidu.com"},
				{rowid:'02',name:'aaaaaaaa',zs:'dfldfalfalf'},
				{rowid:'03',name:'aaaaaaaa',zs:'dfldfalfalf'},
				{rowid:'04',name:'dslfasfjads;fasjdlfadsf测试一些',zs:'发奖发奖所发生的浪费时间地方发了举案说法；设计费；'},
				{rowid:'05',name:'aaaaaaaa',zs:'dfldfalfalf'},
				{rowid:'06',name:'aaaaaaaa',zs:'dfldfalfalf'}
			]
		}
		function doBusiness(p) {
			data.paramCode = p.code;
			data.m1 = p.m1;
			data.m2 = p.m2;
			axios.get("/busi/querydocs.do", {
				params : {
					code : p.code,
					yjmlid:p.yjmlid,
					ejmlid:p.ejmlid,
					yjmlmc:p.m1,
					ejmlmc:p.m2
				}
			}).then(function(res) {
				data.docs = res.data;
			})
		}
		var vm = new Vue({
			el : "#app",
			data : data,
			created:function(){
				//doBusiness({});//初始化时查询全部文档
				this.m1 = "全部"
				this.m2 = "全部文档"
			},
			computed:{
				pageNos:function(){
					var r = [];
					for(var i=1;i<=this.totalPage;i++){
						if(i<10) r.push('0'+i)
						else r.push(i)
					}
					return r;
				}
			},
			methods:{
				prev:function(){
					console.log(this.pageNo-1)
				},
				next:function(){
					console.log(this.pageNo+1)
				},
				jump:function(p){
					console.log(this.pageNo+","+p)
				}
			}
		})
	</script>