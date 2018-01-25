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
// Generated from file `warningmsg.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.gridnt.warningmsg.WarningMsg;

/**
 * Provides type-specific helper functions.
 **/
public final class WarningMsgFilePrxHelper extends Ice.ObjectPrxHelperBase implements WarningMsgFilePrx
{
    private static final String __getContent_name = "getContent";

    public WarningMsgContent getContent(long pos, int length, String strFilename)
    {
        return getContent(pos, length, strFilename, null, false);
    }

    public WarningMsgContent getContent(long pos, int length, String strFilename, java.util.Map<String, String> __ctx)
    {
        return getContent(pos, length, strFilename, __ctx, true);
    }

    private WarningMsgContent getContent(long pos, int length, String strFilename, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getContent_name);
        return end_getContent(begin_getContent(pos, length, strFilename, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getContent(long pos, int length, String strFilename)
    {
        return begin_getContent(pos, length, strFilename, null, false, false, null);
    }

    public Ice.AsyncResult begin_getContent(long pos, int length, String strFilename, java.util.Map<String, String> __ctx)
    {
        return begin_getContent(pos, length, strFilename, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getContent(long pos, int length, String strFilename, Ice.Callback __cb)
    {
        return begin_getContent(pos, length, strFilename, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getContent(long pos, int length, String strFilename, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getContent(pos, length, strFilename, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getContent(long pos, int length, String strFilename, Callback_WarningMsgFile_getContent __cb)
    {
        return begin_getContent(pos, length, strFilename, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getContent(long pos, int length, String strFilename, java.util.Map<String, String> __ctx, Callback_WarningMsgFile_getContent __cb)
    {
        return begin_getContent(pos, length, strFilename, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getContent(long pos, 
                                            int length, 
                                            String strFilename, 
                                            IceInternal.Functional_GenericCallback1<WarningMsgContent> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getContent(pos, length, strFilename, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getContent(long pos, 
                                            int length, 
                                            String strFilename, 
                                            IceInternal.Functional_GenericCallback1<WarningMsgContent> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getContent(pos, length, strFilename, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getContent(long pos, 
                                            int length, 
                                            String strFilename, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<WarningMsgContent> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getContent(pos, length, strFilename, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getContent(long pos, 
                                            int length, 
                                            String strFilename, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<WarningMsgContent> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getContent(pos, length, strFilename, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getContent(long pos, 
                                             int length, 
                                             String strFilename, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.Functional_GenericCallback1<WarningMsgContent> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getContent(pos, length, strFilename, __ctx, __explicitCtx, __synchronous, 
                                new IceInternal.Functional_TwowayCallbackArg1<com.gridnt.warningmsg.WarningMsg.WarningMsgContent>(__responseCb, __exceptionCb, __sentCb)
                                    {
                                        public final void __completed(Ice.AsyncResult __result)
                                        {
                                            WarningMsgFilePrxHelper.__getContent_completed(this, __result);
                                        }
                                    });
    }

    private Ice.AsyncResult begin_getContent(long pos, 
                                             int length, 
                                             String strFilename, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getContent_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getContent_name, __cb);
        try
        {
            __result.prepare(__getContent_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeLong(pos);
            __os.writeInt(length);
            __os.writeString(strFilename);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public WarningMsgContent end_getContent(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getContent_name);
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
            WarningMsgContent __ret = null;
            __ret = WarningMsgContent.__read(__is, __ret);
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

    static public void __getContent_completed(Ice.TwowayCallbackArg1<WarningMsgContent> __cb, Ice.AsyncResult __result)
    {
        com.gridnt.warningmsg.WarningMsg.WarningMsgFilePrx __proxy = (com.gridnt.warningmsg.WarningMsg.WarningMsgFilePrx)__result.getProxy();
        WarningMsgContent __ret = null;
        try
        {
            __ret = __proxy.end_getContent(__result);
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
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static WarningMsgFilePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), WarningMsgFilePrx.class, WarningMsgFilePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static WarningMsgFilePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), WarningMsgFilePrx.class, WarningMsgFilePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static WarningMsgFilePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), WarningMsgFilePrx.class, WarningMsgFilePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static WarningMsgFilePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), WarningMsgFilePrx.class, WarningMsgFilePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static WarningMsgFilePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, WarningMsgFilePrx.class, WarningMsgFilePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static WarningMsgFilePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, WarningMsgFilePrx.class, WarningMsgFilePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::WarningMsg::WarningMsgFile"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, WarningMsgFilePrx v)
    {
        __os.writeProxy(v);
    }

    public static WarningMsgFilePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            WarningMsgFilePrxHelper result = new WarningMsgFilePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}