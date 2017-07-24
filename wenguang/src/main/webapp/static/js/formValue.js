/**
 *--------------------------------------------------
 * 表单默认值控制 脚本文件
 * Scorpio
 * 2015-10-27
 *--------------------------------------------------
**/

var formValue = {
	cd:function(ele){
		if(ele.value==ele.defaultValue){ele.value = "";}
	},
	rd:function(ele){
		if(ele.value.replace(/\s+/g,'')==""){ele.value = ele.defaultValue;}
	}
}