import Login from './views/Login.vue'
import NotFound from './views/404.vue'
import Home from './views/Home.vue'
import Main from './views/Main.vue'
import Approve from './views/Approve.vue'
import Conference from './views/Conference.vue'
import upload from './views/upload.vue'
import information from './views/information.vue'
import Log from './views/Log.vue'

let routes = [
    {
        path: '/login',
        component: Login,
        name: '',
        hidden: true
    },
    {
        path: '/404',
        component: NotFound,
        name: '',
        hidden: true
    },
    //{ path: '/main', component: Main },
    {
        path: '/',
        component: Home,
        name: '',
        iconCls: 'fa fa-address-card',
        leaf: true,//只有一个节点
        children: [
            { path: '/information', component: information, name: '信息发布平台' }
        ]
    },
    // {
    //     path: '/',
    //     component: Home,
    //     name: '',
    //     iconCls: 'fa fa-address-card',
    //     leaf: true,//只有一个节点
    //     children: [
    //         { path: '/upload', component: upload, name: '文件管理平台' }
    //     ]
    // },
    {
        path: '/',
        component: Home,
        name: '办公自动化',
        iconCls: 'el-icon-message',//图标样式class
        children: [
            { path: '/main', component: Main, name: '主页', hidden: true },
            // { path: '/table', component: Table, name: '任务分派' },
            { path: '/Approve', component: Approve, name: '请假/审批' },
            { path: '/Log', component: Log, name: '日志系统' },
            { path: '/Conference', component: Conference, name: '会议管理' },
            // { path: '/echarts', component: echarts, name: '系统管理' },
        ]
    },
    {
        path: '*',
        hidden: true,
        redirect: { path: '/404' }
    }
];

export default routes;