<html>
	<head>
		<link rel="stylesheet" type="text/css" href="/static/css/hello.css" />
		<script type="text/javascript" src="/static/js/hello.js"></script>
		<script type="text/javascript" src="/static/js/vue.js"></script>
	</head>
	<body>
	hello world jsp
	<br><br><br>
	<div id="app">
	{{message}}
	<input v-model="message"/>
	</div>
	</body>
	<script>
		console.log(fun());
		var vm = new Vue({
			el:"#app",
			data:{
				message:"hi vue"
			}
		})
	</script>
</html>

