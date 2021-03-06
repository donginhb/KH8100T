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

public abstract class _YkAppManagerDisp extends Ice.ObjectImpl implements YkAppManager
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Yk::YkAppManager"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public final void cancelEcho(YkCommand cmd, boolean flag, String tip)
    {
        cancelEcho(cmd, flag, tip, null);
    }

    public final void cancelReturn(YkCommand cmd, boolean flag, String tip)
    {
        cancelReturn(cmd, flag, tip, null);
    }

    public final void executeEcho(YkCommand cmd, boolean flag, String tip)
    {
        executeEcho(cmd, flag, tip, null);
    }

    public final void executeReturn(YkCommand cmd, boolean flag, String tip)
    {
        executeReturn(cmd, flag, tip, null);
    }

    /**
     * @param: cmd - 遥控命令。
     * @param: flag - true表示操作正常，false表示操作异常。
     * @param: tip - flag=true，tip=""；flag=false，tip提示出错原因。
     **/
    public final void selectEcho(YkCommand cmd, boolean flag, String tip)
    {
        selectEcho(cmd, flag, tip, null);
    }

    public final void selectReturn(YkCommand cmd, boolean flag, String tip)
    {
        selectReturn(cmd, flag, tip, null);
    }

    public static Ice.DispatchStatus ___selectEcho(YkAppManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        YkCommand cmd = null;
        boolean flag;
        String tip;
        cmd = YkCommand.__read(__is, cmd);
        flag = __is.readBool();
        tip = __is.readString();
        __inS.endReadParams();
        __obj.selectEcho(cmd, flag, tip, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___selectReturn(YkAppManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        YkCommand cmd = null;
        boolean flag;
        String tip;
        cmd = YkCommand.__read(__is, cmd);
        flag = __is.readBool();
        tip = __is.readString();
        __inS.endReadParams();
        __obj.selectReturn(cmd, flag, tip, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___executeEcho(YkAppManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        YkCommand cmd = null;
        boolean flag;
        String tip;
        cmd = YkCommand.__read(__is, cmd);
        flag = __is.readBool();
        tip = __is.readString();
        __inS.endReadParams();
        __obj.executeEcho(cmd, flag, tip, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___executeReturn(YkAppManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        YkCommand cmd = null;
        boolean flag;
        String tip;
        cmd = YkCommand.__read(__is, cmd);
        flag = __is.readBool();
        tip = __is.readString();
        __inS.endReadParams();
        __obj.executeReturn(cmd, flag, tip, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___cancelEcho(YkAppManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        YkCommand cmd = null;
        boolean flag;
        String tip;
        cmd = YkCommand.__read(__is, cmd);
        flag = __is.readBool();
        tip = __is.readString();
        __inS.endReadParams();
        __obj.cancelEcho(cmd, flag, tip, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___cancelReturn(YkAppManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        YkCommand cmd = null;
        boolean flag;
        String tip;
        cmd = YkCommand.__read(__is, cmd);
        flag = __is.readBool();
        tip = __is.readString();
        __inS.endReadParams();
        __obj.cancelReturn(cmd, flag, tip, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "cancelEcho",
        "cancelReturn",
        "executeEcho",
        "executeReturn",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "selectEcho",
        "selectReturn"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___cancelEcho(this, in, __current);
            }
            case 1:
            {
                return ___cancelReturn(this, in, __current);
            }
            case 2:
            {
                return ___executeEcho(this, in, __current);
            }
            case 3:
            {
                return ___executeReturn(this, in, __current);
            }
            case 4:
            {
                return ___ice_id(this, in, __current);
            }
            case 5:
            {
                return ___ice_ids(this, in, __current);
            }
            case 6:
            {
                return ___ice_isA(this, in, __current);
            }
            case 7:
            {
                return ___ice_ping(this, in, __current);
            }
            case 8:
            {
                return ___selectEcho(this, in, __current);
            }
            case 9:
            {
                return ___selectReturn(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
