new Vue({
	el:"#root",
	data: {
		billEntity:{},
		providerList: [],
		nopayCheck:'',
		payCheck:''
	},
	methods:{
		showData:function () {
			var _this =this;
			axios.post("/bill/getData").then(function (respose) {
				_this.billEntity = respose.data;
				if (_this.billEntity.isPayment==1) {
					_this.nopayCheck='checked';
					_this.payCheck=''
				}
				if (_this.billEntity.isPayment==2) {
					_this.payCheck='checked';
					_this.nopayCheck='';
				}
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		loadProvider:function () {
			var _this=this;
			axios.post("/provider/findAll").then(function (respose) {
				console.log(respose.data);
				_this.providerList = respose.data;
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		update:function () {
			axios.post("/bill/update",this.billEntity).then(function (respose) {
				if (respose.data.success) {
					alert(respose.data.message)
					location.href="/billlist";
				}else {
					alert(respose.data.message)
				}
			}).catch(function (reason) {
				console.log(reason);
			})
		}
	},
	created:function () {
		this.showData();
		this.loadProvider();
	}
})