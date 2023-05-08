const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm8ly70/",
            name: "ssm8ly70",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm8ly70/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "电信用户业务管理系统"
        } 
    }
}
export default base
