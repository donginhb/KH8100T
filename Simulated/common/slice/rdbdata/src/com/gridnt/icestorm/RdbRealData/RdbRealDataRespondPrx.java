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

public interface RdbRealDataRespondPrx extends Ice.ObjectPrx
{
    public void RespondDefaultData(RespondDefaultDataSeq seq);

    public void RespondDefaultData(RespondDefaultDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, Ice.Callback __cb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, Callback_RdbRealDataRespond_RespondDefaultData __cb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, java.util.Map<String, String> __ctx, Callback_RdbRealDataRespond_RespondDefaultData __cb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_RespondDefaultData(RespondDefaultDataSeq seq, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb);

    public void end_RespondDefaultData(Ice.AsyncResult __result);

    public void RespondSpecificData(RespondSpecficDataSeq seq);

    public void RespondSpecificData(RespondSpecficDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, Ice.Callback __cb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, Callback_RdbRealDataRespond_RespondSpecificData __cb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, java.util.Map<String, String> __ctx, Callback_RdbRealDataRespond_RespondSpecificData __cb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_RespondSpecificData(RespondSpecficDataSeq seq, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb);

    public void end_RespondSpecificData(Ice.AsyncResult __result);

    public void RespondCompleteData(RespondCompleteDataSeq seq);

    public void RespondCompleteData(RespondCompleteDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, Ice.Callback __cb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, Callback_RdbRealDataRespond_RespondCompleteData __cb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, java.util.Map<String, String> __ctx, Callback_RdbRealDataRespond_RespondCompleteData __cb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_RespondCompleteData(RespondCompleteDataSeq seq, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb);

    public void end_RespondCompleteData(Ice.AsyncResult __result);

    public void SendTopoDataRespond(ReceiveTopoDataSeq seq);

    public void SendTopoDataRespond(ReceiveTopoDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, Ice.Callback __cb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, Callback_RdbRealDataRespond_SendTopoDataRespond __cb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, java.util.Map<String, String> __ctx, Callback_RdbRealDataRespond_SendTopoDataRespond __cb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_SendTopoDataRespond(ReceiveTopoDataSeq seq, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb);

    public void end_SendTopoDataRespond(Ice.AsyncResult __result);
}
