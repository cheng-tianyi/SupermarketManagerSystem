new Vue({
	el:"#root",
	data: {
		providerEntity:{},
	},
	methods:{
		getData:function () {
			var _this =this;
			axios.post("/provider/getData").then(function (respose) {
				_this.providerEntity = respose.data;
				console.log(_this.providerEntity)
			}).catch(function (reason) {
				console.log(reason);
			})
		},
		updatePro:function () {
			axios.post("/provider/update",this.providerEntity).then(function (respose) {
				if (respose.data.success) {
					alert(respose.data.message)
					location.href="/providerlist";
				}else {
					alert(respose.data.message)
				}
			}).catch(function (reason) {
				console.log(reason);
			})
		}
	},
	created:function () {
		this.getData();
	}
})