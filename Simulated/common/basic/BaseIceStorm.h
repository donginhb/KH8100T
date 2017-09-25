﻿/*
* Copyright (c) 2010,GridNT,Inc
*All rights reserved.
*
* 文件名称：amlConst.h
* 摘要：icestorm头文件
*/

#ifndef BASEICESTORM_H
#define BASEICESTORM_H

#include <string>
#include <Ice/Ice.h>
#include <IceStorm/IceStorm.h>

class BaseIceStorm
{
public:
	/** 
	* icestorm订阅方法
	*
	*@param object:对象实例
	*@param identity:对象的identity
	*@param deliverModel:订阅模式，值为twoway,oneway,batch_oneway
	*@param reliability:qos的reliability，值为空或为ordered
	*@param retryCount:deliverModel为twoway时，设置此值表示icestorm重新发送次数
	* @return boolean:true表示成功，false表示失败
	*/
	static bool Subscriber(Ice::CommunicatorPtr &communicatorPtr, Ice::ObjectPrx &objectPrx, std::string &strTopic, 
		std::string &strDeliverModel, std::string &strReliability, std::string &strRetryCount);
	//haofy add 2012-09-12
	static bool Subscriber(Ice::CommunicatorPtr &communicatorPtr, Ice::ObjectPrx &objectPrx, std::string &strTopic,
		std::string &strDeliverModel, std::string &strReliability, std::string &strRetryCount,Ice::ObjectPrx &proxyPrx);

	/** 
	* icestorm取消订阅
	*
	* @return boolean:true表示成功，false表示失败
	*/
	static bool UnSubscriber(Ice::CommunicatorPtr &communicatorPtr, Ice::ObjectPrx &objectPrx, std::string &strTopic);

	/** 
	* 得到icestorm发布者代理
	*
	*@param deliverModel:订阅模式，值为twoway,oneway,datagram,batch_oneway,batch_datagram
	* @return Ice.ObjectPrx
	*/
	static Ice::ObjectPrx GetPublisher(Ice::CommunicatorPtr &communicatorPtr, std::string &strTopic, std::string &strDeliverModel);

	/** 
	* 得到icestorm主题对象代理
	*
	* @return TopicPrx:主题对象代理
	*/
	static IceStorm::TopicPrx GetTopicProxy(Ice::CommunicatorPtr &communicatorPtr, std::string &strTopic);
};

#endif
