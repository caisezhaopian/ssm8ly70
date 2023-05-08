import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yewuleixingList from '../pages/yewuleixing/list'
import yewuleixingDetail from '../pages/yewuleixing/detail'
import yewuleixingAdd from '../pages/yewuleixing/add'
import yewuxinxiList from '../pages/yewuxinxi/list'
import yewuxinxiDetail from '../pages/yewuxinxi/detail'
import yewuxinxiAdd from '../pages/yewuxinxi/add'
import yewuzulinList from '../pages/yewuzulin/list'
import yewuzulinDetail from '../pages/yewuzulin/detail'
import yewuzulinAdd from '../pages/yewuzulin/add'
import yewujiaofeiList from '../pages/yewujiaofei/list'
import yewujiaofeiDetail from '../pages/yewujiaofei/detail'
import yewujiaofeiAdd from '../pages/yewujiaofei/add'
import yewutuizuList from '../pages/yewutuizu/list'
import yewutuizuDetail from '../pages/yewutuizu/detail'
import yewutuizuAdd from '../pages/yewutuizu/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yewuleixing',
					component: yewuleixingList
				},
				{
					path: 'yewuleixingDetail',
					component: yewuleixingDetail
				},
				{
					path: 'yewuleixingAdd',
					component: yewuleixingAdd
				},
				{
					path: 'yewuxinxi',
					component: yewuxinxiList
				},
				{
					path: 'yewuxinxiDetail',
					component: yewuxinxiDetail
				},
				{
					path: 'yewuxinxiAdd',
					component: yewuxinxiAdd
				},
				{
					path: 'yewuzulin',
					component: yewuzulinList
				},
				{
					path: 'yewuzulinDetail',
					component: yewuzulinDetail
				},
				{
					path: 'yewuzulinAdd',
					component: yewuzulinAdd
				},
				{
					path: 'yewujiaofei',
					component: yewujiaofeiList
				},
				{
					path: 'yewujiaofeiDetail',
					component: yewujiaofeiDetail
				},
				{
					path: 'yewujiaofeiAdd',
					component: yewujiaofeiAdd
				},
				{
					path: 'yewutuizu',
					component: yewutuizuList
				},
				{
					path: 'yewutuizuDetail',
					component: yewutuizuDetail
				},
				{
					path: 'yewutuizuAdd',
					component: yewutuizuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
