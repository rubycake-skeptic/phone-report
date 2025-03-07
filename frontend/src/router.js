
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReportLostDeviceReportManager from "./components/listers/ReportLostDeviceReportCards"
import ReportLostDeviceReportDetail from "./components/listers/ReportLostDeviceReportDetail"

import NotificationmanagementNotificationHistoryManager from "./components/listers/NotificationmanagementNotificationHistoryCards"
import NotificationmanagementNotificationHistoryDetail from "./components/listers/NotificationmanagementNotificationHistoryDetail"

import DeviceDeviceMgmtManager from "./components/listers/DeviceDeviceMgmtCards"
import DeviceDeviceMgmtDetail from "./components/listers/DeviceDeviceMgmtDetail"

import ReadDeviceView from "./components/ReadDeviceView"
import ReadDeviceViewDetail from "./components/ReadDeviceViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reports/lostDeviceReports',
                name: 'ReportLostDeviceReportManager',
                component: ReportLostDeviceReportManager
            },
            {
                path: '/reports/lostDeviceReports/:id',
                name: 'ReportLostDeviceReportDetail',
                component: ReportLostDeviceReportDetail
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
                path: '/devices/deviceMgmts',
                name: 'DeviceDeviceMgmtManager',
                component: DeviceDeviceMgmtManager
            },
            {
                path: '/devices/deviceMgmts/:id',
                name: 'DeviceDeviceMgmtDetail',
                component: DeviceDeviceMgmtDetail
            },

            {
                path: '/devices/readDevices',
                name: 'ReadDeviceView',
                component: ReadDeviceView
            },
            {
                path: '/devices/readDevices/:id',
                name: 'ReadDeviceViewDetail',
                component: ReadDeviceViewDetail
            },



    ]
})
