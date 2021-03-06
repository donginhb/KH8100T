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
// Generated from file `rdbdata.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.gridnt.icestorm.RdbRealData;

public interface _RdbRealDataRespondOperationsNC
{
    void RespondDefaultData(RespondDefaultDataSeq seq);

    void RespondSpecificData(RespondSpecficDataSeq seq);

    void RespondCompleteData(RespondCompleteDataSeq seq);

    void SendTopoDataRespond(ReceiveTopoDataSeq seq);
}
