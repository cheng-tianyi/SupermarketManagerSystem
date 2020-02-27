new Vue({
	el:"#root",
	data:{
		page:1,//当前页码
		pageSize:5,//一页多少条数据
		total:0,//总记录数
		maxPage:9,//最大页面数
		searchEntity:{},
		billList:[],
		providerList:[],
		isPay:{1:"未付款",2:"已付款"},
		providerEntity:{}
	},
	methods:{
		pageHandler:function (page) {
			this.page=page;
			var _this=this;
			axios.post("/bill/findPage?page="+this.page+"&pageSize="+this.pageSize,this.searchEntity).then(function (respose) {
				_this.total=respose.data.total;
				_this.billList = respose.data.rows;
				console.log(_this.billList)

			}).catch(function (reason) {
				console.log(reason);
			})
		},
		loadProvider:function () {
			var _this = this;
			axios.post("/provider/findAll").then(function (respose) {
				_this.providerList = respose.data;
				for (var i =0;i<_this.providerList.length;i++){
					var provider = _this.providerList[i];
					_this.providerEntity[provider.id]=provider.proName;
				}
				console.log(_this.providerList)
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		deleteBill:function (billCode) {
			var _this =this;
			axios.post("/bill/deleteBill?billCode="+billCode).then(function (respose) {
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
		updataBill:function (bill) {
			axios.post("/bill/saveData",bill).then(function (respose) {
				location.href="/billModify";
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		billView:function (bill) {
			axios.post("/bill/saveData",bill).then(function (respose) {
				location.href="/billView";
			}).catch(function (reason) {
				console.log(reason);
			})
		}
	},
	created:function () {
		this.pageHandler(1);
		this.loadProvider();
	}
})