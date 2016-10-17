package com.bignerdranch.android.Trip_Logger.database;

/**
 * Created by Paul J Jensen on 6/09/2016.
 */
public class CrimeDbSchema {

    public static final class CrimeTable {
        public static final String NAME = "Crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";

        }
    }
}
