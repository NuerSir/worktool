package org.yameida.worktool

import org.yameida.worktool.model.WeworkMessageBean
import org.yameida.worktool.service.MyLooper
import org.yameida.worktool.service.WeworkController
import org.yameida.worktool.service.WeworkLoopImpl
import org.yameida.worktool.service.getRoot
import org.yameida.worktool.utils.AccessibilityUtil

/**
 * 示例
 */
object Demo {

    fun test(flag: Boolean) {
        if (!flag) return

        MyLooper.getInstance().removeCallbacksAndMessages(null)

        //打印当前视图树
//        AccessibilityUtil.printNodeClazzTree(getRoot())

        //自动通过好友
//        WeworkLoopImpl.getFriendRequest()

        //自动通过好友(后台可配置开关)
//        WeworkLoopImpl.mainLoop()

        //创建群信息
//        WeworkController.initGroup(WeworkMessageBean().apply {
//            groupName = "新建外部群 " + UUID.randomUUID().toString().substring(0, 5)
//            selectList = arrayListOf("冯燕", "尹甲仑")
//            groupAnnouncement = "本群为雨花台区法院诉前调解官方微信群"
//        })

        //修改群信息
//        WeworkController.intoGroupAndConfig(WeworkMessageBean().apply {
//            groupName = "新建外部群 " + UUID.randomUUID().toString().substring(0, 5)
//            selectList = arrayListOf("冯燕", "尹甲仑")
//            groupAnnouncement = "本群为雨花台区法院诉前调解官方微信群"
//        })

        //获取群信息
//        WeworkController.getGroupInfo(WeworkMessageBean().apply {
//            selectList = arrayListOf("企微RPA机器人自测1")
//        })

        //在房间内发送消息
//        WeworkController.sendMessage(WeworkMessageBean().apply {
//            titleList = arrayListOf("下级群1", "上级群1")
//            receivedContent = "aaa"
//        })

        //获取我的信息
//        WeworkController.getMyInfo()

        //推送任意小程序
//        WeworkController.pushMicroprogram(WeworkMessageBean().apply {
//            titleList = arrayListOf("尹甲仑")
//            objectName = "小法名律"
//            extraText = "123"
//        })

        //推送微盘图片
//        WeworkController.pushMicroDiskImage(WeworkMessageBean().apply {
//            titleList = arrayListOf("尹甲仑")
//            objectName = "雨水.jpg"
//        })

        //推送微盘文件
//        WeworkController.pushMicroDiskFile(WeworkMessageBean().apply {
//            titleList = arrayListOf("尹甲仑")
//            objectName = "雨水.jpg"
//        })

        //推送腾讯文档
//        WeworkController.pushOffice(WeworkMessageBean().apply {
//            titleList = arrayListOf("尹甲仑")
//            objectName = "机器人中台"
//            extraText = "附加留言"
//        })
    }

}