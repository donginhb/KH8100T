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

public class SUnitRFW implements java.lang.Cloneable, java.io.Serializable
{
    public SRFWHead Head;

    public int[] Data;

    public SUnitRFW()
    {
        Head = new SRFWHead();
    }

    public SUnitRFW(SRFWHead Head, int[] Data)
    {
        this.Head = Head;
        this.Data = Data;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SUnitRFW _r = null;
        if(rhs instanceof SUnitRFW)
        {
            _r = (SUnitRFW)rhs;
        }

        if(_r != null)
        {
            if(Head != _r.Head)
            {
                if(Head == null || _r.Head == null || !Head.equals(_r.Head))
                {
                    return false;
                }
            }
            if(!java.util.Arrays.equals(Data, _r.Data))
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::wavefepapp::SUnitRFW");
        __h = IceInternal.HashUtil.hashAdd(__h, Head);
        __h = IceInternal.HashUtil.hashAdd(__h, Data);
        return __h;
    }

    public SUnitRFW
    clone()
    {
        SUnitRFW c = null;
        try
        {
            c = (SUnitRFW)super.clone();
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
        SRFWHead.__write(__os, Head);
        SRFWDataSeqHelper.write(__os, Data);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        Head = SRFWHead.__read(__is, Head);
        Data = SRFWDataSeqHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, SUnitRFW __v)
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

    static public SUnitRFW
    __read(IceInternal.BasicStream __is, SUnitRFW __v)
    {
        if(__v == null)
        {
             __v = new SUnitRFW();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final SUnitRFW __nullMarshalValue = new SUnitRFW();

    public static final long serialVersionUID = -985493774L;
}
