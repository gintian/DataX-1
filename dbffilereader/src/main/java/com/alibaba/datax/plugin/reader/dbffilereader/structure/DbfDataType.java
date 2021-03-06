package com.alibaba.datax.plugin.reader.dbffilereader.structure;

/**
 * The supported Dbf field types.
 * Source: http://www.fship.com/dbfspecs.txt
 */
public enum DbfDataType
{
    CHAR('C'),
    DATE('D'),
    FLOAT('F'),
    LOGICAL('L'),
    MEMO('M'),
    NUMERIC('N');

    public final byte byteValue;

    DbfDataType(char byteValue)
    {
        this.byteValue = (byte) (byteValue & 0xff);
    }

    /* package */
    static DbfDataType valueOf(byte value)
    {
        final DbfDataType[] values = values();
        for (DbfDataType dbfDataType : values) {
            if (dbfDataType.byteValue == value) {
                return dbfDataType;
            }
        }
        return null;
    }
}