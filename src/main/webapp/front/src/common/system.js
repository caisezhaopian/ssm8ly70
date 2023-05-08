export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","审核"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"业务类型","menuJump":"列表","tableName":"yewuleixing"}],"menu":"业务类型管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除","查看评论"],"menu":"业务信息","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除","业务缴费"],"menu":"业务租赁","menuJump":"列表","tableName":"yewuzulin"}],"menu":"业务租赁管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改","删除","业务使用统计"],"menu":"业务缴费","menuJump":"列表","tableName":"yewujiaofei"}],"menu":"业务缴费管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除","审核"],"menu":"业务退租","menuJump":"列表","tableName":"yewutuizu"}],"menu":"业务退租管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","业务租赁"],"menu":"业务信息列表","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","退租"],"menu":"业务租赁","menuJump":"列表","tableName":"yewuzulin"}],"menu":"业务租赁管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","支付","月账单统计"],"menu":"业务缴费","menuJump":"列表","tableName":"yewujiaofei"}],"menu":"业务缴费管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"业务退租","menuJump":"列表","tableName":"yewutuizu"}],"menu":"业务退租管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","业务租赁"],"menu":"业务信息列表","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
