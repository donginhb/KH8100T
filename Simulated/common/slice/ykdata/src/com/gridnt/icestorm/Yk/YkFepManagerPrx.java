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
// Generated from file `ykdata.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.gridnt.icestorm.Yk;

public interface YkFepManagerPrx extends Ice.ObjectPrx
{
    /**
     * @param: cmd - ң�����
     **/
    public void select(YkCommand cmd);

    /**
     * @param: cmd - ң�����
     * @param __ctx The Context map to send with the invocation.
     **/
    public void select(YkCommand cmd, java.util.Map<String, String> __ctx);

    /**
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd);

    /**
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, java.util.Map<String, String> __ctx);

    /**
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, Ice.Callback __cb);

    /**
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, Callback_YkFepManager_select __cb);

    /**
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, java.util.Map<String, String> __ctx, Callback_YkFepManager_select __cb);

    /**
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    /**
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_select(YkCommand cmd, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    /**
     * @param __result The asynchronous result object.
     **/
    public void end_select(Ice.AsyncResult __result);

    public void execute(YkCommand cmd);

    public void execute(YkCommand cmd, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_execute(YkCommand cmd);

    public Ice.AsyncResult begin_execute(YkCommand cmd, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_execute(YkCommand cmd, Ice.Callback __cb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, Callback_YkFepManager_execute __cb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, java.util.Map<String, String> __ctx, Callback_YkFepManager_execute __cb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_execute(YkCommand cmd, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public void end_execute(Ice.AsyncResult __result);

    public void cancel(YkCommand cmd);

    public void cancel(YkCommand cmd, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_cancel(YkCommand cmd);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, Ice.Callback __cb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, Callback_YkFepManager_cancel __cb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, java.util.Map<String, String> __ctx, Callback_YkFepManager_cancel __cb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_cancel(YkCommand cmd, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public void end_cancel(Ice.AsyncResult __result);
}
