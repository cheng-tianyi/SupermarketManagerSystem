new Vue({
    el:"#root",
    data:{
        page:1,//当前页码
        pageSize:10,//一页多少条数据
        total:0,//总记录数
        maxPage:9,//最大页面数
        searchEntity:{},
        providerList:[],
        alertHtml:'<div class="zhezhao"></div>\n' +
            '    <div class="remove" id="removeProv">\n' +
            '        <div class="removerChid">\n' +
            '            <h2>提示</h2>\n' +
            '            <div class="removeMain">\n' +
            '                <p>你确定要删除该供应商吗？</p>\n' +
            '                <a href="#" id="yes">确定</a> <a href="#" id="no">取消</a>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>'
    },
    methods:{
        pageHandler:function (page) {
            this.page=page;
            var _this=this;
            axios.post("/provider/findPage?page="+this.page+"&pageSize="+this.pageSize,this.searchEntity).then(function (respose) {
                _this.total=respose.data.total;
                _this.providerList = respose.data.rows;
                console.log(_this.providerList)

            }).catch(function (reason) {
                console.log(reason);
            })
        },
        deletePro:function (proCode) {
            var _this=this;
            axios.post("/provider/providerdel?proCode="+proCode).then(function (respose) {
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
        updataPro:function (provider) {
            axios.post("/provider/saveData",provider).then(function (respose) {
                location.href="/providerModify";
            }).catch(function (reason) {
                console.log(reason);
            })
        },
        proView:function (provider) {
            axios.post("/provider/saveData",provider).then(function (respose) {
                location.href="/providerView";
            }).catch(function (reason) {
                console.log(reason);
            })
        }
    },
    created:function () {
        // $('#root').append(this.alertHtml)
        this.pageHandler(1);
    }
})