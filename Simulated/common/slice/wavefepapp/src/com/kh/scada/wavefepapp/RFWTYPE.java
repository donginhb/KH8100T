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

public enum RFWTYPE implements java.io.Serializable
{
    
    RFWKHP(0),
    
    RFWKHSM(1),
    
    RFWKHROD(2),
    
    RFWKHHAVERFW(3),
    
    RFWKHRFWDIR(4);

    public int
    value()
    {
        return __value;
    }

    public static RFWTYPE
    valueOf(int __v)
    {
        switch(__v)
        {
        case 0:
            return RFWKHP;
        case 1:
            return RFWKHSM;
        case 2:
            return RFWKHROD;
        case 3:
            return RFWKHHAVERFW;
        case 4:
            return RFWKHRFWDIR;
        }
        return null;
    }

    private
    RFWTYPE(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 4);
    }

    public static void
    __write(IceInternal.BasicStream __os, RFWTYPE __v)
    {
        if(__v == null)
        {
            __os.writeEnum(com.kh.scada.wavefepapp.RFWTYPE.RFWKHP.value(), 4);
        }
        else
        {
            __os.writeEnum(__v.value(), 4);
        }
    }

    public static RFWTYPE
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(4);
        return __validate(__v);
    }

    private static RFWTYPE
    __validate(int __v)
    {
        final RFWTYPE __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}
