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

public interface _RdbDataOptOperations
{
    boolean InsertData(RespondCompleteDataSeq dataSeq, RespondCompleteDataSequenceHolder errorSeq, Ice.Current __current);

    boolean SelectDefaultData(RequestDefaultDataSeq reqSeq, RespondDefaultDataSeqHolder repSeq, Ice.Current __current);

    boolean SelectSpecificData(RequestSpecficDataSeq reqSeq, RespondSpecficDataSeqHolder repSeq, Ice.Current __current);

    boolean SelectCompleteData(RequestCompleteDataSeq reqSeq, RespondCompleteDataSeqHolder repSeq, Ice.Current __current);

    boolean SelectDataCount(RequestDefaultDataSeq reqSeq, RespondDataCountSequenceHolder repSeq, Ice.Current __current);

    boolean UpdateCompleteData(RespondCompleteDataSeq reqSeq, RespondCompleteDataSequenceHolder repSeq, Ice.Current __current);

    boolean DeleteRdbData(RequestDefaultDataSeq dataSeq, RequestDefaultDataSequenceHolder errorSeq, Ice.Current __current);

    boolean GetEquipTree(String deviceType, String deviceRid, EquipTreeSequenceHolder treeSeq, Ice.Current __current);

    boolean GetSpecificEquipTree(String deviceType, String deviceRid, String specDeviceType, EquipTreeSequenceHolder treeSeq, Ice.Current __current);

    boolean GetEquipLineAndStationInfo(String deviceType, String deviceRid, LineAndStationInfoHolder info, Ice.Current __current);

    boolean isOrphanNode(String dataType, String dataRid, Ice.Current __current);

    boolean isEmptyNode(String dataType, String dataRid, Ice.Current __current);

    boolean IsInvalidDbData(String tableName, String dataRID, Ice.Current __current);

    boolean GetTopoData(RequestTopoDataSeq inDataSeq, ReceiveTopoDataSeqHolder outDataSeq, Ice.Current __current);

    void GetTopoIslandInfo(TopoIslandInfoSeqHolder islandInfoes, Ice.Current __current);

    void UpdateTopoData(Ice.Current __current);
}