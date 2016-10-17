package com.bignerdranch.android.Trip_Logger.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.Trip_Logger.Crime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Paul J Jensen on 6/09/2016.
 */
public class CrimeCursorWrapper extends CursorWrapper {

    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved((isSolved != 0));

        return crime;
//        return null;
    }
}
