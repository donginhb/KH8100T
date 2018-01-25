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
 * Provides type-specific helper functions.
 **/
public final class CAmsManagerPrxHelper extends Ice.ObjectPrxHelperBase implements CAmsManagerPrx
{
    private static final String __AmsHeartBeat_name = "AmsHeartBeat";

    public void AmsHeartBeat(String strServerName)
    {
        AmsHeartBeat(strServerName, null, false);
    }

    public void AmsHeartBeat(String strServerName, java.util.Map<String, String> __ctx)
    {
        AmsHeartBeat(strServerName, __ctx, true);
    }

    private void AmsHeartBeat(String strServerName, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_AmsHeartBeat(begin_AmsHeartBeat(strServerName, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName)
    {
        return begin_AmsHeartBeat(strServerName, null, false, false, null);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, java.util.Map<String, String> __ctx)
    {
        return begin_AmsHeartBeat(strServerName, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, Ice.Callback __cb)
    {
        return begin_AmsHeartBeat(strServerName, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_AmsHeartBeat(strServerName, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, Callback_CAmsManager_AmsHeartBeat __cb)
    {
        return begin_AmsHeartBeat(strServerName, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, java.util.Map<String, String> __ctx, Callback_CAmsManager_AmsHeartBeat __cb)
    {
        return begin_AmsHeartBeat(strServerName, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, 
                                              IceInternal.Functional_VoidCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_AmsHeartBeat(strServerName, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, 
                                              IceInternal.Functional_VoidCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_AmsHeartBeat(strServerName, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, 
                                              java.util.Map<String, String> __ctx, 
                                              IceInternal.Functional_VoidCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_AmsHeartBeat(strServerName, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_AmsHeartBeat(String strServerName, 
                                              java.util.Map<String, String> __ctx, 
                                              IceInternal.Functional_VoidCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_AmsHeartBeat(strServerName, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_AmsHeartBeat(String strServerName, 
                                               java.util.Map<String, String> __ctx, 
                                               boolean __explicitCtx, 
                                               boolean __synchronous, 
                                               IceInternal.Functional_VoidCallback __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_AmsHeartBeat(strServerName, 
                                  __ctx, 
                                  __explicitCtx, 
                                  __synchronous, 
                                  new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_AmsHeartBeat(String strServerName, 
                                               java.util.Map<String, String> __ctx, 
                                               boolean __explicitCtx, 
                                               boolean __synchronous, 
                                               IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__AmsHeartBeat_name, __cb);
        try
        {
            __result.prepare(__AmsHeartBeat_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(strServerName);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_AmsHeartBeat(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __AmsHeartBeat_name);
    }

    private static final String __Quit_name = "Quit";

    public void Quit()
    {
        Quit(null, false);
    }

    public void Quit(java.util.Map<String, String> __ctx)
    {
        Quit(__ctx, true);
    }

    private void Quit(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_Quit(begin_Quit(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_Quit()
    {
        return begin_Quit(null, false, false, null);
    }

    public Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx)
    {
        return begin_Quit(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_Quit(Ice.Callback __cb)
    {
        return begin_Quit(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_Quit(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_Quit(Callback_CAmsManager_Quit __cb)
    {
        return begin_Quit(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx, Callback_CAmsManager_Quit __cb)
    {
        return begin_Quit(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_Quit(IceInternal.Functional_VoidCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_Quit(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_Quit(IceInternal.Functional_VoidCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Quit(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_VoidCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_Quit(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_VoidCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Quit(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx, 
                                       boolean __explicitCtx, 
                                       boolean __synchronous, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Quit(__ctx, 
                          __explicitCtx, 
                          __synchronous, 
                          new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_Quit(java.util.Map<String, String> __ctx, 
                                       boolean __explicitCtx, 
                                       boolean __synchronous, 
                                       IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__Quit_name, __cb);
        try
        {
            __result.prepare(__Quit_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_Quit(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __Quit_name);
    }

    private static final String __Register_name = "Register";

    public void Register(String strServerName, String strRole)
        throws CAmsException
    {
        Register(strServerName, strRole, null, false);
    }

    public void Register(String strServerName, String strRole, java.util.Map<String, String> __ctx)
        throws CAmsException
    {
        Register(strServerName, strRole, __ctx, true);
    }

    private void Register(String strServerName, String strRole, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws CAmsException
    {
        __checkTwowayOnly(__Register_name);
        end_Register(begin_Register(strServerName, strRole, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_Register(String strServerName, String strRole)
    {
        return begin_Register(strServerName, strRole, null, false, false, null);
    }

    public Ice.AsyncResult begin_Register(String strServerName, String strRole, java.util.Map<String, String> __ctx)
    {
        return begin_Register(strServerName, strRole, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_Register(String strServerName, String strRole, Ice.Callback __cb)
    {
        return begin_Register(strServerName, strRole, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_Register(String strServerName, String strRole, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_Register(strServerName, strRole, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_Register(String strServerName, String strRole, Callback_CAmsManager_Register __cb)
    {
        return begin_Register(strServerName, strRole, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_Register(String strServerName, String strRole, java.util.Map<String, String> __ctx, Callback_CAmsManager_Register __cb)
    {
        return begin_Register(strServerName, strRole, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_Register(String strServerName, 
                                          String strRole, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_Register(strServerName, strRole, null, false, false, __responseCb, __userExceptionCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_Register(String strServerName, 
                                          String strRole, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Register(strServerName, strRole, null, false, false, __responseCb, __userExceptionCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_Register(String strServerName, 
                                          String strRole, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_Register(strServerName, strRole, __ctx, true, false, __responseCb, __userExceptionCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_Register(String strServerName, 
                                          String strRole, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Register(strServerName, strRole, __ctx, true, false, __responseCb, __userExceptionCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_Register(String strServerName, 
                                           String strRole, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Register(strServerName, strRole, __ctx, __explicitCtx, __synchronous, 
                              new IceInternal.Functional_TwowayCallbackVoidUE(__responseCb, __userExceptionCb, __exceptionCb, __sentCb)
                                  {
                                      public final void __completed(Ice.AsyncResult __result)
                                      {
                                          CAmsManagerPrxHelper.__Register_completed(this, __result);
                                      }
                                  });
    }

    private Ice.AsyncResult begin_Register(String strServerName, 
                                           String strRole, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__Register_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__Register_name, __cb);
        try
        {
            __result.prepare(__Register_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(strServerName);
            __os.writeString(strRole);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_Register(Ice.AsyncResult __iresult)
        throws CAmsException
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __Register_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(CAmsException __ex)
                {
                    throw __ex;
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            __result.readEmptyParams();
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __Register_completed(Ice.TwowayCallbackVoidUE __cb, Ice.AsyncResult __result)
    {
        com.kh.ams.Amssrv.CAmsManagerPrx __proxy = (com.kh.ams.Amssrv.CAmsManagerPrx)__result.getProxy();
        try
        {
            __proxy.end_Register(__result);
        }
        catch(Ice.UserException __ex)
        {
            __cb.exception(__ex);
            return;
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
        __cb.response();
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CAmsManagerPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), CAmsManagerPrx.class, CAmsManagerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CAmsManagerPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), CAmsManagerPrx.class, CAmsManagerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CAmsManagerPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), CAmsManagerPrx.class, CAmsManagerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CAmsManagerPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), CAmsManagerPrx.class, CAmsManagerPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static CAmsManagerPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, CAmsManagerPrx.class, CAmsManagerPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static CAmsManagerPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, CAmsManagerPrx.class, CAmsManagerPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Amssrv::CAmsManager",
        "::Ice::Object"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[0];
    }

    public static void __write(IceInternal.BasicStream __os, CAmsManagerPrx v)
    {
        __os.writeProxy(v);
    }

    public static CAmsManagerPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CAmsManagerPrxHelper result = new CAmsManagerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}