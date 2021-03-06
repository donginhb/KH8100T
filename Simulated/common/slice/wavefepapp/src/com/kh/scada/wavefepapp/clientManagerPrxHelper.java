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
// Generated from file `wavefepapp.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.kh.scada.wavefepapp;

/**
 * Provides type-specific helper functions.
 **/
public final class clientManagerPrxHelper extends Ice.ObjectPrxHelperBase implements clientManagerPrx
{
    private static final String __getFileCont_name = "getFileCont";

    public boolean getFileCont(String strFileName, Ice.StringHolder strInf, Ice.StringHolder strCfg, ByteSeqHolder rfwDatas)
    {
        return getFileCont(strFileName, strInf, strCfg, rfwDatas, null, false);
    }

    public boolean getFileCont(String strFileName, Ice.StringHolder strInf, Ice.StringHolder strCfg, ByteSeqHolder rfwDatas, java.util.Map<String, String> __ctx)
    {
        return getFileCont(strFileName, strInf, strCfg, rfwDatas, __ctx, true);
    }

    private boolean getFileCont(String strFileName, Ice.StringHolder strInf, Ice.StringHolder strCfg, ByteSeqHolder rfwDatas, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getFileCont_name);
        return end_getFileCont(strInf, strCfg, rfwDatas, begin_getFileCont(strFileName, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName)
    {
        return begin_getFileCont(strFileName, null, false, false, null);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, java.util.Map<String, String> __ctx)
    {
        return begin_getFileCont(strFileName, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, Ice.Callback __cb)
    {
        return begin_getFileCont(strFileName, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getFileCont(strFileName, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, Callback_clientManager_getFileCont __cb)
    {
        return begin_getFileCont(strFileName, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, java.util.Map<String, String> __ctx, Callback_clientManager_getFileCont __cb)
    {
        return begin_getFileCont(strFileName, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, 
                                             FunctionalCallback_clientManager_getFileCont_Response __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getFileCont(strFileName, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, 
                                             FunctionalCallback_clientManager_getFileCont_Response __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getFileCont(strFileName, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, 
                                             java.util.Map<String, String> __ctx, 
                                             FunctionalCallback_clientManager_getFileCont_Response __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getFileCont(strFileName, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getFileCont(String strFileName, 
                                             java.util.Map<String, String> __ctx, 
                                             FunctionalCallback_clientManager_getFileCont_Response __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getFileCont(strFileName, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getFileCont(String strFileName, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              FunctionalCallback_clientManager_getFileCont_Response __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements com.kh.scada.wavefepapp._Callback_clientManager_getFileCont
        {
            public CB(FunctionalCallback_clientManager_getFileCont_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(boolean __ret, String strInf, String strCfg, byte[] rfwDatas)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, strInf, strCfg, rfwDatas);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                clientManagerPrxHelper.__getFileCont_completed(this, __result);
            }

            private final FunctionalCallback_clientManager_getFileCont_Response __responseCb;
        }
        return begin_getFileCont(strFileName, __ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getFileCont(String strFileName, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getFileCont_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getFileCont_name, __cb);
        try
        {
            __result.prepare(__getFileCont_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(strFileName);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_getFileCont(Ice.StringHolder strInf, Ice.StringHolder strCfg, ByteSeqHolder rfwDatas, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getFileCont_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            strInf.value = __is.readString();
            strCfg.value = __is.readString();
            rfwDatas.value = ByteSeqHelper.read(__is);
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getFileCont_completed(com.kh.scada.wavefepapp._Callback_clientManager_getFileCont __cb, Ice.AsyncResult __result)
    {
        com.kh.scada.wavefepapp.clientManagerPrx __proxy = (com.kh.scada.wavefepapp.clientManagerPrx)__result.getProxy();
        boolean __ret = false;
        Ice.StringHolder strInf = new Ice.StringHolder();
        Ice.StringHolder strCfg = new Ice.StringHolder();
        ByteSeqHolder rfwDatas = new ByteSeqHolder();
        try
        {
            __ret = __proxy.end_getFileCont(strInf, strCfg, rfwDatas, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, strInf.value, strCfg.value, rfwDatas.value);
    }

    private static final String __getFileDirList_name = "getFileDirList";

    public boolean getFileDirList(int unitNo, String startDate, String endDate, FileDirSeqHolder fileList)
    {
        return getFileDirList(unitNo, startDate, endDate, fileList, null, false);
    }

    public boolean getFileDirList(int unitNo, String startDate, String endDate, FileDirSeqHolder fileList, java.util.Map<String, String> __ctx)
    {
        return getFileDirList(unitNo, startDate, endDate, fileList, __ctx, true);
    }

    private boolean getFileDirList(int unitNo, String startDate, String endDate, FileDirSeqHolder fileList, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getFileDirList_name);
        return end_getFileDirList(fileList, begin_getFileDirList(unitNo, startDate, endDate, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, String startDate, String endDate)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, null, false, false, null);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, String startDate, String endDate, java.util.Map<String, String> __ctx)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, String startDate, String endDate, Ice.Callback __cb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, String startDate, String endDate, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, String startDate, String endDate, Callback_clientManager_getFileDirList __cb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, String startDate, String endDate, java.util.Map<String, String> __ctx, Callback_clientManager_getFileDirList __cb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, 
                                                String startDate, 
                                                String endDate, 
                                                FunctionalCallback_clientManager_getFileDirList_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, 
                                                String startDate, 
                                                String endDate, 
                                                FunctionalCallback_clientManager_getFileDirList_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, 
                                                String startDate, 
                                                String endDate, 
                                                java.util.Map<String, String> __ctx, 
                                                FunctionalCallback_clientManager_getFileDirList_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getFileDirList(int unitNo, 
                                                String startDate, 
                                                String endDate, 
                                                java.util.Map<String, String> __ctx, 
                                                FunctionalCallback_clientManager_getFileDirList_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getFileDirList(unitNo, startDate, endDate, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getFileDirList(int unitNo, 
                                                 String startDate, 
                                                 String endDate, 
                                                 java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 FunctionalCallback_clientManager_getFileDirList_Response __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements com.kh.scada.wavefepapp._Callback_clientManager_getFileDirList
        {
            public CB(FunctionalCallback_clientManager_getFileDirList_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(boolean __ret, String[] fileList)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, fileList);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                clientManagerPrxHelper.__getFileDirList_completed(this, __result);
            }

            private final FunctionalCallback_clientManager_getFileDirList_Response __responseCb;
        }
        return begin_getFileDirList(unitNo, startDate, endDate, __ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getFileDirList(int unitNo, 
                                                 String startDate, 
                                                 String endDate, 
                                                 java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getFileDirList_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getFileDirList_name, __cb);
        try
        {
            __result.prepare(__getFileDirList_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(unitNo);
            __os.writeString(startDate);
            __os.writeString(endDate);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_getFileDirList(FileDirSeqHolder fileList, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getFileDirList_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            fileList.value = FileDirSeqHelper.read(__is);
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getFileDirList_completed(com.kh.scada.wavefepapp._Callback_clientManager_getFileDirList __cb, Ice.AsyncResult __result)
    {
        com.kh.scada.wavefepapp.clientManagerPrx __proxy = (com.kh.scada.wavefepapp.clientManagerPrx)__result.getProxy();
        boolean __ret = false;
        FileDirSeqHolder fileList = new FileDirSeqHolder();
        try
        {
            __ret = __proxy.end_getFileDirList(fileList, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, fileList.value);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static clientManagerPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), clientManagerPrx.class, clientManagerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static clientManagerPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), clientManagerPrx.class, clientManagerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static clientManagerPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), clientManagerPrx.class, clientManagerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static clientManagerPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), clientManagerPrx.class, clientManagerPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static clientManagerPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, clientManagerPrx.class, clientManagerPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static clientManagerPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, clientManagerPrx.class, clientManagerPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::wavefepapp::clientManager"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, clientManagerPrx v)
    {
        __os.writeProxy(v);
    }

    public static clientManagerPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            clientManagerPrxHelper result = new clientManagerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
