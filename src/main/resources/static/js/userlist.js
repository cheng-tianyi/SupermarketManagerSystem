new Vue({
	el:"#root",
	data:{
		userList:[],
		sex:{1:"女",2:"男"},
		page:1,//当前页码
		pageSize:10,//一页多少条数据
		total:0,//总记录数
		maxPage:9,//最大页面数
		roleEntity:{},
		roleList:[],
		searchEntity:{userRole:0}
	},
	methods:{
		pageHandler:function (page) {
			this.page=page;
			var _this=this;
			axios.post("/user/findPage?page="+this.page+"&pageSize="+this.pageSize,this.searchEntity).then(function (respose) {
				_this.total=respose.data.total;
				_this.userList = respose.data.rows;
				console.log(_this.userList)

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
		deleteUser:function (userCode) {
			var _this=this;
			axios.post("/user/deleteUser?userCode="+userCode).then(function (respose) {
				if (respose.data.success) {
					alert(respose.data.message)
					_this.pageHandler(1);
				}else {
					alert(respose.data.message)
				}
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		update:function (user) {
			var _this=this;
			axios.post("/user/saveSession",user).then(function (respose) {
				location.href="/userModify";
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		showDetail:function (user) {
			var _this=this;
			axios.post("/user/saveSession",user).then(function (respose) {
				location.href="/userView";
			}).catch(function (reason) {
				console.log(reason);
			})
		}
	},
	created:function () {
		this.pageHandler(1);
		this.loadRole();
	}
})