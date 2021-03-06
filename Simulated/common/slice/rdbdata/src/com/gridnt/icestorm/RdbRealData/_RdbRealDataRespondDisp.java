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

public abstract class _RdbRealDataRespondDisp extends Ice.ObjectImpl implements RdbRealDataRespond
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
        "::RdbRealData::RdbRealDataRespond"
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

    public final void RespondCompleteData(RespondCompleteDataSeq seq)
    {
        RespondCompleteData(seq, null);
    }

    public final void RespondDefaultData(RespondDefaultDataSeq seq)
    {
        RespondDefaultData(seq, null);
    }

    public final void RespondSpecificData(RespondSpecficDataSeq seq)
    {
        RespondSpecificData(seq, null);
    }

    public final void SendTopoDataRespond(ReceiveTopoDataSeq seq)
    {
        SendTopoDataRespond(seq, null);
    }

    public static Ice.DispatchStatus ___RespondDefaultData(RdbRealDataRespond __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        RespondDefaultDataSeq seq = null;
        seq = RespondDefaultDataSeq.__read(__is, seq);
        __inS.endReadParams();
        __obj.RespondDefaultData(seq, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___RespondSpecificData(RdbRealDataRespond __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        RespondSpecficDataSeq seq = null;
        seq = RespondSpecficDataSeq.__read(__is, seq);
        __inS.endReadParams();
        __obj.RespondSpecificData(seq, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___RespondCompleteData(RdbRealDataRespond __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        RespondCompleteDataSeq seq = null;
        seq = RespondCompleteDataSeq.__read(__is, seq);
        __inS.endReadParams();
        __obj.RespondCompleteData(seq, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___SendTopoDataRespond(RdbRealDataRespond __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        ReceiveTopoDataSeq seq = null;
        seq = ReceiveTopoDataSeq.__read(__is, seq);
        __inS.endReadParams();
        __obj.SendTopoDataRespond(seq, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "RespondCompleteData",
        "RespondDefaultData",
        "RespondSpecificData",
        "SendTopoDataRespond",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping"
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
                return ___RespondCompleteData(this, in, __current);
            }
            case 1:
            {
                return ___RespondDefaultData(this, in, __current);
            }
            case 2:
            {
                return ___RespondSpecificData(this, in, __current);
            }
            case 3:
            {
                return ___SendTopoDataRespond(this, in, __current);
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
