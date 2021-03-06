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

public class ConnectivityNodeInfo implements java.lang.Cloneable, java.io.Serializable
{
    public String nodeRID;

    public java.util.List<TerminalInfo> terminalInfoes;

    public ConnectivityNodeInfo()
    {
        nodeRID = "";
    }

    public ConnectivityNodeInfo(String nodeRID, java.util.List<TerminalInfo> terminalInfoes)
    {
        this.nodeRID = nodeRID;
        this.terminalInfoes = terminalInfoes;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ConnectivityNodeInfo _r = null;
        if(rhs instanceof ConnectivityNodeInfo)
        {
            _r = (ConnectivityNodeInfo)rhs;
        }

        if(_r != null)
        {
            if(nodeRID != _r.nodeRID)
            {
                if(nodeRID == null || _r.nodeRID == null || !nodeRID.equals(_r.nodeRID))
                {
                    return false;
                }
            }
            if(terminalInfoes != _r.terminalInfoes)
            {
                if(terminalInfoes == null || _r.terminalInfoes == null || !terminalInfoes.equals(_r.terminalInfoes))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::RdbRealData::ConnectivityNodeInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, nodeRID);
        __h = IceInternal.HashUtil.hashAdd(__h, terminalInfoes);
        return __h;
    }

    public ConnectivityNodeInfo
    clone()
    {
        ConnectivityNodeInfo c = null;
        try
        {
            c = (ConnectivityNodeInfo)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(nodeRID);
        TerminalInfoSeqHelper.write(__os, terminalInfoes);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        nodeRID = __is.readString();
        terminalInfoes = TerminalInfoSeqHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, ConnectivityNodeInfo __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public ConnectivityNodeInfo
    __read(IceInternal.BasicStream __is, ConnectivityNodeInfo __v)
    {
        if(__v == null)
        {
             __v = new ConnectivityNodeInfo();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ConnectivityNodeInfo __nullMarshalValue = new ConnectivityNodeInfo();

    public static final long serialVersionUID = 1161422813L;
}
