
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReportLossReportManager from "./components/listers/ReportLossReportCards"
import ReportLossReportDetail from "./components/listers/ReportLossReportDetail"

import NotificationmanagementNotificationHistoryManager from "./components/listers/NotificationmanagementNotificationHistoryCards"
import NotificationmanagementNotificationHistoryDetail from "./components/listers/NotificationmanagementNotificationHistoryDetail"

import DevicemgmtDeviceMgmtManager from "./components/listers/DevicemgmtDeviceMgmtCards"
import DevicemgmtDeviceMgmtDetail from "./components/listers/DevicemgmtDeviceMgmtDetail"

import 단말기조회View from "./components/단말기조회View"
import 단말기조회ViewDetail from "./components/단말기조회ViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reports/lossReports',
                name: 'ReportLossReportManager',
                component: ReportLossReportManager
            },
            {
                path: '/reports/lossReports/:id',
                name: 'ReportLossReportDetail',
                component: ReportLossReportDetail
            },

            {
                path: '/notificationmanagements/notificationHistories',
                name: 'NotificationmanagementNotificationHistoryManager',
                component: NotificationmanagementNotificationHistoryManager
            },
            {
                path: '/notificationmanagements/notificationHistories/:id',
                name: 'NotificationmanagementNotificationHistoryDetail',
                component: NotificationmanagementNotificationHistoryDetail
            },

            {
                path: '/devicemgmts/deviceMgmts',
                name: 'DevicemgmtDeviceMgmtManager',
                component: DevicemgmtDeviceMgmtManager
            },
            {
                path: '/devicemgmts/deviceMgmts/:id',
                name: 'DevicemgmtDeviceMgmtDetail',
                component: DevicemgmtDeviceMgmtDetail
            },

            {
                path: '/devicemgmts/단말기조회',
                name: '단말기조회View',
                component: 단말기조회View
            },
            {
                path: '/devicemgmts/단말기조회/:id',
                name: '단말기조회ViewDetail',
                component: 단말기조회ViewDetail
            },



    ]
})
