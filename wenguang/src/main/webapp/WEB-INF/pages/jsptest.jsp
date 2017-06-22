<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/static/css/hello.css" />
	<script type="text/javascript" src="/static/js/hello.js"></script>
	<script src="//vuejs.org/js/vue.min.js"></script>
	<link rel="stylesheet" href="//unpkg.com/iview/dist/styles/iview.css">
	<script src="//unpkg.com/iview/dist/iview.min.js"></script>
	<script src="//libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
</head>

<div id="app">
    <i-button @click="show">Click me!</i-button>
    <Modal v-model="visible" title="Welcome">欢迎使用 iView</Modal>
    
    <my-grid></my-grid>
</div>
<script>
	Vue.component("my-grid",{
		template:'<i-table :columns="columns1" :data="data1"></i-table>',
		data:function(){
			return {
                columns1: [
                    {
                        title: '姓名',
                        key: 'name'
                    },
                    {
                        title: '年龄',
                        key: 'age'
                    },
                    {
                        title: '地址',
                        key: 'address'
                    }
                ],
                data1: [
                    {
                        name: '王小明',
                        age: 18,
                        address: '北京市朝阳区芍药居'
                    },
                    {
                        name: '张小刚',
                        age: 25,
                        address: '北京市海淀区西二旗'
                    },
                    {
                        name: '李小红',
                        age: 30,
                        address: '上海市浦东新区世纪大道'
                    },
                    {
                        name: '周小伟',
                        age: 26,
                        address: '深圳市南山区深南大道'
                    }
                ]
            }
		}
	})
    new Vue({
        el: '#app',
        data: {
            visible: false
        },
        methods: {
            show: function () {
                this.visible = true;
            }
        }
    })
  </script>
</html>


