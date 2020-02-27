new Vue({
	el:"#root",
	data: {
		userEntity: {},
		roleList: [],
		ruserPassword: ""
	},
	methods:{
		save:function () {
			if (this.ruserPassword!=this.userEntity.userPassword) {
				alert("两次密码不一致");
				return;
			}
			axios.post("/user/userAdd",this.userEntity).then(function (respose) {
				if (respose.data.success) {
					alert(respose.data.message)
					location.href="/userList";
				}else {
					alert(respose.data.message)
				}
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		/*加载角色*/
		loadRole:function () {
			var _this=this;
			axios.post("/role/findAll").then(function (respose) {
				console.log(respose.data);
				_this.roleList = respose.data;
				for (var i =0;i<_this.roleList.length;i++){
					var role = _this.roleList[i];
					_this.roleEntity[role.id]=role.roleName;
				}
				console.log(_this.roleEntity);
			}).catch(function (reason) {
				console.log(reason);
			})
		},
	},
	created:function () {
		this.loadRole();
	}
})