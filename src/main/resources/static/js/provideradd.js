new Vue({
	el:"#root",
	data: {
		providerEntity: {},
	},
	methods:{
		save:function () {
			axios.post("/provider/providerAdd",this.providerEntity).then(function (respose) {
				if (respose.data.success) {
					alert(respose.data.message)
					location.href="/providerlist";
				}else {
					alert(respose.data.message)
				}
			}).catch(function (reason) {
				console.log(reason);
			})
		},
	},
})