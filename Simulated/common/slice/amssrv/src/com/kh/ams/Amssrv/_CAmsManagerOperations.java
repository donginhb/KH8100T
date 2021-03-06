// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `amssrv.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.kh.ams.Amssrv;

/**
 * AMS Manager�Լ��ӿ�
 *
 **/
public interface _CAmsManagerOperations
{
    /**
     * AMS Managerע��
     *
     * @param __current The Current object for the invocation.
     **/
    void Register(String strServerName, String strRole, Ice.Current __current)
        throws CAmsException;

    void Quit(Ice.Current __current);

    void AmsHeartBeat(String strServerName, Ice.Current __current);
}
