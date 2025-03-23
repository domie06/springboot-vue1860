const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm04609/",
            name: "ssm04609",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm04609/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "经典诗文学习爱好者学习交流平台"
        } 
    }
}
export default base
