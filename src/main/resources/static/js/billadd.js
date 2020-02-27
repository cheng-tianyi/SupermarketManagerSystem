new Vue({
  el:"#root",
  data: {
    billEntity: {providerId:0},
    providerList: [],
  },
  methods:{
    save:function () {
      axios.post("/bill/billAdd",this.billEntity).then(function (respose) {
        if (respose.data.success) {
          alert(respose.data.message)
          location.href="/billlist";
        }else {
          alert(respose.data.message)
        }
      }).catch(function (reason) {
        console.log(reason);
      })
    },
    /*加载角色*/
    loadProvider:function () {
      var _this=this;
      axios.post("/provider/findAll").then(function (respose) {
        console.log(respose.data);
        _this.providerList = respose.data;
      }).catch(function (reason) {
        console.log(reason);
      })
    },
  },
  created:function () {
    this.loadProvider();
  }
})