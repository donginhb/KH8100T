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

public class RespondDefaultDataSeq implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long requestId;

    public String requestNode;

    public long dataCount;

    public java.util.List<RespondDefaultData> seq;

    public RespondDefaultDataSeq()
    {
        requestNode = "";
    }

    public RespondDefaultDataSeq(long id, long requestId, String requestNode, long dataCount, java.util.List<RespondDefaultData> seq)
    {
        this.id = id;
        this.requestId = requestId;
        this.requestNode = requestNode;
        this.dataCount = dataCount;
        this.seq = seq;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        RespondDefaultDataSeq _r = null;
        if(rhs instanceof RespondDefaultDataSeq)
        {
            _r = (RespondDefaultDataSeq)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(requestId != _r.requestId)
            {
                return false;
            }
            if(requestNode != _r.requestNode)
            {
                if(requestNode == null || _r.requestNode == null || !requestNode.equals(_r.requestNode))
                {
                    return false;
                }
            }
            if(dataCount != _r.dataCount)
            {
                return false;
            }
            if(seq != _r.seq)
            {
                if(seq == null || _r.seq == null || !seq.equals(_r.seq))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RdbRealData::RespondDefaultDataSeq");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, requestId);
        __h = IceInternal.HashUtil.hashAdd(__h, requestNode);
        __h = IceInternal.HashUtil.hashAdd(__h, dataCount);
        __h = IceInternal.HashUtil.hashAdd(__h, seq);
        return __h;
    }

    public RespondDefaultDataSeq
    clone()
    {
        RespondDefaultDataSeq c = null;
        try
        {
            c = (RespondDefaultDataSeq)super.clone();
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
        __os.writeLong(id);
        __os.writeLong(requestId);
        __os.writeString(requestNode);
        __os.writeLong(dataCount);
        RespondDefaultDataSequenceHelper.write(__os, seq);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        requestId = __is.readLong();
        requestNode = __is.readString();
        dataCount = __is.readLong();
        seq = RespondDefaultDataSequenceHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, RespondDefaultDataSeq __v)
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

    static public RespondDefaultDataSeq
    __read(IceInternal.BasicStream __is, RespondDefaultDataSeq __v)
    {
        if(__v == null)
        {
             __v = new RespondDefaultDataSeq();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final RespondDefaultDataSeq __nullMarshalValue = new RespondDefaultDataSeq();

    public static final long serialVersionUID = -1152986965L;
}
